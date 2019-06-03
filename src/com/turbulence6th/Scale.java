package com.turbulence6th;

import java.util.ArrayList;
import java.util.List;

public class Scale {

    private List<Note> noteList = new ArrayList<>();

    public Chord chord(Note note) {
        Chord chord = new Chord();
        chord.add(note);
        chord.add(noteList.get((noteList.indexOf(note) + 2) % noteList.size()));
        chord.add(noteList.get((noteList.indexOf(note) + 4) % noteList.size()));
        return chord;
    }

    public OctavedChord octavedChord(Note note, int octave) {
        OctavedChord octavedChord = new OctavedChord();
        OctavedNote octavedNote = new OctavedNote(note, octave);
        octavedChord.add(octavedNote);
        Chord chord = chord(note);
        for (int i = 1; i < chord.getNoteList().size(); i++) {
            if (chord.getNoteList().get(i).getValue() < octavedNote.getNote().getValue()) {
                octave++;
            }

            octavedChord.add(new OctavedNote(chord.getNoteList().get(i), octave));
        }

        return octavedChord;
    }

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
