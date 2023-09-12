package org.humber.dsa.week1;

import java.math.BigDecimal;

/**
 * INHERITANCE - Activity
 * */
enum CURRENCY {
    CAD,
    USD,
    AUD,
    EUR,
    INR
}

enum CardPaymentType {
    CREDIT,
    DEBIT
}

class Payment {
    private final BigDecimal amount;
    private final CURRENCY isoCurrency;

    Payment(BigDecimal amount, CURRENCY isoCurrency) {
        this.amount = amount;
        this.isoCurrency = isoCurrency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public CURRENCY getIsoCurrency() {
        return isoCurrency;
    }

}
class CardPayment extends Payment {
    private String cardNumber;
    private String expiryInMMYY;
    private CardPaymentType type;

    CardPayment(BigDecimal amount, CURRENCY isoCurrency) {
        super(amount, isoCurrency);
    }

    public BigDecimal getAmount() {
        return super.getAmount().add(BigDecimal.valueOf(10));
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryInMMYY() {
        return expiryInMMYY;
    }

    public void setExpiryInMMYY(String expiryInMMYY) {
        this.expiryInMMYY = expiryInMMYY;
    }
}

public class InheritanceActivity {

    public static void main(String[] args) {
        CardPayment cardPayment = new CardPayment(BigDecimal.valueOf(10), CURRENCY.AUD);

        System.out.println("Amount: " + cardPayment.getAmount() + " " + cardPayment.getIsoCurrency());
    }
}
