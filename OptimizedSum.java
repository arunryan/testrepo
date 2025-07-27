/**
 * Optimized Sum Calculator
 * 
 * This class demonstrates efficient ways to calculate sums of natural numbers.
 * It includes multiple optimization techniques and performance benchmarking.
 * 
 * @author Optimized Version
 * @version 2.0
 */
public class OptimizedSum {

    public static void main(String[] args) {
        int n = 10000;
        
        // Benchmark different approaches
        System.out.println("=== Sum Calculation Performance Comparison ===\n");
        
        // Method 1: Original inefficient approach (for comparison)
        long startTime = System.nanoTime();
        int inefficientResult = calculateInefficientSum(n);
        long inefficientTime = System.nanoTime() - startTime;
        
        // Method 2: Optimized using mathematical formula
        startTime = System.nanoTime();
        int optimizedResult = calculateOptimizedSum(n);
        long optimizedTime = System.nanoTime() - startTime;
        
        // Method 3: Using arithmetic progression formula
        startTime = System.nanoTime();
        int arithmeticResult = calculateArithmeticSum(n);
        long arithmeticTime = System.nanoTime() - startTime;
        
        // Method 4: Using stream API (modern Java approach)
        startTime = System.nanoTime();
        int streamResult = calculateStreamSum(n);
        long streamTime = System.nanoTime() - startTime;
        
        // Display results
        System.out.println("Results:");
        System.out.println("Inefficient Method: " + inefficientResult + " (Time: " + inefficientTime + " ns)");
        System.out.println("Optimized Method:  " + optimizedResult + " (Time: " + optimizedTime + " ns)");
        System.out.println("Arithmetic Method: " + arithmeticResult + " (Time: " + arithmeticTime + " ns)");
        System.out.println("Stream Method:     " + streamResult + " (Time: " + streamTime + " ns)");
        
        // Performance improvement calculation
        if (inefficientTime > 0) {
            double improvement = (double) inefficientTime / optimizedTime;
            System.out.println("\nPerformance Improvement: " + String.format("%.2f", improvement) + "x faster");
        }
        
        // Verify all methods give same result
        if (inefficientResult == optimizedResult && 
            optimizedResult == arithmeticResult && 
            arithmeticResult == streamResult) {
            System.out.println("✅ All methods produce identical results");
        } else {
            System.out.println("❌ Results don't match - check implementation");
        }
    }
    
    /**
     * Original inefficient method for comparison
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     */
    public static int calculateInefficientSum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += sumUpTo(i);
        }
        return total;
    }
    
    /**
     * Optimized method using mathematical formula
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int calculateOptimizedSum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            // Use formula: sum(1 to i) = i(i+1)/2
            total += (i * (i + 1)) / 2;
        }
        return total;
    }
    
    /**
     * Using arithmetic progression formula
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public static int calculateArithmeticSum(int n) {
        // Formula: sum of sum(1 to i) for i=1 to n = n(n+1)(n+2)/6
        return (n * (n + 1) * (n + 2)) / 6;
    }
    
    /**
     * Modern Java approach using streams
     * Time Complexity: O(n)
     * Space Complexity: O(n) for stream creation
     */
    public static int calculateStreamSum(int n) {
        return java.util.stream.IntStream.rangeClosed(1, n)
                .map(i -> (i * (i + 1)) / 2)
                .sum();
    }
    
    /**
     * Original inefficient helper method
     */
    private static int sumUpTo(int num) {
        int sum = 0;
        for (int j = 1; j <= num; j++) {
            sum += j;
        }
        return sum;
    }
} 