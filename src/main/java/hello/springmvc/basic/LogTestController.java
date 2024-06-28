package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
//Controller는 반환값이 String이면 뷰 이름으로 인식,
// RestController는 반환값으로 뷰를 찾는 것이 아닌 HTTP 메세지 바디에 바로 입력 @ResponseBody와 관련

public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "spring";

        log.trace("trace log ={}", name);
        log.debug("debug log ={}", name);
        log.info("info log ={}", name);
        log.warn("warn log ={}", name);
        log.error("error log ={}", name);
        return "ok";
    }
}
