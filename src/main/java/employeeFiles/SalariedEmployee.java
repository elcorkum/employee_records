package employeeFiles;
public class SalariedEmployee extends Employee{

    private boolean hasBenefits = true;

    public void setBenefits(boolean hasBenefits) {
        this.hasBenefits = hasBenefits;
    }

    public boolean getBenefits() {
        return this.hasBenefits;
    }
    public SalariedEmployee(String name, double compensationRate, float bonusRate, int vacationHours) {
        super(name, compensationRate, bonusRate, vacationHours);
    }

    @Override
    public double calculateCompensation(double workHours){
        double monthlyEarnings = this.getCompensationRate() * workHours * 4;
        System.out.println("Your monthly earnings this pay period: $" + monthlyEarnings);
        return monthlyEarnings;
    }
    @Override
    public void allocateBonus(double workHours){
        double bonus = 0;
        double annualCompensation = this.getCompensationRate() * workHours * 12;
        bonus = this.getBonusRate() * annualCompensation;
        System.out.println("You earned a bonus of: $" + bonus + " for the year 2024." + "\n" + "We appreciate your contribution to the company's success!");
    }
}
