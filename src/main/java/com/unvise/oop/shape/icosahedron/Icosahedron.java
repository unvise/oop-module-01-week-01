package com.unvise.oop.shape.icosahedron;

import com.unvise.oop.shape.Shape;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Icosahedron extends Shape {
    @Builder.Default
    private Double finLength = 0d;

    @Override
    public Double volume() {
        return 5d / 12 * (3 + Math.sqrt(5)) * Math.pow(finLength, 3);
    }
}
