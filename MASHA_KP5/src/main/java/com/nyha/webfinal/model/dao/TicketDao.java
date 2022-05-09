package com.nyha.webfinal.model.dao;

import com.nyha.webfinal.exception.DaoException;
import com.nyha.webfinal.entity.Ticket;

import java.sql.SQLException;
import java.util.List;


public interface TicketDao extends BaseDao<Ticket> {

    boolean addTicket(Ticket ticket) throws DaoException;

    List<Ticket> findUsersTickets(Long userId) throws DaoException;
}