package com.vecterix.android.tourguideapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        Bundle bundle = new Bundle();

        if (position == 0) {
            bundle.putString(context.getString(R.string.location_key), context.getString(R.string
                    .folsom));
            LocationFragment locationFragment = new LocationFragment();
            locationFragment.setArguments(bundle);
            return locationFragment;
        } else if (position == 1) {
            bundle.putString(context.getString(R.string.location_key), context.getString(R.string
                    .prescott));
            LocationFragment locationFragment = new LocationFragment();
            locationFragment.setArguments(bundle);
            return locationFragment;
        } else if (position == 2) {
            bundle.putString(context.getString(R.string.location_key), context.getString(R.string
                    .reno));
            LocationFragment locationFragment = new LocationFragment();
            locationFragment.setArguments(bundle);
            return locationFragment;
        } else {
            bundle.putString(context.getString(R.string.location_key), context.getString(R.string
                    .phoenix));
            LocationFragment locationFragment = new LocationFragment();
            locationFragment.setArguments(bundle);
            return locationFragment;
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.folsom_ca);
        } else if (position == 1) {
            return context.getString(R.string.prescott_az);
        } else if (position == 2) {
            return context.getString(R.string.reno_nv);
        } else {
            return context.getString(R.string.phoenix_az);
        }

    }

    @Override
    public int getCount() {
        return 4;
    }
}
