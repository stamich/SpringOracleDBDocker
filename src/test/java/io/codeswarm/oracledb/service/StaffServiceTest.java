package io.codeswarm.oracledb.service;

import io.codeswarm.oracledb.repository.StaffRepository;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StaffServiceTest {

    @InjectMocks
    private StaffService staffService;

    @Mock
    private StaffRepository staffRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
}
