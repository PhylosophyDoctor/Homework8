package com.company;

import java.io.File;
import java.io.Serializable;

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


}
