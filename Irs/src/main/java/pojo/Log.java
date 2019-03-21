package pojo;

import java.util.Date;

public class Log {
    private Integer logid;

    private String logcontext;

    private Date operationtime;

    private String username;

    private Integer result;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public String getLogcontext() {
        return logcontext;
    }

    public void setLogcontext(String logcontext) {
        this.logcontext = logcontext == null ? null : logcontext.trim();
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}