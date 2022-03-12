package datastructure.hashtable.chainedhashtable;

import datastructure.hashtable.Employee;
import datastructure.hashtable.StoredEmployee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
    private LinkedList<StoredEmployee>[] hashtable;
    ChainedHashTable() {
        hashtable = new LinkedList[10];
        for(int i = 0; i< hashtable.length; i++) {
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee value) {
        int hashkey = hashKey(key);
        hashtable[hashkey].add(new StoredEmployee(key, value));
    }


    public Employee get(String key) {
        int hashKey = hashKey(key);
        for(StoredEmployee storedEmployee : hashtable[hashKey]) {
            if(storedEmployee.employee.getLastName().equals(key)) {
                return storedEmployee.employee;
            }
        }
        return null;
    }


    public Employee remove(String key) {
        int hashKey = hashKey(key);
        Employee emp = null;
        int index = -1;
        for(StoredEmployee storedEmployee : hashtable[hashKey]) {
            index++;
            if(storedEmployee.employee.getLastName().equals(key)) {
                emp = storedEmployee.employee;
                break;
            }
        }
        if (emp != null) {
            hashtable[hashKey].remove(index);
        }
        return emp;
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void printHashTable() {
        for(int i =0; i< hashtable.length; i++) {
            if(hashtable[i] == null) {
                System.out.println("Position " + i + " is empty.");
            } else {
                System.out.print("Position " + i + " : ");
                ListIterator<StoredEmployee> itr = hashtable[i].listIterator();
                while (itr.hasNext()) {
                    System.out.print(itr.next().employee);
                    System.out.print("-->");
                }
                System.out.println("null");
            }
        }
    }
}
