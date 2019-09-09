package base;
import myInterface.Shape;


/**
 * クラス Circle の注釈をここに書きま?��?.
 * 
 * @author (あなた�??��名前)
 * @version (バ�??��ジョン番号もしく�??��日?��?)
 */
public class Circle implements Shape{
    public double x,y;
    public int radius;
    public Circle(double x,double y,int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void draw(){
        System.out.println("c1");
    }
    public void getArea(){
        System.out.println("c2");
    }
    public void redraw(){
        System.out.println("c3");
    }
}
