package org.dbest.exception;

import org.dbest.commons.DbestStrings;

public class DbestTypeException extends DbestException {
    private static final long serialVersionUID= -8201280079805581435L;

    public DbestTypeException(String message) {
        super(message);
    }
    public DbestTypeException(Object obj){
        super(DbestStrings.EXCEPTION_OBJECT_TYPE+obj.getClass().toString());
    }
}
