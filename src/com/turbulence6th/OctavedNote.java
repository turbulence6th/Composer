package com.turbulence6th;

public class OctavedNote {

    private final Note note;
    private final int octave;

    public OctavedNote(Note note, int octave) {
        this.note = note;
        this.octave = octave;
    }

    public OctavedNote high(int value) {
        Note nextNote = note.high(value);
        if (nextNote.getValue() < note.getValue()) {
            return new OctavedNote(nextNote, octave + 1);
        }

        return new OctavedNote(nextNote, octave);
    }

    public OctavedNote minor2() {
        return high(1);
    }

    public OctavedNote major2() {
        return high(2);
    }

    public OctavedNote minor3() {
        return high(3);
    }

    public OctavedNote major3() {
        return high(4);
    }

    public OctavedNote full4() {
        return high(5);
    }

    public OctavedNote augmented4() {
        return high(6);
    }

    public OctavedNote full5() {
        return high(7);
    }

    public Note getNote() {
        return note;
    }

    public int getOctave() {
        return octave;
    }
}
