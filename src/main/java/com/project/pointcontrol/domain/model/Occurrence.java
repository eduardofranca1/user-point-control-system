package com.project.pointcontrol.domain.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_occurrence")
public class Occurrence implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "{name.notempty}")
    @Size(max = 50)
    private String name;

    @NotEmpty(message = "{description.notempty}")
    @Size(max = 255)
    private String description;
}
