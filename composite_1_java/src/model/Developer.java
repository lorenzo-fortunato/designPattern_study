package model;

public class Developer implements Employee{
    private String name;
    private String surname;
    private String position;

    public Developer(String name, String surname, String position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String getOrganizationInformation() {
        String info = "Name: " + name + " " + surname + " with position: " + position;
        return info;
    }

}
