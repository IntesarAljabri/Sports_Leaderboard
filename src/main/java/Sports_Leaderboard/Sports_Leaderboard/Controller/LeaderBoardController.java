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
    public ResponseEntity<ReportDTO> generateReport() {
        // Generate the report based on the leaderboard data
        // Replace this with your actual report generation logic
        StringBuilder report = new StringBuilder("Sample report: \n");
        for (Game_Creation game : games) {
            report.append("Game: ").append(game.getName()).append(", Score: ").append(game.getScore()).append("\n");
        }
        ReportDTO reportDTO = new ReportDTO(report.toString());
      //return ResponseEntity.ok(reportDTO);
    }
    public class ReportDTO {
        private String report;

        public ReportDTO(String report) {
            this.report = report;
        }

        public String getReport() {
            return report;
        }

        public void setReport(String report) {
            this.report = report;
        }
    }
}
