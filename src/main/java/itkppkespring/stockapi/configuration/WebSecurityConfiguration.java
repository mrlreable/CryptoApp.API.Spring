package itkppkespring.stockapi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration {
    // private final UserDetailsService customUserDetailsService;

    // @Bean
    // public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    //     http.csrf().disable()
    //             .authorizeRequests()
    //             .antMatchers("/h2-console/**")
    //             .permitAll()
    //             .antMatchers(HttpMethod.DELETE)
    //             .hasRole("ADMIN")
    //             .antMatchers("/stocks/**")
    //             .hasAnyRole("USER", "ADMIN")
    //             .antMatchers("/groups/**")
    //             .hasAnyRole("ADMIN")
    //             .anyRequest()
    //             .authenticated()
    //             .and()
    //             .httpBasic()
    //             .and()
    //             .sessionManagement()
    //             .sessionCreationPolicy(SessionCreationPolicy.STATELESS);

    //     http.headers().frameOptions().disable(); // needed to be able to run h2-console
    //     return http.build();
    // }

    // @Bean
    // public PasswordEncoder passwordEncoder() {
    //     return new BCryptPasswordEncoder();
    // }

    // @Bean
    // public AuthenticationManager authManager(HttpSecurity http) throws Exception {
    //     AuthenticationManagerBuilder authenticationManagerBuilder =
    //             http.getSharedObject(AuthenticationManagerBuilder.class);

    //     authenticationManagerBuilder
    //             .userDetailsService(customUserDetailsService)
    //             .passwordEncoder(passwordEncoder());
    //     return authenticationManagerBuilder.build();
    // }
}
