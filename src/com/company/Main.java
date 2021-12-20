package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        final Character PhD = new Character("PhylosophyDoctor",
                88, 12, 8, 6, 10 );


        Progress.check_progress(PhD);
        Progress.save_progress(PhD);




    }
}
