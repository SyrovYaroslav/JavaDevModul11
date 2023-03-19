package crudService;

import entities.Client;
import entities.Planet;
import entities.Ticket;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.time.LocalDateTime;
import java.util.List;

public class TicketCrudService {
    public Ticket getTicketById(int id) {
        Ticket ticket = new Ticket();
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()){
            ticket = session.get(Ticket.class, id);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }

        return ticket;
    }

    public Ticket createTicket(String createdAt, Client clientId, Planet fromPlanetId, Planet toPlanetId) {
        Ticket ticket = new Ticket();
        ticket.setCreatedAt(createdAt);
        ticket.setClient(clientId);
        ticket.setFromPlanetId(fromPlanetId);
        ticket.setToPlanetId(toPlanetId);

        try(Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(ticket);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        return ticket;
    }

    public void deleteTicketById(int id) {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            Ticket ticket = session.get(Ticket.class, id);
            session.remove(ticket);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    public void updateTicketById(int id, String createdAt, Client clientId, Planet fromPlanetId, Planet toPlanetId) {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            Ticket ticket = session.get(Ticket.class, id);
            ticket.setCreatedAt(createdAt);
            ticket.setClient(clientId);
            ticket.setFromPlanetId(fromPlanetId);
            ticket.setToPlanetId(toPlanetId);
            session.merge(ticket);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    public List<Ticket> getTicketList() {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()){
            return session.createQuery("from Ticket", Ticket.class).list();
        }
    }
}
