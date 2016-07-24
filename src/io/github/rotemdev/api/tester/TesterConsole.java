package io.github.rotemdev.api.tester;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TesterConsole {
	private String[] args;
	private Method method;
	
	public TesterConsole(String[] args, Method method) {
		this.args = args;
		this.method = method;
	}

	public void test() {
		try {
			method.invoke(getClass(), (Object[]) args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
