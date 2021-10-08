package com.example.datarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

}
