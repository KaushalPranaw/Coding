package dcipher;

public class TestCount {
    public static void main(String[] args) {

        int a[] = {8, 8, 8, 9, 9, 13, 15, 16, 16, 16};
        int count = 1;
        int current = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] == current) {
                count++;
            } else {
                System.out.println(current + " " + count);
                current = a[i];
                count = 1;
            }
        }
        System.out.println(current + " " + count);
    }
}
