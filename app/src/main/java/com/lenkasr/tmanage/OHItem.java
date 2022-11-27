package com.lenkasr.tmanage;

import java.util.List;

public class OHItem {
    private String courseName;
    private List<PersonItem> persons;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<PersonItem> getPersons() {
        return persons;
    }

    public void setPersons(List<PersonItem> persons) {
        this.persons = persons;
    }
}
