package com.company;

import java.io.File;
import java.io.Serializable;
import java.util.Random;

public class Character implements Serializable {
    private String name;
    private int health;
    private int intelligence;
    private int dexterity;
    private int  power;
    private int luck;

    public Character (String name, int health, int intelligence, int dexterity,int power, int luck)
    {
        this.name=name;
        this.health=health;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.power = power;
        this.luck=luck;
    }

    public String getName()
    {
        return name;
    }

    public int getHealth()
    {
        return health;
    }
    public int getIntelligence()
    {
        return intelligence;
    }
    public int getDexterity()
    {
        return dexterity;
    }
    public int getPower()
    {
        return power;
    }
    public int getLuck()
    {
        return luck;
    }
    public static Character one_more_step(Character character) {
        Random random = new Random();
        int i = random.nextInt(5);
        switch (i) {
            case 0: {
                System.out.println("\nВы вступили в бой, в вас попала стрела, ваше здоровье уменьшено на 15");
                character.health = character.health - 15; break;
            }
            case 1: {
                System.out.println("\nВы вступили в бой, вас ранили мечом, ваше здоровье уменьшено на 20");
                character.health = character.health - 20;break;
            }
            case 2: {
                System.out.println("\nВы вступили в бой, вам удалось увернуться от стрелы, ваша ловкость и удача увеличены на 1");
                character.dexterity = character.dexterity + 1;
                character.luck = character.luck + 1;break;
            }
            case 3: {
                System.out.println("\nВы наткнулись на древний фолиант, ваш интеллект увеличен на 1");
                character.intelligence = character.intelligence + 1;break;
            }
            case 4: {
                System.out.println("\nВы вступили в бой, вам удалось одолеть врага мечом, ваша сила и ловкость увеличены на 1");
                character.dexterity = character.dexterity + 1;
                character.power = character.power + 1;break;
            }
            case 5: {
                System.out.println("\nВы нашли зелье лечения, ваше здоровье увеличено на 30");
                character.health = character.health + 30;break;
            }



        }
        if (character.health <= 0) System.out.println("\nВаш персонаж мёртв");
        if (character.health >100) character.health=100;
        return (character);

    }


}
