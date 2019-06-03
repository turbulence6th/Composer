package com.turbulence6th;

public class ChordManager {

    public OctavedChord major(Note note, int octave) {
        OctavedNote octavedNote = new OctavedNote(note, octave);

        OctavedChord octavedChord = new OctavedChord();
        octavedChord.add(octavedNote);
        octavedChord.add(octavedNote = octavedNote.major3());
        octavedChord.add(octavedNote.minor3());

        return octavedChord;
    }

    public OctavedChord minor(Note note, int octave) {
        OctavedNote octavedNote = new OctavedNote(note, octave);

        OctavedChord octavedChord = new OctavedChord();
        octavedChord.add(octavedNote);
        octavedChord.add(octavedNote = octavedNote.minor3());
        octavedChord.add(octavedNote.major3());

        return octavedChord;
    }

    public OctavedChord augmented(Note note, int octave) {
        OctavedNote octavedNote = new OctavedNote(note, octave);

        OctavedChord octavedChord = new OctavedChord();
        octavedChord.add(octavedNote);
        octavedChord.add(octavedNote = octavedNote.major3());
        octavedChord.add(octavedNote.major3());

        return octavedChord;
    }

    public OctavedChord dimished(Note note, int octave) {
        OctavedNote octavedNote = new OctavedNote(note, octave);

        OctavedChord octavedChord = new OctavedChord();
        octavedChord.add(octavedNote);
        octavedChord.add(octavedNote = octavedNote.minor3());
        octavedChord.add(octavedNote.minor3());

        return octavedChord;
    }

    public OctavedChord major7(Note note, int octave) {
        OctavedNote octavedNote = new OctavedNote(note, octave);

        OctavedChord octavedChord = new OctavedChord();
        octavedChord.add(octavedNote);
        octavedChord.add(octavedNote = octavedNote.major3());
        octavedChord.add(octavedNote = octavedNote.minor3());
        octavedChord.add(octavedNote.major3());

        return octavedChord;
    }

    public OctavedChord minor7(Note note, int octave) {
        OctavedNote octavedNote = new OctavedNote(note, octave);

        OctavedChord octavedChord = new OctavedChord();
        octavedChord.add(octavedNote);
        octavedChord.add(octavedNote = octavedNote.minor3());
        octavedChord.add(octavedNote = octavedNote.major3());
        octavedChord.add(octavedNote.minor3());

        return octavedChord;
    }

    public OctavedChord dominant7(Note note, int octave) {
        OctavedNote octavedNote = new OctavedNote(note, octave);

        OctavedChord octavedChord = new OctavedChord();
        octavedChord.add(octavedNote);
        octavedChord.add(octavedNote = octavedNote.major3());
        octavedChord.add(octavedNote = octavedNote.minor3());
        octavedChord.add(octavedNote.minor3());

        return octavedChord;
    }

    public OctavedChord diminished7(Note note, int octave) {
        OctavedNote octavedNote = new OctavedNote(note, octave);

        OctavedChord octavedChord = new OctavedChord();
        octavedChord.add(octavedNote);
        octavedChord.add(octavedNote = octavedNote.minor3());
        octavedChord.add(octavedNote = octavedNote.minor3());
        octavedChord.add(octavedNote.minor3());

        return octavedChord;
    }

    public OctavedChord major9(Note note, int octave) {
        OctavedNote octavedNote = new OctavedNote(note, octave);

        OctavedChord octavedChord = new OctavedChord();
        octavedChord.add(octavedNote);
        octavedChord.add(octavedNote = octavedNote.major3());
        octavedChord.add(octavedNote = octavedNote.minor3());
        octavedChord.add(octavedNote = octavedNote.major3());
        octavedChord.add(octavedNote.minor3());

        return octavedChord;
    }

    public OctavedChord minor9(Note note, int octave) {
        OctavedNote octavedNote = new OctavedNote(note, octave);

        OctavedChord octavedChord = new OctavedChord();
        octavedChord.add(octavedNote);
        octavedChord.add(octavedNote = octavedNote.minor3());
        octavedChord.add(octavedNote = octavedNote.major3());
        octavedChord.add(octavedNote = octavedNote.minor3());
        octavedChord.add(octavedNote.major3());

        return octavedChord;
    }

    public OctavedChord dominant9(Note note, int octave) {
        OctavedNote octavedNote = new OctavedNote(note, octave);

        OctavedChord octavedChord = new OctavedChord();
        octavedChord.add(octavedNote);
        octavedChord.add(octavedNote = octavedNote.major3());
        octavedChord.add(octavedNote = octavedNote.minor3());
        octavedChord.add(octavedNote = octavedNote.minor3());
        octavedChord.add(octavedNote.major3());

        return octavedChord;
    }
}
