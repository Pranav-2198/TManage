package com.lenkasr.tmanage;

public class CourseItem {
    String courseTitle;
    String courseSubTitle;
    String courseTitleText;
    String courseMode;
    String groupName;

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseSubTitle() {
        return courseSubTitle;
    }

    public void setCourseSubTitle(String courseSubTitle) {
        this.courseSubTitle = courseSubTitle;
    }

    public String getCourseTitleText() {
        return courseTitleText;
    }

    public void setCourseTitleText(String courseTitleText) {
        this.courseTitleText = courseTitleText;
    }

    public String getCourseMode() {
        return "Mode: "+courseMode;
    }

    public void setCourseMode(String courseMode) {
        this.courseMode = courseMode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
