package com.nyha.webfinal.model.service;

import com.nyha.webfinal.exception.DaoException;
import com.nyha.webfinal.exception.ServiceException;

import java.util.Optional;


public interface BankService {

    Optional<String> debitAccount(String accountNumber, double price) throws ServiceException;
}
