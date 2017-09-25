package com.example.sambovisal.fragmentstask;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by sambo visal on 24/09/2017.
 */

public class ContentFragment extends Fragment {

    Button next,prev,submit;

    RelativeLayout p1,p2,p3;
    int pageOpen,pageGone;
    FrameLayout frameLayout;

    EditText input;
    ArrayList<RelativeLayout> listpage = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_fragment,container,false);
        next = view.findViewById(R.id.next_btn);
        prev = view.findViewById(R.id.previous_btn);
        submit = view.findViewById(R.id.submit_btn);
        input = view.findViewById(R.id.input_page);

        frameLayout = view.findViewById(R.id.frame_layout);

        p1 = view.findViewById(R.id.page1);
        p2 = view.findViewById(R.id.page2);
        p3 = view.findViewById(R.id.page3);

        final int count = frameLayout.getChildCount();
        for (int i=0;i<count;i++){
            listpage.add((RelativeLayout)frameLayout.getChildAt(i));
        }
        listpage.get(0).setVisibility(View.VISIBLE);
        for(int j=1;j<count;j++){
            listpage.get(j).setVisibility(View.GONE);
        }

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pageOpen>=0 && pageOpen<count-1){
                    pageOpen++;
                    listpage.get(pageOpen).setVisibility(View.VISIBLE);
                    listpage.get(pageGone).setVisibility(View.GONE);
                    pageGone++;
                }
                else{

                }
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pageOpen>0){
                    pageOpen--;
                    listpage.get(pageOpen).setVisibility(View.VISIBLE);
                    listpage.get(pageGone).setVisibility(View.GONE);
                    pageGone--;
                }
                else{

                }
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = input.getText().toString();
                int n = Integer.parseInt(num);

                if (n > count){
                    //Toast.makeText(ContentFragment.this, "Too big", Toast.LENGTH_SHORT).show()
                }
                else{
                    listpage.get(n).setVisibility(View.VISIBLE);
                }
            }
        });

        return view;
    }

}
