package com.nyha.webfinal.model.service;

import com.nyha.webfinal.entity.Route;
import com.nyha.webfinal.exception.DaoException;
import com.nyha.webfinal.exception.ServiceException;

import java.util.List;
import java.util.Optional;


public interface RouteService {

    Optional<String> addRoutes(List<Route> routes) throws ServiceException;
}
