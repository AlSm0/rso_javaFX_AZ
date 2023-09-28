package com.example.rso_java_az;

public class BirthdayEvent extends Event{
    private int birthdate;
    public BirthdayEvent(String i, String im, String d, int da){
        super(i, im, d);
        this.birthdate = da;
    }

    @Override
    public String getDate() {
        return super.getDate();
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getIme() {
        return super.getIme();
    }

    public int getBirthdate() {
        return birthdate;
    }

    @Override
    public void setDate(String date) {
        super.setDate(date);
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public void setIme(String ime) {
        super.setIme(ime);
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }
}
