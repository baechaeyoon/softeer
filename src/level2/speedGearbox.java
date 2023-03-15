package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 8단변속기
 * level 2
 * */

public class speedGearbox {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];
        String answer = null;

        try{

            for(int i = 0; i<arr.length; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for(int i =0; i<arr.length-1; i++){
                if(arr[i+1] == arr[i]+1){
                    answer = "ascending";
                }
                else if(arr[i+1] == arr[i]-1){
                    answer = "descending";
                }
                else{
                    answer = "mixed";
                    break;
                }
            }
             System.out.println(answer);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
