package org.humber.dsa.week1;


public class UpcastingExample {

    public static void main(String[] args) {
        Bank bank = new Bank();
        printBankDetails(bank);
//        System.out.println(bank.getName() + " : rate " + bank.getRate() + " %");

        //Create polymorphic objects
        RBC rbc = new RBC();
        printBankDetails(rbc);
//        System.out.println(rbc.getName() + " : rate " + rbc.getRate() + " %");

        Bank cibc = new CIBC();
        printBankDetails(cibc);
//        System.out.println(cibc.getName() + " : rate " + cibc.getRate() + " %");

        Bank td = new TD();
        printBankDetails(td);
        //System.out.println(td.getName() + " : rate " + td.getRate() + " %");
    }

    public static void printBankDetails(Bank bank) {
        System.out.println(bank.getName() + " : rate " + bank.getRate() + " %");
    }
}
