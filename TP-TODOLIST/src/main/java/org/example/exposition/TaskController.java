package org.example.exposition;

import org.example.application.ITaskService;
import org.example.domaine.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    @Autowired
    ITaskService service;
    @PostMapping
    public void create(@RequestBody Task t){
        service.create(t);
    }

    @GetMapping("/findone/{id}")
    public Task getById(@PathVariable("id") Long identifiant){
        return service.getById(identifiant);
    }

    @GetMapping("/findall")
    public List<Task> getAll(){
        return service.getAll();
    }

    @GetMapping("/findbytitle/{title}")
    public List<Task> getByTitle(@PathVariable("title") String title){
        return service.getByTitle(title);
    }

    @PutMapping
    public void update(@RequestBody Task t){
        service.update(t);
    }

    @DeleteMapping
    public void delete(@RequestBody Task t){
        service.delete(t);
    }
}
