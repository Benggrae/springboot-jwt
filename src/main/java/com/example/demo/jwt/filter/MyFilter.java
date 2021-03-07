package com.example.demo.jwt.filter;

import javax.servlet.*;
import java.io.IOException;


public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("필터걸림");
        chain.doFilter(request,response);
    }
}
