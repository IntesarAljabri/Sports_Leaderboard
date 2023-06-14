package Sports_Leaderboard.Sports_Leaderboard.Response;
import Sports_Leaderboard.Sports_Leaderboard.Models.LeaderBoard;
import Sports_Leaderboard.Sports_Leaderboard.Request.LeaderBoardRequest;
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

    public static LeaderBoardResponse convertRequestToResponse(LeaderBoard leaderBoardRequest) {
        return LeaderBoardResponse.builder()
                .Id(leaderBoardRequest.getId())
                .Name(leaderBoardRequest.getTeamName())
                .wins(leaderBoardRequest.getTeamWins())
                .losses(leaderBoardRequest.getTeamLosses())
                .build();
    }

    public static List<LeaderBoard> convert(List<LeaderBoardResponse> requestList) {
        List<LeaderBoard> leaderBoards = new ArrayList<>();
        if (!requestList.isEmpty()) {
            for (LeaderBoardResponse response : requestList) {
                LeaderBoard leaderBoard = new LeaderBoard();
                leaderBoards.add(leaderBoard);
            }
        }
        return leaderBoards;
    }
}
