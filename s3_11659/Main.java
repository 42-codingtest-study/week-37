package s3_11659;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
<prefix sum 누적합 알고리즘 -> 시간복잡도 O(n)>
숫자 개수, 질의 개수 저장
1. 합배열 생성
2. 구간합 출력
 */
public class Main {
    private BufferedReader br;
    private int n, m, i, j;
    private String s;
    public static void main(String[] args) throws Exception {
        Main Main = new Main();
        // TODO Auto-generated method stub
        Main.method();
    }
    public void method() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //수 개수
        m = Integer.parseInt(st.nextToken()); //합 구하는 횟수
        //List<Integer> list = new ArrayList<>(); 리스트보다 배열로 해보자!
        //String[] arr = br.readLine().split(" "); //문자 배열로 찢기 [5, 4, 3, 2, 1]
        //to chararray 로 공백기준 분리가 안됨, split
        //split 느려서 ST썼다
        st = new StringTokenizer(br.readLine());
        int[]S = new int[n+1]; //0 제외 1부터 세려고
        //S[0] = 0; //이거 안하면 S[0]에 뭐들어감 -> 0
        //System.out.println(S[0]);
        StringBuilder sb = new StringBuilder(); //StringBuilder로 문자열 만들면 빠르다!!

        for(int k = 1; k <= n; k++) {
            S[k] = S[k-1] + Integer.parseInt(st.nextToken()); // S[n] = S[n-1] + a[n]
            //System.out.printf("%d %d %d\n", S[k], S[k-1], Integer.parseInt(arr[k-1]));
        }
        //s = "";
        for(int k = 0; k < m; k++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken()); //s[b]-s[a-1] 출력
//            s += S[b] - S[a-1];
//            s+="\n";
            sb.append(S[b] - S[a - 1]).append("\n"); //sb말고 bufferedWriter 쓰는 방법

        }
        System.out.println(sb);
    }
}
