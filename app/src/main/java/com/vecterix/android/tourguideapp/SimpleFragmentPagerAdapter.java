package com.vecterix.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Bundle bundle = new Bundle();

        if (position == 0) {
            bundle.putString("LOCATION","Folsom");
            LocationFragment locationFragment = new LocationFragment();
            locationFragment.setArguments(bundle);
            return locationFragment;}
        else if (position == 1) {
            bundle.putString("LOCATION","Prescott");
            LocationFragment locationFragment = new LocationFragment();
            locationFragment.setArguments(bundle);
            return locationFragment;}
        else if (position == 2) {
            bundle.putString("LOCATION","Reno");
            LocationFragment locationFragment = new LocationFragment();
            locationFragment.setArguments(bundle);
            return locationFragment;}
        else {
            bundle.putString("LOCATION","Phoenix");
            LocationFragment locationFragment = new LocationFragment();
            locationFragment.setArguments(bundle);
            return locationFragment;}

    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {return "Folsom CA";}
        else if (position == 1) {return "Prescott AZ";}
        else if (position == 2) {return "Reno NV";}
        else {return "Phoenix AZ";}

    }

    @Override
    public int getCount() {
        return 4;
    }
}
