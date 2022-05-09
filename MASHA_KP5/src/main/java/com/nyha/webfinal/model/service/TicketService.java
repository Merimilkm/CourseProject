package com.nyha.webfinal.model.service;

import com.nyha.webfinal.exception.DaoException;
import com.nyha.webfinal.exception.ServiceException;
import com.nyha.webfinal.entity.Ticket;

import java.util.List;
import java.util.Optional;


public interface TicketService {

    List<Ticket> findAllTickets() throws ServiceException;


    List<Ticket> findUsersTickets(Long userId) throws ServiceException;


    Optional<String> addTicket(Ticket ticket) throws ServiceException;
}
