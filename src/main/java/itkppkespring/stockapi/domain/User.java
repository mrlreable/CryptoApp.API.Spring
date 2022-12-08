package itkppkespring.stockapi.domain;
import lombok.*;

import java.util.Set;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String email;
    private String role;
    private String password;

    @OneToMany(mappedBy = "users")
    Set<UserStock> userStocks;
}
