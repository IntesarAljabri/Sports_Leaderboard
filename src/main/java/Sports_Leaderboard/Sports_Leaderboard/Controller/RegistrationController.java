package Sports_Leaderboard.Sports_Leaderboard.Controller;

import Sports_Leaderboard.Sports_Leaderboard.Models.Registration;
import Sports_Leaderboard.Sports_Leaderboard.Service.RegistrationService;
import Sports_Leaderboard.Sports_Leaderboard.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;
    @Autowired
    TeamService teamService;
    @GetMapping(value = "getRegistrationById")
    public Registration getRegistrationById(@RequestParam Integer id) {
        Registration registrationById = registrationService.getRegistrationById(id);
        return registrationById;
    }
    @RequestMapping(value = "RegisterNewTeam", method = RequestMethod.POST)    //Register Player
    public void registerNewTeam() {
        teamService.createTeam();
    }




}
