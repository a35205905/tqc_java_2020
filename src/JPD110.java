public class JPD110 {
    public static void main (String[] args) {
        System.out.printf("圓形面積為：%f %n", calCircle(5));
        System.out.printf("圓形面積為：%f %n", calTriangle(10 , 5));
        System.out.printf("圓形面積為：%f %n", calRectangle(5, 10));
        double totalarea = calCircle(5) + calTriangle(10, 5) + calRectangle(5, 10);
        System.out.printf("此圖形面積為：%f %n", totalarea);
    }

    static double calCircle(int r){
        return r*r*3.1415926;
    }

    static double calTriangle(int x , int y){
        return x*y/2;
    }

    static double calRectangle(int x, int y){
        return x*y*1.0;
    }
}
