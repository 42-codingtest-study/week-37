import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_1931 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int[][] time = new int[N][2];

        for (int idx = 0; idx < N; idx++) {
            st = new StringTokenizer(br.readLine());
            time[idx][0] = Integer.parseInt(st.nextToken());
            time[idx][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int endTime = 0;
        for (int idx = 0; idx < N; idx++) {
            if (endTime <= time[idx][0]) {
                endTime = time[idx][1];
                count++;
            }
        }
        System.out.println(count);
    }

}
