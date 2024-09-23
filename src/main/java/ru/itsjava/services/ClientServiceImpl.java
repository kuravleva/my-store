package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Client;
import ru.itsjava.domain.Lesson;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService{
    private final Client client;
    private final Scanner scanner;
    private final LessonService lessonService;


    @Override
    public void buyLesson() {
        System.out.println("Введите название направления");
        String title = scanner.next();
        if (lessonService.hasLesson(title)){
            System.out.println("Покупаем абонемент .... ");
            lessonService.takeLessonByTitle(title);
            System.out.println("Купили абонемент " + title);
        } else {
            System.out.println("Не смогли купить абонемент... Такого направления нет :(");
        }


    }

    @Override
    public void putLesson() {
        System.out.println("Введите название направления");
        String title = scanner.next();

        System.out.println("Введите имя преподавателя");
        String coach = scanner.next();

        Lesson lesson = new Lesson(title,coach);
        lessonService.putLesson(lesson);

    }



    @Override
    public void getLesson() {
        System.out.println("Уважаемый " + client.getName());
        System.out.println("Вот и ваш абонемент");
        lessonService.getLesson();
    }

}
