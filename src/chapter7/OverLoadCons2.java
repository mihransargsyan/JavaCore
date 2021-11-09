package chapter7;

public class OverLoadCons2 {

    public static void main(String[] args) {

        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(10);

        Box myClone = new Box(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("myBox1 = " + vol);

        vol = myBox2.volume();
        System.out.println("myBox2 = " + vol);

        vol = myCube.volume();
        System.out.println("myCube = " + vol);

        vol = myClone.volume();
        System.out.println("myClone = " + vol);

    }
}
