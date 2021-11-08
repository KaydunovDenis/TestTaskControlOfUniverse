CREATE TABLE IF NOT EXISTS overlord
(
    id          BIGSERIAL PRIMARY KEY,
    _name        VARCHAR(200) NOT NULL,
    age         integer NOT NULL,
);

CREATE TABLE IF NOT EXISTS planet
(
    id          BIGSERIAL PRIMARY KEY,
    _name       VARCHAR(200) NOT NULL,
    id_overlord BIGSERIAL
);

--мы создаем новые последовательности, указываем, что они должна начинаться с некоторого значения
--потому что в таблицах уже могут быть какие-то строки
--и указываем, что инкремент должен происходить на некоторое значение.
--CREATE SEQUENCE planet_id_seq START WITH 3 INCREMENT BY 1;
--CREATE SEQUENCE overlord_id_seq START WITH 3 INCREMENT BY 1;

--Команды необходимые для отладки и перезапуска
--DROP TABLE IF EXISTS planet CASCADE;
--DROP TABLE IF EXISTS overlord CASCADE;

--DROP SEQUENCE IF EXISTS planet_id_seq;
--DROP SEQUENCE IF EXISTS overlord_id_seq;
