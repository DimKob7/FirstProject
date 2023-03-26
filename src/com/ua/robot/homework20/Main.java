package com.ua.robot.homework20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.print("Hello! Today is " + date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + "!");
        Map<String, List<String>> map = new TreeMap<>();
        map.put("шлях", List.of("way", "道", "weg"));
        map.put("сонце", List.of("sun", "太陽", "sonne"));
        map.put("зірка", List.of("star", "星", "stern"));
        map.put("хмара", List.of("cloud", "雲", "wolke"));
        map.put("зображення", List.of("image", "画像", "bild"));
        map.put("кермо", List.of("helm", "兜", "Helm"));
        map.put("стіл", List.of("table", "テーブル", "Tisch"));
        map.put("крейда", List.of("chalk", "チョーク", "Kreide"));
        map.put("гвинтокрил", List.of("rotorcraft", "回転翼航空機", "Drehflügler"));
        map.put("шафа", List.of("wardrobe", "ワードローブ", "Kleiderschrank"));
        map.forEach((k, v) -> {
            System.out.println("\nСлово  " + k.toUpperCase() + " перекладається:");
            // v.forEach(System.out::println);
            System.out.print("на англійську мову як - " + v.get(0).toUpperCase() + ",");
            System.out.print(" на японську мову як - " + v.get(1).toUpperCase() + ",");
            System.out.print(" на німецьку мову як - " + v.get(2).toUpperCase() + ".");
        });
    }
}
