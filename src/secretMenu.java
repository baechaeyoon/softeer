import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 비밀메뉴
 * level 2
 * */

public class secretMenu {

    public static void main(String[] args) throws IOException{
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());


                StringBuilder mlist = new StringBuilder();
                st = new StringTokenizer(br.readLine());
                for(int i = 0; i<M; i++){
                    mlist.append(st.nextToken());
                }

                StringBuilder nlist = new StringBuilder();
                st = new StringTokenizer(br.readLine());
                for(int i = 0; i<N; i++){
                    nlist.append(st.nextToken());
                }

                if(N < M) System.out.println("normal");
                else{
                    if(nlist.toString().contains(mlist.toString())) System.out.println("secret");
                    else System.out.println("normal");
                }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
