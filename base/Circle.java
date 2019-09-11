package base;

import myInterface.Shape;


/**
 * クラス Circle の注釈をここに書きま?��?.
 * 
 * @author (2018315058 Ota oaki/2018315057 Matubara keito/2018315054 Hozumi yoshiaki)
 * @version (2019/9/10)
 */


public class Circle implements Shape{
    public int x,y;
    public int radius;
    public Circle(int x, int y,int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public boolean equals(Object obj){
        Circle p = (Circle)obj;
        if( x == p.x && y == p.y && radius == p.radius)
        return true;
        else return false;
    }
    public void draw(){
        System.out.println("case1");
    }
    public void getArea(){
        System.out.println("case2");
    }
    public void redraw(){
        System.out.println("case3");
    }
}



