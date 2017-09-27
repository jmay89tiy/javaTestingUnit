package com.company;


import com.sun.jdi.connect.Connector;

public class Main {

    public static void main(String[] args) {


        EventClass event;
        event = new EventClass();


        // javabean with string name and string action

        // write event log class with following:

        //private List<Event> eventList

        //public boolean addEvent(Event event)

        //public int getNumEvents () which returns the size of the list

        //public EventLog () which initializes the list

//        Throw an IllegalArgumentException if the event parameter is null or if either if the two variables of event are null.
//                If both parameters are set then print the event to the console and add it to the list.
//                The return value from the addEvent method should be true.


//        The requirements have changed. action can only be one of the following values:
//
//        "Face2Face"
//        "PhoneCall"
//        "TextMessaging"
//        "Unknown"
//        The action variable in Event has to stay a String for backwards compatibility.
//
//        Add a new test method for this requirement. Again, you will need to test that an
//        exception is thrown properly and that a "good" event can still be added. Then, add
//        a check in the addEvent method to validate the String value. If not valid throw an
//        IllegalArgumentException.
    }
}
