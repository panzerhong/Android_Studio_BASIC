package com.example.admin.fragmentexampleorientation;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /* FragmentManager is an abstract class acts as an interface for interacting with Fragment
        objects inside of an Activity */

        /* FragmentTransaction is used to add, remove and replace Fragments in an activity */
        FragmentManager fragementManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragementManager.beginTransaction();

        /* This class describes all device configuration information that can impact the
        resources the application retrieves. This includes both user-specified configuration
         options (locale list and scaling) as well as device configurations
         (such as input modes, screen size and screen orientation).
         */

        Configuration config = getResources().getConfiguration();

        /* Below condition is used to check if the device is in Landscape or Portrait
           The object (config) is having the current status of the device
           Configuration.ORIENTATION_LANDSCAPE is having some predefined measurement for Landscape view
           Configuration.ORIENTATION_LANDSCAPE is having some predefined measurement for Portrait view
         */
        if(config.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            //Below is an object created for the class which we have created for Landscape fragment
            LandscapeClass landscapeClass = new LandscapeClass();
            //replacing the fragment using Fragment Transaction
            fragmentTransaction.replace(android.R.id.content,landscapeClass);
        }
        else
        {
            //Below is an object created for the class which we have created for Portrait fragment
            PortraitClass portraitClass = new PortraitClass();
            //replacing the fragment using Fragment Transaction
            fragmentTransaction.replace(android.R.id.content,portraitClass);

        }
        //Saving and confirming the final change
        fragmentTransaction.commit();
    }
}
