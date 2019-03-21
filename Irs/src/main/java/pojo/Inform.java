package pojo;

import java.util.Date;

public class Inform {
    private Integer infoid;

    private String title;

    private Date starttime;

    private Date stoptime;

    private Integer sid;

    private Integer sids;

    private Date creattime;

    private Integer infostate;

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getStoptime() {
        return stoptime;
    }

    public void setStoptime(Date stoptime) {
        this.stoptime = stoptime;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getSids() {
        return sids;
    }

    public void setSids(Integer sids) {
        this.sids = sids;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Integer getInfostate() {
        return infostate;
    }

    public void setInfostate(Integer infostate) {
        this.infostate = infostate;
    }
}