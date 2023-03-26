public class CreditPaymentService {
    public int calculate(int creditAmountRub, int creditPeriodYears, double rateOfInterest) {
        return (int) (creditAmountRub * (((rateOfInterest / 100 / 12) * Math.pow(1 + (rateOfInterest / 100 / 12), creditPeriodYears * 12)) / (Math.pow((1 + (rateOfInterest / 100 / 12)), creditPeriodYears * 12) - 1)));

    }
}
