import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1541 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inputSt = new StringTokenizer(br.readLine(), "-");

        boolean flag = false;
        int sum = 0;
        while (inputSt.hasMoreTokens()) {

            StringTokenizer subsetSt = new StringTokenizer(inputSt.nextToken(), "+");
            int tmpSum = 0;
            while (subsetSt.hasMoreTokens()) {
                tmpSum += Integer.parseInt(subsetSt.nextToken());
            }
            if (!flag) {
                sum = tmpSum;
                flag = true;
            } else {
                sum -= tmpSum;
            }
        }
        System.out.println(sum);

    }

}
