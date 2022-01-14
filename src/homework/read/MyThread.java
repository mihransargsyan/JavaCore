package homework.read;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class MyThread implements Runnable {

    public static String path = "D:\\JAVA\\sample.txt";
    public static AtomicInteger countOfKeyword = new AtomicInteger();
    public List<String> strings;
    Thread t;

    MyThread(List<String> string) {
        strings = string;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        String keyword = ";";
        for (String string : strings) {
            if (string.contains(keyword)) {
                countOfKeyword.incrementAndGet();
            }
        }
    }

}
