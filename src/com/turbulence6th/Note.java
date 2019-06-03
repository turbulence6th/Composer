package com.turbulence6th;

public enum Note {

    C(0),
    C_SHARP(1),
    D(2),
    D_SHARP(3),
    E(4),
    F(5),
    F_SHARP(6),
    G(7),
    G_SHARP(8),
    A(9),
    A_SHARP(10),
    B(11);

    public static Note getByValue(int value) {
        return values()[value];
    }

    private int value;

    Note(int value) {
        this.value = value;
    }

    public Note low(int i) {
        return getByValue((value - i) % 12);
    }

    public Note high(int i) {
        return getByValue((value + i) % 12);
    }

    public int getValue() {
        return value;
    }
}
