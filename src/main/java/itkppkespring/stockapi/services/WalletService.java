package itkppkespring.stockapi.services;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import itkppkespring.stockapi.controllers.dto.WalletDto;
import itkppkespring.stockapi.domain.Wallet;

@Repository
public interface WalletService extends JpaRepository<Wallet, Integer>, CustomWalletService {
    List<WalletDto> getAllWallets(String username);
    WalletDto getWalletById(Integer id);
}
