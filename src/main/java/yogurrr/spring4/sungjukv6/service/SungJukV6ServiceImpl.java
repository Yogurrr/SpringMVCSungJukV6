package yogurrr.spring4.sungjukv6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yogurrr.spring4.sungjukv6.dao.SungJukV4DAO;
import yogurrr.spring4.sungjukv6.model.SungJukVO;

import java.util.List;
import java.util.Scanner;

@Service("sjsrv")
public class SungJukV6ServiceImpl implements SungJukV6Service {   // 키보드 입력 받아서 리스트에 저장하는 역할
    private Scanner sc = null;
    private List<SungJukVO> sjs = null;
    private SungJukV4DAO sjdao = null;

    @Autowired
    public SungJukV6ServiceImpl(SungJukV4DAO sjdao) {   // 이렇게 하면 자동으로 객체 생성됨
        this.sjdao = sjdao;
    }

    public void removeSungJuk() {

    }

    public void modifySungJuk() {

    }

    public void readOneSungJuk() {
        return;
    }

    // 성적 리스트 받아옴 (이름, 국어, 영어, 수학)
    public List<SungJukVO> readSungJuk() {

        return sjdao.selectSungJuk();
    }

    // 성적 데이터 추가
    public void newSungJuk() {

    }

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
