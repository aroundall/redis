package org.amuji.domain.dto;

/**
 * Roy Yang
 * 7/29/15
 */
public class ErrorInfo {
    private String url;
    private String msg;

    public ErrorInfo(String url, String msg) {
        this.url = url;
        this.msg = msg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
