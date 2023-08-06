import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_1744 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> positiveList = new ArrayList<>();
        List<Integer> negativeList = new ArrayList<>();

        for (int idx = 0; idx < N; idx++) {
            int input = Integer.parseInt(br.readLine());

            if (input > 0) {
                positiveList.add(input);
            } else {
                negativeList.add(input);
            }
        }
        Collections.sort(positiveList, Collections.reverseOrder());
        Collections.sort(negativeList);

        int sum = 0;
        for (int idx = 0; idx < positiveList.size(); idx++) {
            if (idx + 1 < positiveList.size() && positiveList.get(idx) != 1 && positiveList.get(idx + 1) != 1) {
                sum += positiveList.get(idx++) * positiveList.get(idx);
            } else {
                sum += positiveList.get(idx);
            }
        }

        for (int idx = 0; idx < negativeList.size(); idx++) {
            if (idx + 1 < negativeList.size()) {
                sum += negativeList.get(idx++) * negativeList.get(idx);
            } else {
                sum += negativeList.get(idx);
            }
        }
        System.out.println(sum);
    }

}
