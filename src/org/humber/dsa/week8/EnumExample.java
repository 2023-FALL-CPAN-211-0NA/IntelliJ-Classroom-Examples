package org.humber.dsa.week8;

enum PaymentType {
    CREDIT_CARD,
    DEBIT_CARD,
    BANK_PAYMENT
}


public class EnumExample {

    public static void main(String[] args) {
        PaymentType creditCard = PaymentType.CREDIT_CARD;

        PaymentType debitCard = PaymentType.valueOf("DEBIT_CARD");


        System.out.println(debitCard.equals(PaymentType.DEBIT_CARD));

        if(creditCard.equals(PaymentType.CREDIT_CARD)) {
            System.out.println("Credit Card");
        }

        System.out.println("Bank Payment name: " + PaymentType.BANK_PAYMENT.name());
    }
}
