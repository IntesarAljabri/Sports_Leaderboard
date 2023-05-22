package Sports_Leaderboard.Sports_Leaderboard.Controller;

import Sports_Leaderboard.Sports_Leaderboard.Models.Game_Creation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api/leaderboard")
public class LeaderBoardController<ResponseEntity> {
    private List<Game_Creation> games = new ArrayList<>(); // In-memory storage for games
    @GetMapping
    public List<Game_Creation> getLeaderboard() {
        // Sort the games by score in descending order
        games.sort(Comparator.comparingInt(Game_Creation::getScore).reversed());
        return games;
    }

    @GetMapping("/report")
    public ResponseEntity<Game_Creation> generateReport() {
        // Generate the report based on the leaderboard data
        // Replace this with your actual report generation logic
        String report = "Sample report: \n";
        for (Game_Creation game : games) {
            report += "Game: " + game.getName() + ", Score: " + game.getScore() + "\n";
        }
        return ResponseEntity.ok(report);
    }
}
