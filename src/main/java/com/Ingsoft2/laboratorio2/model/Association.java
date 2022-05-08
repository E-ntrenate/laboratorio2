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
    @JoinColumn(name = "course_id", referencedColumnName = "course_id", nullable = false)
    private Course course;

    @ManyToOne
    @JoinColumn(name = "period_id", referencedColumnName = "period_id", nullable = false)
    private Period period;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "user_id",
                    referencedColumnName = "user_id",
                    nullable = false),
            @JoinColumn(
                    name = "role_id",
                    referencedColumnName = "role_id",
                    nullable = false)
    })
    private UserRole user_role;
}
