import java.util.Date;
import java.util.List;

public interface BATicketService {
    List<BATicket> getTicketInfo(Airport from, Airport to, Date
            when);
}
