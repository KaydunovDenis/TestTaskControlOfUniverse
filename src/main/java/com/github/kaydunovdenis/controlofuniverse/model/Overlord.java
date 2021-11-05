package com.github.kaydunovdenis.controlofuniverse.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
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

    @Column(name = "id_planet")
    private Long id_planet;

//    @Column(name = "?")
//    private List<Planet> planetList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Overlord overlord = (Overlord) o;
        return id != null && Objects.equals(id, overlord.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
