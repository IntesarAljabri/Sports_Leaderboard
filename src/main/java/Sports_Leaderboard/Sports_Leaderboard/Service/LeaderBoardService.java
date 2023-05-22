package Sports_Leaderboard.Sports_Leaderboard.Service;

import Sports_Leaderboard.Sports_Leaderboard.Models.Game_Creation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class LeaderBoardService {

    private List<Game_Creation> games = new ArrayList<>(); // In-memory storage for games

    public void addGame(Game_Creation game) {
        games.add(game);
    }

    public List<Game_Creation> getLeaderboard() {
        // Sort the games by score in descending order
        games.sort(Comparator.comparingInt(Game_Creation::getScore).reversed());
        return games;
    }
}
