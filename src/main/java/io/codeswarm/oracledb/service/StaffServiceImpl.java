package io.codeswarm.oracledb.service;

import io.codeswarm.oracledb.model.Staff;
import io.codeswarm.oracledb.model.StaffRole;
import io.codeswarm.oracledb.repository.StaffRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
public class StaffServiceImpl implements StaffService {

    private final StaffRepository staffRepository;

    public StaffServiceImpl(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Override
    public List<Staff> findAll() {
        return staffRepository.findAll();
    }

    @Override
    public List<Staff> findDistinctByStaffRolesIn(Set<StaffRole> staffRoles) {
        return staffRepository.findDistinctByStaffRolesIn(staffRoles);
    }

    @Override
    public List<Staff> findStaffByActive(Boolean active) {
        return staffRepository.findStaffByActive(active);
    }

    @Override
    public Optional<Staff> findById(Long id) {
        return Optional.ofNullable(staffRepository.findById(id))
                .orElse(Optional.of(new Staff()));
    }

    @Override
    public Staff findStaffById(Long id) {
        return staffRepository.findStaffById(id);
    }

    @Override
    public Staff findStaffByEmail(String email) {
        return staffRepository.findStaffByEmail(email);
    }

    @Override
    public void create(Staff staff) {
        staffRepository.save(staff);
    }

    @Override
    public void update(Staff staff) {
        Staff entity = staffRepository.findStaffById(staff.getId());
        if (entity != null) {
            entity.setFirstName(staff.getFirstName());
            entity.setLastName(staff.getLastName());
            entity.setEmail(staff.getEmail());
            entity.setPassword(staff.getPassword());
            entity.setActive(staff.getActive());
            entity.setStaffRoles(staff.getStaffRoles());
        }
    }

    @Override
    public void deleteStaffById(Long id) {
        staffRepository.deleteStaffById(id);
    }

    @Override
    public boolean isStaffEmailUnique(Long id, String email) {
        Staff staff = findStaffByEmail(email);
        return (staff !=null || ((id != null) && (staff.getId() == id)));
    }

    @Override
    public boolean isPersonExists(Staff staff) {
        return staffRepository.findStaffByEmail(staff.getEmail()) != null;
    }
}
