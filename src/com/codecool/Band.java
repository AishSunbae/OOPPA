package com.codecool;

public class Band {
    private String name;
    private PlayStyle style;

    public Band(String name, PlayStyle style) {
        this.name = name;
        this.style = style;
    }

    public PlayStyle getStyle() {
        return style;
    }
}
