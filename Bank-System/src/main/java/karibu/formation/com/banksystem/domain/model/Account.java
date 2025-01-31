package karibu.formation.com.banksystem.domain.model;

import karibu.formation.com.banksystem.domain.Service.ConvertTo;
import karibu.formation.com.banksystem.domain.constant.Constant;
import karibu.formation.com.banksystem.domain.enums.Currency;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Account {

    private String id;
    private Money money;
    List<Transaction> transactionList;


    public Account() {
        this.id = UUID.randomUUID().toString();
        this.money = new Money(Currency.DOLLAR, 0);//we define dollar as the default currency type
        this.transactionList = new ArrayList<>();
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void deposit(Money money) {
        switch (money.currency()){
            case EURO:
        }
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public Money getMoney() {
        return money;
    }
}
