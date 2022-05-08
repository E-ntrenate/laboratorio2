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
public class Association {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int association_id;

    @OneToOne(mappedBy = "association")
    private Grade grade;

    @ManyToOne
    private Course course;
    @ManyToOne
    private Period period;


}
