package io.codeswarm.oracledb.controller;

import io.codeswarm.oracledb.exception.NoDataException;
import io.codeswarm.oracledb.model.Staff;
import io.codeswarm.oracledb.model.StaffRole;
import io.codeswarm.oracledb.service.StaffService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "/staff")
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Staff>> getAll() {
        List<Staff> staff = staffService.findAll();
        if (staff.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(staff, HttpStatus.OK) ;
    }

    @GetMapping("/allByRoles/{staffRoles}")
    public ResponseEntity<List<Staff>> getAllWithRoles(@PathVariable("staffRoles") Set<StaffRole> staffRoles) {
        List<Staff> staff = staffService.findDistinctByStaffRolesIn(staffRoles);
        if (staff.isEmpty()) {
            return new ResponseEntity<>(staff, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(staff, HttpStatus.OK);
    }


    @GetMapping(value = "/allActive/{active}")
    public ResponseEntity<List<Staff>> getAllActive(@PathVariable("active") Boolean active) {
        List<Staff> staff = staffService.findStaffByActive(active);
        if (staff.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(staff, HttpStatus.OK);
    }

    @GetMapping("/byId/{id}")
    public ResponseEntity<Staff> getOneById(@PathVariable("id") Long id) throws NoDataException {
        Staff staff = staffService.findById(id).orElseThrow(() -> new NoDataException(id));
//        if (staff == null) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
        return new ResponseEntity<>(staff, HttpStatus.FOUND);
    }

    @GetMapping("/byEmail/{email}")
    public ResponseEntity<Staff> getOneByEmail(@PathVariable("email") String email) {
        Staff staff = staffService.findStaffByEmail(email);
        if (staff == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(staff, HttpStatus.FOUND);
    }


    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody Staff staff, UriComponentsBuilder ucb) {
        if (staffService.isPersonExists(staff)) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        staffService.create(staff);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(ucb.path("/staff/{id}").buildAndExpand(staff.getId()).toUri());
        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/update/{email}")
    public ResponseEntity<Staff> update(@PathVariable String email, @RequestBody Staff staff) {
        Staff current = staffService.findStaffByEmail(email);
        if (current != null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
//        current.setFirstName(staff.getFirstName());
//        current.setLastName(staff.getLastName());
        staffService.update(current);
        return new ResponseEntity<>(current, HttpStatus.OK);
    }
}
