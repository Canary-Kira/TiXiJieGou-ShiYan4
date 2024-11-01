package demo;

//计算税收
public class TaxCalculate {

    public double calculateTax(double income, double deductions) {
        double taxableIncome = income - deductions;
        if (taxableIncome <= 0) {
            return 0;
        }
        double tax = 0;
        if (taxableIncome <= 3000) {
            tax = taxableIncome * 0.03;
        } else if (taxableIncome <= 12000) {
            tax = 3000 * 0.03 + (taxableIncome - 3000) * 0.1;
        } else if (taxableIncome <= 25000) {
            tax = 3000 * 0.03 + 9000 * 0.1 + (taxableIncome - 12000) * 0.2;
        } else if (taxableIncome <= 35000) {
            tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + (taxableIncome - 25000) * 0.25;
        } else if (taxableIncome <= 55000) {
            tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + (taxableIncome - 35000) * 0.3;
        } else if (taxableIncome <= 80000) {
            tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + (taxableIncome - 55000) * 0.35;
        } else {
            tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + 25000 * 0.35 + (taxableIncome - 80000) * 0.45;
        }
        return tax;
    }
}
