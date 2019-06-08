import java.util.Date;
import java.util.List;

public interface UATicketService {
    List<UATicketInfo> getTicketInfo(String from, String to,
                                     Date when);
}