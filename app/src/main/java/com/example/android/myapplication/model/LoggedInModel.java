package com.example.android.myapplication.model;

/**
 * Created by ahammed.hafees on 04-10-2017.
 */

public class LoggedInModel {

    private String Name;
    private String Designation;
    private String LogTime;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getLogTime() {
        return LogTime;
    }

    public void setLogTime(String logTime) {
        LogTime = logTime;
    }
}
