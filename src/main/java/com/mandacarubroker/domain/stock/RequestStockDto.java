package com.mandacarubroker.domain.stock;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record RequestStockDto(
        @Pattern(regexp = "[A-Za-z]{4}[0-9]{1}",
                message = "Symbol must be 4 letters followed by 1 number")
        String symbol,
        @NotBlank(message = "Company name cannot be blank")
        String companyName,
        @NotNull(message = "Price cannot be null")
        double price
) {
}
