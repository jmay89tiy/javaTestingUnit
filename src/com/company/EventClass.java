package com.company;


import java.util.List;


public class EventClass {

    private String name;
    private String action;

    //




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override       // when setting up stuff, include
    public String toString() {
        return "EventClass{" +
                "name='" + name + '\'' +
                ", action='" + action + '\'' +
                '}';
    }


}


