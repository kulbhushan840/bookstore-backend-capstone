package com.example.bookstore.order;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public record OrderRequest(
        @NotBlank @Email String customerEmail,
        @NotNull BigDecimal total
) {}
