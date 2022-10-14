package com.usa.palcos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="message")
@NoArgsConstructor
@Getter
@Setter
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

    @ManyToOne
    @JoinColumn(name = "idBox")
    @JsonIgnoreProperties({"messages", "client", "reservations"}) //Arreglo {}
    private Box box;

    @ManyToOne
    @JoinColumn(name = "idClient")
    @JsonIgnoreProperties({"messages", "client", "reservations"}) //Arreglo {}
    private Client client;

}
