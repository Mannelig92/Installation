package ru.netology;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        StringBuilder log = new StringBuilder();

        List<File> list = new ArrayList<>();

        File src = new File("C://Games/src");
        File res = new File("C://Games/res");
        File savegames = new File("C://Games/savegames");
        File temp = new File("C://Games/temp");
        File main = new File("C://Games/src/main");
        File test = new File("C://Games/src/test");
        File drawables = new File("C://Games/res/drawables");
        File vectors = new File("C://Games/res/vectors");
        File icons = new File("C://Games/res/icons");

        Collections.addAll(list, src, res, savegames, temp, main, test, drawables, vectors, icons);

        for (File i : list) {
            if (i.mkdir()) {
                log.append("Каталог " + i + " создан\n");
            } else log.append("Каталог " + i + " создать не удалось\n");
        }

        File mainJava = new File("C://Games/src/main/Main.java");
        try {
            if (mainJava.createNewFile()) log.append("Файл Main.java создан\n");
        } catch (IOException e) {
            log.append("Файл Main.java не создан");
        }
        File utilsJava = new File("C://Games/src/main/Utils.java");
        try {
            if (utilsJava.createNewFile()) log.append("Файл Utils.java создан\n");
        } catch (IOException e) {
            log.append("Файл Utils.java не создан");
        }
        File tempTXT = new File("C://Games/temp/temp.txt");
        try {
            if (tempTXT.createNewFile()) log.append("Файл temp.txt создан\n");
        } catch (IOException e) {
            log.append("Файл temp.txt не создан");
        }
        try (FileWriter fileWriter = new FileWriter("C://Games/temp/temp.txt", false)) {
            fileWriter.write(String.valueOf(log));
            fileWriter.append('\n');
            fileWriter.flush();
        } catch (IOException e) {
            e.getMessage();
        }
        System.out.println(log);
    }
}
