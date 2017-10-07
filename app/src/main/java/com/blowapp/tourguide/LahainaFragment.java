package com.blowapp.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LahainaFragment extends Fragment {

    public LahainaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lahaina, container, false);

        ArrayList<LocationItem> locationItems = new ArrayList<>();
        locationItems.add(new LocationItem(R.drawable.fast_food, getResources().getString(R.string.lahaina_grill), getResources().getString(R.string.lahaina_grill_address), getResources().getString(R.string.lahaina_grill_phone)));

        LocationItemAdapter locationItemAdapter = new LocationItemAdapter(getActivity(), locationItems);
        ListView listView = (ListView) view.findViewById(R.id.lahaina_listview_location);
        listView.setDivider(null);
        listView.setAdapter(locationItemAdapter);

        // Inflate the layout for this fragment
        return view;
    }

}
