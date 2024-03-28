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
        double weeklyCompensation = 0.0;

        if (hoursWorked < getMaxHours()) {
            weeklyCompensation = this.getCompensationRate() * hoursWorked;
        }
        if (hoursWorked > getMaxHours()) {
            double wageBeforeOvertime = this.getCompensationRate() * getMaxHours();
            double overTime = hoursWorked - getMaxHours();
            double earnedOvertime = (this.getCompensationRate() * 1.5) * overTime;
            weeklyCompensation = wageBeforeOvertime + earnedOvertime;
            System.out.println("You earned " + earnedOvertime + " for working " + overTime + " overtime hours");
        }



        System.out.println("Your earnings this pay period: $" + weeklyCompensation);
        return weeklyCompensation;
    }
}
