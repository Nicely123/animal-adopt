import com.annsl.config.SpringConfig;
import com.annsl.domain.Adopt;
import com.annsl.service.AdoptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class AdoptServiceTest {
    @Autowired
    private AdoptService adoptService;

    @Test
    public void TestAddAdopt(){
        Adopt adopt = new Adopt();
        //编号为2的用户领养了编号为3的宠物,状态为审批中
        adopt.setUserId("2");
        adopt.setPetId("3");
        adopt.setState("2");
        adopt.setAdoptTime("2022-12-12 19:31:00");
        int i = adoptService.addAdopt(adopt);
        if (i > 0){
            System.out.println("添加领养信息成功");
        }else {
            System.out.println("添加领养信息失败");
        }
    }

    @Test
    public void testDelete(){
        //需求：删除id为2的一列信息
        int i = adoptService.deleteById(2);
        if (i > 0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }

    @Test
    public void testGetById(){
        //需求：查询id为1的领养信息
        System.out.println(adoptService.getById(1));
    }

    @Test
    public void testGetAll(){
        System.out.println(adoptService.getAll());
    }
}
