package io.github.rotemdev.api.tester;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TesterConsole {
	private String[] args;
	private Method[] methods;
	public TesterConsole(String[] args, Method[] methods) {
		this.args = args;
		this.methods = methods;
	}
	
	public Object[] execute() {
		Object[] obj = new Object[methods.length];
		int i = 0;
		for (Method method : methods) {
			try {
				obj[i] = method.invoke(null, (Object[]) args);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
		return obj;
	}
	
	public Object execute(int methodNumber) {
		Object obj = new Object();
		try {
			obj = methods[methodNumber].invoke(null, (Object[]) args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
