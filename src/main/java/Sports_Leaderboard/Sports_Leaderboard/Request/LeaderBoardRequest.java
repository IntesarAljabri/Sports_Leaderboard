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
    Integer wins;
    Integer losses;

    public static LeaderBoard convertLeaderBoardToRequest(LeaderBoardRequest request) {
        LeaderBoard leaderBoard = new LeaderBoard();
        leaderBoard.setTeamName(request.getTeamName());
        leaderBoard.setTeamWins(request.getWins());
        leaderBoard.setTeamLosses(request.getLosses());
        leaderBoard.setCreateDate(new Date());
        leaderBoard.setIsActive(true);
        return leaderBoard;

    }

    public static List<LeaderBoard> convertListToLeaderBoardRequest(List<LeaderBoardRequest> LeaderBoardRequestList) {
        List<LeaderBoard> LeaderBoardList = new ArrayList<>();
        if (!LeaderBoardRequestList.isEmpty()) {
            for (LeaderBoardRequest leaderBoardRequest : LeaderBoardRequestList) {
                LeaderBoardList.add(convertLeaderBoardToRequest(leaderBoardRequest));
            }
        }
        return LeaderBoardList;

    }
}
