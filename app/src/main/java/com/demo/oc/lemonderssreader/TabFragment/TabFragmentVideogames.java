package com.demo.oc.lemonderssreader.TabFragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.oc.lemonderssreader.R;

/**
 * Created by Erwan on 16/04/2016.
 */
public class TabFragmentVideogames extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_videogames, container, false);
    }

}
