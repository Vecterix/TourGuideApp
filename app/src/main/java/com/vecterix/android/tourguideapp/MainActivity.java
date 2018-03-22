package com.vecterix.android.tourguideapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.vecterix.android.tourguideapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public final static ArrayList<Location> locations = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding;

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ViewPager viewPager = binding.viewpager;

        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter
                (this, getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = binding.tabs;

        tabLayout.setupWithViewPager(viewPager);

        PopulateLocations();

    }

    private void PopulateLocations() {
        ArrayList<String> descriptions = getDescriptions();

        locations.add(new Location(getString(R.string.folsom_dam), getString(R.string.folsom),
                getString(R.string.ca), R.drawable.folsom_dam, descriptions.get(0)));
        locations.add(new Location(getString(R.string.folsom_prison), getString(R.string.folsom),
                getString(R.string.ca), R.drawable.folsom_prison, descriptions.get(1)));
        locations.add(new Location(getString(R.string.folsom_lake), getString(R.string.folsom),
                getString(R.string.ca), R.drawable.folsom_lake, descriptions.get(2)));
        locations.add(new Location(getString(R.string.palladio_outlets), getString(R.string
                .folsom), getString(R.string.ca), R.drawable.palladio_outlets, descriptions.get(3)));
        locations.add(new Location(getString(R.string.negro_bar_picnic_area), getString(R.string
                .folsom), getString(R.string.ca), R.drawable.negro_bar_picnic_area, descriptions.get(4)));
        locations.add(new Location(getString(R.string.lake_natoma), getString(R.string.folsom),
                getString(R.string.ca), R.drawable.lake_natoma, descriptions.get(5)));

        locations.add(new Location(getString(R.string.willow_lake), getString(R.string.prescott),
                getString(R.string.az), R.drawable.willow_lake, descriptions.get(6)));
        locations.add(new Location(getString(R.string.granite_dells), getString(R.string.prescott),
                getString(R.string.az), R.drawable.granite_dells, descriptions.get(7)));
        locations.add(new Location(getString(R.string.peavine_trail), getString(R.string.prescott),
                getString(R.string.az), R.drawable.peavine_trail, descriptions.get(8)));
        locations.add(new Location(getString(R.string.granite_mountain), getString(R.string
                .prescott), getString(R.string.az), R.drawable.granite_mountain, descriptions.get(9)));
        locations.add(new Location(getString(R.string.whiskey_row), getString(R.string.prescott),
                getString(R.string.az), R.drawable.whiskey_row, descriptions.get(10)));
        locations.add(new Location(getString(R.string.lynx_lake), getString(R.string.prescott),
                getString(R.string.az), R.drawable.lynx_lake, descriptions.get(11)));

        locations.add(new Location(getString(R.string.lake_pleasant), getString(R.string.phoenix),
                getString(R.string.az), R.drawable.lake_pleasant, descriptions.get(12)));
        locations.add(new Location(getString(R.string.mcdowell_mountain_regional_park), getString
                (R.string.phoenix), getString(R.string.az),
                R.drawable.mcdowell_mountain_regional_park, descriptions.get(13)));
        locations.add(new Location(getString(R.string.estrella_mountain_regional_park), getString
                (R.string.phoenix), getString(R.string.az),
                R.drawable.estrella_mountain_regional_park, descriptions.get(14)));
        locations.add(new Location(getString(R.string.adobe_dam_regional_park), getString(R.string
                .phoenix), getString(R.string.az), R.drawable.adobe_dam_regional_park,
                descriptions.get(15)));
        locations.add(new Location(getString(R.string.downtown_tempe), getString(R.string.phoenix),
                getString(R.string.az), R.drawable.downtown_tempe, descriptions.get(16)));
        locations.add(new Location(getString(R.string.southern_scottsdale), getString(R.string
                .phoenix), getString(R.string.az), R.drawable.southern_scottsdale,
                descriptions.get(17)));

        locations.add(new Location(getString(R.string.mount_rose), getString(R.string.reno),
                getString(R.string.nv), R.drawable.mount_rose, descriptions.get(18)));
        locations.add(new Location(getString(R.string.mount_rose_ski_resort), getString(R.string
                .reno), getString(R.string.nv), R.drawable.mount_rose_ski_resort,
                descriptions.get(19)));
        locations.add(new Location(getString(R.string.national_automobile_museum), getString(R
                .string.reno), getString(R.string.nv), R.drawable.national_automobile_museum,
                descriptions.get(20)));
        locations.add(new Location(getString(R.string.idlewild_park), getString(R.string.reno),
                getString(R.string.nv), R.drawable.idlewild_park, descriptions.get(21)));
        locations.add(new Location(getString(R.string.circus_circus_reno), getString(R.string.reno),
                getString(R.string.nv), R.drawable.circus_circus_reno, descriptions.get(22)));
        locations.add(new Location(getString(R.string.nevada_museum_of_art), getString(R.string.reno)
                , getString(R.string.nv), R.drawable.nevada_museum_of_art, descriptions.get(23)));
    }

    static ArrayList<Location> GetLocations(String city) {

        ArrayList<Location> filteredLocations = new ArrayList<>();

        for (int i = 0; i < locations.size(); i++) {
            if (locations.get(i).getCity().equals(city)) {
                filteredLocations.add(locations.get(i));
            }
        }

        return filteredLocations;
    }

    private ArrayList<String> getDescriptions() {

        ArrayList<String> descriptions = new ArrayList<>();

        descriptions.add(getString(R.string.folsom_dam_description));
        descriptions.add(getString(R.string.folsom_prison_description));
        descriptions.add(getString(R.string.folsom_lake_description));
        descriptions.add(getString(R.string.palladio_outlets_decription));
        descriptions.add(getString(R.string.negro_bar_picnic_area_description));
        descriptions.add(getString(R.string.lake_natoma_description));
        descriptions.add(getString(R.string.willow_lake_description));
        descriptions.add(getString(R.string.granite_dells_description));
        descriptions.add(getString(R.string.peavine_trail_description));
        descriptions.add(getString(R.string.granite_mountain_description));
        descriptions.add(getString(R.string.whiskey_row_description));
        descriptions.add(getString(R.string.lynx_lake_description));
        descriptions.add(getString(R.string.lake_pleasant_description));
        descriptions.add(getString(R.string.mcdowell_mountain_regional_park_description));
        descriptions.add(getString(R.string.estrella_mountain_regional_park_description));
        descriptions.add(getString(R.string.adobe_dam_regional_park_description));
        descriptions.add(getString(R.string.downtown_tempe_description));
        descriptions.add(getString(R.string.southern_scottsdale_description));
        descriptions.add(getString(R.string.mount_rose_description));
        descriptions.add(getString(R.string.mount_rose_ski_resort_description));
        descriptions.add(getString(R.string.national_automobile_museum_description));
        descriptions.add(getString(R.string.idlewild_park_description));
        descriptions.add(getString(R.string.circus_circus_reno_description));
        descriptions.add(getString(R.string.nevada_museum_of_art_description));

        return descriptions;
    }
}
