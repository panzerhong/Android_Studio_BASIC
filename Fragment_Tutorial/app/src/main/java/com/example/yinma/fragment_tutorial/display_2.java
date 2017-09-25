package com.example.yinma.fragment_tutorial;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by yinma on 9/24/2017.
 */

public class display_2 extends Fragment {
    TextView pagenumbobj;


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.display_2,container,false);

        pagenumbobj=view.findViewById(R.id.txtnum);
        return view;
    }

    public void setNamepase(String num) {
        pagenumbobj.setText(String.valueOf(num));
    }
}
