package employeeFiles;

public abstract class Employee {
    private String name;
    private double hours;
    private double payRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours > 0) {
            this.hours = hours;
        }

    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        if (payRate > 0) {
            this.payRate = payRate;
        }

    }

    public Employee(String name) {
        this.name = name;
    }


    public abstract double calculateCompensation(double hours, double payRate);

}
