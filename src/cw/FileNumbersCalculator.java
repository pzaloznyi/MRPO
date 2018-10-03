package cw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNumbersCalculator {
    public void Run() throws Exception {
        File currentDir = new File(".");
        HashMap<String, Integer> fileNumbers = new HashMap<>();
        calculateDirectoryContents(currentDir, fileNumbers);
        writeResultData(fileNumbers);
    }

    public void calculateDirectoryContents(File dir, HashMap<String, Integer> hashMap) throws Exception {
        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    calculateDirectoryContents(file, hashMap);
                } else {
                    String filePath = file.getCanonicalPath();
                    String content = readFileAsString(filePath);
                    int sumFromFile = getNumbersFromString(content).stream().mapToInt(a -> a).sum();
                    addNumberToHashMap(hashMap, filePath, sumFromFile);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addNumberToHashMap(HashMap<String, Integer> hashMap, String filePath, int delta) {
        if (hashMap.containsKey(filePath)) {
            var oldValue = hashMap.get(filePath);
            hashMap.put(filePath, oldValue + delta);
        } else {
            hashMap.put(filePath, delta);
        }
    }

    private String readFileAsString(String fileName) throws Exception {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    private List<Integer> getNumbersFromString(String str) {
        List<Integer> numbers = new ArrayList<>();
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(str);
        while (m.find()) {
            numbers.add(Integer.parseInt(m.group()));
        }
        return numbers;
    }

    private void writeResultData(HashMap<String, Integer> hashMap) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(".\\output.txt"));
        Iterator iterator = hashMap.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            writer.write("file: " + pair.getKey() + ", value: " + pair.getValue());
            writer.newLine();
            iterator.remove();
        }
    }
}
