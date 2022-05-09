package com.nyha.webfinal.model.dao;

import com.nyha.webfinal.exception.DaoException;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;


public interface BankDao extends BaseDao {

    boolean debitAccount(String accountNumber, double price) throws DaoException;
}
