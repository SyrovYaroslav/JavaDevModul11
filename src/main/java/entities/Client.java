package entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Set;


@Entity
@Table(name = "client")
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Ticket> tickets;
}
