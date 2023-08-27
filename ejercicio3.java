public class ejercicio3 {
    public static void main(String[] args) {
        double result1 = 2.5 / 0.0; // Infinity
        double result2 = -2.5 / 0.0; // -Infinity
        double result3 = 0.0 / 0.0; // NaN
        double result4 = Double.POSITIVE_INFINITY * 0.0; // NaN
        
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
    }
}
