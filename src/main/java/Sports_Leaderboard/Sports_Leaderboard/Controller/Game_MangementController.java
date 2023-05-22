package Sports_Leaderboard.Sports_Leaderboard.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Game_MangementController {

    private List<Game> games = new ArrayList<>(); // In-memory storage for games

    @PostMapping
    public ResponseEntity<String> createGame(@RequestBody Game game) {
        games.add(game);
        return ResponseEntity.status(HttpStatus.CREATED).body("Game created successfully");
    }

    @PutMapping("/{gameId}")
    public ResponseEntity<String> editGame(@PathVariable("gameId") int gameId, @RequestBody Game updatedGame) {
        // Find the game by gameId
        Optional<Game> optionalGame = findGameById(gameId);
        if (optionalGame.isPresent()) {
            Game game = optionalGame.get();
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
        Optional<Game> optionalGame = findGameById(gameId);
        if (optionalGame.isPresent()) {
            games.remove(optionalGame.get());
            return ResponseEntity.ok("Game deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    private Optional<Game> findGameById(int gameId) {
        return games.stream()
                .filter(game -> game.getId() == gameId)
                .findFirst();
    }
}
