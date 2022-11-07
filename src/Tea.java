import java.util.Scanner;

public class Tea extends Drink {
    private String type;
    private String haveMilk="Нет";
    @Override
    public void addMilk() {
        Scanner in= new Scanner(System.in);
        System.out.println("Хотите добавить молоко? \n1 - да\n2 - нет");
        int choice=in.nextInt();
        switch (choice){
            case 1:
                setHaveMilk();
                System.out.println("В чай добавлено молоко");
                break;
            case 2:

                break;
            default: break;
        }
    }

    @Override
    public String typeDrink() {
        Scanner in= new Scanner(System.in);
        System.out.println("Какой хотите выпить чай \n1 - зеленый\n2 - черный");
        int choice=in.nextInt();
        switch (choice){
            case 1:
                setType("Зеленый чай");
                break;
            case 2:
                setType("Черный чай");
                break;
            default: break;
        }
        return getType();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String isHaveMilk() {
        return haveMilk;
    }

    public void setHaveMilk() {
        this.haveMilk = "Да";
    }
}
