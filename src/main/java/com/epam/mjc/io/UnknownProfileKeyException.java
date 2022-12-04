package com.epam.mjc.io;

public class UnknownProfileKeyException extends Exception {

    public UnknownProfileKeyException(String key) {
        super("There is unknown key: " + key);
    }

}
