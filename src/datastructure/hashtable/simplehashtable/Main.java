package datastructure.hashtable.simplehashtable;

import datastructure.hashtable.Employee;

public class Main {
    public static void main(String args[]) {
        Employee vinayak = new Employee("Vinayak", "Magadum", 1234);
        Employee maruti = new Employee("Maruti", "Hajare", 1235);
        Employee tanaji = new Employee("Tanaji", "Agale", 1236);
        Employee nivas = new Employee("Nivas", "Nikam", 1237);
        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put("Magadum", vinayak);
        hashTable.put("Hajare", maruti);
        hashTable.put("Agale", tanaji);
        hashTable.put("Nikam", nivas);

        hashTable.printHashTable();

        System.out.println();
        hashTable.remove("Nikam");

        hashTable.printHashTable();



//        System.out.println(hashTable.get("Agale"));
    }
}
