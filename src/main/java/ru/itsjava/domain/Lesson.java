package ru.itsjava.domain;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
@Data
@RequiredArgsConstructor
public class Lesson {
    private final String title;
    private final String coach;

}
