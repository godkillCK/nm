package com.nm.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 功能说明：TODO
 * @return <br/>
 *         修改历史：<br/>
 *         1.[2016年05月27日上午10:45] 创建方法 by hw
 */
@Controller
@RequestMapping(path = "/rest/user")
public class UserController extends BaseController {

    HttpServletRequest request;
    HttpServletResponse response;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    private ResponseEntity hello() {

        return getResult(null);
    }
}
