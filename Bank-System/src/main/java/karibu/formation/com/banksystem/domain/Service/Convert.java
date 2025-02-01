package karibu.formation.com.banksystem.domain.Service;

import karibu.formation.com.banksystem.domain.constant.Constant;
import karibu.formation.com.banksystem.domain.enums.Currency;

public class Convert {

    public static double convertToDollar(double amount, Currency currency) {
        return switch (currency) {
            case DOLLAR -> amount;
            case EURO -> amount / Constant.EURO;
            case XAF -> amount / Constant.XAF;
            default -> throw new IllegalArgumentException("Invalid currency");
        };
    }
}
