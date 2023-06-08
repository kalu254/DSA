package core_dsa.hashtable;

public class SimpleHashTable {

    StoredEmployees[] myEmployees;

    public SimpleHashTable() {
        myEmployees = new StoredEmployees[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == myEmployees.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % myEmployees.length;
            }
        }

        if (occupied(hashedKey)) {
            System.out.println("The position " + hashedKey + "is occupied ");
        } else {
            myEmployees[hashedKey] = new StoredEmployees(key, employee);
        }
    }

    private boolean occupied(int key) {
        return myEmployees[key] != null;
    }


    public Employee get(String key) {
        return myEmployees[findKey(key)].employee;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (myEmployees[hashedKey].key.equals(key)) {
            return hashedKey;
        } else {
            int stopIndex = hashedKey;
            if (hashedKey == myEmployees.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (hashedKey != stopIndex &&
                    myEmployees[hashedKey] != null &&
                    !myEmployees[hashedKey].key.equals(key)
            ) {
                hashedKey = (hashedKey + 1) % myEmployees.length;
            }

            if (myEmployees[hashedKey] == null && !myEmployees[hashedKey].key.equals(key)) {
                return -1;
            } else {
                return hashedKey;
            }


        }
    }

    private int hashKey(String key) {
        return key.length() % myEmployees.length;
    }

    public void printHashTable() {
        for (int i = 0; i < myEmployees.length; i++) {
            if (myEmployees[i] == null) {
                System.out.println("Not found");
            } else {
                System.out.println("Employee " + i + myEmployees[i].employee);
            }
        }
    }

}
