package com.teachmeskills.lesson_9.model.card;

import java.util.Date;

public class MasterCard extends BaseCard {

    public String country;

    public MasterCard(String cardNumber, int cvv, Date validDate, String cardHolder, String currency, String country) {
        super(cardNumber, cvv, validDate, cardHolder, currency);
        this.country = country;
    }

    @Override
    public boolean checkCardLimitTransfer(double limit) {
        if (limit <= BaseCard.LIMIT_OF_MASTER || limit < 0 || limit > this.amount) {
            return false;
        } else {
            return true;
        }
    }
}
