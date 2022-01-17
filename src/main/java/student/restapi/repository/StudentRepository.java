package student.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import student.restapi.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
