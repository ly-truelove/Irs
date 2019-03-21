package pojo;

public class Styless {
    private Integer sid;

    private String bgcolor;

    private String fontcolor;

    private String fontsty;

    private Double fontsize;

    private Integer rollspeed;

    private Integer upmovepx;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getBgcolor() {
        return bgcolor;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor == null ? null : bgcolor.trim();
    }

    public String getFontcolor() {
        return fontcolor;
    }

    public void setFontcolor(String fontcolor) {
        this.fontcolor = fontcolor == null ? null : fontcolor.trim();
    }

    public String getFontsty() {
        return fontsty;
    }

    public void setFontsty(String fontsty) {
        this.fontsty = fontsty == null ? null : fontsty.trim();
    }

    public Double getFontsize() {
        return fontsize;
    }

    public void setFontsize(Double fontsize) {
        this.fontsize = fontsize;
    }

    public Integer getRollspeed() {
        return rollspeed;
    }

    public void setRollspeed(Integer rollspeed) {
        this.rollspeed = rollspeed;
    }

    public Integer getUpmovepx() {
        return upmovepx;
    }

    public void setUpmovepx(Integer upmovepx) {
        this.upmovepx = upmovepx;
    }
}