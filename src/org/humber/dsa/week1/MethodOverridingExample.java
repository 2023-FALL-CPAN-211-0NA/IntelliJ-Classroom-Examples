package org.humber.dsa.week1;

class Bank {

    public double getRate() {
        return 5;
    }

    public double getRate(int number) {
        return getRate() + number;
    }

    public String getName() {
        return "Bank";
    }
}

class RBC extends Bank {

    private String location = "Toronto";

    @Override
    public double getRate() {
        return super.getRate() + 0.5;
    }

    @Override
    public String getName() {
        return "RBC";
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
        double baseRate = 2.5;
        if(super.getRate() > baseRate) {
            return super.getRate();
        }
        return baseRate;
    }

    @Override
    public String getName() {
        return "TD";
    }
}

public class MethodOverridingExample {

    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.getName() + " : rate " + bank.getRate() + " %");

        //Create polymorphic objects
        RBC rbc = new RBC();
        System.out.println(rbc.getName() + " : rate " + rbc.getRate() + " %");

        CIBC cibc = new CIBC();
        System.out.println(cibc.getName() + " : rate " + cibc.getRate() + " %");

        TD td = new TD();
        System.out.println(td.getName() + " : rate " + td.getRate() + " %");
    }
}
