package itkppkespring.stockapi.controllers.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import itkppkespring.stockapi.domain.Stock;
import itkppkespring.stockapi.domain.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockDto {
    private double price;
    private String name;
    private String shortName;
    private boolean isSupported;
    private double change;
    private String description;

    public static StockDto fromBet(Stock stock) {
        return new StockDto(
                stock.getId(),
                stock.getName(),
                stock.getShortName(),
                stock.isSupported(),
                stock.getChange(),
                stock.getDescription()
        );
    }
}
