public class LauncherApp {
    public static void main(String[] args) {
        Person person = new Person("Marcuccio", 32, "qualcosa");
        EmployeeDetails employeeDetails = new EmployeeDetails(1800, "developer", "ICT");
        Employee employee = new Employee(
                person,
                employeeDetails);
        System.out.println(employee.getEmployeeInfo());
    }
}
