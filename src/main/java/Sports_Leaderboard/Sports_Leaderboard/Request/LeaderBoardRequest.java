package Sports_Leaderboard.Sports_Leaderboard.Request;

import Sports_Leaderboard.Sports_Leaderboard.Models.LeaderBoard;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class LeaderBoardRequest {

    Integer Id;
    String teamName;
    Integer winners;
    Integer losses;

    public LeaderBoard convertToLeaderBoard() {
        Date nowDate = new Date();
        LeaderBoard leaderBoard = new LeaderBoard();
        leaderBoard.setId(this.getId());
        leaderBoard.setTeamName(this.getTeamName());
        leaderBoard.setTeamWins(this.getWinners());
        leaderBoard.setTeamLosses(this.getLosses());
        leaderBoard.setCreateDate(nowDate);
        leaderBoard.setIsActive(true);
        return leaderBoard;
    }

    public static List<LeaderBoard> convert(List<LeaderBoardRequest> requestList) {
        List<LeaderBoard> leaderBoards = new ArrayList<>();
        if (!requestList.isEmpty()) {
            for (LeaderBoardRequest leaderBoardRequest : requestList) {
                leaderBoards.add((LeaderBoard) convert((List<LeaderBoardRequest>) leaderBoardRequest));
            }
        }
        return leaderBoards;
    }
}
