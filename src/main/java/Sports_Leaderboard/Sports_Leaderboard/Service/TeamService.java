package Sports_Leaderboard.Sports_Leaderboard.Service;

import Sports_Leaderboard.Sports_Leaderboard.Models.LeaderBoard;
import Sports_Leaderboard.Sports_Leaderboard.Models.Team;
import Sports_Leaderboard.Sports_Leaderboard.Repositories.RegistrationRepository;
import Sports_Leaderboard.Sports_Leaderboard.Repositories.TeamRepository;
import antlr.collections.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TeamService {
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    RegistrationRepository registrationRepository;

    public void createTeam() {
        Team newTeam = new Team();
        newTeam.setLosses(1);
        newTeam.setWins(1);
        newTeam.setCreateDate(new Date());
        newTeam.setIsActive(true);
        newTeam.setRegistration(registrationRepository.getRegistrationId(1));
        teamRepository.save(newTeam);

    }

    public Team getTeamById(Integer id) {
        Team teamById = teamRepository.getTeamById(id);
        return teamById;

    }

}
