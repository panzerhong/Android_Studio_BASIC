package com.example.yinma.fragmentdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.R.id.content;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentManager fragmentManager=getFragmentManager();/* Call the fragment manager to create fragmentTransaction*/
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Configuration config = getResources().getConfiguration();

        if (config.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            Landscape landscapeClass = new Landscape();
            fragmentTransaction.replace(android.R.id.content,landscapeClass);
        }
        else if (config.orientation==Configuration.ORIENTATION_PORTRAIT)
        {
            PortraitClass portraitClass = new PortraitClass();
            fragmentTransaction.replace(android.R.id.content,portraitClass);
        }

        fragmentTransaction.commit();
    }
}
