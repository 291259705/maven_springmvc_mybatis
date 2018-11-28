import com.mv.dao.CategoryMapper;
import com.mv.entity.Category;
import com.mv.utils.MybatisFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CategoryTest {

    public static void main(String[] args) {
        listTest();

    }

    private static void insertTest() {
        SqlSession session = MybatisFactory.getOpenSession();
        CategoryMapper mapper = session.getMapper(CategoryMapper.class);

        Category category;
        for (int i = 0; i < 100; i++) {
            category = new Category();
            category.setName("category tag:" + i);

            mapper.insert(category);
        }

        session.commit();
        session.close();
    }

    private static void listTest() {
        SqlSession session = MybatisFactory.getOpenSession();
        CategoryMapper mapper = session.getMapper(CategoryMapper.class);

        List<Category> categories = mapper.list();

        for (Category cate : categories) {
            System.out.println(cate.toString());
        }
    }
}