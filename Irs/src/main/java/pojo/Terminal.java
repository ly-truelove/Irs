package pojo;

public class Terminal {
    private Integer terid;

    private Integer tstate;

    private String tername;

    private String terpwd;

    private Integer yid;

    private Integer tiid;

    public Integer getTerid() {
        return terid;
    }

    public void setTerid(Integer terid) {
        this.terid = terid;
    }

    public Integer getTstate() {
        return tstate;
    }

    public void setTstate(Integer tstate) {
        this.tstate = tstate;
    }

    public String getTername() {
        return tername;
    }

    public void setTername(String tername) {
        this.tername = tername == null ? null : tername.trim();
    }

    public String getTerpwd() {
        return terpwd;
    }

    public void setTerpwd(String terpwd) {
        this.terpwd = terpwd == null ? null : terpwd.trim();
    }

    public Integer getYid() {
        return yid;
    }

    public void setYid(Integer yid) {
        this.yid = yid;
    }

    public Integer getTiid() {
        return tiid;
    }

    public void setTiid(Integer tiid) {
        this.tiid = tiid;
    }
}