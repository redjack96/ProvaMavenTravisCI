package com.giacomolorenzo.rossi;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class HelloTravisMaven {
    public static void main(String[] args) {
        Logger.getGlobal().log(new LogRecord(Level.INFO, "Hello TravisCI and Maven!"));
    }
}
