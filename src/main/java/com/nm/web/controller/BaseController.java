package com.nm.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.nm.web.util.Result;

/**
 * 功能说明：TODO
 * @return <br/>
 *         修改历史：<br/>
 *         1.[2016年06月04日上午10:47] 创建方法 by hw
 */
public abstract class BaseController {

    public ResponseEntity<Result> getResult(Object data) {
        return getResult(new Result(data));
    }

    public ResponseEntity<Result> getResult(Result result) {
        ResponseEntity<Result> responseEntity = null;
        if (null == result) {
            result = new Result();
        }
        if(result.getSuccess()){
            responseEntity = ResponseEntity.ok().body(result);
        }else{
            responseEntity = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(result);
        }
        return responseEntity;
    }
}
