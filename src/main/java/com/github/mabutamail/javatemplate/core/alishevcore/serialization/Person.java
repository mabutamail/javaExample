package com.github.mabutamail.javatemplate.core.alishevcore.serialization;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 7235965464939155147L;

    transient int id;
    String name;

    public String toString() {
        return id + ":" + name;
    }
}