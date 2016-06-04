package com.nm.web.util;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月04日上午10:37] 创建方法 by hw
 */
public class Result {
    private int errCode = 0;
    private String msg;
    private Object data;
    private boolean success;

    public Result(int errCode, String msg, Object data, boolean success) {
        this.errCode = errCode;
        this.msg = msg;
        this.data = data;
        this.success = success;
    }

    public Result() {
        this.success = true;
    }

    public Result(Object data) {
        this.data = data;
        this.success=true;
    }

    ////////////////////// get and set ////////////////////////////

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
        this.setSuccess(false);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
