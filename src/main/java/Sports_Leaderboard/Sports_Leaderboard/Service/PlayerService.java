package Sports_Leaderboard.Sports_Leaderboard.Service;

import Sports_Leaderboard.Sports_Leaderboard.Models.Player;
import Sports_Leaderboard.Sports_Leaderboard.Repositories.PlayerRepository;
import antlr.collections.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
     PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
//
//    public List<Player> getAllPlayer() {
//        return (List<Player>) playerRepository.findAll();
//    }
}
