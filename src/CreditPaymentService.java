public class CreditPaymentService {
    public int calculate(int creditAmountRub, int creditPeriodYears, double rateOfInterest) {
        double monthlyPayment = creditAmountRub * (((rateOfInterest / 100 / 12) * Math.pow(1 + (rateOfInterest / 100 / 12), creditPeriodYears * 12)) / (Math.pow((1 + (rateOfInterest / 100 / 12)), creditPeriodYears * 12) - 1));
        return (int) monthlyPayment;
    }
}
