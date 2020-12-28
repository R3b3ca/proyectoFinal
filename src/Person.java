package com.Rebeca.ds.ChicagoAnalysis;
public class Person {
    protected String name;
    protected String lastname;

    public Person(final String name, final String lastname) {
        super();
        this.name = name.replace ( "\"", "");
        this.lastname = lastname.replace (  "\"",  "");
    }

    public String toString() {
        return "{\"name\":\""+ this.name + "\", \"lastname\":\"" + this.lastname + "\" }";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
