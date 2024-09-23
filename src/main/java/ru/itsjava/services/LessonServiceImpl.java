package ru.itsjava.services;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Lesson;

import java.util.List;

@Data
@RequiredArgsConstructor
public class LessonServiceImpl implements LessonService{
    private final List<Lesson> lessonsFromGym;


    @Override
    public Lesson takeLessonByTitle(String title) {
        Lesson resLesson = null;
        for (Lesson lesson: lessonsFromGym) {
            if (lesson.getTitle().equals(title)) {
                resLesson = lesson;


            }
        }
        if (resLesson != null) {
            lessonsFromGym.remove(resLesson);
            return resLesson;
        }

        return null;
    }
    @Override
    public void putLesson(Lesson Lesson) {
        lessonsFromGym.add(Lesson);

    }

    @Override
    public boolean hasLesson(String title) {
        for (Lesson lesson: lessonsFromGym){
            if (lesson.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Lesson> getLesson() {
        for (Lesson lesson: lessonsFromGym){
            System.out.println("lesson.getCoach() = "  + lesson.getTitle() + " " + lesson.getCoach());
        }
        return lessonsFromGym;

    }


}
