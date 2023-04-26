package com.github.alrumbl4.mobile_test_mishka.helpers;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetAbsolutePath {

    public static String getAbsolutePath(String filePath) {
        File file = new File(filePath);
        assertTrue(file.exists(), filePath + " Не найден");
        return file.getAbsolutePath();
    }
}
