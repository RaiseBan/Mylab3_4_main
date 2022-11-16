package Exceptions;

import java.io.IOException;

public class OutputException extends IOException {
    public OutputException(String massage){
        super(massage);
    }
}
