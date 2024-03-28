package employeeFiles;

public class HourlyEmployee extends Employee{

    private int maxHours;

    public void setMaxHours(int maxHours) {
        this.maxHours = maxHours;
    }
    public int getMaxHours() {
        return this.maxHours;
    }

    public HourlyEmployee(String name, double compensationRate, float bonusRate, int vacationHours) {
        super(name, compensationRate, bonusRate, vacationHours);
    }


    @Override
    public double calculateCompensation(double hoursWorked){
        this.setMaxHours(35);

        double weeklyCompensation = this.getCompensationRate() * hoursWorked;

        System.out.println("Your earnings this pay period: $" + weeklyCompensation);
        return weeklyCompensation;
    }
}
