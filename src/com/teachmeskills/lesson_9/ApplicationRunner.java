package com.teachmeskills.lesson_9;

import com.teachmeskills.lesson_9.document_parser.IParser;
import com.teachmeskills.lesson_9.fabric.ParserFabric;
import com.teachmeskills.lesson_9.model.account.Account;
import com.teachmeskills.lesson_9.model.card.MasterCard;
import com.teachmeskills.lesson_9.model.card.VisaCard;
import com.teachmeskills.lesson_9.transfer.impl.MasterCardTransferService;
import com.teachmeskills.lesson_9.transfer.impl.VisaCardTransferService;

import java.util.Date;
import java.util.Scanner;

public class ApplicationRunner {

    public static void main(String[] args) {
        System.out.println("Input path to file");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ParserFabric.createParser(input);


        Account account1 = new Account();
        Account account2 = new Account();

        MasterCard masterCardAccount1 = new MasterCard("123123", 007, new Date(), "Oleg Tinkoff", "RUB", "RUS");
        VisaCard visaCardAccount1 = new VisaCard("321321", 700, new Date(), "Oleg Tinkoff", "RUB", 5);

        MasterCard masterCardAccount2 = new MasterCard("456456", 108, new Date(), "German Gref", "RUB", "RUS");
        VisaCard visaCardAccount2 = new VisaCard("654654", 801, new Date(), "German Gref", "RUB", 1);

        MasterCardTransferService transfer1 = new MasterCardTransferService();
        transfer1.transferFromCardToCard(masterCardAccount1, visaCardAccount2, 500);
        VisaCardTransferService transfer2 = new VisaCardTransferService();
        transfer2.transferFromCardToAccount(masterCardAccount2, visaCardAccount1, 500);

        // создать двух клиентов
        // каждому клиенту создать два счета и две карты
        // перевести с карты одного клиента на карту другого сумму денег
        // перевести с карты одного клинента на счет другого клиента сумму денег
    }

}
