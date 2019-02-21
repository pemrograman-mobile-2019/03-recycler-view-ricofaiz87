package com.example.rico.recyclerview.models;

import java.util.ArrayList;

public class Contact {
    private String mName;
    private boolean nOnLine;
}
    public Contact (String mName, boolean nOnLine) {
    this.mName = mName;
    this.nOnLine = nOnLine;
    }

public String getmName() {return mName;}

public boolean isnOnLine() {return nOnLine;}
private static int lastContactId = 0;
public static ArrayList<Contact> createContactList
