import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1456 {

    private static int[] primeNumber;
    private static final int MAX = 10000001;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        erosto();
        System.out.println(countAlmostPrimeNumber((double) A, (double) B));
    }

    private static int countAlmostPrimeNumber(double A, double B) {
        int count = 0;
        for (int idx = 2; idx < MAX; idx++) {
            if (primeNumber[idx] != 0) {
                long temp = primeNumber[idx];
                while ((double)primeNumber[idx] <= B / (double)temp) {
                    if ((double)primeNumber[idx] >= A / (double)temp) {
                        count++;
                    }
                    temp *= primeNumber[idx];
                }
            }
        }
        return count;
    }

    private static void erosto() {
        primeNumber = new int[MAX];
        primeNumber[0] = primeNumber[1] = 0;
        for (int idx = 2; idx < MAX; idx++) {
            primeNumber[idx] = idx;
        }

        for (int idx = 2; idx < Math.sqrt(MAX); idx++) {
            if (primeNumber[idx] == 0) {
                continue;
            }
            for (int div = idx * 2; div < MAX; div += idx) {
                primeNumber[div] = 0;
            }
        }
    }
}
