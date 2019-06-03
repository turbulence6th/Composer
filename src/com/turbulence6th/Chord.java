package com.turbulence6th;

import java.util.ArrayList;
import java.util.List;

public class Chord {

    private List<Note> noteList = new ArrayList<>();

    public List<Note> getNoteList() {
        return new ArrayList<>(noteList);
    }

    public void add(Note note) {
        noteList.add(note);
    }

    @Override
    public String toString() {
        return noteList.toString();
    }
}