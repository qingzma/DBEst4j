package org.dbest.sqlreader;


import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
/** Error Listener of Antlr parser. Throw Runtime error once parser fails. */
public class DBEstErrorListener extends BaseErrorListener{
    @Override
    public void syntaxError(
            Recognizer<?, ?> recognizer,
            Object offendingSymbol,
            int line,
            int charPositionInLine,
            String msg,
            RecognitionException e) {
        throw new RuntimeException(String.format("syntax error occurred:%s", msg));
    }
}
