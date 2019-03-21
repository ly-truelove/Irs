package pojo;

import java.util.Date;

public class Material {
    private Integer mid;

    private String mname;

    private String mstorecatalog;

    private Integer cid;

    private Double filesize;

    private Date uploadingtime;

    private String mformat;

    private Integer share;

    private Integer fid;

    private Integer uid;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getMstorecatalog() {
        return mstorecatalog;
    }

    public void setMstorecatalog(String mstorecatalog) {
        this.mstorecatalog = mstorecatalog == null ? null : mstorecatalog.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Double getFilesize() {
        return filesize;
    }

    public void setFilesize(Double filesize) {
        this.filesize = filesize;
    }

    public Date getUploadingtime() {
        return uploadingtime;
    }

    public void setUploadingtime(Date uploadingtime) {
        this.uploadingtime = uploadingtime;
    }

    public String getMformat() {
        return mformat;
    }

    public void setMformat(String mformat) {
        this.mformat = mformat == null ? null : mformat.trim();
    }

    public Integer getShare() {
        return share;
    }

    public void setShare(Integer share) {
        this.share = share;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}