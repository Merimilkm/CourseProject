package com.nyha.webfinal.model.dao;

import com.nyha.webfinal.exception.DaoException;
import com.nyha.webfinal.entity.Train;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


public interface TrainDao extends BaseDao<Train> {

    List<Train> findTrainByStation(String departureStation) throws DaoException;

    List<Train> findPopularTrains() throws DaoException;


    Optional<Train> findTrainById(Long trainId) throws DaoException;


    boolean addTrain(Train train) throws DaoException;
}
