package myInterface;

/**
 * インターフェース Shape のための注釈をここに書きます.
 * 
 * @author (2018315058 Ota oaki/2018315057 Matubara keito/2018315054 Hozumi yoshiaki) 
 * @version (2019/9/10)
 */

public interface Shape{
    final double PI = 3.14;
    void draw();

    void getArea();

    default public void redraw(){
        System.out.print("---다시 그립니다.");
        draw();
    }
}
