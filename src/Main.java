import java.lang.reflect.Array;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
    }
        public static void task1() {
            System.out.println("Task 1");
            int[] numbers1 = new int[3];
            numbers1[0] = 1;
            numbers1[1] = 2;
            numbers1[2] = 3;
            System.out.println(numbers1[0] + ", " + numbers1[1] + ", " + numbers1[2]);
            double[] numbers2 = {1.57, 7.654, 9.986};
            System.out.println(numbers2[0] + ", " + numbers2[1] + ", " + numbers2[2]);
            byte[] numbers3 = {41, 66, 10, 90, 87};
            System.out.println(numbers3[0] + ", " + numbers3[1] + ", " + numbers3[2]);
        }
        public static void task3() {
            System.out.println("Task 3");
            int[] numbers1 = new int[3];
            numbers1[0] = 1;
            numbers1[1] = 2;
            numbers1[2] = 3;
            System.out.println(numbers1[2] + ", " + numbers1[1] + ", " + numbers1[0]);
            double[] numbers2 = {1.57, 7.654, 9.986};
            System.out.println(numbers2[2] + ", " + numbers2[1] + ", " + numbers2[0]);
            byte[] numbers3 = {41, 66, 10, 90, 87};
            System.out.println(numbers3[4] + ", " + numbers3[3] + ", " + numbers3[2] + ", " + numbers3[1] + ", " + numbers3[0]);
        }
        public static void task4() {
            System.out.println("Task 4");
            int[] evenNumbers = {1, 2, 3};
            for (int i = 0; i < evenNumbers.length; i++) {
                if (evenNumbers[i] % 2 != 0) {
                    evenNumbers[i]++;
                }
            }
            System.out.println(Arrays.toString(evenNumbers));
        }
}