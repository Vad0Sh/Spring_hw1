import impl.human.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        Knight knight = ctx.getBean(Knight.class);
        knight.getQuest();
        knight.getQuest().say();
    }
}
