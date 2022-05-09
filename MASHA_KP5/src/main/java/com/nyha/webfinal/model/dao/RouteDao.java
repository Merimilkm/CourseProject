package com.nyha.webfinal.model.dao;

import com.nyha.webfinal.exception.DaoException;
import com.nyha.webfinal.entity.Route;

import java.sql.SQLException;


public interface RouteDao extends BaseDao<Route> {

    boolean addRoute(Route route, int stationNumber) throws DaoException;
}
