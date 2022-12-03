package org.blackcat.Entity;

import org.blackcat.Aplication.Exception.SizeMinimalWorldException;

public class SizeWorld {
    public final int sizeX;
    public final int sizeY;

    public SizeWorld(int sizeX, int sizeY) {

        if (sizeX < 4 || sizeY < 4) {
            throw new SizeMinimalWorldException();
        }

        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
}
