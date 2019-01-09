import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) throws Exception {
        int  KeySearch=0,Key;
        long Value;
        String string;
        boolean isNumber;
        Random random = new Random(100);
        HashMap<Integer, Long> hashMap = new HashMap<>();

        //
        //Заполняем HashMap
        //
        for (int i = 0; i < 50; i++) {

            Key = random.nextInt(100);
            Value = ThreadLocalRandom.current().nextLong(100);
            hashMap.put(Key, Value);
        }

        //
        //Выводим HashMap
        //
        System.out.println("HashMap: \n"+hashMap);

        //
        //Выводим размер HashMap
        //
        System.out.println("HashMap Size: \n"+hashMap.size());

        //
        //Поиск по Ключу
        //
        System.out.println("Search by key \nEnter Key:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        //
        //Проверка на ввод чисел
        //

        do {
            isNumber = true;
            string = bufferedReader.readLine();
            try {
                KeySearch = Integer.parseInt(string);
            } catch (Exception exception) {
                isNumber = false;
                System.out.println("Enter number");
            }
        } while (!isNumber);
        //
        //Проверка на нахождение ключа
        //
        if (hashMap.get(KeySearch)!=null){System.out.println("Key: "+KeySearch+" Value: "+hashMap.get(KeySearch));}
        else{ System.out.println("No value");}

    }

}
