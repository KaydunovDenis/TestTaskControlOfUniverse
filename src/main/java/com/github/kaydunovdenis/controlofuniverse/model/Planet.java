package com.github.kaydunovdenis.controlofuniverse.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * @author Kaydunov Denis
 * 03.11.2021
 */
@Entity
@Table(name = "planet")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Planet implements EntityUniverse {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "planetIdSeq", sequenceName = "planet_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "planetIdSeq")
    private Long id;

    @Column(name = "_name")
    private String name;

    @ManyToOne(targetEntity = Overlord.class)
    @Column(name = "id_overlord")
    private Overlord id_overlord;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Planet planet = (Planet) o;
        return id != null && Objects.equals(id, planet.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
