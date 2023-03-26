public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmountRub = 1_000_000;
        int creditPeriodYears = 1;
        double rateOfInterest = 9.99;
        int monthlyPayment = service.calculate(creditAmountRub, creditPeriodYears, rateOfInterest);
        System.out.println(monthlyPayment);
    }
}