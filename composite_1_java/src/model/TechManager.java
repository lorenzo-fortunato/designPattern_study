package model;

import java.util.ArrayList;
import java.util.List;

public class TechManager extends Developer implements Employee{

    private List<Employee> developers = new ArrayList<Employee>();

    public TechManager(String name, String surname, String position) {
        super(name, surname, position);
    }

    public void addEmployee(Employee developer) {
        this.developers.add(developer);
    }

    @Override
    public String getOrganizationInformation() {
        StringBuilder organizationInformation = new StringBuilder(super.getOrganizationInformation());
        for(Employee employee : this.developers) {
            organizationInformation.append("\n\t").append(employee.getOrganizationInformation());
        }
        return organizationInformation.toString();
    }
}
