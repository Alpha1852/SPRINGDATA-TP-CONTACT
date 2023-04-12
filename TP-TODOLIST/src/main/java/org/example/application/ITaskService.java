package org.example.application;

import org.example.domaine.Task;

import java.util.List;

public interface ITaskService {


    void create(Task t);

    Task getById(Long id);

    List<Task> getAll();
    void update(Task t);

    void delete(Task t);

    List<Task> getByTitle(String title);
 }
