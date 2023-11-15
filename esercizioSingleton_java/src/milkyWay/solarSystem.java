package milkyWay;

public class solarSystem {
    // obbiettivo dell'esercizio: rendi sun un singleton
    public static void main(String[] args) {
        Planet mercury = new Planet("Mercury", 2439.7, 3.3011e23, "Rocky");
        Planet venus = new Planet("Venus", 6051.8, 4.8675e24, "Rocky");
        Planet earth = new Planet("Earth", 6371, 5.972e23, "Rocky");
        Planet mars = new Planet("Mars", 3389.5, 6.4171e23, "Rocky");
        // other planets

        mercury.displayInfo();
        venus.displayInfo();
        earth.displayInfo();
        mars.displayInfo();
        // other planets

        //Star sun = new Star("Sun", 696342, 1.989e30, "G-type");
        Star sirius = new Star("Sirius", 1674000, 2.063e30, "A1V");
        Star betelgeuse = new Star("Betelgeuse", 936000000, 1.434e31, "M1-M2Ia-Iab");
        Sun sun = Sun.getInstance();
        Sun sun2 = Sun.getInstance();



        sun.displayInfo();
        sun2.displayInfo();
        sirius.displayInfo();
        betelgeuse.displayInfo();
    }
}
