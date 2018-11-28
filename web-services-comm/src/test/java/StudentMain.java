import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mv.dao.StudentMapper;
import com.mv.dao.Student_SubjectMapper;
import com.mv.entity.Student;
import com.mv.entity.Student_Subject;
import com.mv.utils.MybatisFactory;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentMain {

    public static void main(String[] args) throws IOException {

        SqlSession session = MybatisFactory.getOpenSession();

//        List<Student> stus = session.selectList("listStudent");
//        System.out.println(stus.size());
//
//        Student result = session.selectOne("getStudentById", 2);
//        System.out.println(result.getName());

//        Student addStu = new Student();
//        addStu.setName("虞姬小姐姐");
//        addStu.setAge(18);
//        addStu.setPhone("13151350001");
//        session.insert("addStudent", addStu);
//        session.commit();

//        Student delStu = new Student();
//        delStu.setId(4);
//        session.delete("delStudent", delStu);
//        session.commit();

//        Student stu=new Student();
//        stu.setName("张");
//
//        List<Student> stus = session.selectList("getStudentByWhere",stu);
//        for (Student s:stus) {
//            System.out.println(s.toString());
//        }


        StudentMapper stumap = session.getMapper(StudentMapper.class);

//        PageHelper.offsetPage(0, 2);
//        List<Student> stuList = stumap.list();
//        PageInfo pageInfo = new PageInfo<>(stuList);
//
//        System.out.println("总数：" + pageInfo.getTotal());
//        for (Student s : stuList) {
//            System.out.println(s.toString());
//        }

//        Student stu = stumap.get(1);
//        System.out.println(stu);
//        Student stu1 = stumap.get(1);
//        System.out.println(stu1);

        List<Student> stu1 = stumap.listPage(0, 2);
        System.out.println(stu1.size());
        List<Student> stu2 = stumap.listPage(0, 2);
        System.out.println(stu2.size());

    }
}