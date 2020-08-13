import com.chinasoft.dao.IUserDao;
import com.chinasoft.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDaoTest {

    @Test
    public void testFindAll() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(resourceAsStream);

        SqlSession sqlSession = factory.openSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);

        List<User> userList = mapper.findAll();

        for (User user : userList) {
            System.out.println(user);
        }
    }
}
