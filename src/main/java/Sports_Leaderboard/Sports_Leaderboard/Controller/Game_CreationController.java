package Sports_Leaderboard.Sports_Leaderboard.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/games")
public class Game_CreationController {

    private List<Game> games = new ArrayList<>(); // In-memory storage for games

    @PostMapping
    public ResponseEntity<String> createGame(@RequestBody Game game, Principal principal) {
        if (!isAuthenticated(principal)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed");
        }

        if (game.getName() == null || game.getPlayers() == null || game.getScore() == 0) {
            return ResponseEntity.badRequest().body("Missing required fields");
        }

        games.add(game);

        return ResponseEntity.status(HttpStatus.CREATED).body("Game created successfully");
    }

}
