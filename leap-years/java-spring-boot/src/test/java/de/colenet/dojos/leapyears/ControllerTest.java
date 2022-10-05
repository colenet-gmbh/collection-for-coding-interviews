package de.colenet.dojos.leapyears;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class ControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void getRomanLiteral_ReturnsApplicationJsonAsMediaType() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/somepath/123e45"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
