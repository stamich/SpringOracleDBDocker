package io.codeswarm.oracledb.service;

import io.codeswarm.oracledb.model.Staff;
import io.codeswarm.oracledb.model.StaffRole;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface StaffService {

    List<Staff> findAll();
//    List<Staff> findAllByStaffRoles(Set<StaffRole> staffRoles);
}
