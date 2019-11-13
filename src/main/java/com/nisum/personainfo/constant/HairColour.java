package com.nisum.personainfo.constant;

public enum HairColour {
    BLACK("black"),
    RED("red"),
    BROWN("brown"),
    WHITE("white"),
    YELLOW("yellow"),
    ;

    private String value;

    HairColour(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
