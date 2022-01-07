package homework.fileExample;

import java.io.*;

public class FileUtil1 {

    public static void findLines(File path, String keyword) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static long size = 0;

    public static long printSizePackage(File file) {
        for (File files : file.listFiles()) {
            if (files.isDirectory()) {
                printSizePackage(files);
            }
            size += files.length();
        }
        return size / 1024 / 1024;
    }

    public static void createFileWithContent(String path, String fileName, String content) throws IOException {

        File file = new File(path + "\\" + fileName);
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("File is created!");
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                    bw.write(content);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.err.println("FileName deos not exists");
        }
    }

}
