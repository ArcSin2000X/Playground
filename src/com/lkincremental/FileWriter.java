package com.lkincremental;

import java.io.File;

public class FileWriter {
    private static File
    private static FileWriter ourInstance = new FileWriter();

    public static FileWriter getInstance() {
        return ourInstance;
    }

    private FileWriter() {}
}
