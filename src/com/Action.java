package com;

public class Action {
    private int vector;
    private String name;

    public int getVector() {
        return vector;
    }

    public String getName() {
        return name;
    }

    public void setVector(int vector) {
        this.vector = vector;
    }

    public void setName(String name) {
        this.name = name;
    }




    public Action(int vector, String name){
        this.vector = vector;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Action{" +
                "vector=" + vector +
                ", name='" + name + '\'' +
                '}';
    }
}
