package datastructure.hashtable.chainedhashtable;

import datastructure.hashtable.Employee;
import datastructure.hashtable.simplehashtable.SimpleHashTable;

public class Main {
    public static void main(String args[]) {
        Employee vinayak = new Employee("Vinayak", "Magadum", 1234);
        Employee supriya = new Employee("Supriya", "Magadum", 4041);
        Employee maruti = new Employee("Maruti", "Hajare", 1235);
        Employee tanaji = new Employee("Tanaji", "Agale", 1236);
        Employee nivas = new Employee("Nivas", "Nikam", 1237);
        ChainedHashTable hashTable = new ChainedHashTable();
        hashTable.put("Magadum", vinayak);
        hashTable.put("Magadum", supriya);
        hashTable.put("Hajare", maruti);
        hashTable.put("Agale", tanaji);
        hashTable.put("Nikam", nivas);

        hashTable.printHashTable();

        System.out.println();
        hashTable.remove("Nikam");
//
        hashTable.printHashTable();



//        System.out.println(hashTable.get("Agale"));
    }
}
