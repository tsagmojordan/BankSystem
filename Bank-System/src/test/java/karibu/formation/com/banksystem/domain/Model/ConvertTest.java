package karibu.formation.com.banksystem.domain.Model;

import karibu.formation.com.banksystem.domain.Service.Convert;
import karibu.formation.com.banksystem.domain.enums.Currency;
import karibu.formation.com.banksystem.domain.model.Money;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConvertTest {


    Money money=new Money(Currency.EURO,970);
    Money money2=new Money(Currency.XAF,63196);

    @Test
    void convertEuroToDollar() {
        money.setAmount(Convert.convertToDollar(money.getAmount(),money.getCurrency()));
        Assertions.assertEquals(1000,money.getAmount());
    }
    @Test
    void convertXafToDollar() {
        money2.setAmount(Convert.convertToDollar(money2.getAmount(),money2.getCurrency()));
        Assertions.assertEquals(100,money2.getAmount());
    }
}
