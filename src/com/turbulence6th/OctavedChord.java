package com.turbulence6th;

import java.util.ArrayList;
import java.util.List;

public class OctavedChord {

    private List<OctavedNote> octavedNoteList = new ArrayList<>();

    public List<OctavedNote> getNoteList() {
        return new ArrayList<>(octavedNoteList);
    }

    public void add(OctavedNote note) {
        octavedNoteList.add(note);
    }

    @Override
    public String toString() {
        return octavedNoteList.toString();
    }

}
