package Chapter6;

public class BoxDemo {

    public static void main(String[] args) {

        Box myBox = new Box();
        Box myBox1 = new Box();
        // double vol;
        myBox.setDim(10,20,15);
//        myBox.depth = 10;
//        myBox.heigth = 20;
//        myBox.widt = 15;

//        vol = myBox.depth * myBox.heigth * myBox.widt;
//        System.out.println("vol = " + vol);
        double vol = myBox.volume();
        System.out.println(vol);

        myBox1.setDim(3, 6, 9);
//        myBox1.widt = 3;
//        myBox1.depth = 6;
//        myBox1.heigth = 9;
//        vol = myBox1.depth * myBox1.heigth * myBox1.widt;
//        System.out.println("vol = " + vol);
        double volume1 = myBox1.volume();
        System.out.println(volume1);
    }
}
