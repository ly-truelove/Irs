package pojo;

public class Rss {
    private Integer rssid;

    private String rssname;

    private Integer refresh;

    private String site;

    public Integer getRssid() {
        return rssid;
    }

    public void setRssid(Integer rssid) {
        this.rssid = rssid;
    }

    public String getRssname() {
        return rssname;
    }

    public void setRssname(String rssname) {
        this.rssname = rssname == null ? null : rssname.trim();
    }

    public Integer getRefresh() {
        return refresh;
    }

    public void setRefresh(Integer refresh) {
        this.refresh = refresh;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }
}