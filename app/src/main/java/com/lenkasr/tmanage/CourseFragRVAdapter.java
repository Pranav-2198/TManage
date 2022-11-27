package com.lenkasr.tmanage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CourseFragRVAdapter extends RecyclerView.Adapter<CourseFragRVAdapter.CourseViewHolder>{
    List<CourseItem> courseItemList = new ArrayList<>();

    public CourseFragRVAdapter(){
        addItemsToList();
    }
    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View courseView = inflater.inflate(R.layout.course_layout_adapter, parent, false);

        return(new CourseViewHolder(courseView));
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {


        holder.courseTitle.setText(courseItemList.get(position).getCourseTitle());

        holder.courseSubTitle.setText(courseItemList.get(position).getCourseSubTitle());

        holder.courseTitleText.setText(courseItemList.get(position).getCourseTitleText());
        holder.courseMode.setText(courseItemList.get(position).getCourseMode());
        holder.groupName.setText(courseItemList.get(position).getGroupName());

        holder.gradesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Grades currently not available",Toast.LENGTH_LONG).show();
            }
        });

        holder.announcementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"No new announcements",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void addItemsToList() {
        CourseItem item1 = new CourseItem();

        item1.courseMode = "In-person";
        item1.courseTitle = "INFM-603";
        item1.courseSubTitle = "WED";
        item1.courseTitleText = "Information in Organizational Context - Fall 2022 Doug Oard";
        item1.groupName = "Group 8";

        CourseItem item2 = new CourseItem();

        item2.courseMode = "Online";
        item2.courseTitle = "INFM-600";
        item2.courseSubTitle = "FRI";
        item2.courseTitleText = "Information Environments - Fall 2022 Ping Wang";
        item2.groupName = "Group 6";

        CourseItem item3 = new CourseItem();

        item3.courseMode = "In-person";
        item3.courseTitle = "INFM-733";
        item3.courseSubTitle = "TUE";
        item3.courseTitleText = "Information Analytics for Professionals - Fall 2022 Chris Antoun";
        item3.groupName = "Group 4";

        courseItemList.add(item1);
        courseItemList.add(item2);
        courseItemList.add(item3);
    }


    @Override
    public int getItemCount() {
        return courseItemList.size();
    }

    public static class CourseViewHolder extends RecyclerView.ViewHolder {
        public TextView courseTitle;
        public TextView courseSubTitle;

        public TextView courseTitleText;
        public TextView courseMode;

        public TextView groupName;

        public Button gradesBtn;
        public Button announcementBtn;

        public CourseViewHolder(View itemView) {
            super(itemView);
            this.courseTitle = (TextView) itemView.findViewById(R.id.courseTitle);
            this.courseSubTitle = (TextView) itemView.findViewById(R.id.courseSubTitle);

            this.courseTitleText = (TextView) itemView.findViewById(R.id.courseTitleText);
            this.courseMode = (TextView) itemView.findViewById(R.id.courseMode);

            this.groupName = (TextView) itemView.findViewById(R.id.groupName);

            this.gradesBtn = (Button) itemView.findViewById(R.id.gradesBtn);
            this.announcementBtn = (Button) itemView.findViewById(R.id.announcementBtn);
        }
    }

}

