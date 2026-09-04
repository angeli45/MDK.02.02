import java.util.ArrayList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<>();
        Scanner in =new Scanner(System.in);
        while (true){
            System.out.println("1 - Показать список всех животных в зоопарке");
            System.out.println("2 - Добавить животное в список");
            System.out.println("3 - Удалить животное из списка");
            System.out.println("4 - Очистить список");
            System.out.println("5 - Проверить наличие животного в зоопарке");
            int command=in.nextInt();
            in.nextLine();
            if(command == 1) {
                if (animals.isEmpty()) System.out.println("Животных нет.");
                else {
                    System.out.println("Всего животныж в зоопарке: " + animals.size());
                    for (String animal : animals) System.out.println(animal);
                }
            }else if (command==2){
                    System.out.print("Название животного:");
                    String animal=in.nextLine();
                    animals.add(animal);
            } else if (command==3){
                if(!animals.isEmpty()) {
                    System.out.print("Название удаляемого животного: ");
                    String animal=in.nextLine();
                    animals.remove(animal);
                }else System.out.println("Список пуст. Нечего удалять.");
            }else if (command==4){
                if(!animals.isEmpty()){
                    animals.clear();
                    System.out.println("Список очищен.");
                } else System.out.println("Список пуст. Нечего очищать.");
            }else if (command==5){
                System.out.print("Название: ");
                String animal=in.nextLine();
                if (animals.contains(animal))System.out.println("Животное "+animal + " есть в зоопарке");
                else System.out.println("Животного "+animal + " нет в зоопарке");
            }else break;
        }
    }

}
