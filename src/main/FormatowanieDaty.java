package main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatowanieDaty {
    public static void main(String[] arg) {

        Date data = new Date();
        System.out.println(data);

        SimpleDateFormat formatowanie = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss Z");
        String strData = formatowanie.format(data);
        System.out.println(strData);



    }
}
