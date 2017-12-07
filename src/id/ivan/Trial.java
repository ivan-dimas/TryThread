package id.ivan;

import java.util.Scanner;

public class Trial {

    public String nama;
    public String npm;
    
    public void Thread() {
        Scanner s = new Scanner(System.in);
        Thread thread = new Thread();

        System.out.print("Input Nama : ");
        nama = s.nextLine();
        System.out.print("Input NPM : ");
        npm = s.nextLine();

        try {
            for (int i = 0; i < nama.length(); i++) {
                System.out.print(nama.charAt(i));
                thread.sleep(1000);
            }
            System.out.print(" ");
            for (int j = 0; j < npm.length(); j++) {
                System.out.print(npm.charAt(j));
                thread.sleep(1000);
            }
            System.out.println();
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        System.out.println("Thread Selesai");
    }
}

