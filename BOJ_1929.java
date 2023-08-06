import java.io.*;
import java.util.*;

public class BOJ_1929 {

    private static int[] primeNumber;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        erasto(N);

        for (int idx = M; idx <= N; idx++) {
            if (primeNumber[idx] != 0) {
                bw.write(idx + "\n");
            }
        }
        bw.flush();
    }

    private static void erasto(int N) {
        primeNumber = new int[N + 1];

        for (int idx = 2; idx <= N; idx++) {
            primeNumber[idx] = idx;
        }
        for (int idx = 2; idx <= Math.sqrt(N); idx++) {
            if (primeNumber[idx] == 0) {
                continue;
            }
            for (int div = idx * 2; div <= N; div += idx) {
                primeNumber[div] = 0;
            }
        }
    }
}
