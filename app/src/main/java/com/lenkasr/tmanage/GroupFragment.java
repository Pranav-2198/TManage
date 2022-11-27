package com.lenkasr.tmanage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Calendar;

public class GroupFragment extends Fragment {
    TextView lastLoginText;
    RecyclerView groupsRV;
    GroupFragRVAdapter adapter;
    public GroupFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.group_layout, container, false);

        lastLoginText = (TextView) view.findViewById(R.id.lastLoginText);
        lastLoginText.setText("Last Login at: "+ Calendar.getInstance().getTime());

        groupsRV = (RecyclerView) view.findViewById(R.id.groupsRV);
        adapter = new GroupFragRVAdapter();
        groupsRV.setHasFixedSize(true);
        groupsRV.setLayoutManager(new LinearLayoutManager(getActivity()));
        groupsRV.setAdapter(adapter);

        return view;
    }
}
