package io.codeswarm.oracledb.service;

import io.codeswarm.oracledb.model.Staff;
import io.codeswarm.oracledb.model.StaffRole;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

public interface StaffService {
    List<Staff> findAll();
    List<Staff> findDistinctByStaffRolesIn(Set<StaffRole> staffRoles);
    List<Staff> findStaffByActive(Boolean active);
    Staff findStaffById(Long id);
    Staff findStaffByEmail(String email);
    void create(Staff staff);
    void update(Staff staff);
    void deleteStaffById(Long id);
    boolean isStaffEmailUnique(Long id, String email);
    public boolean isPersonExists(Staff staff);
}
