package com.lenkasr.tmanage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GroupFragRVAdapter extends RecyclerView.Adapter<GroupFragRVAdapter.GroupViewHolder> {
    List<GroupItem> groupItemList = new ArrayList<>();

    public GroupFragRVAdapter() {
        addItemsToList();
    }

    @NonNull
    @Override
    public GroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View courseView = inflater.inflate(R.layout.groups_layout_adapter, parent, false);

        return (new GroupViewHolder(courseView));
    }

    @Override
    public void onBindViewHolder(@NonNull GroupViewHolder holder, int position) {


        holder.courseTitle.setText(groupItemList.get(position).getCourseTitle());

        holder.members.setText(groupItemList.get(position).getMembers());

        holder.teamName.setText(groupItemList.get(position).getTeamName());
        holder.teamCreationDate.setText(groupItemList.get(position).getTeamCreationDate());

        holder.scheduleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Currently not available", Toast.LENGTH_LONG).show();
            }
        });

    }

    private void addItemsToList() {
        GroupItem item1 = new GroupItem();

        item1.courseTitle = "INFM-603";
        item1.members = "4";
        item1.teamCreationDate = "29.10.2022";
        item1.teamName = "Group 8";

        GroupItem item2 = new GroupItem();

        item2.courseTitle = "INFM-600";
        item2.members = "7";
        item2.teamCreationDate = "12.11.2022";
        item2.teamName = "Group 6";

        GroupItem item3 = new GroupItem();

        item3.courseTitle = "INFM-733";
        item3.members = "4";
        item3.teamCreationDate = "15.10.2022";
        item3.teamName = "Group 4";

        groupItemList.add(item1);
        groupItemList.add(item2);
        groupItemList.add(item3);
    }


    @Override
    public int getItemCount() {
        return groupItemList.size();
    }

    public static class GroupViewHolder extends RecyclerView.ViewHolder {
        public TextView courseTitle;
        public TextView teamName;

        public TextView teamCreationDate;

        public TextView members;

        public Button scheduleBtn;

        public GroupViewHolder(View itemView) {
            super(itemView);
            this.courseTitle = (TextView) itemView.findViewById(R.id.courseTitle);
            this.teamName = (TextView) itemView.findViewById(R.id.teamName);

            this.teamCreationDate = (TextView) itemView.findViewById(R.id.teamCreationDate);

            this.members = (TextView) itemView.findViewById(R.id.members);

            this.scheduleBtn = (Button) itemView.findViewById(R.id.scheduleBtn);
        }
    }

}

