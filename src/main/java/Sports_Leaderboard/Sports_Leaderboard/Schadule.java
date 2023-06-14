package Sports_Leaderboard.Sports_Leaderboard;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schadule {

    @Scheduled(cron = " * * * * *  "
    )


    public void ScheduledTask(){
        System.out.println("Project Was Running!!!!");

    }
}
