package com.smart.contact.manager.SmartContactManager.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String userName;
    @Column(unique = true)
    private String usermail;
    private  String password;
    private String role;
    private boolean enabled;
    private String imageUrl;
    @Column(length = 500)
    private String about;

    // CASCADETYPE.ALL -> If we will add contacts in user then it will add all contacts in user, if we will delete all user it will remove all contacts added to user
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy ="user")
    private ArrayList<Contact> contactList = new ArrayList<>();

}
