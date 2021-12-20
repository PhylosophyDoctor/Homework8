package com.company;


import java.io.*;

public class Progress {

    public void check_progress() throws IOException {


        File file = new File("character.txt");
        file.createNewFile();
        try (FileInputStream fis = new FileInputStream(file);
             BufferedReader bf = new BufferedReader(new InputStreamReader(fis));)
        {
            StringBuilder sb = new StringBuilder();


            String character;
            while ((character = bf.readLine()) != null) {
                sb
                        .append(character)
                        .append("\n");
            }
            System.out.println(sb.toString());

        }
        catch (IOException err) {
            System.out.println("Файл не существует или к нему нет доступа");
        }
    }


}
