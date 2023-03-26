public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmountRub = 1_000_000;
        int creditPeriodYears = 1;
        double rateOfInterest = 9.99;
        int monthlyPayment = service.calculate(creditAmountRub, creditPeriodYears, rateOfInterest);
        System.out.println("1млн, 1 год, 9,99% :");
        System.out.println(monthlyPayment + " руб");
        System.out.println();

        System.out.println("1млн, 2 года, 9,99% :");
        System.out.println(service.calculate(1_000_000, 2, 9.99) + " руб");
        System.out.println();

        System.out.println("1млн, 3 года, 9,99% :");
        System.out.println(service.calculate(1_000_000, 3, 9.99) + " руб");
    }
}