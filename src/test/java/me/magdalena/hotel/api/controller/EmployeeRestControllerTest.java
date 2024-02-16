package me.magdalena.hotel.api.controller;

import lombok.AllArgsConstructor;
import me.magdalena.hotel.api.dto.EmployeeDTO;
import me.magdalena.hotel.api.dto.mapper.EmployeeMapper;
import me.magdalena.hotel.business.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EmployeeRestController.class)
@AutoConfigureMockMvc(addFilters = false)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeRestControllerTest {

    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    @MockBean
    private EmployeeMapper employeeMapper;

    @Test
    public void shouldGetAllEmployees() throws Exception {
        // Arrange (prepare your mocks, stubbing the behavior of employeeService and employeeMapper)
        EmployeeDTO employeeDTO =
        // ...

        // Act & Assert
        mockMvc.perform(get(EmployeeRestController.API_EMPLOYEE).contentType(MediaType.APPLICATION_JSON))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$").exists())
               .andExpect(jsonPath("$.employees").isArray());
        // Add more expectations as needed to verify the response structure and data
    }
}
