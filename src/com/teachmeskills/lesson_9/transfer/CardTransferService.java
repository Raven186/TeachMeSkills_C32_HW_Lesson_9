package com.teachmeskills.lesson_9.transfer;

import com.teachmeskills.lesson_9.model.card.BaseCard;
import com.teachmeskills.lesson_9.model.document.Check;

public interface CardTransferService {
    Check transferFromCardToCard(BaseCard cardFrom, BaseCard cardTo, double sumOfTransfer);

    Check transferFromCardToAccount(BaseCard cardFrom, BaseCard cardTo, double sumOfTransfer);

}
