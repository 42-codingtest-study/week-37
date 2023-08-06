public class Office {

    public int solution(int[][] office, int k) {
        int answer = 0;

        int n = office.length;
        for (int i = 0; i <= n - k; i++) {
            for (int j = 0; j <= n - k; j++) {
                int sum = 0;
                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        sum += office[x][y];
                    }
                }
                answer = Math.max(answer, sum);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Office solution = new Office();

        int[][] office1 = {
            {1, 0, 0, 0},
            {0, 0, 0, 1},
            {0, 0, 1, 0},
            {0, 1, 1, 0}
        };
        int k1 = 2;
        System.out.println(solution.solution(office1, k1)); // Output: 3

        int[][] office2 = {
            {1, 0, 0},
            {0, 0, 1},
            {1, 0, 0}
        };
        int k2 = 2;
        System.out.println(solution.solution(office2, k2)); // Output: 1
    }
}
