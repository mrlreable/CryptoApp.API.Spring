package itkppkespring.stockapi.controllers.dto;

import java.sql.Date;

import itkppkespring.stockapi.domain.Wallet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WalletDto {
    private String cardNumber;
    private String cardHolder;
    private Date expirationDate;
    private double balance;

    public static WalletDto fromWallet(Wallet w) {
        return new WalletDto(
                w.getCardNumber(),
                w.getCardHolder(),
                w.getExpirationDate(),
                w.getBalance()
        );
    }
}
