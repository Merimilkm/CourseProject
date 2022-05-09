package com.nyha.webfinal.model.dao;

import com.nyha.webfinal.exception.DaoException;
import com.nyha.webfinal.entity.Passenger;

import java.sql.SQLException;


public interface PassengerDao extends BaseDao<Passenger> {

    boolean addPassenger(Passenger passenger) throws DaoException;
}
