package org.blackcat.Aplication.Exception;

public class SizeMinimalWorldException extends RuntimeException {
    public SizeMinimalWorldException() {
        super("Size minimal can't be minor than 4");
    }
}
