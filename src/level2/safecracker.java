package level2;
import java.util.*;
import java.io.*;

/**
* 금고털이
* level 2
* */
public class safecracker {
    public static void main(String args[]) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int total = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        PriorityQueue<Jewel> queue = new PriorityQueue<Jewel>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int weight = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            queue.offer(new Jewel(weight, price));
        }

        int result = 0;

        while(!queue.isEmpty()){
            Jewel jewel = queue.poll();
            if(total < jewel.weight){
                result = result + total * jewel.price;
                break;
            } else {
                result = result + jewel.weight * jewel.price;
                total = total - jewel.weight;
            }
        }

        System.out.print(result + "");
    }

    public static class Jewel implements Comparable<Jewel>{
        public int weight;
        public int price;
        public Jewel(int weight, int price){
            this.weight = weight;
            this.price = price;
        }

        @Override
        public int compareTo(Jewel jewel){
            return this.price < jewel.price ? 1 : -1;
        }
    }
}
