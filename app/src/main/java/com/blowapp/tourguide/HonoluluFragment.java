package com.blowapp.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HonoluluFragment extends Fragment {

    public HonoluluFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_honolulu, container, false);

        ArrayList<LocationItem> locationItems = new ArrayList<>();
        locationItems.add(new LocationItem(R.drawable.fast_food, getResources().getString(R.string.alan_wongs), getResources().getString(R.string.alan_wongs_phone), getResources().getString(R.string.alan_wongs_address)));
        locationItems.add(new LocationItem(R.drawable.mask, getResources().getString(R.string.okinawan), getResources().getString(R.string.okinawan_detail), getResources().getString(R.string.okinawan_address)));
        locationItems.add(new LocationItem(R.drawable.music, getResources().getString(R.string.revive), getResources().getString(R.string.revive_detail), getResources().getString(R.string.revive_address)));

        LocationItemAdapter locationItemAdapter = new LocationItemAdapter(getActivity(), locationItems);
        ListView listView = (ListView) view.findViewById(R.id.honolulu_listview_location);
        listView.setDivider(null);
        listView.setAdapter(locationItemAdapter);

        // Inflate the layout for this fragment
        return view;
    }

}
