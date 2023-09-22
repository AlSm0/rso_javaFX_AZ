package com.example.rso_java_az;

public class Event {
    private String id;
    private String ime;
    private String date;
    public Event(String i, String im, String d){
        this.id = i;
        this.ime = im;
        this.date = d;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getDate() {
        return date;
    }

    public String getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }
}
