package org.blackcat.Aplication.Exception;

public class CoordinateOutBoundException extends RuntimeException {
    public CoordinateOutBoundException() {
        super("Indexes can't be negative");
    }

    public CoordinateOutBoundException(String msg) {
        super(msg);
    }
}
