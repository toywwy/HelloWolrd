/**
 * Created by treda on 2016-03-27.
 */


public class Hello {

    public static  void main(String []args)
    {
        System.out.println("HELLO");
        System.out.println("HELLO");
        System.out.println("HELLO");
        System.out.println("HELLO");
        System.out.println("HELLO");

        AAA a= new AAA();
        AAA b= new BBB();
        BBB bb = new BBB();
        a.show();
        a.showAAA();
        b.show();
        b.showAAA();

        bb.showBBB();
        //한마디로 리모콘은 저기 선언된 객체 타입이고
        //이리모콘에 따라서 사용이 가능 한 것인데,
        //객체를 생성했다고 하여도 그걸로 하면 호출이 안되는 것이다.
        System.out.println(" --------------------------- ");

        CCCAb ab = new DDD();
        ab.show();
        ab.showAb();
        ab.showAbstract();




    }

}

