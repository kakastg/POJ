/*
    Aleksander Mojzych
    Kacper Wieczorek
    Zadanie 1 lab7
    Implementacja Adaptera z Liniami Lotniczymi
     */
import java.util.Date;
import java.util.List;

public interface BATicketService {
    List<BATicket> getTicketInfo(Airport from, Airport to, Date
            when);
}
