import static java.lang.Math.min;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1300 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int left = 1;
        int right = K;

        while (left < right) {
            int mid = (left + right) / 2;
            long count = 0;

            for (int idx = 1; idx <= N; idx++) {
                count += min(mid / idx, N);
            }
            if (count >= K) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);

    }

}
