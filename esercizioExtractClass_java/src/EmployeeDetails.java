public class EmployeeDetails {
    private double salary;
    private String position;
    private String department;

    public EmployeeDetails(double salary, String position, String department) {
        this.salary = salary;
        this.position = position;
        this.department = department;
    }

    public String getDetails() {
        String detailsInfo = "Salary: " + salary
                + ", Position: " + position
                + ", Department: " + department;
        return detailsInfo;
    }
}
