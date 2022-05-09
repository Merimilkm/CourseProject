package com.nyha.webfinal.model.dao;

import com.nyha.webfinal.entity.Entity;
import com.nyha.webfinal.exception.DaoException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public interface BaseDao<T extends Entity> {
    Logger logger = LogManager.getLogger();

    List<T> findAll() throws DaoException;



    default void close(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            logger.error("close statement error", e);
        }
    }

    default void close(Connection connection) {
        try {
            if (connection != null) {
                connection.setAutoCommit(true);
                connection.close();
            }
        } catch (SQLException e) {
            logger.error("close connection error", e);
        }
    }
}