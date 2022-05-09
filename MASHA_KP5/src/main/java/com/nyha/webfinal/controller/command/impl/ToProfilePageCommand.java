package com.nyha.webfinal.controller.command.impl;

import com.nyha.webfinal.controller.RequestAttribute;
import com.nyha.webfinal.controller.SessionAttribute;
import com.nyha.webfinal.controller.command.Command;
import com.nyha.webfinal.controller.command.PagePath;
import com.nyha.webfinal.controller.command.Router;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class ToProfilePageCommand implements Command {
    public static final String ERROR_ACCESS = "errorAccess";

    @Override
    public Router execute(HttpServletRequest request) {
        Router router = new Router();
        HttpSession session = request.getSession(true);
        if (session.getAttribute(SessionAttribute.USER) == null) {
            request.setAttribute(RequestAttribute.EXCEPTION, ERROR_ACCESS);
            router.setPage(PagePath.ERROR_500);
            return router;
        }
        session.setAttribute(SessionAttribute.CURRENT_COMMAND, PagePath.PROFILE);
        router.setPage(PagePath.PROFILE);
        return router;
    }
}
