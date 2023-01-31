package Ex1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println(integerList);
        System.out.println("--------");

        StringList(integerList);
        System.out.println(integerList);
    }

    private static void StringList(List list){//ми створили метод , але не вказали який тип дженерика повинен бути
        list.add("some text");                  //тому компілятор дозволяє ровити таке, але це не є вірним рішенням
    }
}
