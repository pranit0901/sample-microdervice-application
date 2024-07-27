package com.eazybytes.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(name = "Loans",
        description = "Schema to hold Loan information"
)
@Data
public class LoansDto {

    @NotEmpty(message = "Mobile Number cannot be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must be 10 digits")
    @Schema(description = "Mobile Number of Customer", example = "9004912797")
    private String mobileNumber;

    @NotEmpty(message = "Loan Number cannot be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{12})\", message = \"Loan Number must be 12 digits\"")
    @Schema(description = "Loan Number of Customer", example = "123456789098")
    private String loanNumber;

    @NotEmpty(message = "Loan Type cannot be a null or empty")
    @Schema(description = "Type of the loan", example = "Home Loan")
    private String loanType;

    @Positive(message = "Total loan amount should be grater than zero")
    @Schema(description = "Total Loan amount", example = "1000000")
    private int totalLoan;

    @PositiveOrZero(message = "Total loan amount paid should be equal or greater than zero")
    @Schema(description = "Total loan amount paid", example = "100000")
    private int amountPaid;

    @PositiveOrZero(message = "Total outstanding amount should be equal or greater than zero")
    @Schema(description = "Total outstanding amount against a loan", example = "900000")
    private int outstandingAmount;
}
