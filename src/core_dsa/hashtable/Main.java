package core_dsa.hashtable;

public class Main {

    public static void main(String[] args) {
        Employee one = new Employee("Kalu", "Munene", 1);
        Employee two = new Employee("Luka", "Alebe", 2);
        Employee three = new Employee("Kelvin", "MandagoMandagoMandagoMandago", 3);
        Employee four = new Employee("Jackson", "Mando", 4);
        Employee five = new Employee("Alex", "Jenguz", 5);


        SimpleHashTable myHashTable = new SimpleHashTable();
        myHashTable.put("Munene", one);
        myHashTable.put("Alebe", two);
        myHashTable.put("MandagoMandagoMandagoMandago", three);
        myHashTable.put("Mando", four);
        myHashTable.put("Jenguz", five);


//        System.out.println(myHashTable.get("Mando") + "get");

        myHashTable.printHashTable();
    }
}
