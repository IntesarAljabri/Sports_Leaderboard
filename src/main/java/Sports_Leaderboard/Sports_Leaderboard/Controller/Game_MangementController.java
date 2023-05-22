package Sports_Leaderboard.Sports_Leaderboard.Controller;

import Sports_Leaderboard.Sports_Leaderboard.Models.Game_Creation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Game_MangementController {

    private List<Game_Creation> games = new ArrayList<>(); // In-memory storage for games

    @PostMapping
    public ResponseEntity<String> createGame(@RequestBody Game_Creation game) {
        Game_Creation.add(Game_Creation);
        return ResponseEntity.status(HttpStatus.CREATED).body("Game created successfully");
    }

    @PutMapping("/{gameId}")
    public ResponseEntity<String> editGame(@PathVariable("gameId") int gameId, @RequestBody Game_Creation updatedGame) {
        // Find the game by gameId
        Optional<Game_Creation> optionalGame = findGameById(gameId);
        if (optionalGame.isPresent()) {
            Game_Creation game = optionalGame.get();
            // Update the game details
            game.setName(updatedGame.getName());
            game.setPlayers(updatedGame.getPlayers());
            game.setScore(updatedGame.getScore());
            return ResponseEntity.ok("Game updated successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{gameId}")
    public ResponseEntity<String> deleteGame(@PathVariable("gameId") int gameId) {
        // Find the game by gameId
        Optional<Game_Creation> optionalGame = findGameById(gameId);
        if (optionalGame.isPresent()) {
            games.remove(optionalGame.get());
            return ResponseEntity.ok("Game deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    private Optional<Game_Creation> findGameById(int gameId) {
        return games.stream()
                .filter(Game_Creation -> Game_Creation.getId() == gameId)
                .findFirst();
    }
}
