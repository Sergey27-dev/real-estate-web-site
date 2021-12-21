package com.company.domain;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table
@Entity
@ToString(of = {"id", "name"})
@Data
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonView(Views.Id.class) // нужен для контроля выдаваемой информации
    private Long id;

    @JsonView(Views.ShortInformation.class)
    private String name;

    @JsonView(Views.ShortInformation.class)
    private String price;

    @JsonView(Views.ShortInformation.class)
    private String numberOfRooms;

    @JsonView(Views.FullInformation.class)
    private String square;

    @JsonView(Views.FullInformation.class)
    private String floor;

    @JsonView(Views.FullInformation.class)
    private String totalFloors;

    @JsonView(Views.FullInformation.class)
    private String addres;

    @JsonView(Views.FullInformation.class)
    private String description;

    @JsonView(Views.FullInformation.class)
    private LocalDateTime dateOfPlacement;

    @JsonView(Views.FullInformation.class)
    private String type;

    @JsonView(Views.FullInformation.class)
    private String longDescription;

    @JsonView(Views.FullInformation.class)
    private String userEmail;
}
