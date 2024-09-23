package ru.itsjava.services;

import ru.itsjava.domain.Lesson;

import java.util.List;

public interface LessonService {
    Lesson takeLessonByTitle(String title);
    void putLesson(Lesson Lesson);
    boolean hasLesson (String name);
    List<Lesson> getLesson();


}
