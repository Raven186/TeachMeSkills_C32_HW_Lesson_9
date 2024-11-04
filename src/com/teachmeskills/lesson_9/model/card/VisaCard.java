package com.teachmeskills.lesson_9.model.card;

import java.util.Date;

public class VisaCard extends BaseCard{

    int cashback;

    public VisaCard(String cardNumber, int cvv, Date validDate, String cardHolder, String currency, int cashback) {
        super(cardNumber, cvv, validDate, cardHolder, currency);
        this.cashback = cashback;
    }

    @Override
    public boolean checkCardLimitTransfer(double limit) {
        if (limit <= BaseCard.LIMIT_OF_VISA || limit < 0 || limit > this.amount) {
            return false;
        } else {
            return true;
        }
    }
}
