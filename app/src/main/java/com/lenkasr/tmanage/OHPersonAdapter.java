package com.lenkasr.tmanage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OHPersonAdapter extends RecyclerView.Adapter<OHPersonAdapter.PersonVH> {
    List<PersonItem> personItemList;


    public OHPersonAdapter(List<PersonItem> persons) {
        this.personItemList = persons;
    }

    @NonNull
    @Override
    public OHPersonAdapter.PersonVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View courseView = inflater.inflate(R.layout.oh_person_adapter, parent, false);

        return (new OHPersonAdapter.PersonVH(courseView));
    }

    @Override
    public void onBindViewHolder(@NonNull OHPersonAdapter.PersonVH holder, int position) {

        holder.personName.setText(personItemList.get(position).getPersonName());

        holder.classDay.setText(personItemList.get(position).getClassDay());

        holder.classTime.setText(personItemList.get(position).getClassTime());


    }

    @Override
    public int getItemCount() {
        return personItemList.size();
    }

    public static class PersonVH extends RecyclerView.ViewHolder {
        public TextView personName;
        public TextView classDay;

        public TextView classTime;

        public PersonVH(View itemView) {
            super(itemView);
            this.personName = (TextView) itemView.findViewById(R.id.personName);
            this.classDay = (TextView) itemView.findViewById(R.id.classDay);
            this.classTime = (TextView) itemView.findViewById(R.id.classTime);

        }
    }

}

