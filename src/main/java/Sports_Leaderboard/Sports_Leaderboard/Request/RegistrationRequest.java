package Sports_Leaderboard.Sports_Leaderboard.Request;
import Sports_Leaderboard.Sports_Leaderboard.Models.Registration;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
public class RegistrationRequest {
    Integer registerId;
    String userName;
    String password;
    String teamName;
    String sportType;

    public Registration convertToRegistration() {
        Date nowDate = new Date();
        Registration registration = new Registration();
        registration.setRegisterId(this.getRegisterId());
        registration.setPassword(this.getPassword());
        registration.setUserName(this.getUserName());
        registration.setTeamName(this.getTeamName());
        registration.setCreateDate(nowDate);
        registration.setIsActive(true);
        return registration;
    }

    public static List<Registration> convert(List<RegistrationRequest> requestList) {
        List<Registration> registrations = new ArrayList<>();
        if (!requestList.isEmpty()) {
            for (RegistrationRequest registrationRequest : requestList) {
                registrations.add((Registration) convert((List<RegistrationRequest>) registrationRequest));
            }
        }
        return registrations;
    }

}
