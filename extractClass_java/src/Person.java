public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getPersonalInfo() {
        String personInfo = "Name: " + name
                + ", Age: " + age
                + ", Address: " + address + "\n";
        return personInfo;
    }
}
