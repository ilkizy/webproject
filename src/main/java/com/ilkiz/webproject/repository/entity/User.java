package com.ilkiz.webproject.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Table(name = "tbluser")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String name;
    String surname;
    String address;
    String phone;
    int birthDate;
    String email;
    String username;
    String password;
    String gender;
}
