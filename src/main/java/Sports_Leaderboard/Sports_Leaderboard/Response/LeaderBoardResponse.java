package Sports_Leaderboard.Sports_Leaderboard.Response;
import Sports_Leaderboard.Sports_Leaderboard.Models.LeaderBoard;
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
public class LeaderBoardResponse {

    Integer Id;
    String Name;
    Integer wins;
    Integer losses;

    public static LeaderBoardResponse covertLeaderBoardToResponse(LeaderBoard requestFromLeaderBoard) {
        return LeaderBoardResponse.builder()
                .Id(requestFromLeaderBoard.getId())
                .Name(requestFromLeaderBoard.getTeamName())
                .wins(requestFromLeaderBoard.getTeamWins())
                .losses(requestFromLeaderBoard.getTeamLosses())
                .build();
    }

    public static List<LeaderBoardResponse> convertRequestListToResponseList(List<LeaderBoard> LeaderBoardRequestFromUser) {
        List<LeaderBoardResponse> LeaderBoardResponseList = new ArrayList<>();
        if (!LeaderBoardRequestFromUser.isEmpty()) {
            for (LeaderBoard leaderBoardRequest : LeaderBoardRequestFromUser) {
                LeaderBoardResponseList.add(covertLeaderBoardToResponse(leaderBoardRequest));
            }
        }
        return LeaderBoardResponseList;
    }
}
