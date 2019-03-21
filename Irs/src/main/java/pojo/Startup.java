package pojo;

import java.util.Date;

public class Startup {
    private Integer staid;

    private Date startuptime;

    private Integer type;

    private Integer cycle;

    public Integer getStaid() {
        return staid;
    }

    public void setStaid(Integer staid) {
        this.staid = staid;
    }

    public Date getStartuptime() {
        return startuptime;
    }

    public void setStartuptime(Date startuptime) {
        this.startuptime = startuptime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }
}