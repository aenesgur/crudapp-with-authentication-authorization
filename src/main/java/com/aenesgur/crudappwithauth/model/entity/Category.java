package com.aenesgur.crudappwithauth.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CATEGORY")
@Getter
@Setter
public class Category {
    @Id
    @SequenceGenerator(name = "seq_category", allocationSize = 1)
    @GeneratedValue(generator = "seq_category", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 50)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private List<Product> products = new ArrayList<>();
}
