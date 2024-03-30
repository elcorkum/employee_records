package employeeFiles;

public class BaseCommissionEmployee extends CommissionEmployee{
    public BaseCommissionEmployee(String name) {
        super(name);
    }

    @Override
    public double calculateCommission(float completionRate, char salaryTier) {
        double commission = 0.0;
        if (this.getSalaryTier() == 'A') {
           commission = this.getCompletionRate() * 100000;
        }
        if (this.getSalaryTier() == 'B') {
            commission = this.getCompletionRate() * 50000;
        }
        if (this.getSalaryTier() == 'B') {
            commission = this.getCompletionRate() * 25000;
        }

        return commission;
    }

    @Override
    public double calculateCompensation(double hours, double payRate) {
        double baseCompensation = this.getHours() * this.getPayRate() * 52;
        double totalCompensation = baseCompensation + this.calculateCommission(this.getCompletionRate(), this.getSalaryTier());
        System.out.println("Earnings for " + this.getName() + "\n" + "Total earnings including commission : " + totalCompensation);
        return totalCompensation;
    }
}
