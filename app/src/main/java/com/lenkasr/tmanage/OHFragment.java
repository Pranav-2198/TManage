package com.lenkasr.tmanage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Calendar;

public class OHFragment extends Fragment {
    RecyclerView groupsRV;
    OHAdapter adapter;
    public OHFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.oh_layout, container, false);


        groupsRV = (RecyclerView) view.findViewById(R.id.ohRV);
        adapter = new OHAdapter(getActivity());
        groupsRV.setHasFixedSize(true);
        groupsRV.setLayoutManager(new LinearLayoutManager(getActivity()));
        groupsRV.setAdapter(adapter);

        return view;
    }
}

