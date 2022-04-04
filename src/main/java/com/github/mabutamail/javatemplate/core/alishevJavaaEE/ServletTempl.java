package com.github.mabutamail.javatemplate.core.alishevJavaaEE;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class ServletTempl extends HttpServlet {
    private static final long serialVersionUID = 7336426149369478190L;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendError(400);
        log.info(req.getProtocol());
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendError(400);
        log.info(req.getProtocol());
    }

    public static void main(String[] args) {
        log.info("Program start ");
    }
}