package employeeFiles;

public class Main {
    public static void main(String[] args) {
        HourlyEmployee employee1 = new HourlyEmployee("Maria Margarita");
        employee1.setPayRate(19.15);
        employee1.setHours(35.0);
        employee1.calculateCompensation(employee1.getHours(), employee1.getPayRate());
        System.out.println("====================");

        SalariedEmployee employee2 = new SalariedEmployee("Monty Mustang");
        employee2.setHours(40.0);
        employee2.setPayRate(38.67);
        employee2.calculateCompensation(employee2.getHours(), employee2.getPayRate());
        System.out.println("====================");

        BaseCommissionEmployee employee3 = new BaseCommissionEmployee("Macy Mack");
        employee3.setHours(40.0);
        employee3.setPayRate(43.75);
        employee3.setSalaryTier('A');
        employee3.setCompletionRate(0.50f);
        employee3.calculateCompensation(employee3.getHours(), employee3.getPayRate());
        System.out.println("====================");
    }
}
