package Sports_Leaderboard.Sports_Leaderboard.Service;

import Sports_Leaderboard.Sports_Leaderboard.Models.Game_Creation;
import Sports_Leaderboard.Sports_Leaderboard.Repositories.Game_CreationRepository;
import antlr.collections.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Game_CreationService {
    @Autowired
     Game_CreationRepository game_CreationRepository;

    public void Game_Creation(Game_CreationRepository game_CreationRepository) {
        this.game_CreationRepository = game_CreationRepository;
    }
//    public List<Game_Creation> getAllGame_Creation() {
//        return game_CreationRepository.findAll();
//    }
}
