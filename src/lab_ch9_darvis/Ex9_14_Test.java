package lab_ch9_darvis;

public class Ex9_14_Test {
    public static void main(String[] args) {
        Ex9_14_CommEmployee employee = new Ex9_14_CommEmployee("Дмитрий", "Фёдоров", "333", 25869, .09);

        System.out.println("Геттеры:");
        System.out.println("|Сотрудник|");
        System.out.printf("Имя: %s \n", employee.getFirstName());
        System.out.printf("Фамилия: %s \n", employee.getLastName());
        System.out.printf("ID: %s \n", employee.getID());
        System.out.printf("Объем продаж: %s$ \n", employee.getGrossSales());
        System.out.printf("Процентная ставка: %s \n", employee.getCommissionRate());

        employee.setGrossSales(35782);
        employee.setCommissionRate(.03);
        System.out.println("Обновление информации:");
        System.out.printf("|Сотрудник|\n%s", employee);
    }
}
