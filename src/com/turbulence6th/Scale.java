package com.turbulence6th;

import java.util.ArrayList;
import java.util.List;

public class Scale {

    private List<Note> noteList = new ArrayList<>();

    public void add(Note note) {
        noteList.add(note);
    }

    public Note get(int index) {
        return noteList.get(index);
    }

    @Override
    public String toString() {
        return noteList.toString();
    }
}
