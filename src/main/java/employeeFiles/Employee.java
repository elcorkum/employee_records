package employeeFiles;

public class Employee {
    private String name;
    private double compensationRate;
    private float bonusRate;
    private int vacationHours;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setCompensationRate(double compensationRate){
        this.compensationRate = compensationRate;
    }
    public double getCompensationRate(){
        return this.compensationRate;
    }

    public void setBonusRate(float bonusRate){
        this.bonusRate = bonusRate;
    }
    public float getBonusRate(){
        return this.bonusRate;
    }

    public void setVacationHours(int vacationHours){
        this.vacationHours = vacationHours;
    }
    public int getVacationHours(){
        return this.vacationHours;
    }


    public Employee(String name, double compensationRate, float bonusRate, int vacationHours){
        this.name = name;
        this.compensationRate = compensationRate;
        this.bonusRate = bonusRate;
        this.vacationHours = vacationHours;
    }




    public void checkVacationDays(int vacationHoursUsed){
        System.out.println("Your annual allocated vacationHours: " + this.vacationHours);
        int vacationHoursLeft = 0;
        if (this.vacationHours > vacationHoursUsed){
            vacationHoursLeft = this.vacationHours - vacationHoursUsed;
            System.out.println("You have utilized " + vacationHoursUsed + " vacation hours." + "\n" + "Remaining vacation hours: " + vacationHoursLeft);
        }
        if (this.vacationHours == vacationHoursUsed) {
            System.out.println("You have utilized all your allocated vacation hours.");
        }
    }

    public double calculateCompensation(double workHours){
        double weeklyCompensation = this.compensationRate * workHours;
        System.out.println("Your earnings this pay period: $" + weeklyCompensation);
        return weeklyCompensation;
    }

    public double allocateBonus(double workHours){
        double bonus = 0;
        double annualCompensation = this.compensationRate * workHours * 12;
        bonus = bonusRate * annualCompensation;
        System.out.println("You earned a bonus of: $" + bonus + " .We appreciate your contribution to the company's success!");
        return bonus;
    }
}
