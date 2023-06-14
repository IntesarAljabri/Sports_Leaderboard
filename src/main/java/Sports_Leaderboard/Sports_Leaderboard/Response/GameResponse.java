package Sports_Leaderboard.Sports_Leaderboard.Response;

import Sports_Leaderboard.Sports_Leaderboard.Models.Game;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Data
@Builder
public class GameResponse {

    Integer Id;
    String Description;
    TeamResponse teamOneResponse;
    TeamResponse teamTwoResponse;
    Integer scoreTeam1;
    Integer scoreTeam2;


    public static GameResponse convertRequestToResponse(Game gameRequest) {
        return GameResponse.builder()
                .Id(gameRequest.getId())
                .Description(gameRequest.getDescription())
                .teamOneResponse(TeamResponse.covertTeamToResponse(gameRequest.getTeamOne()))
                .teamTwoResponse(TeamResponse.covertTeamToResponse(gameRequest.getTeamTwo()))
                .scoreTeam1(gameRequest.getScoreTeamOne())
                .scoreTeam2(gameRequest.getScoreTeamTwo())
                .build();

    }

    public static List<Game> convert(List<GameResponse> requestList) {
        List<Game> games = new ArrayList<>();
        if (!requestList.isEmpty()) {
            for (GameResponse response : requestList) {
                 Game game = new Game();
                games.add(game);
            }
        }
        return games;
    }

}
