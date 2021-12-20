package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Progress p1 = new Progress();
        try {
            p1.check_progress();
        } catch (IOException err) {
            System.out.println("Метод не может быть реализован из-за проблем с файлом.");
        }
    }
}
