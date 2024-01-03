package com.thoughtworks.rectangle;

public class Rectangle {
    private int lenght;
    private int breath;
    Rectangle(int length,int breath){
        this.lenght = length;
        this.breath = breath;
    }
    int getLength(){
        return lenght;
    }
    int findArea(){
        return lenght*breath;
    }
    int findPerimeater(){
        return 2*(lenght+breath);
    }
}