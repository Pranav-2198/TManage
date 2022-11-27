package com.lenkasr.tmanage;

public class GroupItem {
    String courseTitle;
    String teamName;
    String teamCreationDate;
    String members;

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCreationDate() {
        return "Created on: "+teamCreationDate;
    }

    public void setTeamCreationDate(String teamCreationDate) {
        this.teamCreationDate = teamCreationDate;
    }

    public String getMembers() {
        return "Members: "+members;
    }

    public void setMembers(String members) {
        this.members = members;
    }
}