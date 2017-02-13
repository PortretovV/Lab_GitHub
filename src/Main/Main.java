package Main;

public class Main {
    public static void main(String[] args) {
        Vitaliy vitaliy = new Vitaliy("Виталий", "Портретов", 20, 60);
        System.out.println(vitaliy.toString());
        if(vitaliy.getIq() < 110) {
            System.out.println("Виталь, давай почитаем книги");
        }
        else {
            System.out.println("Виталь, ну ты и умный");
        }
    }

}
