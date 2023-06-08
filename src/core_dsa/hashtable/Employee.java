package core_dsa.hashtable;

public class Employee {
    private String firstName;
    private String lastName;
    private int idNo;

    public Employee(String fName, String lName, int iNo) {
        firstName = fName;
        lastName = lName;
        idNo = iNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNo=" + idNo +
                '}';
    }
}
