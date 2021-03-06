package com.example.Proyecto.jparest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
public class StudentResource {

	@Autowired
	private StudentRepository studentRepository;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/students")
	public Iterable<Student> retrieveAllStudents() {
		return studentRepository.findAll();
	}
	
	@GetMapping("/students/{id}")
	public Student retrieveStudent(@PathVariable int id) {
		Optional<Student> student = studentRepository.findById(id);

		if (!student.isPresent())
			throw new ResourceNotFoundException("Student","id",id);

		return student.get();
	}
	
	@PostMapping("/students")
	public ResponseEntity<Object> createStudent(@RequestBody Student student) {
		Student savedStudent = studentRepository.save(student);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedStudent.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
}
