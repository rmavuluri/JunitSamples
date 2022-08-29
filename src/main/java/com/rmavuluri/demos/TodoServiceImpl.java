package com.rmavuluri.demos;

import java.util.ArrayList;
import java.util.List;

public class TodoServiceImpl {
    private TodoService todoService;

    TodoServiceImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodos(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> allTodos = todoService.retrieveTodos(user);
        for(String todos: allTodos){
            if(todos.contains("Spring")){
                filteredTodos.add(todos);
            }
        }
        return filteredTodos;
    }
}
