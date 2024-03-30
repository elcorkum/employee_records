package employeeFiles;

public abstract class CommissionEmployee extends Employee{

    private float completionRate;
    private char salaryTier;

    public float getCompletionRate() {
        return completionRate;
    }

    public void setCompletionRate(float completionRate) {
        if (completionRate > 0) {
            this.completionRate = completionRate;
        }
    }

    public char getSalaryTier() {
        return salaryTier;
    }

    public void setSalaryTier(char salaryTier) {
        this.salaryTier = salaryTier;
    }

    public CommissionEmployee(String name) {
        super(name);
    }

    public abstract double calculateCommission(float completionRate, char salaryTier);
}
