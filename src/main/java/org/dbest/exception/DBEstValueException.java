package org.dbest.exception;

public class DBEstValueException extends DBEstException {
    private static final long serialVersionUID = -6817372602616960842L;

    public DBEstValueException(String message) {
        super(message);
    }

    public DBEstValueException(Exception e){
        super(e.getMessage());
    }
}
