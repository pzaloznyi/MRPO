package lab1;

import utils.ConsoleUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// Variant 17
public class Lab1 {
    public static void Lab1_1() {
        String s = "dfsjglfdjgdfg8g9g-34t4  sfaffaf\'f 'sd;fl s ";

        System.out.println("String before format: " + s);
        System.out.println("String after format: " + Lab1(s));
    }

    public static void Lab1_2() throws IOException{
        BufferedReader reader = ConsoleUtils.getBufferedReader();
        System.out.print("Enter a string: ");
        String s = reader.readLine();
        System.out.println("String before format: " + s);
        System.out.println("String after format: " + Lab1(s));
    }

    private static String Lab1(String s) {
        StringBuffer sb = new StringBuffer();
        for (char c :s.toCharArray()) {
            if (c == 32 || (c >= 65 && c <= 90) || (c >= 97 && c <= 122))
                sb.append(c);
        }
        return sb.toString();
    }
}
