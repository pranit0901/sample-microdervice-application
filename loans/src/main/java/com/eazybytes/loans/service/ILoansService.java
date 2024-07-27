package com.eazybytes.loans.service;

import com.eazybytes.loans.dto.LoansDto;

public interface ILoansService {

    /**
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    void createLoan(String mobileNumber);

    /**
     *
     * @param mobileNumber - Input mobile Number
     * @return Loan Details based on a given mobileNumber
     */
    LoansDto fetchLoan(String mobileNumber);

    /**
     *
     * @param loansDto - LoansDto object
     * @return boolean indicating if the update of loan details is successful or not
     */
    boolean updateLoan(LoansDto loansDto);

    /**
     *
     * @param mobileNumber - Input mobile Number
     * @return boolean indicating if delete of loan details is successful or not
     */
    boolean deleteLoan(String mobileNumber);
}
