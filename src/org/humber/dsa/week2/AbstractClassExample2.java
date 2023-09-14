package org.humber.dsa.week2;

import java.util.ArrayList;
import java.util.List;

abstract class Bank {

    abstract double getRate();


    abstract String getName();
}

class RBC extends Bank {

    @Override
    public double getRate() {
        return 0.5;
    }

    @Override
    public String getName() {
        return "RBC";
    }

}

class CIBC extends Bank {

    @Override
    public double getRate() {
        return 2;
    }

    @Override
    public String getName() {
        return "CIBC";
    }
}

class TD extends Bank {

    @Override
    public double getRate() {
        return 5;
    }

    @Override
    public String getName() {
        return "TD";
    }
}


public class AbstractClassExample2 {

    public static void main(String[] args) {
        List<Bank> banks = new ArrayList<>();

        Bank anonymousBank = new Bank() {
            @Override
            double getRate() {
                return 0;
            }

            @Override
            String getName() {
                return null;
            }
        };



        banks.add(new RBC());
        banks.add(new TD());
        banks.add(new CIBC());

        for(Bank each : banks) {
            printDetails(each);
        }
    }

    private static void printDetails(Bank bank) {
        System.out.println("Bank name: " + bank.getName() + " Rate: " + bank.getRate());
    }
}
