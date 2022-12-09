package itkppkespring.stockapi.services;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import itkppkespring.stockapi.domain.User;

public interface UserService extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
