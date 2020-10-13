package square;
//Сдвиньте последнюю Точку Ломаной в позицию {15,25}
//Снова выведите на экран длину Ломаной


public class Lab {

    public static void main(String [] args){
        Point r = new Point(5,3);
        Square a = new Square(r, 23);


        System.out.println(a);
        a.toLine();

    }

}
