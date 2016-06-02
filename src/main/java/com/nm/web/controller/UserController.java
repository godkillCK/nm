package com.nm.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 功能说明：TODO
 * @return <br/>
 *         修改历史：<br/>
 *         1.[2016年05月27日上午10:45] 创建方法 by hw
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {

    HttpServletRequest request;
    HttpServletResponse response;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    private ModelAndView hello() {
        return new ModelAndView("index");
    }
}
