package com.stalight.crystal.util;

public enum ColorUtil {
    WHITE("white", 1),
    LIGHT_GRAY("light", 2),
    GRAY("gray", 3),
    BLACK("black", 4),
    RED("red", 5),
    ORANGE("orange", 6),
    YELLOW("yellow", 7),
    LIME("lime", 8),
    GREEN("green", 9),
    CYAN("cyan", 10),
    LIGHT_BLUE("light_blue", 11),
    BLUE("blue", 12),
    MAGENTA("magenta", 13),
    PURPLE("purple", 14),
    PINK("pink", 15);

    private final String id;
    private final int i;

    ColorUtil(String id, int index) {
        this.id = id;
        this.i = index;
    }

    public String getId() {
        return id;
    }

    public int getIndex() {
        return i;
    }
}
