package pojo;

public class Terminalversions {
    private Integer tvid;

    private String vernumber;

    private String downlink;

    private String context;

    public Integer getTvid() {
        return tvid;
    }

    public void setTvid(Integer tvid) {
        this.tvid = tvid;
    }

    public String getVernumber() {
        return vernumber;
    }

    public void setVernumber(String vernumber) {
        this.vernumber = vernumber == null ? null : vernumber.trim();
    }

    public String getDownlink() {
        return downlink;
    }

    public void setDownlink(String downlink) {
        this.downlink = downlink == null ? null : downlink.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}