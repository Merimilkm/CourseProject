package com.nyha.webfinal.model.service;

import com.nyha.webfinal.exception.DaoException;
import com.nyha.webfinal.exception.ServiceException;
import com.nyha.webfinal.entity.Passenger;

import java.util.Optional;


public interface PassengerService {

    Optional<String> addPassenger(Passenger passenger) throws ServiceException;
}
