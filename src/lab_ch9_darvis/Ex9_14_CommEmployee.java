package lab_ch9_darvis;

public class Ex9_14_CommEmployee extends Ex9_14_Employee {
    private double grossSales;
    private double commission;

    public Ex9_14_CommEmployee(String firstName, String lastName, String ID, double grossSales,
                               double commission) {
        super(firstName, lastName, ID);
        this.grossSales = grossSales;
        this.commission = commission;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Ошибка");
        }

        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }


    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Ошибка");
        }

        this.commission = commissionRate;
    }

    public double getCommissionRate() {
        return commission;
    }

    public double earnings() {
        return commission * grossSales;
    }

    @Override
    public String toString() {

        return String.format("Имя: %s\n Объем продаж: %s\n Процентная ставка: %s\n", super.toString(), grossSales, commission);
    }
}
