package pojo;

public class Mclassify {
    private Integer cid;

    private String classname;

    private Integer totalclassid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getTotalclassid() {
        return totalclassid;
    }

    public void setTotalclassid(Integer totalclassid) {
        this.totalclassid = totalclassid;
    }
}