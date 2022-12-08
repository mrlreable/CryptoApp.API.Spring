package itkppkespring.stockapi.domain;
import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserStock {
    @EmbeddedId
    UserStockKey id;

    @ManyToOne
    @MapsId("stockId")
    @JoinColumn(name = "stock_id")
    Stock stockId;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    Stock userId;

    private double balance;
    private LocalDateTime latestPurchase;
}
