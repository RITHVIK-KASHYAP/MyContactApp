package com.user.command.manager;

import java.util.Stack;

public class CommandManager {

    private final Stack<command> undoStack = new Stack<>();
    private final Stack<command> redoStack = new Stack<>();

    public void execute(command command) {
        command.execute();
        undoStack.push(command);
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            command cmd = undoStack.pop();
            cmd.undo();
            redoStack.push(cmd);
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            command cmd = redoStack.pop();
            cmd.execute();
            undoStack.push(cmd);
        }
    }
}