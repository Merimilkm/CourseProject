package com.nyha.webfinal.controller.command;

import javax.servlet.http.HttpServletRequest;


public interface Command {

    Router execute(HttpServletRequest request);
}
