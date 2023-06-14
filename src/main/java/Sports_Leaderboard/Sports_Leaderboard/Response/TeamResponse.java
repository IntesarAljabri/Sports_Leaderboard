package Sports_Leaderboard.Sports_Leaderboard.Response;

import Sports_Leaderboard.Sports_Leaderboard.Models.Registration;
import Sports_Leaderboard.Sports_Leaderboard.Models.Team;
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
public class TeamResponse {

    Integer Id;
    Integer wins;
    Integer losses;
    Registration registration;

    public static TeamResponse covertTeamToResponse(Team TeamRequest) {
        return TeamResponse.builder()
                .Id(TeamRequest.getTeamId())
                .wins(TeamRequest.getWins())
                .losses(TeamRequest.getLosses())
                .registration(TeamRequest.getRegistration())
                .build();
    }

    public static List<TeamResponse> convertListToGameRequest(List<Team> teamRequest) {
        List<TeamResponse> TeamResponseList = new ArrayList<>();
        if (!TeamResponseList.isEmpty()) {
            for (Team TeamRequest : teamRequest) {
                TeamResponseList.add(covertTeamToResponse(TeamRequest));
            }
        }
        return TeamResponseList;
    }
}
