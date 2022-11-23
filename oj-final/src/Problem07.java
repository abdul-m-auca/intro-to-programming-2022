import java.util.*;
import java.io.*;

public class Problem07{
    static int A = 100;
    static int B = 100;
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        for(int i = 0; i < N; i++){
            String input = in.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a > b){
                B -= a;
            }else if(b > a){
                A -= b;
            }
        }

        System.out.println(A + "\n" + B);
        in.close();

    }
}