package com.example.rso_java_az;

import java.util.ArrayList;

public class EventList {
    private String id;
    private String ime;
    private int timeDiff;
    private ArrayList<Event> dogodki;
    private int calculateTimeDiff(Event e){
        //?
        return 0;
    }
    public EventList(String i){
        this.id = i;
        dogodki = new ArrayList<Event>();
        this.timeDiff = Integer.MAX_VALUE;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public String getId() {
        return id;
    }

    public int getTimeDiff() {
        return timeDiff;
    }
    public void addEvent(Event e){
        dogodki.add(e);
    }
}
