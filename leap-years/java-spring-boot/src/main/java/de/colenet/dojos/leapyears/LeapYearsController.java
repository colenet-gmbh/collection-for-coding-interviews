package de.colenet.dojos.leapyears;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeapYearsController {

    @GetMapping(value = "/somepath/{number}")
    public Integer getSomepath(@PathVariable int number) {
        return number;
    }
}
