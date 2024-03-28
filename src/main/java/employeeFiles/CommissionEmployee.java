package employeeFiles;

public class CommissionEmployee extends Employee{

    private float completionRate;
    private char salaryTier;

    public void setCompletionRate(float completionRate) {
        this.completionRate = completionRate;
    }
    public float getCompletionRate() {
        return this.completionRate;
    }

    public void setSalaryTier(char salaryTier) {
        this.salaryTier = salaryTier;
    }
    public char getSalaryTier() {
        return this.salaryTier;
    }
    public CommissionEmployee(String name, double compensationRate, float bonusRate, int vacationHours) {
        super(name, compensationRate, bonusRate, vacationHours);
    }

    public double calculateCommission(float completionRate, char salaryTier) {
        this.completionRate = completionRate;
        this.salaryTier = salaryTier;
        double earnedCommission = 0.0;
        double  baseCommission = 0.0;

        if (this.salaryTier == 'A') {
            baseCommission = 100000.0;
        }
        if (this.salaryTier == 'B') {
            baseCommission = 50000.0;
        }
        if (this.salaryTier == 'C') {
            baseCommission = 30000.0;
        }
        earnedCommission = baseCommission * this.completionRate;

        return earnedCommission;
    }

    @Override
    public double calculateCompensation(double earnedCommission){
        final int workHours = 40;
        earnedCommission = this.calculateCommission(this.completionRate, this.salaryTier);
        double bonus = this.allocateBonus(workHours);
        double annualCompensation = (this.getCompensationRate() * workHours) * 52;
        double totalCompensation = annualCompensation + earnedCommission + bonus;
        System.out.println("You earned " + earnedCommission + " from commissions in year 2024");
        System.out.println("You earned a bonus of: $" + bonus);
        System.out.println("Your total earnings for year 2024: $" + totalCompensation);

        return totalCompensation;
    }
    @Override
    public double allocateBonus(double workHours){
        double bonus = 0;
        double annualCompensation = this.getCompensationRate() * workHours * 12;
        bonus = this.getBonusRate() * annualCompensation;
        return bonus;
    }
}
