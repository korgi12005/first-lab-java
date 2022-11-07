import java.util.Scanner;

public abstract class Drink {
    protected int sug;
    public void createDrink(){
        System.out.println("Вы выбрали обчный чёрный кофе");

    }
    public int addSugar(){
        Scanner in= new Scanner(System.in);
        System.out.println("Сколько ложек сахара добавить в напиток \n0 \n1 \n2 \n3 ");
        int choice=in.nextInt();
        switch (choice){
            case 0:
                setSug(0);
                break;
            case 1:
                setSug(1);
                break;
            case 2:
                setSug(2);
                break;
            case 3:
                setSug(3);
                break;
            default: break;
        }
        return  getSug();
    }

    public int getSug() {
        return sug;
    }

    public void setSug(int sug) {
        this.sug = sug;
    }

    public abstract void addMilk();
    public abstract String typeDrink();
    public abstract String isHaveMilk();
}
