package org.humber.dsa.week2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BankComparator implements Comparator<Bank> {

    /**
     * @param firstBank of type Bank
     * @param secondBank of type Bank
     * @return 1, 0, or -1
     * i) 1 : when firstBank's interest Rate is bigger than the secondBank
     * ii) 0 : when interest rate of both the banks are equal
     * iii) -1 : when firstBank's interest Rate is smaller than the secondBank
     * */
    @Override
    public int compare(Bank firstBank, Bank secondBank) {
        if(firstBank.getRate() > secondBank.getRate()) {
            return 1;
        }
        if(firstBank.getRate() == secondBank.getRate()) {
            return 0;
        }
        //when: firstBank.getRate() < secondBank.getRate()
        return -1;
    }
}

public class ComparatorExample {

    public static void main(String[] args) {

        List<Bank> banks = new ArrayList<>();
        banks.add(new TD());
        banks.add(new RBC());
        banks.add(new CIBC());
        System.out.println("Before Sorting");
        printBankDetails(banks);

        Collections.sort(banks, new BankComparator());
        System.out.println("After Sorting");
        printBankDetails(banks);
    }

    private static void printBankDetails(List<Bank> banks) {
        for (Bank each : banks) {
            System.out.println(each.getName() + " " + each.getRate());
        }
        System.out.println();
    }
}
