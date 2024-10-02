package org.example;

import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);

    public void outLine(String msg) {
        System.out.println(msg);
    }

    public String input(String msg) {
        outLine(msg);
        return sc.nextLine();
    }
}
