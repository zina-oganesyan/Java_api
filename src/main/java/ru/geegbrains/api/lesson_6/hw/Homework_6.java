package ru.geegbrains.api.lesson_6.hw;
import java.util.HashSet;
import java.util.Set;

public class Homework_6 {

    public static void main(String[] args) {

        Set<NBook> set = new HashSet<>();
        set.add(new NBook("Notebook 1", 8, "Windows10", 100000, "HP"));
        set.add(new NBook("Notebook 2", 16, "Windows10", 95000, "Asus"));
        set.add(new NBook("Notebook 3", 32, "linux", 13000, "HW"));
        set.add(new NBook("Notebook 4", 64, "linux", 90000, "Lenovo"));
        set.add(new NBook("Notebook 5", 126, "MacOS", 15000, "MacBook"));

        SearchNbook operation = new SearchNbook(set);
        operation.start();

    }




}

