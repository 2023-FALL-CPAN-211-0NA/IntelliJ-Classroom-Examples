package org.humber.dsa.week1;


public class InstanceOfExample {

    public static void main(String[] args) {
        //Array of Banks
        Bank[] banks = new Bank[4];
        banks[0] = new RBC();
        banks[1] = new CIBC();
        banks[2] = new TD();
        banks[3] = new Bank();
        for(Bank bank : banks) {
            printInstanceOfDetails(bank);
        }
    }

    private static void printInstanceOfDetails(Bank bank) {
        if(bank instanceof TD) {
            System.out.println("TD Bank");
        } else if(bank instanceof CIBC) {
            System.out.println("CIBC Bank");
        } else if(bank instanceof RBC) {
            System.out.println("RBC Bank");
        } else {
            System.out.println("Parent Bank class");
        }
    }
}
