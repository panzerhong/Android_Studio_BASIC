package com.example.yinma.fragment_tutorial;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class display_3 extends Fragment {
    Button prevobj,nextobj,gotoobj;
    EditText pageobj;
    visalinterface visalinterfaceobj;

    public interface visalinterface{
        void setText(String num);
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        try
        {
            visalinterfaceobj=(visalinterface) activity;
        }catch (ClassCastException e)/*Convert from 1 activity to another activity */
        {

        }
    }
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.display_3,container,false);
        prevobj =view.findViewById(R.id.previd);
        nextobj = view.findViewById(R.id.nextid);
        gotoobj = view.findViewById(R.id.gotoid);
        pageobj = view.findViewById(R.id.pageid);

        gotoobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(pageobj.getText().toString());
            }

            private void buttonClick(String s) {
                visalinterfaceobj.setText(s);
            }
        });
        return view;

    }
}
