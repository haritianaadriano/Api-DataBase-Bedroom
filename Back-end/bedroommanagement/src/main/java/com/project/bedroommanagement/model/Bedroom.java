package com.project.bedroommanagement.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Bedroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBedroom;

    private Boolean reserved;

    private Double locationPrice;

    private String hotel;

    @OneToOne
    private TypeLocation typeLocation;

    @OneToMany
    private List<TypeBedroom> typeBedroom;
}
