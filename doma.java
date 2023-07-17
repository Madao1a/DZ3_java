import java.util.ArrayList;
import java.util.Random;

public class doma {
    static Random random = new Random();
   /*  Задание

    Пусть дан произвольный список целых чисел.
    
    1) Нужно удалить из него чётные числа
    2) Найти минимальное значение
    3) Найти максимальное значение
    4) Найти среднее значение*/
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int size = random.nextInt(10, 20);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(-5, 10));
        }
        System.out.println(list);

       //task1(list);
        //System.out.println(list);
        task2(list);
    
        

       // PrintArray(list);

    }



    static void task1(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0) {
                list.remove(i);
            }
            
        }
    }

    static void task2(ArrayList<Integer> list){
        int max = 0; 
        int min = 0;
        for (Integer integer : list) {
            if (integer>max) {
                max=integer;
            }
            if (integer<min) {
                min=integer;
            }
        }
        
        System.out.println(max);
        System.out.println(min);
        System.out.println((min+max)/2);

    
    }

    
}

    






