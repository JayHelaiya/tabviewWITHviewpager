package com.nichetech.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Pratik on 23/5/16.
 */
public class PagerAdepter extends FragmentStatePagerAdapter{

    int tabCount;
    public PagerAdepter(FragmentManager fm,int tabCount) {
        super(fm);
        this.tabCount=tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment=null;

        switch (position)
        {
            case 0:
                fragment=new GameFragment();
                break;

            case 1:
                fragment=new MoviesFragment();
                break;

            case 2:
                fragment =new StudyFragment();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return tabCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title="";

        switch (position){

            case 0:
                title="game";
                break;

            case 1:
                title="movies";
                break;

            case 2:
                title="study";
                break;
        }
        return title;
    }
}
