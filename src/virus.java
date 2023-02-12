import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 바이러스
 * level 2
 * */

public class virus {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //바이러스 수 K
        int K = Integer.parseInt(st.nextToken());
        //증가율 P
        int P = Integer.parseInt(st.nextToken());
        //총 시간 N
        int N = Integer.parseInt(st.nextToken());

        long answer = K;
        for(int i =1; i<= N; i++){
            answer = (answer * P)%1000000007;
        }
        System.out.println(answer);
    }
}
