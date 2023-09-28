package com.example.rso_java_az;

public class User {
    private String ime;
    private String priimek;
    private String geslo;
    public User(String i, String p, String g){
        this.ime = i;
        this.priimek = p;
        this.geslo = g;
    }
    public String getGeslo() {
        return geslo;
    }

    public String getIme() {
        return ime;
    }

    public String getPriimek() {
        return priimek;
    }

    public void setGeslo(String geslo) {
        this.geslo = geslo;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPriimek(String priimek) {
        this.priimek = priimek;
    }
}
