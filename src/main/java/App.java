import crudService.ClientCrudService;
import crudService.PlanetCrudService;
import crudService.TicketCrudService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class App {
    public static void main(String[] args) {
        ClientCrudService clientCrudService = new ClientCrudService();
        PlanetCrudService planetCrudService = new PlanetCrudService();
        TicketCrudService ticketCrudService = new TicketCrudService();
//        System.out.println("clientCrudService.getClientList() = " + clientCrudService.getClientList());
//        System.out.println("clientCrudService.getClientById(1) = " + clientCrudService.getClientById(1));
//        clientCrudService.deleteClientById(1);
//        System.out.println("clientCrudService.getClientList() = " + clientCrudService.getClientList());
//        clientCrudService.createClient("Vova");
//        clientCrudService.updateClientById(2, "Gosha");
//        System.out.println("clientCrudService.getClientList() = " + clientCrudService.getClientList());
//        System.out.println("planetCrudService.getPlanetList() = " + planetCrudService.getPlanetList());
//        System.out.println("planetCrudService.getPlanetById(\"M67\") = " + planetCrudService.getPlanetById("M67"));
//        planetCrudService.deletePlanetById("M67");
//        System.out.println("planetCrudService.getPlanetList() = " + planetCrudService.getPlanetList());
//        planetCrudService.createPlanet("R2", "HelpMe");
//        planetCrudService.updatePlanetById("R2", "Murder");
//        System.out.println("planetCrudService.getPlanetList() = " + planetCrudService.getPlanetList());
//        System.out.println("ticketCrudService.getTicketList() = " + ticketCrudService.getTicketList());
//        System.out.println("ticketCrudService.getTicketById(1) = " + ticketCrudService.getTicketById(5));
//        System.out.println("ticketCrudService.getTicketList() = " + ticketCrudService.getTicketList());
//        ticketCrudService.createTicket("2023-01-01 15:00:45-05",
//                clientCrudService.getClientById(3),
//                planetCrudService.getPlanetById("R2"),
//                planetCrudService.getPlanetById("P54"));
//        ticketCrudService.updateTicketById(11, "2023-01-01 15:00:45+05",
//                clientCrudService.getClientById(3),
//                planetCrudService.getPlanetById("R2"),
//                planetCrudService.getPlanetById("P54"));
//        System.out.println("ticketCrudService.getTicketList() = " + ticketCrudService.getTicketList());
//        ticketCrudService.createTicket("2023-01-01 15:00:45-05",
//                clientCrudService.getClientById(10),
//                planetCrudService.getPlanetById("L2"),
//                planetCrudService.getPlanetById("P54"));
//        ticketCrudService.createTicket("2023-01-01 15:00:45-05",
//                clientCrudService.getClientById(100),
//                planetCrudService.getPlanetById("R2"),
//                planetCrudService.getPlanetById("P54"));
    }
}
