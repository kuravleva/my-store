package ru.itsjava.services;

import ru.itsjava.domain.Client;
import ru.itsjava.domain.Lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class StoreServiceImpl implements StoreService {
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше ФИО");
        String clientName = scanner.next();

        Client client = new Client(clientName, new ArrayList<>());

        List<Lesson> lessonList = new ArrayList<>();
        lessonList.add(new Lesson("Пилатес", "Попович"));
        lessonList.add(new Lesson("Растяжка", "Осипова"));

        LessonService lessonService = new LessonServiceImpl(lessonList);

        ClientService clientService = new ClientServiceImpl(client, scanner, lessonService);

        MenuService menuService = new MenuServiceImpl(clientService, scanner);
        menuService.menu();
    }
}
