package org.scoula.ex05.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeController {
    public String getIndex(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return "index";
    }
}
