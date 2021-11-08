package com.github.kaydunovdenis.controlofuniverse.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * @author Kaydunov Denis
 * 03.11.2021
 */

@Entity
@Table(name = "overlord")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Overlord implements EntityUniverse {
    @Id
    @Column(name = "id")
    //для MySQL GenerationType.IDENTITY
    @SequenceGenerator(name = "overlordIdSeq", sequenceName = "overlord_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "overlordIdSeq")
    private Long id;

    @Column(name = "_name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @OneToMany(targetEntity = Planet.class)
    @Column(name = "id_planet")
    private List<Long> planets;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Overlord overlord = (Overlord) o;
        return Objects.equals(id, overlord.id) && Objects.equals(name, overlord.name) && Objects.equals(age, overlord.age) && Objects.equals(planets, overlord.planets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, planets);
    }
}
