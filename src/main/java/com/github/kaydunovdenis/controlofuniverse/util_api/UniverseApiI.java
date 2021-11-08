package com.github.kaydunovdenis.controlofuniverse.util_api;

import com.github.kaydunovdenis.controlofuniverse.model.Overlord;
import com.github.kaydunovdenis.controlofuniverse.model.Planet;

import java.util.List;

/**
 * Методы API:
 * - [] Добавить нового Повелителя
 * - [] Добавить новую Планету
 * - [] Назначить Повелителя управлять Планетой
 * - [] Уничтожить Планету
 * - [] Найти всех Повелителей бездельников, которые прохлаждаются и не управляют никакими Планетами
 * - [] Отобразить ТОП 10 самых молодых Повелителей
 *
 * @author Kaydunov Denis
 * 06.11.2021
 */
public interface UniverseApiI {
    Overlord addOverLord(Overlord overlord);

    Planet addPlanet(Planet planet);

    void setOverlordToRulePlanet(Overlord overlord, Planet planet);

    void destroyPlanet(Planet planet);

    List<Overlord> findOverlordsWithoutPlanet();

    List<Overlord> find10YoungestOverlords();
}
