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

//        SalariedEmployee employee2 = new SalariedEmployee("Mia", 60.50, 0.28f, 150);
//        System.out.println(employee2.getName());
//        employee2.checkVacationDays(vacationHoursUsed);
//        System.out.println("=======================");
//        employee2.calculateCompensation(workHours);
//        System.out.println("=======================");
//        employee2.allocateBonus(workHours);
//        System.out.println("=======================");
//

//        HourlyEmployee employee3 = new HourlyEmployee("Malik", 18.50, 0.05f, 60);
//        System.out.println(employee3.getName());
//        employee3.checkVacationDays(vacationHoursUsed);
//        System.out.println("=======================");
//        employee3.calculateCompensation(workHours);
//        System.out.println("=======================");
//        employee3.allocateBonus(workHours);
//        System.out.println("=======================");


        CommissionEmployee employee4 = new CommissionEmployee("Miranda", 60.75, 0.30f, 150);
        employee4.setCompletionRate(0.80f);
        employee4.setSalaryTier('B');
        System.out.println(employee4.getName());
        employee4.checkVacationDays(vacationHoursUsed);
        System.out.println("=======================");
        double bonus = employee4.allocateBonus(workHours);
        System.out.println("=======================");
        double earnedCommission = employee4.calculateCommission(employee4.getCompletionRate(), employee4.getSalaryTier());
        employee4.calculateCompensation(earnedCommission);
        System.out.println("=======================");

    }
}
