package homework.fileExample;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileUtilTest {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        //       Առաջադրանք 3 ․ 1

        System.out.println("Please input path");
        String pathStr = scanner.nextLine();
        File path = new File(pathStr);
        if (!path.exists() || path.isDirectory()) {
            System.err.println("Path deos not exists or is not directory");
        } else {
            System.out.println("please input keyword");
            String keyword = scanner.nextLine();
            FileUtil.findLines(path, keyword);
        }

        //       Առաջադրանք 3 ․ 2

        System.out.println("Please input path");
        String pathOfPackage = scanner.nextLine();
        File file = new File(pathOfPackage);
        if (file.exists() && file.isDirectory()) {
            System.out.println(FileUtil.printSizePackage(file) + " mb");
        } else {
            System.err.println("Path deos not exists or is not directory");
        }

        //       Առաջադրանք 3 ․ 3

//        System.out.println("Please input path");
//        String path = scanner.nextLine();
//        File file = new File(path);
//        if (!file.exists() || file.isFile()) {
//            System.err.println("Path deos not exists or is not directory");
//        } else {
//            System.out.println("please input file name");
//            String fileName = scanner.nextLine();
//            System.out.println("please input content");
//            String content = scanner.nextLine();
//            FileUtil.createFileWithContent(path, fileName, content);
//        }

    }
}
