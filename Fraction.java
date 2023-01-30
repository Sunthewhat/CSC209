public class Fraction {
    // Attributes
    private int ses;
    private int suan;

    // Constructor
    public Fraction(int ses, int suan) {
        this.ses = ses;
        this.suan = suan;
    }

    public Fraction(int ses) {
        this.ses = ses;
        this.suan = 1;
    }

    // Getter | Setter
    public int getSes() {
        return ses;
    }

    public void setSes(int ses) {
        this.ses = ses;
    }

    public int getSuan() {
        return suan;
    }

    public void setSuan(int suan) {
        this.suan = suan;
    }

    // Methods
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public String toString() {
        return Integer.toString(ses) + "/" + Integer.toString(suan);
    }

    public void add(Fraction operate) {
        int newsuan = lcm(suan, operate.getSuan());
        int thismul = newsuan / suan;
        int thatmul = newsuan / operate.getSuan();
        this.ses = ses * thismul + operate.getSes() * thatmul;
        this.suan = newsuan;
    }

    public void subtract(Fraction operate) {
        int newsuan = lcm(suan, operate.getSuan());
        int thismul = newsuan / suan;
        int thatmul = newsuan / operate.getSuan();
        this.ses = ses * thismul - operate.getSes() * thatmul;
        this.suan = newsuan;
    }

    public void multiply(Fraction operate) {
        this.ses *= operate.getSes();
        this.suan *= operate.getSuan();
    }

    public void divide(Fraction operate) {
        this.ses /= operate.getSuan();
        this.suan /= operate.getSes();
    }

    public void reduce() {
        int gcd = gcd(ses, suan);
        this.ses /= gcd;
        this.suan /= gcd;
    }
}