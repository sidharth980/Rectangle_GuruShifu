package com.thoughtworks.rectangle;

public class Rectangle {
    private int lenght;
    private int breath;
    Rectangle(int length,int breath){
        this.lenght = length;
        this.breath = breath;
    }
    int area(){
        return lenght*breath;
    }
}