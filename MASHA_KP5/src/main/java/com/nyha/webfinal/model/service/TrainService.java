package com.nyha.webfinal.model.service;

import com.nyha.webfinal.exception.DaoException;
import com.nyha.webfinal.exception.ServiceException;
import com.nyha.webfinal.entity.ShortTrainData;
import com.nyha.webfinal.entity.Train;

import java.util.List;
import java.util.Optional;


public interface TrainService {

    List<ShortTrainData> findAllTrains() throws ServiceException;

    List<ShortTrainData> findTrainByStations(String departureStation, String arrivalStation) throws ServiceException;


    List<ShortTrainData> findPopularTrains() throws ServiceException;

    Optional<Train> findTrainById(Long trainId) throws ServiceException;

    Optional<String> addTrain(Train train) throws ServiceException;
}
