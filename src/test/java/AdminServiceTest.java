import com.annsl.config.SpringConfig;
import com.annsl.domain.Admin;
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

    @Test
    public void testGetById(){
        System.out.println(adminService.getById(1));
    }

    @Test
    public  void testSave(){
        Admin admin = new Admin();
        admin.setName("张麻子");
        admin.setAccount("zmz123");
        admin.setPassword("zmz123");
        admin.setNickname("麻子人生");
        admin.setSex("男");
        admin.setBirthday("2000-1-1");
        admin.setEmail("zmz123@163.com");
        admin.setTelephone("13211112222");
        admin.setPic(null);
        admin.setRemark("麻子一出手就知有没有");

        if (adminService.addAdmin(admin)>0){
            System.out.println("添加管理员成功");
        }else {
            System.out.println("添加管理员失败");
        }
    }

    @Test
    public void testUpdate(){
        Admin admin = new Admin();
        admin.setId(3);
        admin.setName("张麻子");
        admin.setAccount("zmz123");
        admin.setPassword("zmz123");
        admin.setNickname("麻子人生");
        admin.setSex("男");
        admin.setBirthday("2000-1-1");
        admin.setEmail("zmz123@163.com");
        admin.setTelephone("13211112222");
        admin.setPic(null);
        admin.setRemark("麻子一出手就知有没有");

        //修改id为2的admin昵称为麻子的春天
        admin.setNickname("麻子的春天");
        int i = adminService.update(admin);
        if (i > 0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }

    @Test
    public void testDelete(){
        int i = adminService.deleteById(2);
        if (i>0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }
}
