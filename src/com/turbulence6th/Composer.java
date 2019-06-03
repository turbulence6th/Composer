package com.turbulence6th;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.util.Arrays;
import java.util.List;

public class Composer {

    private MidiChannel[] channels;

    public Composer() {

        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            channels = synth.getChannels();
        } catch (MidiUnavailableException e) {
            throw new ComposerException(e);
        }
    }

    public void play(Instrument instrument, OctavedChord chord, int duration) {
        try {
            chord.getNoteList().forEach(note -> channels[instrument.getValue()].noteOn(id(note), 80 ));
            Thread.sleep(duration);
            chord.getNoteList().forEach(note -> channels[instrument.getValue()].noteOff(id(note)));
        } catch (InterruptedException e) {
            throw new ComposerException(e);
        }
    }

    public void play(Instrument instrument, OctavedNote note, int duration) {
        try {
            channels[instrument.getValue()].noteOn(id(note), 80 );
            Thread.sleep(duration);
            channels[instrument.getValue()].noteOff(id(note));
        } catch (InterruptedException e) {
            throw new ComposerException(e);
        }
    }

    private int id(OctavedNote note) {
        return note.getNote().getValue() + note.getOctave() * 12 + 12;
    }
}
