package com.rmavuluri.demos;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{
    public List<String> retrieveTodos(String user){
        return Arrays.asList("Spring","Angular","Java","JavaScript","TypeScript","Spring Cloud");
    }
}
