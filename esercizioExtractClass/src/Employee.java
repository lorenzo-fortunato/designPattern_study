public class Employee {
    private Person person;
    private EmployeeDetails details;

    public Employee(Person person, EmployeeDetails details) {
       this.person = person;
       this.details = details;
    }

    public String getEmployeeInfo() {
        String allInfo = person.getPersonalInfo() + details.getDetails();
        return allInfo;
    }
}
