package com.vecterix.android.tourguideapp;

import android.databinding.DataBindingUtil;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = binding.tabs;

        tabLayout.setupWithViewPager(viewPager);

        PopulateLocations();

    }

    private void PopulateLocations() {
        ArrayList<String> descriptions = getDescriptions();

        locations.add(new Location("Folsom Dam","Folsom" ,"CA", R.drawable.folsom_dam,
                descriptions.get(0)));
        locations.add(new Location("Folsom Prison","Folsom" ,"CA", R.drawable.folsom_prison,
                descriptions.get(1)));
        locations.add(new Location("Folsom Lake","Folsom" ,"CA", R.drawable.folsom_lake, descriptions
                .get(2)));
        locations.add(new Location("Palladio Outlets","Folsom" ,"CA", R.drawable.palladio_outlets,
                descriptions.get(3)));
        locations.add(new Location("Negro Bar Picnic Area","Folsom" ,"CA", R.drawable.negro_bar_picnic_area,
                descriptions.get(4)));
        locations.add(new Location("Lake Natoma","Folsom" ,"CA", R.drawable.lake_natoma,
                descriptions.get(5)));

        locations.add(new Location("Willow Lake","Prescott" ,"AZ", R.drawable.willow_lake, descriptions
                .get(6)));
        locations.add(new Location("Granite Dells","Prescott" ,"AZ", R.drawable.granite_dells,
                descriptions.get(7)));
        locations.add(new Location("Peavine Trail","Prescott" ,"AZ", R.drawable.peavine_trail,
                descriptions.get(8)));
        locations.add(new Location("Granite Mountain","Prescott" ,"AZ", R.drawable.granite_mountain,
                descriptions.get(9)));
        locations.add(new Location("Whiskey Row","Prescott" ,"AZ", R.drawable.whiskey_row, descriptions
                .get(10)));
        locations.add(new Location("Lynx Lake","Prescott" ,"AZ", R.drawable.lynx_lake, descriptions
                .get(11)));

        locations.add(new Location("Lake Pleasant","Phoenix" ,"AZ", R.drawable.lake_pleasant,
                descriptions.get(12)));
        locations.add(new Location("McDowell Mountain Regional Park","Phoenix" ,"AZ", R
                .drawable.mcdowell_mountain_regional_park, descriptions.get(13)));
        locations.add(new Location("Estrella Mountain Regional Park","Phoenix" ,"AZ", R
                .drawable.estrella_mountain_regional_park, descriptions.get(14)));
        locations.add(new Location("Adobe Dam Regional Park","Phoenix" ,"AZ", R.drawable.adobe_dam_regional_park,
                descriptions.get(15)));
        locations.add(new Location("Downtown Tempe","Phoenix" ,"AZ", R.drawable.downtown_tempe,
                descriptions.get(16)));
        locations.add(new Location("Southern Scottsdale","Phoenix" ,"AZ", R.drawable.southern_scottsdale,
                descriptions.get(17)));

        locations.add(new Location("Mount Rose","Reno" ,"NV", R.drawable.mount_rose, descriptions.get
                (18)));
        locations.add(new Location("Mount Rose Ski Resort","Reno" ,"NV", R.drawable.mount_rose_ski_resort,
                descriptions.get(19)));
        locations.add(new Location("National Automobile Museum","Reno" ,"NV", R.drawable.national_automobile_museum,
                descriptions.get(20)));
        locations.add(new Location("Idlewild Park","Reno" ,"NV", R.drawable.idlewild_park, descriptions
                .get(21)));
        locations.add(new Location("Circus Circus Reno","Reno" ,"NV", R.drawable.circus_circus_reno,
                descriptions.get(22)));
        locations.add(new Location("Nevada Museum of Art","Reno" ,"NV", R.drawable.nevada_museum_of_art,
                descriptions.get(23)));
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

        descriptions.add("Completed in 1955, Folsom Dam became an icon of the northeast " +
                "Sacramento area. Easily seen from the recently completed Folsom Lake Crossing " +
                "bridge, it towers at 340ft, generating an annual energy capacity of 691TWh.");
        descriptions.add("One of 33 state prisons in California, it was immortalized in 1955 " +
                "after Johnny Cash's release of Folsom Prison Blues.");
        descriptions.add("Man-made reservoir on the American River, it holds 11,500 acre-ft of " +
                "water. Folsom Lake State Recreation Area permits hiking, camping, motorboating, " +
                "fishing, and many other activities");
        descriptions.add("This is where a description of the Palladio Outlets would go");
        descriptions.add("This is where a description of the Negro Bar Picnic Area would go");
        descriptions.add("This is where a description of Lake Natoma would go");
        descriptions.add("This is where a description of Willow Lake would go");
        descriptions.add("This is where a description of the Granite Dells would go");
        descriptions.add("This is where a description of the Peavine Trail would go");
        descriptions.add("This is where a description of Granite Mountain would go");
        descriptions.add("This is where a description of Whiskey Row would go");
        descriptions.add("This is where a description of the Lynx Lake would go");
        descriptions.add("This is where a description of Mount Rose would go");
        descriptions.add("This is where a description of the Mount Rose Ski Resort would go");
        descriptions.add("This is where a description of the National Automobile Museum would go");
        descriptions.add("This is where a description of IdleWild Park would go");
        descriptions.add("This is where a description of Circus Circus Reno would go");
        descriptions.add("This is where a description of the Nevada Museum of Art would go");
        descriptions.add("This is where a description of Lake Pleasant would go");
        descriptions.add("This is where a description of McDowell Mountain Regional Park would go");
        descriptions.add("This is where a description of Estrella Mountain Regional Park would go");
        descriptions.add("This is where a description of Adobe Dam Regional Park would go");
        descriptions.add("This is where a description of Downtown Tempe would go");
        descriptions.add("This is where a description of Southern Scottsdale would go");
        return descriptions;
    }
}
