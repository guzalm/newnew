package com.guzql.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "coffee")
//mark class as an Entity
@Entity
//defining class name as Table name
public class Coffee {
    //Defining book id as primary key
    @Id
    @Column
    private int coffeeid;
    @Column
    private String coffeename;
    @Column
    private String text;
    @Column
    private int price;
    public int getCoffeeid()
    {
        return coffeeid;
    }
    public void setCoffeeid(int coffeeid)
    {
        this.coffeeid = coffeeid;
    }
    public String getCoffeename()
    {
        return coffeename;
    }
    public void setCoffeename(String coffeename)
    {
        this.coffeename = coffeename;
    }
    public String getText()
    {
        return text;
    }
    public void setText(String text)
    {
        this.text = text;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
}