package com.example.diff.filter;


import com.example.diff.utils.JsonData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = "/api/**", filterName = "loginFilter")
public class LoginFilter implements Filter {


    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 容器加载的时候
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("init LoginFilter======");
    }



    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("doFilter LoginFilter======");

        HttpServletRequest req = (HttpServletRequest) servletRequest;

        HttpServletResponse resp = (HttpServletResponse) servletResponse;


        String token = req.getHeader("token");

        if(!StringUtils.isEmpty(token)){

            //判断token是否合法
            if(token!=null){
                filterChain.doFilter(servletRequest,servletResponse);
            }else {

               JsonData jsonData =  JsonData.buildError("登录失败，token无效",-2);
                String jsonStr = objectMapper.writeValueAsString(jsonData);
                renderJson(resp,jsonStr);

            }

        }else {

            JsonData jsonData =  JsonData.buildError("没有token",-3);
            String jsonStr = objectMapper.writeValueAsString(jsonData);
            renderJson(resp,jsonStr);
        }







    }



    private void renderJson(HttpServletResponse response,String json){

        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");

        try(PrintWriter writer = response.getWriter()){
            writer.print(json);
        }catch (Exception e){
            e.printStackTrace();
        }

    }






    /**
     * 容器销毁的时候
     */
    @Override
    public void destroy() {

        System.out.println("destroy LoginFilter======");

    }


}
