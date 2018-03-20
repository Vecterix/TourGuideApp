package com.vecterix.android.tourguideapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.vecterix.android.tourguideapp.databinding.ListContainerBinding;

public class LocationFragment extends Fragment {

    public LocationFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Bundle arguments = getArguments();

        assert arguments != null;
        String city = arguments.getString("LOCATION");

        ListContainerBinding binding;

        binding = DataBindingUtil.inflate(inflater,R.layout.list_container, container, false);

        ListView listView = binding.locationList;

        LocationAdapter adapter = new LocationAdapter(getContext(), MainActivity.GetLocations
                (city));

        listView.setAdapter(adapter);



        return listView;
    }
}
