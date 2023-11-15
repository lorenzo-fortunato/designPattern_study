package launcher;

import model.Developer;
import model.Employee;
import model.TechManager;

public class OrgChartMain {
    public static void main(String[] args) {
        Employee developer = new Developer("Lorenzo", "Fortunato", "developer");
        Employee anotherDeveloper = new Developer("John", "Laslo", "developer");
        TechManager techManager = new TechManager("Will", "Smith", "tech lead");
        techManager.addEmployee(developer);
        techManager.addEmployee(anotherDeveloper);
        TechManager ceo = new TechManager("Bill", "Gates", "CEO");
        ceo.addEmployee(techManager);
        System.out.println(ceo.getOrganizationInformation());
    }
}
