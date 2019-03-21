package pojo;

import java.util.Date;

public class Pinfo {
    private Integer iid;

    private Double x;

    private Double y;

    private Integer rid;

    private Integer fid;

    private String projrampath;

    private Integer state;

    private Date creattime;

    private Integer totalclassid;

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getProjrampath() {
        return projrampath;
    }

    public void setProjrampath(String projrampath) {
        this.projrampath = projrampath == null ? null : projrampath.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Integer getTotalclassid() {
        return totalclassid;
    }

    public void setTotalclassid(Integer totalclassid) {
        this.totalclassid = totalclassid;
    }
}