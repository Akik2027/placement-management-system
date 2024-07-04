package com.tns.B83_college;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
@RestController
public class collegecontroller {

	 @Autowired
	 private collegeservice service;

	 // RESTful API methods for Retrieval operations
	 @GetMapping("/colleges")
	 public List<collegeentity> list()
	 {
	 return service.listAll();
	 }
	 @GetMapping("/colleges/{id}")
	 public ResponseEntity<collegeentity> get(@PathVariable Integer id)
	 {
	 try
	 {
	 collegeentity college = service.get(id);
	 return new ResponseEntity<collegeentity>(college, HttpStatus.OK);
	 }
	 catch (NoSuchElementException e)
	 {
	 return new ResponseEntity<collegeentity>(HttpStatus.NOT_FOUND);
	 }
	 }
	 // RESTful API method for Create operation
	 @PostMapping("/colleges")
	 public void add(@RequestBody collegeentity college)
	 {
	 service.save(college);
	 }

	 // RESTful API method for Update operation
	 @PutMapping("/colleges/{id}")
	 public ResponseEntity<?> update(@RequestBody collegeentity college, @PathVariable Integer id)
	 {
	 try
	 {
	 collegeentity existcollege = service.get(id);
	 service.save(college);
	 return new ResponseEntity<>(HttpStatus.OK);
	 }
	 catch (NoSuchElementException e)
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 }
	 }
	 // RESTful API method for Delete operation
	 @DeleteMapping("/colleges/{id}")
	 public void delete(@PathVariable Integer id)
	 {
	 service.delete(id);
	 }
	}
