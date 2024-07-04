package com.tns.B83_college;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class collegeservice {
	@Autowired
	 private collegeRepository repo;

	 public List<collegeentity> listAll()
	 {
	 return repo.findAll();
	 }

	 public void save(collegeentity college)
	 {
	 repo.save(college);
	 }

	 public collegeentity get(Integer id)
	 {
	 return repo.findById(id).get();
	 }

	 public void delete(Integer id)
	 {
	 repo.deleteById(id);
	 }
	}

