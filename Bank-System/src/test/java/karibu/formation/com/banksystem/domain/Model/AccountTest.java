package karibu.formation.com.banksystem.domain.Model;

import karibu.formation.com.banksystem.domain.model.Account;
import karibu.formation.com.banksystem.domain.enums.Currency;
import karibu.formation.com.banksystem.domain.model.Money;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {



    @Test
    void create_new_account_should_be_created_with_amount_equal_to_zero() {
        Account account = new Account();
        Assertions.assertEquals(0,account.getMoney().amount());
    }

    @Test
    void deposit_amount_should_be_deposited() {
        Account account = new Account();
        Money money=new Money(Currency.DOLLAR,100);
        account.deposit(money);
        account.setMoney(money);
        Assertions.assertEquals(money,account.getMoney());
    }

    @Test
    void deposit_amount_should_not_be_deposited_when_amount_currency_unknown() {
        Account account = new Account();
        Money money=new Money(Currency.EURO,100);
        account.deposit(money);
        account.setMoney(money);
        Assertions.assertEquals(0,account.getMoney().amount());
    }
}
