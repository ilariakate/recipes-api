package task;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RestController
public class Controller {

    @PostMapping("api/colors")
    public void addTask(@Valid @RequestBody Json json) {

    }

}

class Json {

    @NotNull
    @Size(min = 3, max = 12)
    String[] colors;

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

}