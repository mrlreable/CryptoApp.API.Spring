package itkppkespring.stockapi.controllers;

import java.security.Principal;

import org.springframework.boot.actuate.endpoint.SecurityContext;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itkppkespring.stockapi.controllers.dto.WalletDto;
import itkppkespring.stockapi.domain.Wallet;
import itkppkespring.stockapi.services.WalletService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/wallets")
public class WalletController {
    private final WalletService _walletService;

    @Secured("ROLE_USER")
    @PostMapping()
    public WalletDto post(@RequestBody WalletDto dto, Authentication auth){
        String username = auth.getUsername();

        Wallet w = _walletService.createWallet(dto, username);
        return WalletDto.fromWallet(w);
    }

}
