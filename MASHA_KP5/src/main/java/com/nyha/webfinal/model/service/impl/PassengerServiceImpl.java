package com.nyha.webfinal.model.service.impl;


import com.nyha.webfinal.exception.DaoException;
import com.nyha.webfinal.exception.ServiceException;
import com.nyha.webfinal.model.dao.PassengerDao;
import com.nyha.webfinal.model.dao.impl.PassengerDaoImpl;
import com.nyha.webfinal.entity.Passenger;
import com.nyha.webfinal.model.service.PassengerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

/**
 * The service is responsible for passenger operations
 *
 * @author Andrey Gretchenko
 * @see PassengerService
 */
public class PassengerServiceImpl implements PassengerService {
    static Logger logger = LogManager.getLogger();
    public static final String PASSENGER_NOT_ADDED = "passengerNotAdded";
    private PassengerDao passengerDao = new PassengerDaoImpl();

    @Override
    public Optional<String> addPassenger(Passenger passenger) throws ServiceException {
        try {
            System.out.println("тут");
            if (!passengerDao.addPassenger(passenger)) {
                System.out.println("тут2");
                return Optional.of(PASSENGER_NOT_ADDED);
            }
        } catch (DaoException e) {
            System.out.println("тут1");
            logger.error("add passenger error, " + passenger, e);
            throw new ServiceException("add passenger error, " + passenger, e);
        }
        System.out.println("вот тут");
        return Optional.empty();
    }
}
