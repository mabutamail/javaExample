package com.github.mabutamail.javatemplate.core.enumtemp;

public enum Season {
    WINTER("зима"), SPRING("весна"), SUMMER("лето"), AUTUMN("осень");
    private final String translation;

    Season(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Season{" +
                "translation='" + translation + '\'' +
                '}';
    }
}