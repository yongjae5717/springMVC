package hello.springmvc.basic;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // String 그대로 반환
@Slf4j
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(LogTestController.class);

    @GetMapping("/log-test")
    public String logTest() {
        String name = "String";

        System.out.println("name = " + name);

        log.trace("trace log = {}", name);
        log.debug("debug log = {}", name);
        log.warn("warn log = {}", name);
        log.error("error log = {}", name);
        log.info(" info log = {}", name);

        return "ok";
    }
}
