package com.demo.oc.lemonderssreader;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.demo.oc.lemonderssreader.TabFragment.TabFragmentTechnologies;
import com.demo.oc.lemonderssreader.TabFragment.TabFragmentTopnews;
import com.demo.oc.lemonderssreader.TabFragment.TabFragmentVideogames;

/**
 * Created by Erwan on 16/04/2016.
 */
public class PageAdapter extends FragmentStatePagerAdapter {

    private int nbOfTab;

    public PageAdapter(FragmentManager fm, int nbOfTab) {
        super(fm);
        this.nbOfTab = nbOfTab;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TabFragmentTopnews();
            case 1:
                return new TabFragmentTechnologies();
            case 2:
                return new TabFragmentVideogames();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return nbOfTab;
    }
}
