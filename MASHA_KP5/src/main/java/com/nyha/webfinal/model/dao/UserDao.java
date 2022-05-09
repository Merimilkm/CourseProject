package com.nyha.webfinal.model.dao;

import com.nyha.webfinal.entity.User;
import com.nyha.webfinal.exception.DaoException;

import java.sql.SQLException;
import java.util.Optional;


public interface UserDao extends BaseDao<User> {

    Optional<User> findUserByEmailAndPassword(String email, String password) throws DaoException;


    Optional<User> findUserByEmail(String email) throws DaoException;


    boolean addUser(User user, String password) throws DaoException;


    boolean changePassword(User user, String password) throws DaoException;


    boolean updateUser(User user) throws DaoException;
}