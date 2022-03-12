package datastructure.hashtable.simplehashtable;

import datastructure.hashtable.Employee;
import datastructure.hashtable.StoredEmployee;

public class SimpleHashTable {
    private StoredEmployee[] hashtable;

    SimpleHashTable() {
        hashtable = new StoredEmployee[10];
    }

    /**
     * Created to just get hash key. It's not perfect yet.
     *
     * @param key
     * @return
     */
    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void put(String key, Employee value) {
        int hashKey = hashKey(key);
        //Linear probing logic
        if(isOccupied(hashKey)) {
            int stopKey = hashKey;
            if(hashKey == hashtable.length -1) {
                hashKey = 0;
            } else {
                hashKey++;
            }
            while (isOccupied(hashKey) && hashKey != stopKey) {
                hashKey = (hashKey+1)%hashtable.length;
            }
        }
        if(isOccupied(hashKey)) {
            System.out.println("Employee already present for this hash key " + hashKey);
        } else {
            hashtable[hashKey] = new StoredEmployee(key, value);
        }
    }

    public Employee get(String key) {
        int hashkey = findKey(key);
        if(hashkey == -1) {
            return  null;
        }
        return hashtable[hashkey].employee;
    }

    public void printHashTable() {
        for(StoredEmployee emp : hashtable) {
            if(emp == null) {
                System.out.println("Empty");
            } else
                System.out.println(emp.employee);
        }
    }

    public boolean isOccupied(int index) {
        return hashtable[index] != null;
    }

    private int findKey(String rawKey) {
        int hashKey = hashKey(rawKey);
        if(hashtable[hashKey] != null && hashtable[hashKey].key.equals(rawKey)) {
            return hashKey;
        }

        int stopKey = hashKey;
        if(hashKey == hashtable.length -1) {
            hashKey = 0;
        } else {
            hashKey++;
        }
        while (hashKey != stopKey &&
                hashtable[hashKey]!= null &&
                !hashtable[hashKey].key.equals(rawKey)) {
            hashKey = (hashKey+1)%hashtable.length;
        }

        if(stopKey == hashKey){
            return  -1;
        } else {
            return hashKey;
        }
    }

    public Employee remove(String key) {
        int hashKey = findKey(key);

        if(hashKey == -1) {
            System.out.println("No employee present");
            return  null;
        }
        Employee employee = hashtable[hashKey].employee;
        hashtable[hashKey] = null;
        return employee;
    }
}
