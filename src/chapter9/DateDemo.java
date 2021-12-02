package chapter9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date = new Date();
        System.out.println(sdf.format(date));

        String dateStr = "23/03/2003";
        sdf.parse(dateStr);

        Date parse = sdf.parse(dateStr);
        System.out.println(parse);

    }
}
