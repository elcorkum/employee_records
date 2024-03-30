package employeeFiles;

public class HourlyEmployee extends Employee{

    public HourlyEmployee(String name) {
        super(name);
    }

    @Override
    public double calculateCompensation(double hours, double payRate) {
        double weeklyEarnings = this.getHours() * this.getPayRate();
        System.out.println("Weekly earnings for " + this.getName() + ": " + weeklyEarnings);
        return weeklyEarnings;
    }
}
