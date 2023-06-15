package Sports_Leaderboard.Sports_Leaderboard.Request;

import Sports_Leaderboard.Sports_Leaderboard.Models.Registration;
import Sports_Leaderboard.Sports_Leaderboard.Models.Team;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class TeamRequest {

    Integer Id;
    Integer wins;
    Integer losses;
    Registration registration;

    public Team convertToTeam() {
        Date nowDate = new Date();
        Team team = new Team();
        team.setId(this.getId());
        team.setWins(this.getWins());
        team.setLosses(this.getLosses());
        team.setRegistration(this.getRegistration());
        team.setCreateDate(nowDate);
        team.setIsActive(true);
        return team;
    }

    public static List<Team> convert(List<TeamRequest> requestList) {
        List<Team> team = new ArrayList<>();
        if (!requestList.isEmpty()) {
            for (TeamRequest teamRequest : requestList) {
                team.add((Team) convert((List<TeamRequest>) teamRequest));
            }
        }
        return team;
    }

}
