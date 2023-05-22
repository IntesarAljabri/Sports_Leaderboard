package Sports_Leaderboard.Sports_Leaderboard.Controller;

import Sports_Leaderboard.Sports_Leaderboard.Models.Game_Creation;
import antlr.collections.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/games")
public class Game_CreationController {
    private List games = (List<Game_Creation>) new ArrayList<>(); // In-memory storage for games

    @PostMapping
    public ResponseEntity<String> createGame(@RequestBody Game_Creation game) {
        games.add(game);

        return ResponseEntity.status(HttpStatus.CREATED).body("Game created successfully");
    }

}
