package employeeFiles;
public class SalariedEmployee extends Employee{

    public SalariedEmployee(String name) {
        super(name);
    }

    @Override
    public double calculateCompensation(double hours, double payRate) {
        double weeklyEarnings = this.getHours() * this.getPayRate();
        double annualSalary = weeklyEarnings * 52;
        System.out.println("Earnings for " + this.getName() + "\n"+ "Weekly earnings: " + weeklyEarnings + "\nAnnual salary: " + annualSalary);
        return annualSalary;
    }
}
