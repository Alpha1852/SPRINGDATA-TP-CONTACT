package org.example.application;

import org.example.domaine.Task;
import org.example.infrastructure.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements ITaskService {

    @Autowired
    ITaskRepository repo;

    @Override
    public void create(Task t) {
        repo.save(t);
    }

    @Override
    public Task getById(Long id) {
        Optional<Task> optionTask=repo.findById(id);
        if(!optionTask.isPresent()){
           throw new EntityNotFoundException();
        }
        return optionTask.get();
    }

    @Override
    public List<Task> getAll() {

        return repo.findAll();
    }

    @Override
    public void update(Task t) {

        create(t);
        //ou repo.save(t);
    }

    @Override
    public void delete(Task t) {
         repo.delete(t);
    }

    @Override
    public List<Task> getByTitle(String title) {
        return repo.findByTitle(title);
    }
}
