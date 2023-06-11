package com.example.demo.model;

import java.util.ArrayList;

public class CodeResult {

    private String applicationType;

    private ArrayList<String> techStack = new ArrayList<String>();


    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public ArrayList<String> getTechStack() {
        return techStack;
    }

    public void setTechStack(ArrayList<String> techStack) {
        this.techStack = techStack;
    }




}
