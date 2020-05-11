package com.javalec.ex.CommandAdmin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface AdminCommand {

	public void execute(HttpServletRequest request, HttpServletResponse response);
}
