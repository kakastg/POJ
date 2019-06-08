/*
    Aleksander Mojzych
    Kacper Wieczorek
    Zadanie 1 lab7
    Implementacja Adaptera z Liniami Lotniczymi
     */
import java.util.Date;
import java.util.List;

public interface UATicketService {
    List<UATicketInfo> getTicketInfo(String from, String to,
                                     Date when);
}
