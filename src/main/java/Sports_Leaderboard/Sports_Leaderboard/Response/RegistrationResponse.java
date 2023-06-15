package Sports_Leaderboard.Sports_Leaderboard.Response;

import Sports_Leaderboard.Sports_Leaderboard.Models.Registration;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Data
@Getter
@Setter
@Builder
public class RegistrationResponse {
    Integer registerId;
    String userName;
    String password;
    String teamName;
    String sportType;

    public static RegistrationResponse convertRegistrationToResponse(Registration RegistrationRequest) {
        return RegistrationResponse.builder()
                .registerId(RegistrationRequest.getRegisterId())
                .userName(RegistrationRequest.getUserName())
                .password(RegistrationRequest.getPassword())
                .teamName(RegistrationRequest.getTeamName())
                .sportType(RegistrationRequest.getSportType())
                .build();
    }

    public static List<RegistrationResponse> convertListToRegistrationResponse(List<Registration> registrations) {
        List<RegistrationResponse> registrationResponsesList = new ArrayList<>();
        if (!registrations.isEmpty()) {
            for (Registration registration : registrations) {
                RegistrationResponse response = convertRegistrationToResponse(registration);
                registrationResponsesList.add(response);
            }
        }
        return registrationResponsesList;
    }
}
