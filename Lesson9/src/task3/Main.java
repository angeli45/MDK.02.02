package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Вас приветствует виртуальная АТС!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите модель телефона собеседника, 1 - стационарный телефон, 2 - мобильный телефон, 3 - смартфон:");
        int type = scanner.nextInt();
        System.out.println("Введите ваш номер телефона:");
        String number = scanner.next();
        System.out.println("Введите номер пользователя, с которым хотите связаться:");
        String friendNumber = scanner.next();
        if (type==1) {
            getPhone(type, number).makeCall(friendNumber);
        } else if (type>1 || type <4) {
            System.out.println("Выберите 1 - позвонить, 2 - написать сообщение:");
            int i = scanner.nextInt();
            if (i==1) {
                if (type==2){
                    getPhone(type, number).makeCall(friendNumber);
                } else if (type==3){
                    Smartphone Sp = new Smartphone(number);
                    System.out.println("Введите приложение для связи:");
                    String app = scanner.next();
                    Sp.makeCall(friendNumber, app);
                }else{
                    System.out.println("Введён неверный вариант.");
                    return;
                }
            } else if (i==2){
                System.out.println("Введите ваше сообщение:");
                String massege = scanner.next();
                if (type==2){
                    MobilePhone Mb=new MobilePhone(number);
                    Mb.sendSms(friendNumber, massege);
                } else if (type==3) {
                    Smartphone Sp =new Smartphone(number);
                    System.out.println("Введите email пользователя, которому хотите написать:");
                    String email = scanner.next();
                    Sp.sendEmail(email, massege);
                } else {
                    System.out.println("Введён неверный вариант.");
                    return;
                }
            }
        } else {
            System.out.println("Введена неверная модель телефона");
            return;
        }

    }
    public static Phone getPhone(int type, String number) {
        if (type == 1) {
            return new LandlinePhone(number);
        } else {
            return new MobilePhone(number);
        }
    }
}
