package com.teachmeskills.lesson_9.model.document;

import com.teachmeskills.lesson_9.model.account.Account;
import com.teachmeskills.lesson_9.model.card.BaseCard;

import java.util.Date;

public class Check {
    private double transferSum;
    private Date dateOfTransfer;
    private String accountNumber;
    private String comment;

    public Check(double transferSum, Date dateOfTransfer, BaseCard account) {
        this.transferSum = transferSum;
        this.dateOfTransfer = dateOfTransfer;
        this.accountNumber = account.cardNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void getCheckInfo() {
        if (comment == null) {
            System.out.println("Check{" +
                    "transferSum=" + transferSum +
                    ", dateOfTransfer=" + dateOfTransfer +
                    ", accountNumber='" + accountNumber + '\'' +
                    '}');
        } else {
            System.out.println("Check{" +
                    "transferSum=" + transferSum +
                    ", dateOfTransfer=" + dateOfTransfer +
                    ", accountNumber='" + accountNumber + '\'' +
                    ", comment='" + comment + '\'' +
                    '}');
        }
    }
}
