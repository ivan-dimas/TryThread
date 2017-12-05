package id.ivan;

import java.util.Scanner;

class Trial {

    public String nama;
    public String npm;

    public void Thread() {
        Scanner s = new Scanner(System.in);
        Thread jeda = new Thread();

        System.out.print("Input Nama : ");
        nama = s.nextLine();
        System.out.print("Input NPM : ");
        npm = s.nextLine();

        try {
            for (int i = 0; i < nama.length(); i++) {
                System.out.print(nama.charAt(i));
                jeda.sleep(1000);
            }
            System.out.print(" ");
            for (int j = 0; j < npm.length(); j++) {
                System.out.print(npm.charAt(j));
                jeda.sleep(1000);
            }
        } catch (InterruptedException e) {

        }
    }
}

public class TryThread {

    public static void main(String[] args) {
        Trial T = new Trial();
        T.Thread();
    }
}
