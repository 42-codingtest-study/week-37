import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2343 {

    private static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[N];

        int sum = 0;
        int max = 0;
        for (int idx = 0; idx < N; idx++) {
            arr[idx] = Integer.parseInt(st.nextToken());
            sum += arr[idx];
            max = Math.max(max, arr[idx]);
        }

        int left = max;
        int right = sum;
        int mid;
        int count;
        int tmpSum;
        while (left <= right) {
            mid = (left + right) / 2; // size
            count = 0;
            tmpSum = 0;
            for (int idx = 0; idx < N; idx++) {
                if (tmpSum + arr[idx] > mid) {
                    count++;
                    tmpSum = 0;
                }
                tmpSum += arr[idx];
            }
            if (tmpSum != 0)
                count++;
            if (M >= count) { // 담야아 하는 횟수 > 실제로 담은 횟수 -> 더 작은 그릇으로 여러번 담아야 하므로 sizeDown
                right = mid - 1;
            } else if (M < count) {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }

}
