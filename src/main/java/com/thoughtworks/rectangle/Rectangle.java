package com.thoughtworks.rectangle;

public class Rectangle {
    int lenght;
    int breadth;
    Rectangle(int length,int breadth){
        this.lenght = length;
        this.breadth = breadth;
    }
    int area(){
        return lenght*breadth;
    }
}