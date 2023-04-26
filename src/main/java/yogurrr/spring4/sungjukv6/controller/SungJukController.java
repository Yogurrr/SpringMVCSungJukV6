package yogurrr.spring4.sungjukv6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import yogurrr.spring4.sungjukv6.model.SungJukVO;
import yogurrr.spring4.sungjukv6.service.SungJukV6Service;

@Controller
public class SungJukController {

    private SungJukV6Service sjsrv;

    @Autowired
    public SungJukController(SungJukV6Service sjsrv) {
        this.sjsrv = sjsrv;
    }

    // 성적 리스트 처리
    @GetMapping(value = "/list")
    public ModelAndView List() {
        ModelAndView mv = new ModelAndView();

        // sungjuklist.jsp에 성적조회결과를 sjs라는 이름으로 넘김
        mv.addObject("sjs", sjsrv.readSungJuk());
        mv.setViewName("sungjuklist");   // 뷰 이름 지정
        // 이게 Spring4 스타일

        return mv;
    }

    // 성적 입력 폼 표시
    @GetMapping(value = "/add")
    public String Add() {
        return "sungjuk";
    }

    // 성적 입력 처리 (입력 완료 눌렀을 때 뜨는 것)
    @PostMapping(value = "/add")
    public ModelAndView Addok(SungJukVO sj) {
        ModelAndView mv = new ModelAndView();
        String view = "sungjukfail";

        if (sjsrv.newSungJuk(sj)) {
            mv.addObject("sj", sj);
            view = "sungjukok";
        }

        mv.setViewName(view);

        return mv;
    }
}
