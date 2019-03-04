package org.dbest.exception;

import org.dbest.commons.DBEstStrings;

public class DBEstTypeException extends DBEstException{
    private static final long serialVersionUID= -8201280079805581435L;

    public DBEstTypeException(String message) {
        super(message);
    }
    public DBEstTypeException(Object obj){
        super(DBEstStrings.EXCEPTION_OBJECT_TYPE+obj.getClass().toString());
    }
}
