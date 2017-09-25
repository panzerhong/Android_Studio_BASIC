package com.example.yinma.a2_fragment;

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
import java.util.ArrayList;

public class fragment_2 extends Fragment {
    int pageOpen=0,pageGone=0;
    Button prevobj,nextobj,gotoobj;
    EditText pageobj;
    RelativeLayout page1obj,page2obj,page3obj;
    FrameLayout frameLayout;
    final ArrayList<RelativeLayout> listpage = new ArrayList<>(); /* Create the object as array for the RelativeLayout*/
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view_2 = inflater.inflate(R.layout.fragment_2,container,false);
        prevobj = view_2.findViewById(R.id.prev_id);
        nextobj = view_2.findViewById(R.id.next_id);
        gotoobj = view_2.findViewById(R.id.goto_id);
        frameLayout = view_2.findViewById(R.id.main_relative_id);
        page1obj=view_2.findViewById(R.id.page_1);
        page2obj=view_2.findViewById(R.id.page_2);
        page3obj=view_2.findViewById(R.id.page_3);
        pageobj=view_2.findViewById(R.id.page_id);

        final int count = frameLayout.getChildCount();/*pageobj.setText(String.valueOf(count));*/
        for (int i = 0; i<count;i++)
        {
            listpage.add((RelativeLayout)frameLayout.getChildAt(i));
        }
        listpage.get(0).setVisibility(View.VISIBLE);

        for (int j = 1;j<count;j++)
        {
            listpage.get(j).setVisibility(View.GONE);
        }

        nextobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pageOpen==count-1)
                {
                    pageGone=pageOpen;
                    listpage.get(pageGone).setVisibility(View.GONE);
                    pageOpen=0;
                    listpage.get(pageOpen).setVisibility(View.VISIBLE);
                }
                else
                {
                    pageGone=pageOpen;
                    listpage.get(pageGone).setVisibility(View.GONE);
                    pageOpen++;
                    listpage.get(pageOpen).setVisibility(View.VISIBLE);
                }

            }
        });

        prevobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pageOpen==0)
                {
                    listpage.get(0).setVisibility(View.VISIBLE);
                }
                else
                {
                    pageGone=pageOpen;
                    listpage.get(pageGone).setVisibility(View.GONE);
                    pageOpen--;
                    listpage.get(pageOpen).setVisibility(View.VISIBLE);
                }
            }
        });
        return view_2;
    }
}
