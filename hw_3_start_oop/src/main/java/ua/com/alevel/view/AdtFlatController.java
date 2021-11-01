package ua.com.alevel.view;

import ua.com.alevel.entity.AdtFlat;
import ua.com.alevel.mass.Mass;
import ua.com.alevel.service.AdtFlatService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdtFlatController {

    private final AdtFlatService adtFlatService = new AdtFlatService();

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите действие");
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                crud(position, reader);
                position = reader.readLine();
                if (position.equals("0")) {
                    System.exit(0);
                }
                crud(position, reader);
            }
        } catch (IOException e) {
            System.out.println("Проблема: = " + e.getMessage());
        }
    }

    private void runNavigation() {
        System.out.println();
        System.out.println("Если вы хотите создать объявление об аренде квартиры, введите 1");
        System.out.println("Если вы хотите редактировать объявление, введите 2");
        System.out.println("Если вы хотите удалить объявление, введите 3");
        System.out.println("Если вы хотите найти объявление по айди, введите 4");
        System.out.println("Если вы хотите найти все объявления, введите 5");
        System.out.println("Если вы хотите выйти, введите 0");
        System.out.println();
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1":
                create(reader);
                break;
            case "2":
                update(reader);
                break;
            case "3":
                delete(reader);
                break;
            case "4":
                findById(reader);
                break;
            case "5":
                findAll(reader);
                break;
        }
        runNavigation();
    }

    private void create(BufferedReader reader) {
        System.out.println("AdtFlatController.create");
        try {
            System.out.println("Пожалуйста, введите название объявления вашей квартиры");
            String name = reader.readLine();
            System.out.println("Пожалуйста, введите город, в котором находится ваша квартира");
            String city = reader.readLine();
            System.out.println("Пожалуйста, введите количество комнат в квартире");
            String roomString = reader.readLine();
            System.out.println("Пожалуйста, введите стоимость аренды вашей квартиры");
            String priceString = reader.readLine();
            int room = Integer.parseInt(roomString);
            int price = Integer.parseInt(priceString);
            AdtFlat adtFlat = new AdtFlat();
            adtFlat.setName(name);
            adtFlat.setCity(city);
            adtFlat.setRoom(room);
            adtFlat.setPrice(price);
            adtFlatService.create(adtFlat);
        } catch (IOException e) {
            System.out.println("Проблема: = " + e.getMessage());
        }
    }

    private void update(BufferedReader reader) {
        System.out.println("AdtFlatController.update");
        try {
            System.out.println("Пожалуйста, введите айди");
            String id = reader.readLine();
            System.out.println("Пожалуйста, введите название объявления вашей квартиры");
            String name = reader.readLine();
            System.out.println("Пожалуйста, введите город, в котором находится ваша квартира");
            String city = reader.readLine();
            System.out.println("Пожалуйста, введите количество комнат в квартире");
            String roomString = reader.readLine();
            System.out.println("Пожалуйста, введите стоимость аренды вашей квартиры");
            String priceString = reader.readLine();
            int room = Integer.parseInt(roomString);
            int price = Integer.parseInt(priceString);
            AdtFlat adtFlat = new AdtFlat();
            adtFlat.setId(id);
            adtFlat.setName(name);
            adtFlat.setCity(city);
            adtFlat.setRoom(room);
            adtFlat.setPrice(price);
            adtFlatService.update(adtFlat);
        } catch (IOException e) {
            System.out.println("Проблема: = " + e.getMessage());
        }
    }

    private void delete(BufferedReader reader) {
        System.out.println("AdtFlatController.delete");
        try {
            System.out.println("Пожалуйста, введите айди");
            String id = reader.readLine();
            adtFlatService.delete(id);
        } catch (IOException e) {
            System.out.println("Проблема: = " + e.getMessage());
        }
    }

    private void findById(BufferedReader reader) {
        System.out.println("AdtFlatController.findById");
        try {
            System.out.println("Пожалуйста, введите айди");
            String id = reader.readLine();
            AdtFlat adtFlat = adtFlatService.findById(id);
            System.out.println("AdtFlat = " + adtFlat);
        } catch (IOException e) {
            System.out.println("Проблема: = " + e.getMessage());
        }
    }

    private void findAll(BufferedReader reader) {
        System.out.println("UserController.findAll");
        Mass<AdtFlat> adtFlats = adtFlatService.findAll();
        if (adtFlats != null && adtFlats.size() != 0) {
            for (int i = 0; i < adtFlats.size(); i++) {
                System.out.println("AdtFlat = " + adtFlats.get(i));
            }
        } else {
            System.out.println("Нет объявлений");
        }
    }
}
