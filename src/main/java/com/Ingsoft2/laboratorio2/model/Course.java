package com.Ingsoft2.laboratorio2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int course_id;
    @Column(nullable = false,length = 100)
    private String course_name;
    @Column(nullable = false)
    private int duration_hours;
}
