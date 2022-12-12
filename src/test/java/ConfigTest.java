import com.annsl.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import javax.sql.DataSource;

public class ConfigTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext ctx = new
                AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
