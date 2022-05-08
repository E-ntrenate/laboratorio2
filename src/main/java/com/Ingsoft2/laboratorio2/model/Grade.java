package com.Ingsoft2.laboratorio2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int grade_id;
    @Column(nullable = true)
    private Byte approved;
    @Column(nullable = true)
    private BigDecimal note;

    @OneToOne
    @JoinColumn(name = "association_id", referencedColumnName = "association_id", nullable = false)
    private Association association;
}