package itkppkespring.stockapi.controllers.dto;

import org.springframework.lang.Nullable;

import itkppkespring.stockapi.domain.Stock;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateStockDto {
    private Integer id;
    @Nullable
    private double price;
    @Nullable
    private double spread;
    @Nullable
    private double change;
    @Nullable
    private boolean isSupported;
    @Nullable
    private String description;

    public static UpdateStockDto fromStock(Stock stock) {
        return new UpdateStockDto(
                stock.getId(),
                stock.getPrice(),
                stock.getSpread(),
                stock.getChange(),
                stock.isSupported(),
                stock.getDescription()
        );
    }
}
