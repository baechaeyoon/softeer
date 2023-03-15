package level1;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * 근무 시간
 * level 1
 */

public class workingHours {
    public static void main(String args[])
    {
        try{
            int answer = 0;

            Scanner sc = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

            for(int i =0; i<5; i++){

                String start = sc.next();
                String end = sc.next();

                Date startTime = sdf.parse(start);
                Date endTime = sdf.parse(end);

                long timeStart = startTime.getTime();
                long timeEnd = endTime.getTime();

                long diff = timeEnd - timeStart;

                long diffMin = diff  /(1000 * 60);

                answer += diffMin;
            }

            System.out.println(answer);
        }
        catch(ParseException e){
            e.printStackTrace();
        }

    }
}
