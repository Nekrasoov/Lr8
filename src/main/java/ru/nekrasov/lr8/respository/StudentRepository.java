package ru.nekrasov.lr8.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nekrasov.lr8.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
