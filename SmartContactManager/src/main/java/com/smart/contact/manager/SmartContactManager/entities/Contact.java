package com.smart.contact.manager.SmartContactManager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "CONTACTS")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long contactId;
    private String name;
    private String nichName;
    private String work;
    private String email;
    private String phoneNumber;
    private String image;
    private String description;

    @ManyToOne
    private User user = new User();
}
