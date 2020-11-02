package io.codeswarm.oracledb.controller;

import io.codeswarm.oracledb.model.Staff;
import io.codeswarm.oracledb.model.StaffRole;
import io.codeswarm.oracledb.service.StaffService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class StaffControllerTest {

    @InjectMocks
    private StaffController staffController;

    @Mock
    private StaffService staffService;

    @BeforeAll
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllTest() {

        //given
        Set<StaffRole> set = new HashSet<>();
        set.add(StaffRole.CEO);

        Staff staff0 = new Staff();
        staff0.setId(100L);
        staff0.setEmail("email@com.com");
        staff0.setPassword("password");
        staff0.setStaffRoles(set);

        List<Staff> ss = new ArrayList<>();
        ss.add(staff0);

        when(staffService.findAll()).thenReturn(ss);

        //when
        ResponseEntity<List<Staff>> result = staffController.getAll();

        //then
        assertThat(result.getStatusCodeValue()).isEqualTo(200);
    }
}
