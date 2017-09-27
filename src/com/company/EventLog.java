package com.company;

import java.util.ArrayList;
import java.util.List;

public class EventLog {



    private static List<EventClass> eventList;

    public static boolean addEvent(EventClass event) throws IllegalArgumentException {
        if (event == null) {
            throw new IllegalArgumentException();
        }
        if (event.getName()== null || event.getAction()==null) {
            throw new IllegalArgumentException();
        }
        if (event.getAction().equals("Face2Face") || event.getAction().equals("PhoneCall") || event.getAction().equals("TextMessaging") || event.getAction().equals("Unknown")) {
            eventList.add(event);
            System.out.println(event);
            return true;
        } else {
            throw new IllegalArgumentException();
        }



    };

    public int getNumEvents() {
        return eventList.size();     //returns list size
    };

    public EventLog () {
        eventList = new ArrayList<>();
    }


}
