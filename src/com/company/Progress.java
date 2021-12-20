package com.company;

import java.io.*;

public class Progress {

    File file = new File("character.data");

    public static void save_progress(Character character) throws IOException
    {
        try (FileOutputStream fos = new FileOutputStream("character.data");
             ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(character);
        }
        catch (IOException e) {
            System.out.println("Файл не сущевствует или к нему нет доступа!");
        }
    }
    public static void check_progress(Character character) throws IOException
    {
        try (FileInputStream fis = new FileInputStream("character.data");
             ObjectInputStream ois = new ObjectInputStream(fis))
        {
            Object obj  = ois.readObject();
            Character result = (Character) obj;

            System.out.printf("\n Ваш персонаж: \n ЗДОРОВЬЕ - %d \n СИЛА - %d \n ЛОВКОСТЬ - %d \n ИНТЕЛЛЕКТ - %d \n УДАЧА - %d ",
                    character.getHealth(),character.getPower(),character.getDexterity(), character.getIntelligence(), character.getLuck());
        }
        catch (IOException e) {
            System.out.println("Файл не сущевствует или к нему нет доступа!");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Такого класса не существует!");
        }
    }

}
