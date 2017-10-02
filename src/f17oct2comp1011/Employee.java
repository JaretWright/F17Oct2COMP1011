
package f17oct2comp1011;

import java.time.LocalDate;

/**
 *
 * @author JWright
 */
public class Employee {
    private String firstName, lastName, socialInsuranceNum, position;
    private LocalDate dateOfBirth, dateOfHire;
    private static int nextEmployeeNumber = 100001;
    private boolean systemAdministrator;

    public Employee(String firstName, String lastName, String socialInsuranceNum, String position, LocalDate dateOfBirth) {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialInsuranceNum(socialInsuranceNum);
        setPosition(position);
        setDateOfBirth(dateOfBirth);
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
        this.lastName = lastName;
    }

    public String getSocialInsuranceNum() {
        return socialInsuranceNum;
    }

    public void setSocialInsuranceNum(String socialInsuranceNum) {
        this.socialInsuranceNum = socialInsuranceNum;
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
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(LocalDate dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public static int getNextEmployeeNumber() {
        return nextEmployeeNumber;
    }

    public static void setNextEmployeeNumber(int nextEmployeeNumber) {
        Employee.nextEmployeeNumber = nextEmployeeNumber;
    }

    public boolean isSystemAdministrator() {
        return systemAdministrator;
    }

    public void setSystemAdministrator(boolean systemAdministrator) {
        this.systemAdministrator = systemAdministrator;
    }
    
    
    
    
    
}
