package com.nyha.webfinal.util;

import com.nyha.webfinal.controller.SessionAttribute;
import com.nyha.webfinal.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public final class UserAccessControl {
    private UserAccessControl() {
    }


    public static boolean isValidForRole(HttpServletRequest request, User.Role permissibleRole) {
        HttpSession session = request.getSession(true);
        User user = (User) session.getAttribute(SessionAttribute.USER);
        if (user.getRole() != permissibleRole) {
            return false;
        }
        return true;
    }
}
