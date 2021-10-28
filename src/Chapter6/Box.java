package Chapter6;

public class Box {

    double widt;
    double heigth;
    double depth;

    //    void volume() {
//
//        System.out.println("volume: ");
//        System.out.println(widt * heigth * depth);
//    }
    double volume() {

        double vol = widt * heigth * depth;
        return vol;

    }

    void setDim(double w, double h, double d) {
        widt = w;
        heigth = h;
        depth = d;

    }
}
