package ru.netology;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringBuilder log = new StringBuilder();

        File src = new File("C://Games/src");
        if (src.mkdir()) {
            log.append("Каталог src создан\n");
        } else log.append("Каталог src создать не удалось\n");

        File res = new File("C://Games/res");
        if (res.mkdir()) {
            log.append("Каталог res создан\n");
        } else log.append("Каталог res создать не удалось\n");

        File savegames = new File("C://Games/savegames");
        if (savegames.mkdir()) {
            log.append("Каталог savegames создан\n");
        } else log.append("Каталог savegames создать не удалось\n");

        File temp = new File("C://Games/temp");
        if (temp.mkdir()) {
            log.append("Каталог temp создан\n");
        } else log.append("Каталог temp создать не удалось\n");

        File main = new File("C://Games/src/main");
        if (main.mkdir()) {
            log.append("Каталог main создан\n");
        } else log.append("Каталог main создать не удалось\n");

        File test = new File("C://Games/src/test");
        if (test.mkdir()) {
            log.append("Каталог test создан\n");
        } else log.append("Каталог test создать не удалось\n");

        File drawables = new File("C://Games/res/drawables");
        if (drawables.mkdir()) {
            log.append("Каталог drawables создан\n");
        } else log.append("Каталог drawables создать не удалось\n");

        File vectors = new File("C://Games/res/vectors");
        if (vectors.mkdir()) {
            log.append("Каталог vectors создан\n");
        } else log.append("Каталог vectors создать не удалось\n");

        File icons = new File("C://Games/res/icons");
        if (icons.mkdir()) {
            log.append("Каталог icons создан\n");
        } else log.append("Каталог icons создать не удалось\n");

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
