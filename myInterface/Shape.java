package myInterface;

/**
 * インターフェース Shape のための注釈をここに書きます.
 * 
 * @author (あなたの名前) 
 * @version (バージョン番号もしくは日付)
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
