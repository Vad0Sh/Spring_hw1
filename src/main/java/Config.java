import impl.human.Knight;
import impl.quest.Dragon;
import impl.quest.Ogr;
import interfaces.Human;
import interfaces.Quest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Quest dragonQuest(){
        return new Dragon();
    }
    @Bean
    public Quest ogrQuest(){
        return new Ogr();
    }
    @Bean
    public Human knight(){
        return new Knight();
    }

}
