package pojo;

import java.util.Date;

public class Terminalinfo {
    private Integer tiid;

    private Integer connecttime;

    private Integer volume;

    private Double maximum;

    private Date onlinetime;

    private Integer tvid;

    private String context;

    public Integer getTiid() {
        return tiid;
    }

    public void setTiid(Integer tiid) {
        this.tiid = tiid;
    }

    public Integer getConnecttime() {
        return connecttime;
    }

    public void setConnecttime(Integer connecttime) {
        this.connecttime = connecttime;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Double getMaximum() {
        return maximum;
    }

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    public Date getOnlinetime() {
        return onlinetime;
    }

    public void setOnlinetime(Date onlinetime) {
        this.onlinetime = onlinetime;
    }

    public Integer getTvid() {
        return tvid;
    }

    public void setTvid(Integer tvid) {
        this.tvid = tvid;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}