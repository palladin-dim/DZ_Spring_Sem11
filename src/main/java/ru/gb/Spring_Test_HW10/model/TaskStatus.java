package ru.gb.Spring_Test_HW10.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Getter

public enum TaskStatus {
    NOT_STARTED("Не начата"),
    IN_PROGRESS("В процессе"),
    COMPLETED("Завершена");

    private final String value;
}
