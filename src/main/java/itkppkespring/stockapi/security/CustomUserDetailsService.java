package itkppkespring.stockapi.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import itkppkespring.stockapi.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

// @Service
// @Slf4j
// @RequiredArgsConstructor
// public class CustomUserDetailsService implements UserDetailsService{
//     private final UserService _userService;

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
// //      read user with password and role from DB
//         var dbUser = _userService
//                 .findByUsername(username)
//                 .orElseThrow(() -> new UsernameNotFoundException(String.format("User with username %s")));
// //      populate Spring security user with data from DB user
//         return org.springframework.security.core.userdetails.User.builder()
//                 .username(username)
//                 .password(dbUser.getPassword())
//                 .authorities(dbUser.getRole())
//                 .build();
//     }
// }
// 