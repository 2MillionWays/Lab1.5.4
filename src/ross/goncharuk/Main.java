package ross.goncharuk;


import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {
    static public void main(String[] args) {

        int lim = 300;
        for (int a = 1; a <= lim; a++) {
            if (a % 3 != 0 & a % 4 != 0) {
                continue;
            } else if (a > 20) {
                break;
            }
            System.out.println(a);
        }
    }
}
