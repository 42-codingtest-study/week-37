public class ZigZag {

    public static int solution(int N, int row, int col) {
        row--;
        col--;
        int sum = row + col;

        if (sum % 2 != 0) {
            if (sum >= N + 1) {
                int maxRow = (N - 1) - Math.min(sum, N - 1);
                int minRow = (N - 1) -  Math.max(0, sum - (N - 1));

                return (N * N) - ((minRow + maxRow) * (minRow + maxRow + 1) / 2 + (N - 1 - row + minRow));

            }
            int maxRow = Math.min(sum, N - 1);
            int minRow = Math.max(0, sum - (N - 1));

            return (minRow + maxRow) * (minRow + maxRow + 1) / 2 + (row - minRow) + 1;
        } else { // 5 5
            if (sum >= N + 1) {
                int maxCol = (N - 1) - Math.min(sum, N - 1); // 5
                int minCol = (N - 1) - Math.max(0, sum - (N - 1)); // 0

                return (N * N) - ((minCol + maxCol) * (minCol + maxCol + 1) / 2 + (N - 1 - col + minCol));

            }

            int maxCol = Math.min(sum, N - 1);
            int minCol = Math.max(0, sum - (N - 1));

            return (minCol + maxCol) * (minCol + maxCol + 1) / 2 + (col - minCol) + 1;
        }
    }

    public static void main(String[] args) {
        int N = 6;

        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= N; col++) {
                System.out.print(solution(N, row, col) + " ");
            }
            System.out.println();
        }
//        System.out.print(solution(5, 3, 2) + " ");
//        System.out.print(solution(6, 6, 6) + " ");
    }
}
