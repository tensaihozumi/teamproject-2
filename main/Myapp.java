package main;
import base.Circle;

/**
 * 여기에 Myapp 클래스 설명을 작성하십시오.
 * 
 * @author (2018315058 Ota oaki/2018315057 Matubara keito/2018315054 Hozumi yoshiaki) 
 * @version (2019/9/10)
 */
public class Myapp
{
    public static void main(String[] args){
        Circle c1 = new Circle(2,3,5);
        Circle c2 = new Circle(2,3,5);
        System.out.println("원1:" + c1);
        System.out.println("원2:" + c2);
        if(c1.equals(c2)){
            System.out.println("같은 원");
        }
        else{
            System.out.println("서로 다른 원");
        }
        
    }
}
