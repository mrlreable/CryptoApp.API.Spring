package itkppkespring.stockapi.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import itkppkespring.stockapi.controllers.dto.WalletDto;
import itkppkespring.stockapi.domain.Wallet;
import lombok.RequiredArgsConstructor;

import java.util.NoSuchElementException;
import java.util.Optional;

@RequiredArgsConstructor
public class CustomWalletServiceImpl implements CustomWalletService{

    @PersistenceContext
    private EntityManager _entityManager;

    @Override
    @Transactional
    public Wallet createWallet(WalletDto dto, String username) {
        Wallet w;
        Wallet existingWallet = _entityManager.find(Wallet.class, dto.getCardNumber());

        if (existingWallet != null)
            throw new IllegalArgumentException(String.format("Wallet with %s number already exists", dto.getCardNumber()));
        
        w = new Wallet();
        w.setBalance(dto.getBalance());
        w.setCardNumber(dto.getCardNumber());
        w.setCardHolder(dto.getCardHolder());
        w.setExpirationDate(dto.getExpirationDate());

        _entityManager.persist(w);
        return w;
    }

    @Override
    @Transactional
    public void deleteWallet(String username, Integer id) {
        Optional<Wallet> wallet = _entityManager
                .createQuery("SELECT w FROM Wallet w WHERE w.username = :username AND w.id = :id", Wallet.class)
                .setParameter("username", username)
                .setParameter("id", id)
                .setMaxResults(1)
                .getResultStream()
                .findFirst();
        
        if(wallet.isPresent()){
            Wallet w = wallet.get();
            _entityManager.remove(w);
        }
    }
    
}
