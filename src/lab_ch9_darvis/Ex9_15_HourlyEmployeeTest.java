package lab_ch9_darvis;

public class Ex9_15_HourlyEmployeeTest {
    public static void main(String[] args) {
        Ex9_15_HourlyEmployee employee = new Ex9_15_HourlyEmployee("Дмитрий", "Фёдоров", "333", 750, 28);

        System.out.println("Геттеры:");
        System.out.println("|Сотрудник|");
        System.out.printf("Имя: %s \n", employee.getFirstName());
        System.out.printf("Фамилия: %s \n", employee.getLastName());
        System.out.printf("ID: %s \n", employee.getID());
        System.out.printf("Часов отработано: %s \n", employee.getHours());
        System.out.printf("Заработано: %s$ \n", employee.getWage());

        System.out.println("Обновление информации:");
        System.out.printf("|Сотрудник|\n%s", employee);
    }
}
