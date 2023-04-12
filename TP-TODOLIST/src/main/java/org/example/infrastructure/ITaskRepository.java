package org.example.infrastructure;

import org.example.domaine.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITaskRepository extends JpaRepository<Task,Long> {
    List<Task> findByTitle(String title);
}
