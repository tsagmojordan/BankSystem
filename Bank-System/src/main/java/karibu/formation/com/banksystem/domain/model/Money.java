package karibu.formation.com.banksystem.domain.model;


import karibu.formation.com.banksystem.domain.constant.Constant;
import karibu.formation.com.banksystem.domain.enums.Currency;

public record Money(Currency currency, double amount) {

    public double getAmount() {
        return amount;
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

    public double convertToDollar(double amount) {
     return 0;
    }





}
