package ru.itsjava.services;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{
    private final ClientService clientService;
    private final Scanner scanner;

    @Override
    public void menu() {

        while (true) {
            printMenu();
            System.out.println("Введите номер меню");
            int menuNum = scanner.nextInt();
            if (menuNum == 1) {
                System.out.println("Вы выбрали купить абонемент");
                clientService.buyLesson();
            } else if (menuNum == 2) {
                System.out.println("Вы выбрали отменить покупку");
                clientService.putLesson();
            }else if (menuNum == 3) {
                    System.out.println("Печатаем название направления");
                    clientService.getLesson();
            } else {
                System.out.println("До встречи");
                break;
            }


        }

    }

    @Override
    public void printMenu() {
        System.out.println("1 - Купить; 2 - Отменить; 3 - Вывод направлений; Все остальное выход");
    }


}


