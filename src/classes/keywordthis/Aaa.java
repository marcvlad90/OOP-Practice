package classes.keywordthis;

public class Aaa<T> {

    private T xxx;
    boolean isXxx;

    public boolean isXxx() {
        return isXxx;
    }

    public void setXxx(boolean isXxx) {
        this.isXxx = isXxx;
    }

    public Aaa(T xxx) {
        this.xxx = xxx;
    }

    public T getXxx() {
        return xxx;
    }

    public void setXxx(T xxx) {
        this.xxx = xxx;
    }

}
