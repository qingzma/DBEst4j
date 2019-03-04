package org.dbest.exception;

public class DBEstDbmsException extends DBEstException{
    private static final long serialVersionUID = -3696910559441325383L;

    public DBEstDbmsException(String message) {
        super(message);
    }

    public DBEstDbmsException(Exception e) {
        this(e.getMessage());
    }
}
