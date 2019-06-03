package com.turbulence6th;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Composer composer = new Composer();
	    ScaleManager scaleManager = new ScaleManager();
	    ChordManager chordManager = new ChordManager();
	    Note rootNote = Note.A;

	    composer.play(Instrument.PIANO, chordManager.major(Note.A, 4), 2000);

//        Scale scale = scaleManager.minor(rootNote);
//        List<OctavedChord> chordList = scale.allOctavedChords(4);
//
//        int chordSize = chordList.size();
//
//        while (true) {
//            composer.play(Instrument.PIANO, chordList.get(0), 1000);
//            composer.play(Instrument.PIANO, chordList.get(0).get(2), 500);
//            composer.play(Instrument.PIANO, chordList.get(0).get(1), 500);
//
//            composer.play(Instrument.PIANO, chordList.get(chordSize - 1), 1000);
//            composer.play(Instrument.PIANO, chordList.get(chordSize - 1).get(2), 250);
//            composer.play(Instrument.PIANO, chordList.get(chordSize - 1).get(1), 250);
//            composer.play(Instrument.PIANO, chordList.get(chordSize - 1).get(2), 500);
//
//            composer.play(Instrument.PIANO, chordList.get(chordSize - 2), 1000);
//            composer.play(Instrument.PIANO, chordList.get(chordSize - 2).get(1), 500);
//            composer.play(Instrument.PIANO, chordList.get(chordSize - 2).get(2), 500);
//
//            composer.play(Instrument.PIANO, chordList.get(chordSize - 3), 1000);
//            composer.play(Instrument.PIANO, new OctavedNote(rootNote.low(1), 4), 1000);
//        }
    }
}
