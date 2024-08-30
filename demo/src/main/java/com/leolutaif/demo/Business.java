package com.leolutaif.demo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Leonardo")
    private String firstName;

    @Column(name = "Lutaif")
    private String lastName;

    @Column(name = "leo_lutaif@hotmail.com")
    private String email;

}
