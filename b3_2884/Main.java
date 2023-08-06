package b3_2884;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        alarm(h, m);
    }
    static void alarm(int h, int m) {
        int al_h = h, al_m = m;

        if(m < 45) {
            al_m = m + 15;
            if(h == 0) al_h = 23;
            else al_h = h - 1;

        }
        else al_m = m - 45;
        System.out.print(al_h);
        System.out.print(" ");
        System.out.print(al_m);

    }
}
