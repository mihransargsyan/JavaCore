package homework.read;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static homework.read.MyThread.countOfKeyword;

public class MultithreadRead {

    public static String path = "D:\\JAVA\\sample.txt";

    public static void main(String[] args) throws IOException, InterruptedException {

        long count = Files.lines(Paths.get(path)).count();

        System.out.println("all lines:" + count);
        long currentTime = System.currentTimeMillis();

        List<String> strings = Files.readAllLines(Paths.get(path));

        List<String> subList1 = strings.subList(0, 1000000);
        List<String> subList2 = strings.subList(1000001, 2000000);
        List<String> subList3 = strings.subList(2000001, 3448632);

        MyThread ob1 = new MyThread(subList1);
        MyThread ob2 = new MyThread(subList2);
        MyThread ob3 = new MyThread(subList3);

        ob1.t.join();
        ob2.t.join();
        ob3.t.join();

        System.out.println("found lines :" + countOfKeyword);
        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - currentTime));

    }

}
