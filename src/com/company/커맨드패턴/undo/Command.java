package com.company.커맨드패턴.undo;

public interface Command {
	public void execute();
	public void undo();
}
