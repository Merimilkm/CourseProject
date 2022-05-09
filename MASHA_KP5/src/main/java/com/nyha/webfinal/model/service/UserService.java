package com.nyha.webfinal.model.service;

import com.nyha.webfinal.entity.User;
import com.nyha.webfinal.exception.DaoException;
import com.nyha.webfinal.exception.ServiceException;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> findUserByEmail(String email) throws ServiceException;


    Optional<User> findUserByEmailAndPassword(String email, String password) throws ServiceException;


    List<User> findAllUsers() throws ServiceException;


    Optional<String> addUser(User user, String password) throws ServiceException;

    Optional<String> changePassword(User user, String password) throws ServiceException;


    Optional<String> updateUser(User user) throws ServiceException;
}
