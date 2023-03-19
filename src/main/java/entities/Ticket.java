package entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "ticket")
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "created_at")
    private String createdAt;

    @ManyToOne
    @JoinColumn(name="client_id", nullable=false)
    private Client client;

    @ManyToOne
    @JoinColumn(name="from_planet_id", nullable=false)
    private Planet fromPlanetId;

    @ManyToOne
    @JoinColumn(name="to_planet_id", nullable=false)
    private Planet toPlanetId;
}
