public class InefficientSum {

    public static void main(String[] args) {
        int n = 10000;
        int total = 0;

        // Inefficient method: For each i from 1 to n, sum from 1 to i again and again
        for (int i = 1; i <= n; i++) {
            total += sumUpTo(i); // O(n^2) total time
        }

        System.out.println("Inefficient total sum: " + total);
    }

    // This function calculates the sum from 1 to n inefficiently using a loop
    public static int sumUpTo(int num) {
        int sum = 0;
        for (int j = 1; j <= num; j++) {
            sum += j;
        }
        return sum;
    }
}
