package fileExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileExample {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\NZP\\IdeaProjects\\JavaCore\\src\\homework\\fileExample\\testFolder";
               File file = new File(path);

//        System.out.println(file.exists());
//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());

//        if (!file.exists()) {
//            if (file.createNewFile()) {
//                System.out.println("File is created!");
//            }
//        }

//        if (file.exists()) {
//            file.delete();
//        }

//        File[] files = file.listFiles();
//        for (File singleFile : files) {
//            String name = singleFile.getName();
//            if (!singleFile.isHidden() && name.contains(".")) {
//                String[] split = name.split("\\.");
//                System.out.println(split[split.length - 1]);
//            }
//        }

//       File [] files = file.listFiles();
//        for (File singlFile : files) {
//            System.out.println(singlFile.length());
//        }

//        try {
//            BufferedReader inputStream = new BufferedReader(new FileReader(path + "//" + "example2.TXT"));
//            String line;
//            while ((line = inputStream.readLine()) != null) {
//                if (line.contains("java")) {
//                    File file = new File(path + "//" + "example2.TXT");
//                    System.out.println(file.list());
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
