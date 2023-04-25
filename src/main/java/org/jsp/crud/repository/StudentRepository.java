package org.jsp.crud.repository;

import org.jsp.crud.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
