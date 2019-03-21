package pojo;

public class InformWithBLOBs extends Inform {
    private String context;

    private String contexts;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public String getContexts() {
        return contexts;
    }

    public void setContexts(String contexts) {
        this.contexts = contexts == null ? null : contexts.trim();
    }
}