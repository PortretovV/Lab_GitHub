package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vitaliy vitaliy = new Vitaliy("Виталик", "Вершинин", 20, 999);
        System.out.println(vitaliy.toString());
        if(vitaliy.getIq() < 110) {
            System.out.println("Виталь, давай почитаем книги");
            System.out.println("Хочешь прочитать хотя бы одну");
            String answer = new Scanner(System.in).next();
            if(answer.equals("yes")) {
                vitaliy.setIq(vitaliy.getIq() + 10);
            }
            else if(answer.equals("no")) {
                vitaliy.setIq(vitaliy.getIq() - 10);
            }
        }
        else {
            System.out.println("Виталь, ну ты и красавчик");
        }
        System.out.println(vitaliy.toString());
    }
}
