package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    @NotEmpty(message = "AccountNumber cannot be null or empty")
    @Schema(
            description = "Account Number of Eazy Bank Account", example = "1234567890"
    )
    private Long accountNumber;

    @NotEmpty(message = "AccountType cannot be null or empty")
    @Schema(
            description = "Account type of Eazy Bank Account", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "BranchAddress cannot be null or empty")
    @Schema(
            description = "Eazy Bank Branch Address" ,example = "123 NewYork"
    )
    private String branchAddress;
}
