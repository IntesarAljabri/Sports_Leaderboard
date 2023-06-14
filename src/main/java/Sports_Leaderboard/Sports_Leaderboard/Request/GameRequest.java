package Sports_Leaderboard.Sports_Leaderboard.Request;

import Sports_Leaderboard.Sports_Leaderboard.Models.Game;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Getter
@Setter
public class GameRequest {
    Integer Id;
    String Description;
    TeamRequest teamRequest1;
    TeamRequest teamRequest2;
    Integer scoreTeam1;
    Integer scoreTeam2;

    public Game convertToGam() {
        Date nowDate = new Date();
        Game game = new Game();

        game.setId(this.getId());
        game.setDescription(this.getDescription());
        game.setTeamOne(this.convertToGam().getTeamOne());
        game.setTeamTwo(this.convertToGam().getTeamTwo());
        game.setCreateDate(nowDate);
        game.setUpdateDate(nowDate);
        game.setIsActive(true);
        return game;
    }

    public static List<Game> convertToGameRequest(List<GameRequest> gameRequest) {
        List<Game> gameList = new ArrayList<>();
        if (!gameRequest.isEmpty()) {
            for (GameRequest gameRequests : gameRequest) {
                gameList.add((Game) convertToGameRequest((List<GameRequest>) gameRequest));
            }
        }
        return gameList;

    }
}
