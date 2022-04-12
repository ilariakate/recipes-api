package task;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ConcurrentMap;

@RestController
public class Controller {
    @PostMapping("/test")
    public String getValue(@RequestParam String param) {
        return param;
    }
}
