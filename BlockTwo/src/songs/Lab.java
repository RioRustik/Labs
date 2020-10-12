package songs;

public class Lab {
    public static void main(String [] args){
        Albom puppeteer = new Albom("Кукловод ", " Металлов");
        Albom highwayToTheOOP = new Albom("Шоссе ООП", "Асид");

        Trek object_status = new Trek("Состояние объектов", "Янг", highwayToTheOOP);
        Trek highwayToTheOop = new Trek("Шоссе к ООП", "", highwayToTheOOP);
        Trek oneTimeProgrammer = new Trek("Одноразовый программист", "Бертон", puppeteer);

        System.out.println(object_status);
        System.out.println(highwayToTheOop);
        System.out.println(oneTimeProgrammer);

    }
}
