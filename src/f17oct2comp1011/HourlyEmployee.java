package f17oct2comp1011;

import java.time.LocalDate;

/**
 *
 * @author JWright
 */
public class HourlyEmployee extends Employee {

    private double hourlyRate, hoursWorked;
    private double MINIMUMWAGE=11.40;
    
    public HourlyEmployee(double hourlyRate, String firstName, String lastName, String socialInsuranceNum, String position, LocalDate dateOfBirth) {
        super(firstName, lastName, socialInsuranceNum, position, dateOfBirth);
        setHourlyRate(hourlyRate);
        hoursWorked=0;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= MINIMUMWAGE)
            this.hourlyRate = hourlyRate;
        else
            throw new IllegalArgumentException("Stop working for Ian and at least make "
                    + "minimum wage");
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * This method should be used at least once per week
     * @param hoursWorked must be in the range 0-80
     */
    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked >= 0 && hoursWorked <= 80)
            this.hoursWorked = hoursWorked;
    }

    
    @Override
    public double calculatePay() {
        double totalPay = 0;
        double overTimeHours = 0;
        
        if (hoursWorked > 44)
        {
            overTimeHours = hoursWorked - 44;
            hoursWorked = 44;
        }
            
        totalPay = hoursWorked*hourlyRate + overTimeHours*hourlyRate*1.5;
        return totalPay;
    }
    
    
}
