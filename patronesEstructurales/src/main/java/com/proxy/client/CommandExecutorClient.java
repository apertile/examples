package com.proxy.client;

import com.proxy.proxy.CommandExecutorProxy;
import com.proxy.subject.CommandExecutor;

public class CommandExecutorClient {
	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("Pankaj",
				"wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}

	}
}
