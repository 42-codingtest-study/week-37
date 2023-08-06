import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1920 {
    private static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr;
        arr = generateArr(N, st);

        Arrays.sort(arr);

        BOJ_1920 findNumberPrinter = new BOJ_1920();
        findNumberPrinter.binarySearch(br, arr);
    }

    private static int[] generateArr(int N, StringTokenizer st) {
        int[] arr;
        arr = new int[N];
        for (int idx = 0; idx < N; idx++) {
            arr[idx] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }

    private void binarySearch(BufferedReader br, int[] arr) throws IOException {
        StringTokenizer st;
        M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int idx = 0; idx < M; idx++) {
            int target = Integer.parseInt(st.nextToken());
            boolean flag = false;
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int midIndex = (start + end) / 2;
                int midValue = arr[midIndex];

                if (target < midValue) {
                    end = midIndex - 1;
                } else if (target > midValue){
                    start = midIndex + 1;

                } else if (target == midValue) {
                    flag = true;
                    break;
                }
            }
            printResult(flag);
        }
    }

    private static void printResult(boolean flag) {
        if (flag) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
