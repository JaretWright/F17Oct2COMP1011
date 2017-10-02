
package f17oct2comp1011;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author JWright
 */
public abstract class Employee {
    private String firstName, lastName, socialInsuranceNum, position;
    private LocalDate dateOfBirth, dateOfHire;
    private static int nextEmployeeNumber = 100001;
    private int employeeNum;
    private boolean systemAdministrator;

    public Employee(String firstName, String lastName, String socialInsuranceNum, String position, LocalDate dateOfBirth) {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialInsuranceNum(socialInsuranceNum);
        setPosition(position);
        setDateOfBirth(dateOfBirth);
        employeeNum = nextEmployeeNumber;
        nextEmployeeNumber++;
    }

    /**
     * This method will validate if the user's first name matches
     * the pattern of upper case letter followed by any number of
     * upper case or lower case letters.  It does not allow
     * users to have any special characters or - in their name
     * @return 
     */
    public boolean validateName(String name)
    {
        return name.matches("[A-Z][\\-a-zA-Z]*");
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (validateName(firstName))
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("First name must start with an "
                                                + "upper case letter");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
          if (validateName(lastName))
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("Last name must start with an "
                                                + "upper case letter");
    }

    public String getSocialInsuranceNum() {
        return socialInsuranceNum;
    }

    public void setSocialInsuranceNum(String socialInsuranceNum) {
        if (socialInsuranceNum.matches("\\d{3}\\s\\d{3}\\s\\d{3}"))
            this.socialInsuranceNum = socialInsuranceNum;
        else
            throw new IllegalArgumentException("Social insurance number"
                    + "must be XXX XXX XXX where X is any number 0-9");
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        
        if (age >= 13 && age <=130)
            this.dateOfBirth = dateOfBirth;
        else
            throw new IllegalArgumentException("Employees must be 13-130 years old");
    }

    public LocalDate getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(LocalDate dateOfHire) {
        if (dateOfHire.isBefore(LocalDate.now().minusDays(3)))
            throw new IllegalArgumentException("Employees must be added "
                    + "to the system within 3 days");
        else if (dateOfHire.isAfter(LocalDate.now().plusDays(31)))
            throw new IllegalArgumentException("Employees must be added "
                    + "to the system up to 1 month prior to the start date");
        else
            this.dateOfHire = dateOfHire;
    }

 
    public boolean isSystemAdministrator() {
        return systemAdministrator;
    }

    public void setSystemAdministrator(boolean systemAdministrator) {
        this.systemAdministrator = systemAdministrator;
    }
    
    public abstract double calculatePay();
}
