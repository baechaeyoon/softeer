package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 지도 자동 구축
 * level 2
 * */

public class buildMapAutomatically {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 2;
        int num = Integer.parseInt(st.nextToken());

        for(int i = 0; i<num; i++){
            answer *= 2;
            answer--;
        }

        System.out.println(answer*answer);
    }
}
