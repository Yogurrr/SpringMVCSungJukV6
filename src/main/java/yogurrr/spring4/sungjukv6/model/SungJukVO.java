package yogurrr.spring4.sungjukv6.model;

public class SungJukVO {

    private int sjno;
    private String names;
    private int kors;
    private int engs;
    private int mats;
    private int tots;
    private double avgs;
    private char grds;
    private String regdate;

    // 기본 생성자를 꼭 만들어야 함!!
    public SungJukVO() {
    }

    public SungJukVO(String names, int kors, int engs, int mats) {
        this.names = names;
        this.kors = kors;
        this.engs = engs;
        this.mats = mats;

        this.tots = (kors + engs + mats);
        this.avgs = tots / 3;
        if (avgs >= 90) this.grds = '수';
        else if (avgs >= 80) this.grds = '우';
        else if (avgs >= 70) this.grds = '미';
        else if (avgs >= 60) this.grds = '양';
        else this.grds = '가';
    }

    public SungJukVO(String names, int kors, int engs, int mats, int tots, double avgs, char grds) {
        this(names, kors, engs, mats);
        this.names = names;
        this.kors = kors;
        this.engs = engs;
        this.mats = mats;
        this.tots = tots;
        this.avgs = avgs;
        this.grds = grds;
    }

    public int getSjno() { return sjno; }

    public void setSjno(int sjno) { this.sjno = sjno; }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getKors() {
        return kors;
    }

    public void setKors(int kors) {
        this.kors = kors;
    }

    public int getEngs() {
        return engs;
    }

    public void setEngs(int engs) {
        this.engs = engs;
    }

    public int getMats() {
        return mats;
    }

    public void setMats(int mats) {
        this.mats = mats;
    }

    public int getTots() {
        return tots;
    }

    public void setTots(int tots) {
        this.tots = tots;
    }

    public double getAvgs() {
        return avgs;
    }

    public void setAvgs(double avgs) {
        this.avgs = avgs;
    }

    public char getGrds() {
        return grds;
    }

    public void setGrds(char grds) {
        this.grds = grds;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        String fmt = "%d %s %d %d %d %d %.1f %c %s\n";
        return String.format(fmt, sjno, names, kors, engs, mats, tots, avgs, grds, regdate);
    }
}
