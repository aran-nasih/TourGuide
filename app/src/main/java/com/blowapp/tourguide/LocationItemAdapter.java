package com.blowapp.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aran on 10/6/2017.
 */

public class LocationItemAdapter extends ArrayAdapter<LocationItem> {
    public LocationItemAdapter(Activity context, ArrayList<LocationItem> locationItems) {
        super(context, 0, locationItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_item, parent, false);
        }

        LocationItem currentLocation = getItem(position);

        ImageView image = (ImageView) listItemView.findViewById(R.id.location_item_image);
        image.setImageResource(currentLocation.getImage());

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.location_item_name);
        nameTextView.setText(currentLocation.getName());

        TextView phoneNumber = (TextView) listItemView.findViewById(R.id.location_item_phonenumber);
        phoneNumber.setText(currentLocation.getPhoneNumber());

        TextView address = (TextView) listItemView.findViewById(R.id.location_item_address);
        address.setText(currentLocation.getAddress());

        return listItemView;
    }

}

