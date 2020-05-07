package com.javalec.ex.CommandEvent;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface EventCommand {

	public void execute(HttpServletRequest request, HttpServletResponse response);
}
