package com.turbulence6th;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Composer composer = new Composer();
	    ScaleManager scaleManager = new ScaleManager();
        Scale scale = scaleManager.minor(Note.A);
        List<OctavedChord> chordList = Arrays.asList(
            scale.octavedChord(Note.A, 4),
            scale.octavedChord(Note.G, 4),
            scale.octavedChord(Note.F, 4),
            scale.octavedChord(Note.E, 4)
        );

        int divide = 8;
        int duration = 200;

        for (int i = 0;; i = (i + 1) % 4) {
            int remaining = divide;
            int c = 1 + new Random().nextInt(remaining);

            composer.play(Instrument.PIANO, chordList.get(i), c * duration);
            remaining -= c;

            while (remaining != 0) {
                c = 1 + new Random().nextInt(remaining);
                composer.play(Instrument.PIANO, chordList.get(i).getNoteList().get(new Random().nextInt(3)), c * duration);
                remaining -= c;
            }
        }
    }
}
