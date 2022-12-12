import com.annsl.config.SpringConfig;
import com.annsl.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//设置类运行器
@RunWith(SpringJUnit4ClassRunner.class)
//设置spring环境对应的配置类
@ContextConfiguration(classes = {SpringConfig.class})   //加载配置类
public class AdminServiceTest {
    @Autowired
    private AdminService adminService;

    @Test
    public void testGetAll(){
        System.out.println(adminService.getAll());
    }
}
