package com.usa.palcos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="box")
@NoArgsConstructor
@Getter
@Setter
public class Box {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String location;
    private Integer capacity;
    private String description;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    @JsonIgnoreProperties("boxes")
    private Category category;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "box")
    @JsonIgnoreProperties({"boxes","client"})
    private List<Reservation> reservations;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "box")
    @JsonIgnoreProperties({"boxes", "client"})
    private List<Message> messages;

}
