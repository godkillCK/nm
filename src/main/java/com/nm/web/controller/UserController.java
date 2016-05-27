package com.nm.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能说明：TODO
 * @return <br/>
 *         修改历史：<br/>
 *         1.[2016年05月27日上午10:45] 创建方法 by hw
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    private String hello() {
        return "hello";
    }
}
