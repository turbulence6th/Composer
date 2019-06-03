package com.turbulence6th;

public class ScaleManager {

    public Scale chromatic(Note note) {
        Scale scale = new Scale();
        scale.add(note);
        scale.add(note = note.high(1));
        scale.add(note = note.high(1));
        scale.add(note = note.high(1));
        scale.add(note = note.high(1));
        scale.add(note = note.high(1));
        scale.add(note = note.high(1));
        scale.add(note = note.high(1));
        scale.add(note = note.high(1));
        scale.add(note = note.high(1));
        scale.add(note = note.high(1));
        scale.add(note.high(1));
        return scale;
    }

    public Scale major(Note note) {
        Scale scale = new Scale();
        scale.add(note);
        scale.add(note = note.high(2));
        scale.add(note = note.high(2));
        scale.add(note = note.high(1));
        scale.add(note = note.high(2));
        scale.add(note = note.high(2));
        scale.add(note.high(2));
        return scale;
    }

    public Scale minor(Note note) {
        Scale scale = new Scale();
        scale.add(note);
        scale.add(note = note.high(2));
        scale.add(note = note.high(1));
        scale.add(note = note.high(2));
        scale.add(note = note.high(2));
        scale.add(note = note.high(1));
        scale.add(note.high(2));
        return scale;
    }

    public Scale arabic(Note note) {
        Scale scale = new Scale();
        scale.add(note);
        scale.add(note = note.high(2));
        scale.add(note = note.high(2));
        scale.add(note = note.high(1));
        scale.add(note = note.high(1));
        scale.add(note = note.high(2));
        scale.add(note.high(2));
        return scale;
    }

    public Scale pentatonicMinor(Note note) {
        Scale scale = new Scale();
        scale.add(note);
        scale.add(note = note.high(3));
        scale.add(note = note.high(2));
        scale.add(note = note.high(2));
        scale.add(note.high(3));
        return scale;
    }
}
