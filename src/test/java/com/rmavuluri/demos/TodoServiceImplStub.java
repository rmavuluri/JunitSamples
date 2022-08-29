package com.rmavuluri.demos;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoServiceImplStub {
    @Test
    public void testServiceStub() {
        TodoService todoService = new TodoServiceStub();
        TodoServiceImpl todoServiceImpl = new TodoServiceImpl(todoService);
        List<String> todos = todoServiceImpl.retrieveTodos("Ramesh");
        assertEquals(2, todos.size());
    }
}
