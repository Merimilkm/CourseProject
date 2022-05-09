package com.nyha.webfinal.controller.command;


public class Router {
    private String page;
    private boolean isRedirect;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public boolean isRedirect() {
        return isRedirect;
    }

    public void setRedirect() {
        isRedirect = true;
    }
}