package com.example.admin.fragmentexampleorientation;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//This class is created for Landscape view
//landscape_fragment.xml is mapped with this java class
public class LandscapeClass extends Fragment
{
    @Nullable
    @Override
    //Below is a lifecycle method which will be called automatically

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.landscape_fragment, container, false);

        /*
        Parameters
resource
int: ID for an XML layout resource to load (e.g., R.layout.main_page)
root


ViewGroup: Optional view to be the parent of the generated hierarchy
(if attachToRoot is true), or else simply an object that provides a set of
LayoutParams values for root of the returned hierarchy (if attachToRoot is false.)
This value may be null.


boolean: Whether the inflated hierarchy should be attached to the root parameter? If false, root is only used to create the correct subclass of LayoutParams for the root view in the XML.
         */
    }
}
