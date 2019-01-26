package com.chatRobot.model;

/**
 * @Classname Ouser
 * @Description TOO
 * @Date 2019/1/18 13:18
 * @Created by HP
 */
public class Ouser {
    private int id;
    private String name;
    private int password;
    private int count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Ouser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", count=" + count +
                '}';
    }
}
