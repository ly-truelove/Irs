package pojo;

public class Jurisdiction {
    private Integer jid;

    private Integer jlevel;

    private String jname;

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public Integer getJlevel() {
        return jlevel;
    }

    public void setJlevel(Integer jlevel) {
        this.jlevel = jlevel;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname == null ? null : jname.trim();
    }
}