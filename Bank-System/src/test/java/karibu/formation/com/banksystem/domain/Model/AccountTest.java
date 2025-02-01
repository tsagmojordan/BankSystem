package karibu.formation.com.banksystem.domain.Model;

import karibu.formation.com.banksystem.domain.model.Account;
import karibu.formation.com.banksystem.domain.enums.Currency;
import karibu.formation.com.banksystem.domain.model.Money;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class AccountTest {



    @Test
    void create_new_account_should_be_created_with_amount_equal_to_zero() {
        Account account = new Account();
        Assertions.assertEquals(0,account.getMoney().getAmount());
    }

    @Test
    void deposit_amount_should_be_deposited() {
        Account account = new Account();
        Money money=new Money(Currency.DOLLAR,100);
        account.deposit(money);
        Assertions.assertEquals(100,account.getMoney().getAmount());
    }

    @Test
    void deposit_amount_should_not_be_deposited_when_amount_currency_unknown() {
        Account account = new Account();
        Money money=new Money(Currency.XOF,100);
        Assertions.assertThrows(IllegalArgumentException.class,()->account.deposit(money));
    }
    @Test
    void deposit_amount_should_be_convert_in_dollar_before_deposit_amount() {
        Account account = new Account();
        Money money=new Money(Currency.EURO,970);
        account.deposit(money);
        Assertions.assertEquals(1000,account.getMoney().getAmount());
        Assertions.assertEquals(Currency.DOLLAR,account.getMoney().getCurrency());
    }

     @Test
     void deposit_amount_should_not_be_done_when_the_amount_is_negative() {
         Account account = new Account();
         Money money=new Money(Currency.EURO,970);
         account.deposit(money);
         Assertions.assertEquals(1000,account.getMoney().getAmount());
         Assertions.assertEquals(Currency.DOLLAR,account.getMoney().getCurrency());
     }
}
