package services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Lesson;
import ru.itsjava.services.LessonService;
import ru.itsjava.services.LessonServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class MyApplicationTest {
    List <Lesson> lessonList = new ArrayList<>();


    @DisplayName("Должен проверить позиции в списке")
    @Test
    public void  shouldCheckListPositions () {
        Lesson lesson = new Lesson("Пилатес","Попович");
        lessonList.add(lesson);
        LessonService lessonService = new LessonServiceImpl(lessonList);
        Assertions.assertTrue(lessonService.hasLesson("Пилатес"));
    }

    @DisplayName ("Метод put должен работать корректно")
    @Test
    public void shouldBeCorrectPutMethod(){
        Lesson stretch = new Lesson("Растяжка", "Осипова");

        LessonService lessonService = new LessonServiceImpl(lessonList);
        lessonService.putLesson(stretch);
        Assertions.assertTrue(lessonService.getLesson().contains(stretch));
    }

    @DisplayName ("Метод getLesson должен возвращать LessonsFromGym")
    @Test
    public void getLessonShouldReturnLessonsFromGym() {

        lessonList.add(new Lesson("Пилатес", "Попович"));
        Lesson pilates = new Lesson("Пилатес", "Попович");

        LessonService lessonService = new LessonServiceImpl(lessonList);
        lessonService.getLesson();
        Assertions.assertTrue(lessonList.contains(pilates));
    }












}
