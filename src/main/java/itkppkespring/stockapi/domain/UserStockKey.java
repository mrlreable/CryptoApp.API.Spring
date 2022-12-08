package itkppkespring.stockapi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserStockKey implements Serializable {
    @Column(name = "user_id")
    Integer userId;
    
    @Column(name = "stock_id")
    Integer stockId;
}