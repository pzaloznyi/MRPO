package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleUtils {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedReader getBufferedReader() {
        return bufferedReader;
    }
}
