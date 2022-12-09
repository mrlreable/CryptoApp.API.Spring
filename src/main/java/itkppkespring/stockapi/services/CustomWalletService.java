package itkppkespring.stockapi.services;

import org.springframework.stereotype.Repository;

import itkppkespring.stockapi.controllers.dto.WalletDto;
import itkppkespring.stockapi.domain.Wallet;

@Repository
public interface CustomWalletService {
    Wallet createWallet(WalletDto dto, String username);
    void deleteWallet(String username, Integer id);
}
