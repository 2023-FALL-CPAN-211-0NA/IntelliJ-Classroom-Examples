package org.humber.dsa.week1;


public class DownCastingExample {

    public static void main(String[] args) {
        RBC rbc1 = new RBC();
        rbc1.setLocation("New York");
        Bank bank = rbc1;
        System.out.println(bank.getName() + " : rate " + bank.getRate() + " %");

        //Downcasting
        RBC rbc = (RBC) bank;
        System.out.println(rbc.getName() + " : rate " + rbc.getRate() + " %");
        System.out.println("Location :" + rbc.getLocation());
    }
}
