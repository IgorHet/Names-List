package app;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    // Метод формирует вывод имени по заданному индексу
    public String formOutput(List<String> list, int index) {
        try {
            String name = list.get(index);
            return "Name: " + name + " is in index " + index;
        } catch (IndexOutOfBoundsException e) {
            return "Wrong index!";
        }
    }

    // Метод формирует вывод нумерованного списка имен
    public String formListOutput(List<String> list) {
        StringBuilder sb = new StringBuilder();
        AtomicInteger count = new AtomicInteger(1);
        for (String name : list) {
            sb.append(String.format("%d) %s%n", count.getAndIncrement(), name));
        }
        return "\nNames:\n" + sb.toString();
    }
}