package com.turbulence6th;

public enum Instrument {

    PIANO(0),
    PERCUSSION(9);

    private int value;

    Instrument(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
