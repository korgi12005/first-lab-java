import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("что вы хотите:\n1 - обычный кофе\n2 - составить свой кофе\n3 - составить свой чай");
        int choice=in.nextInt();
        System.out.println(choice);
        Drink c;
        switch (choice){
            case 1:
                 c=new Coffe();
                c.createDrink();
                break;
            case 2:
                 c=new Coffe();
                 c.typeDrink();
                 c.addSugar();
                 c.addMilk();
                System.out.printf("Вам будет составлен %s \nколичество сахара: %d \nС молоком: %s", ((Coffe) c).getType(),c.getSug(),c.isHaveMilk());
                break;
            case 3:
                c=new Tea();
                c.typeDrink();
                c.addSugar();
                c.addMilk();
                System.out.printf("Вам будет составлен %s \nколичество сахара: %d \nС молоком: %s",((Tea) c).getType(),c.getSug(),c.isHaveMilk());
                break;
            default: break;
        }


    }
}