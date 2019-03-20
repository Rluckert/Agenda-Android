package com.example.agenda;

import java.util.ArrayList;

public class Data {
    private static ArrayList<Contact> Contacts = new ArrayList<>();

    public static void Save(Contact c){ Contacts.add(c);}
    public ArrayList<Contact> Get(){ return Contacts;}


}
