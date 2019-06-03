package com.turbulence6th;

public class OctavedNote {

    private final Note note;
    private final int octave;

    public OctavedNote(Note note, int octave) {
        this.note = note;
        this.octave = octave;
    }

    public OctavedNote fullQuartet() {
        Note fullQuartetNote = note.high(5);
        if (fullQuartetNote.getValue() < note.getValue()) {
            return new OctavedNote(fullQuartetNote, octave + 1);
        }

        return new OctavedNote(fullQuartetNote, octave);
    }

    public OctavedNote fullPenta() {
        Note fullPenta = note.high(7);
        if (fullPenta.getValue() < note.getValue()) {
            return new OctavedNote(fullPenta, octave + 1);
        }

        return new OctavedNote(fullPenta, octave);
    }

    public Note getNote() {
        return note;
    }

    public int getOctave() {
        return octave;
    }
}
