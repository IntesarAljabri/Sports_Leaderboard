package Sports_Leaderboard.Sports_Leaderboard.Service;

import Sports_Leaderboard.Sports_Leaderboard.Models.Registration;
import Sports_Leaderboard.Sports_Leaderboard.Models.Team;
import Sports_Leaderboard.Sports_Leaderboard.Repositories.RegistrationRepository;
import Sports_Leaderboard.Sports_Leaderboard.Request.RegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RegistrationService {
    @Autowired
    RegistrationRepository registrationRepository;

    public void RegisterTeam(RegistrationRequest registrationRequest) {
        Registration registration = new Registration();
        registration.setUserName(registrationRequest.getUserName());
        registration.setTeamName(registrationRequest.getTeamName());
        registration.setPassword(registrationRequest.getPassword());
        registration.setSportType(registrationRequest.getSportType());
        registration.setCreateDate(new Date());
        registration.setIsActive(true);
        registrationRepository.save(registration);
    }
    public Registration getRegistrationById(Integer id) {
        Registration registrationById = registrationRepository.getRegistrationId(id);
        return registrationById;

    }

}
