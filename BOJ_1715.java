import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_1715 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int result = 0;

        for (int idx = 0; idx < N; idx++) {
            pq.add(Integer.parseInt(br.readLine()));
        }
        while (pq.size() != 1) {
            int sum = pq.poll() + pq.poll();
            result += sum;
            pq.add(sum);
        }
        System.out.println(result);
    }
}
