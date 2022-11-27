package com.lenkasr.tmanage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Calendar;

public class CourseFragment extends Fragment {
    TextView lastLoginText;
    RecyclerView courseRV;
    CourseFragRVAdapter adapter;
    public CourseFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.course_layout, container, false);

        lastLoginText = (TextView) view.findViewById(R.id.lastLoginText);
        lastLoginText.setText("Last Login at: "+ Calendar.getInstance().getTime());
        courseRV = (RecyclerView) view.findViewById(R.id.courseRV);
        adapter = new CourseFragRVAdapter();
        courseRV.setHasFixedSize(true);
        courseRV.setLayoutManager(new LinearLayoutManager(getActivity()));
        courseRV.setAdapter(adapter);

        return view;
    }
}
