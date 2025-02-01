package karibu.formation.com.banksystem.domain.model;


import karibu.formation.com.banksystem.domain.enums.Currency;
import lombok.Data;

@Data
public class Money {

    private Currency currency;
    private double amount;

    public Money(Currency currency, double amount) {
        this.currency=currency;
        this.amount=amount;
    }


    public boolean isPositive(Money money) {
        return money.amount > 0;
    }

    public boolean isEqualToZero(Money money) {
        return money.amount == 0;
    }

    public boolean isNegative(Money money) {
        return money.amount < 0;
    }


}
