import java.util.Date;
import java.util.List;

public class AirlineAdapter implements BATicketService,UATicketService {

    UATicketService United;
    BATicketService British;
    private AirlineAdapter(UATicketService United,BATicketService British){
        this.British=British;
        this.United=United;
    }

    public List<BATicket> getTicketInfo(Airport from, Airport to, Date when) {
        return null;
    }

    public List<UATicketInfo> getTicketInfo(String from, String to, Date when) {
        return null;
    }
}
