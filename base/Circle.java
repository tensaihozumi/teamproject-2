package base;

import myInterface.Shape;


/**
 * クラス Circle の注釈をここに書きま?��?.
 * 
 * @author (あなた�??��名前)
 * @version (バ�??��ジョン番号もしく�??��日?��?)
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
        Shape p = (Shape)obj;
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
