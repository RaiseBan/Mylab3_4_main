package actions;

import Exceptions.LengthOfSentenceException;

public interface Communicate {
    void toCommunicate(String str) throws LengthOfSentenceException;

}
