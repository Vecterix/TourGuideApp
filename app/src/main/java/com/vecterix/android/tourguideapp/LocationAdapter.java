package com.vecterix.android.tourguideapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.vecterix.android.tourguideapp.databinding.LocationItemBinding;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context,0,locations);
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position,@Nullable View convertView, @NonNull ViewGroup parent) {

        final LocationItemBinding binding;

        binding = DataBindingUtil.inflate(LayoutInflater.from(getContext()),R.layout.location_item,
                parent, false);

        Location currentLocation = getItem(position);

        assert currentLocation != null;

        binding.locationImageIcon.setImageResource(currentLocation.getImageResourceId());
        binding.siteName.setText(currentLocation.getSiteName());
        binding.city.setText(currentLocation.getCity());
        binding.state.setText(currentLocation.getState());
        binding.description.setText(currentLocation.getDescription());

        return binding.getRoot();

    }

}
