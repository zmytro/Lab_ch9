package lab_ch9_darvis;

public class Ex9_15_HourlyEmployee extends Ex9_14_Employee {
    private double wage;
    private double hours;


    public Ex9_15_HourlyEmployee(String firstName, String lastName, String ID, double wage, double hours) {
        super(firstName, lastName, ID);

        this.hours = hours;
        this.wage = wage;
    }


    //геттеры
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168) {
            System.err.println("Ошибка");
        } else
            this.hours = hours;
    }

    //сеттеры
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0) {
            System.err.println("Ошибка");
        } else this.wage = wage;
    }

    public double earn() {
        return getHours() * getWage();
    }

    @Override
    public String toString() {
        return String.format("Сотрудник: %s\n Часов отработано: %s\n Заработано: %s$ \n", super.toString(), getHours(), getWage());
    }
}
