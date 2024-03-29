package yogurrr.spring4.sungjukv6.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yogurrr.spring4.sungjukv6.dao.SungJukV4DAO;
import yogurrr.spring4.sungjukv6.dao.SungJukV6DAOImpl;
import yogurrr.spring4.sungjukv6.model.SungJukVO;

import java.util.List;
import java.util.Scanner;

@Service("sjsrv")
public class SungJukV6ServiceImpl implements SungJukV6Service {   // 키보드 입력 받아서 리스트에 저장하는 역할
    private SungJukV4DAO sjdao = null;
    private static final Logger logger = LogManager.getLogger(SungJukV6DAOImpl.class);

    @Autowired
    public SungJukV6ServiceImpl(SungJukV4DAO sjdao) {   // 이렇게 하면 자동으로 객체 생성됨
        this.sjdao = sjdao;
    }

    public boolean removeSungJuk(int sjno) {
        return false;
    }

    public boolean modifySungJuk(SungJukVO sj) {
        return false;
    }

    public SungJukVO readOneSungJuk(int sjno) {
        return sjdao.selectOneSungJuk(sjno);
    }

    // 성적 리스트 받아옴 (이름, 국어, 영어, 수학)
    public List<SungJukVO> readSungJuk() {

        return sjdao.selectSungJuk();
    }

    // 성적 데이터 추가
    public boolean newSungJuk(SungJukVO sj) {
        boolean result = false;

        this.computeSungJuk(sj);
        logger.info(sj);

        if (sjdao.insertSungJuk(sj) > 0) result = true;

        return result;
    }

    // 성적 데이터 처리
    public void computeSungJuk(SungJukVO sj) {
        sj.setTots( sj.getKors() + sj.getEngs() + sj.getMats() );
        sj.setAvgs((double) sj.getTots() / 3);

        switch ((int)(sj.getAvgs() / 10)) {
            case 10:
            case 9: sj.setGrds('수'); break;
            case 8: sj.setGrds('우'); break;
            case 7: sj.setGrds('미'); break;
            case 6: sj.setGrds('양'); break;
            default: sj.setGrds('가');
        }
    }
}
