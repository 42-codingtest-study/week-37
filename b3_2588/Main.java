package b3_2588;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String x = br.readLine(), y = br.readLine();
    int a = Integer.parseInt(x);
    int b = Integer.parseInt(y);
    System.out.println(a*(y.charAt(2) - '0'));
    System.out.println(a*(y.charAt(1) - '0'));
    System.out.println(a*(y.charAt(0) - '0'));
    System.out.println(a*(y.charAt(2) - '0')+a*(y.charAt(1) - '0')*10+a*(y.charAt(0) - '0')*100);

    }

}