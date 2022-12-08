package itkppkespring.stockapi.domain;
import lombok.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stocks")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String shortName;
    private boolean isSupported;
    private double price;
    private double spread;
    private double change;
    private LocalDateTime updatedAt;
    private String description;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "updated_by_id")
    private User updatedBy;

    @OneToMany(mappedBy = "stocks")
    Set<UserStock> userStocks;
}
