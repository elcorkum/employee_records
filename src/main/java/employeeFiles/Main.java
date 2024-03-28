package employeeFiles;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new HourlyEmployee("Jullian", 50.75, 0.25f, 120);
        int vacationHoursUsed = 50;
        double workHours = 40;
//        System.out.println(employee1.getName());
//        employee1.checkVacationDays(vacationHoursUsed);
//        System.out.println("=======================");
//        employee1.calculateCompensation(workHours);
//        System.out.println("=======================");
//        employee1.allocateBonus(workHours);
//        System.out.println("=======================");

        SalariedEmployee employee2 = new SalariedEmployee("Mia", 60.50, 0.28f, 150);
        System.out.println(employee2.getName());
        employee2.checkVacationDays(vacationHoursUsed);
        System.out.println("=======================");
        employee2.calculateCompensation(workHours);
        System.out.println("=======================");
        employee2.allocateBonus(workHours);
        System.out.println("=======================");

    }
}
