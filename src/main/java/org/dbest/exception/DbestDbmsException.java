package org.dbest.exception;

public class DbestDbmsException extends DbestException {
    private static final long serialVersionUID = -3696910559441325383L;

    public DbestDbmsException(String message) {
        super(message);
    }

    public DbestDbmsException(Exception e) {
        this(e.getMessage());
    }
}
