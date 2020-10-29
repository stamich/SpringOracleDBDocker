package io.codeswarm.oracledb.repository;

import io.codeswarm.oracledb.model.Staff;
import io.codeswarm.oracledb.model.StaffRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
    List<Staff> findAll();
    List<Staff> findDistinctByStaffRolesIn(Set<StaffRole> staffRoles);
    List<Staff> findStaffByActive(Boolean active);
    Staff findStaffById(Long id);
    Staff findStaffByEmail(String email);
    void deleteStaffById(Long id);
}
