import java.util.*;
import java.io.*;

public class electronicDisplay {
    private static Map<Integer, int[]> map;

    public static void main(String args[]) throws IOException
    {
        StringBuilder sb = new StringBuilder();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        map = new HashMap<>();
        map.put(0, new int[] { 1, 1, 1, 1, 1, 1, 0 });
        map.put(1, new int[] { 0, 1, 1, 0, 0, 0, 0 });
        map.put(2, new int[] { 1, 1, 0, 1, 1, 0, 1 });
        map.put(3, new int[] { 1, 1, 1, 1, 0, 0, 1 });
        map.put(4, new int[] { 0, 1, 1, 0, 0, 1, 1 });
        map.put(5, new int[] { 1, 0, 1, 1, 0, 1, 1 });
        map.put(6, new int[] { 1, 0, 1, 1, 1, 1, 1 });
        map.put(7, new int[] { 1, 1, 1, 0, 0, 1, 0 });
        map.put(8, new int[] { 1, 1, 1, 1, 1, 1, 1 });
        map.put(9, new int[] { 1, 1, 1, 1, 0, 1, 1 });

        for(int t = 0; t<T; t++){
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int[] arrA = new int[5];
            int[] arrB = new int[5];

            Arrays.fill(arrA, -1);
            Arrays.fill(arrB, -1);

            for(int i =0; i<5; i++){
                arrA[i] = A % 10;
                A /= 10;
                if(A == 0) break;
            }

            for(int i =0; i<5; i++){
                arrB[i] = B % 10;
                B /= 10;
                if(B == 0) break;
            }

            int res =0;

            for(int i =0; i<5; i++){
                if(arrA[i] != arrB[i]){
                    if(arrA[i] == -1){
                        res += sum(arrB[i]);
                    }
                    else if(arrB[i] == -1){
                        res += sum(arrA[i]);
                    }
                    else{
                        res += calcDiff(arrA[i], arrB[i]);
                    }
                }
            }
            sb.append(res).append("\n");
        }

        System.out.println(sb);
    }

    private static int calcDiff(int a, int b){
        int[] arrA = map.get(a);
        int[] arrB = map.get(b);

        int cnt = 0;

        for(int i=0; i<7; i++){
            if(arrA[i] != arrB[i]){
                cnt++;
            }
        }

        return cnt;
    }

    private static int sum(int a){
        int[] target = map.get(a);

        int cnt = 0;
        for(int i =0; i<7; i++){
            cnt += target[i];
        }

        return cnt;
    }
}
