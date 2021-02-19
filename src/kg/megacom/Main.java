package kg.megacom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class Main {
    // задаю константы в соответствии  с условиями задачи
    final static int month = 30;
    final static int week = 7;
    final static int day = 1;
    final static int hour = 1;
    final static int minute = 1;

    public static void main(String[] args) {
        ArrayList<Long> numbers = getArrayList(); // заполнил ArrayList
        print(numbers); //печать
        Collections.sort(numbers);
        print(numbers); //печать
        System.out.println(Collections.binarySearch(numbers, TimeUnit.HOURS.toSeconds(hour))); //нашел индекс количества секунд в 1 часу
        Collections.reverse(numbers); // развернул список в обратном порядке
        print(numbers); //печать
        Collections.shuffle(numbers); //перемешал список
        print(numbers); //печать
        System.out.println(Collections.max(numbers)); //печать максимального элемента
        System.out.println(Collections.min(numbers)); //печать минимального элемента
        Collections.fill(numbers, 42L); //заполнил значением 42
        print(numbers); //печать
    }

    public static ArrayList<Long> getArrayList (){
        ArrayList<Long> result = new ArrayList<>();
        result.add(TimeUnit.DAYS.toSeconds(month)); //Вычислил количество секунд в 1 месяце (30дней)
        result.add(TimeUnit.DAYS.toSeconds(week)); //Вычислил количество секунд в 1 неделе
        result.add(TimeUnit.DAYS.toSeconds(day)); //Вычислил количество секунд в 1 сутках
        result.add(TimeUnit.HOURS.toSeconds(hour)); //Вычислил количество секунд в 1 часу
        result.add(TimeUnit.MINUTES.toSeconds(minute)); //Вычислил количество секунд в 1 минуте
        return result;
    }

    public static void print(ArrayList arrayList) {
        System.out.println(arrayList.toString());
    }


}
