package entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;


import java.util.Set;


@Entity
@Table(name = "planet")
@Data
public class Planet {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "fromPlanetId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Ticket> ticketFrom;

    @OneToMany(mappedBy = "toPlanetId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Ticket> ticketsTo;
}
