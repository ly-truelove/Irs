package pojo;

public class Screen {
    private Integer scrid;

    private String scrname;

    private Double x;

    private Double y;

    private Double wide;

    private Double high;

    private String picture;

    private String savecatalog;

    public Integer getScrid() {
        return scrid;
    }

    public void setScrid(Integer scrid) {
        this.scrid = scrid;
    }

    public String getScrname() {
        return scrname;
    }

    public void setScrname(String scrname) {
        this.scrname = scrname == null ? null : scrname.trim();
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

    public Double getWide() {
        return wide;
    }

    public void setWide(Double wide) {
        this.wide = wide;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getSavecatalog() {
        return savecatalog;
    }

    public void setSavecatalog(String savecatalog) {
        this.savecatalog = savecatalog == null ? null : savecatalog.trim();
    }
}