package entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "planet")
@Data
public class Planet {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;
}
