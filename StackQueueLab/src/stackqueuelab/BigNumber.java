package stackqueuelab;

public class BigNumber {
    String num;

    public BigNumber(String num) {
        this.num = num;
    }

    public BigNumber(int num) {
        this.num = num + "";
    }

    public String toString() {
        return this.num;
    }

    public int length() {
        return num.length();
    }

    public BigNumber add(BigNumber BigNum2) {
        String num2 = BigNum2.toString();
        String ans = "";
        Stack op1 = new Stack(this.num.length());
        Stack op2 = new Stack(num2.length());
        Stack res = new Stack(Math.max(this.num.length(), num2.length()) + 1);
        for (int i = 0; i < this.num.length(); i++) {
            op1.push(this.num.charAt(i) - '0');
        }
        for (int i = 0; i < num2.length(); i++) {
            op2.push(num2.charAt(i) - '0');
        }
        int carry = 0;
        int tmp;
        while (!(op1.isEmpty() && op2.isEmpty())) {
            tmp = (op1.isEmpty() ? 0 : op1.pop()) + (op2.isEmpty() ? 0 : op2.pop()) + carry;
            res.push(tmp % 10);
            carry = tmp / 10;
        }
        if (carry > 0)
            res.push(carry);
        while (!res.isEmpty()) {
            ans += res.pop();
        }
        return new BigNumber(ans);
    }
}
