package com.github.kaydunovdenis.controlofuniverse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControlOfUniverseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlOfUniverseApplication.class, args);
    }
    //todo в запросах скл подключить
    // подключить пул JDBS connection подтянть зависимость Hikari
}
//TODO сделать промежуточную таблицу между лордами и планетами
//TODO мапятся на объекты либо на запросы погуглить тему
// написать валидатор
// Error hendler реализовать для веба , указывать в конфигурации приложения либо в джава конфиг
// Что имеется ввиду под API?
// Каскадное удаление элементов из таблицы
// погуглить что такое proxy java? не шаблон
// Писать тесты через Mokito
// тесты для веба https://www.baeldung.com/spring-boot-testing

