import java.util.Arrays;
import java.util.Comparator;

class Test {

    int number;

    public Test(int number) {
        this.number = number;
    }
}

public class ComparatorTest {

    public static void main(String[] args) {

        Test[] test = {new Test(5), new Test(2), new Test(3), new Test(6), new Test(10)};

        Arrays.sort(test, new Comparator<Test>() {
            @Override
            public int compare(Test o1, Test o2) {
                return o1.number - o2.number;
            }
        });

        for (Test perTest : test) {
            System.out.print(perTest.number + " ");
        }
        System.out.println();

        Arrays.sort(test, new Comparator<Test>() {
            @Override
            public int compare(Test o1, Test o2) {
                return o2.number - o1.number;
            }
        });

        for (Test perTest : test) {
            System.out.print(perTest.number + " ");
        }
        System.out.println();
    }

}
