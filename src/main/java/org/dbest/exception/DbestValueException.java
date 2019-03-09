package org.dbest.exception;

public class DbestValueException extends DbestException {
    private static final long serialVersionUID = -6817372602616960842L;

    public DbestValueException(String message) {
        super(message);
    }

    public DbestValueException(Exception e){
        super(e.getMessage());
    }
}
