package com.lenkasr.tmanage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class OHAdapter  extends RecyclerView.Adapter<OHAdapter.OHViewHolder> {
    List<OHItem> ohItemList = new ArrayList<>();
    OHPersonAdapter ohPersonAdapter;
    FragmentActivity activity;

    public OHAdapter(FragmentActivity activity) {
        this.activity = activity;
        addItemsToList();
    }

    @NonNull
    @Override
    public OHAdapter.OHViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View courseView = inflater.inflate(R.layout.oh_layout_adapter, parent, false);

        return (new OHAdapter.OHViewHolder(courseView));
    }

    @Override
    public void onBindViewHolder(@NonNull OHAdapter.OHViewHolder holder, int position) {

        holder.courseName.setText("Course "+(position+1)+": "+ohItemList.get(position).getCourseName());

        ohPersonAdapter = new OHPersonAdapter(ohItemList.get(position).getPersons());
        holder.ohRV.setHasFixedSize(true);
        holder.ohRV.setLayoutManager(new LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL,false));
        holder.ohRV.setAdapter(ohPersonAdapter);

    }

    private void addItemsToList() {
        OHItem item1 = new OHItem();

        item1.setCourseName("INFM-603");

        List<PersonItem> pList1 = new ArrayList<>();
        PersonItem p1 = new PersonItem();
        p1.personName = "Prof Oard";
        p1.classDay = "Tue";
        p1.classTime = "3-4 PM";

        pList1.add(p1);

        PersonItem p2 = new PersonItem();
        p2.personName = "TA Xin";
        p2.classDay = "Tue & Thu";
        p2.classTime = "2-3 PM";

        pList1.add(p2);

        PersonItem p3 = new PersonItem();
        p3.personName = "Ta Jam";
        p3.classDay = "Thu";
        p3.classTime = "3-4PM";

        pList1.add(p3);
        item1.setPersons(pList1);

        OHItem item2 = new OHItem();

        item2.setCourseName("INFM-600");
        List<PersonItem> pList2 = new ArrayList<>();
        PersonItem pe2 = new PersonItem();
        pe2.personName = "Prof Wang";
        pe2.classDay = "Tue";
        pe2.classTime = "3-4 PM";

        pList2.add(pe2);
        item2.setPersons(pList2);

        OHItem item3 = new OHItem();

        item3.setCourseName("INFM-733");

        List<PersonItem> pList3 = new ArrayList<>();
        PersonItem pe3 = new PersonItem();
        pe3.personName = "Prof Chris";
        pe3.classDay = "Tue";
        pe3.classTime = "3-4 PM";

        pList3.add(pe3);

        PersonItem pe4 = new PersonItem();
        pe4.personName = "TA Maitri";
        pe4.classDay = "Tue & Thu";
        pe4.classTime = "2-3 PM";

        pList3.add(pe4);
        item3.setPersons(pList3);


        ohItemList.add(item1);
        ohItemList.add(item2);
        ohItemList.add(item3);
    }


    @Override
    public int getItemCount() {
        return ohItemList.size();
    }

    public static class OHViewHolder extends RecyclerView.ViewHolder {
        public TextView courseName;

        public RecyclerView ohRV;

        public OHViewHolder(View itemView) {
            super(itemView);
            this.courseName = (TextView) itemView.findViewById(R.id.courseName);

            this.ohRV = (RecyclerView) itemView.findViewById(R.id.ohPersonRV);
        }
    }

}


