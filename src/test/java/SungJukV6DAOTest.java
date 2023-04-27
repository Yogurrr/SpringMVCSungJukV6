import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yogurrr.spring4.sungjukv6.dao.SungJukV4DAO;
import yogurrr.spring4.sungjukv6.model.SungJukVO;

import java.util.List;

// 단위(unit) 테스트
// 하나의 모듈을 기준으로 독립적으로 진행하는 가장 작은 단위의 테스트
// 모듈은 애플리케이션에서 작동하는 하나의 기능 또는 메소드를 의미
// 애플리케이션을 구성하는 하나의 기능이 올바르게 동작하는지를 독립적으로 테스트하는 것
// "어떤 기능이 실행되면 어떤 결과가 나온다" 수준으로 테스트 함

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:root-context.xml", "classpath:servlet-context.xml"})
public class SungJukV6DAOTest {

    @Autowired()
    SungJukV4DAO sjdao;

    @Test   // 테스트 슈트
    public void Test1() {
        System.out.println(">> Test 1(select) 시작 <<");

        List<SungJukVO> sjs = sjdao.selectSungJuk();
        System.out.println(sjs);
    }

    @Test   // 테스트 슈트
    public void Test2() {
        System.out.println(">> Test 2(selectOne) 시작 <<");

        int sjno = 4;
        SungJukVO sj = sjdao.selectOneSungJuk(sjno);
        System.out.println(sj);
    }

    @Test   // 테스트 슈트
    public void Test3() {
        System.out.println(">> Test 3(insert) 시작 <<");

        SungJukVO sj = new SungJukVO("Test3", 99, 98, 99);
        sj.setTots(296);
        sj.setAvgs(98.0);
        sj.setGrds('수');
        int cnt = sjdao.insertSungJuk(sj);

        System.out.println(cnt);
    }
}
