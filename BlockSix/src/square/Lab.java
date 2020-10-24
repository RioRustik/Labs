package square;
//Сдвиньте последнюю Точку Ломаной в позицию {15,25}
//Снова выведите на экран длину Ломаной

public class Lab {

    public static void main(String [] args){
        Square a = new Square(5,3, 23);
        System.out.println(a);
        a.toLine();
        a.getLength();
        a.setLength(53);
        System.out.println(a);
        a.toLine();


    }

}
