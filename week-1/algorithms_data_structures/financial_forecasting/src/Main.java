public class Main {
    public static void main(String[] args) {
       
        double presentValue = 1000.0;
        double growthRate = 0.05;
        int periods = 10; 

        double futureValueRecursive = FinancialForecastingFuture.calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("The future value after " + periods + " years (recursive approach) is: " + futureValueRecursive);

        double futureValueIterative = FinancialForecastingIterative.calculateFutureValueIterative(presentValue, growthRate, periods);
        System.out.println("The future value after " + periods + " years (iterative approach) is: " + futureValueIterative);
    }
}
