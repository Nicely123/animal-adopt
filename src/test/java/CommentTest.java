import com.annsl.config.SpringConfig;
import com.annsl.domain.Comment;
import com.annsl.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class CommentTest {
    @Autowired
    private CommentService commentService;

    @Test
    public void TestAddComment(){
        //需求添加id为1的用户对id为2的宠物的评价
        /*Comment comment = new Comment();
        comment.setPetId("2");
        comment.setUserId("1");
        comment.setTime("2022-12-13 15:41:03");
        comment.setContent("这只宠物好可爱");
        int i = commentService.addComment(comment);
        if (i >0) {
            System.out.println("评价添加成功");
        }else {
            System.out.println("评价添加失败");
        }*/
        /*Comment comment = new Comment();
        comment.setPetId("2");
        comment.setUserId("2");
        comment.setTime("2022-12-13 15:48:14");
        comment.setContent("我也好喜欢这个修勾");
        int i = commentService.addComment(comment);
        if (i >0) {
            System.out.println("评价添加成功");
        }else {
            System.out.println("评价添加失败");
        }*/
        Comment comment = new Comment();
        comment.setPetId("1");
        comment.setUserId("1");
        comment.setTime("2022-12-13 15:41:03");
        comment.setContent("阿狸你不认识我我了吗");
        int i = commentService.addComment(comment);
        if (i >0) {
            System.out.println("评价添加成功");
        }else {
            System.out.println("评价添加失败");
        }
    }

    @Test
    public void TestDeleteById(){
        //需求：删除id为3的评价
        int i = commentService.deleteById(3);
        if (i>0){
            System.out.println("删除评价成功");
        }else {
            System.out.println("删除评价失败");
        }
    }

    @Test
    public void TestGetAll(){
        System.out.println(commentService.getAll());
    }

    @Test
    public void TestGetById(){
        System.out.println(commentService.getById(4));
    }
}
