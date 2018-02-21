package java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * <p>
 * With Java 8, Nashorn, a much improved javascript engine is introduced, to
 * replace the existing Rhino. Nashorn provides 2 to 10 times better
 * performance, as it directly compiles the code in memory and passes the
 * bytecode to JVM. Nashorn uses invoke dynamics feature, introduced in Java 7
 * to improve performance.
 * </p>
 * <hr>
 * <p>
 * <b>jjs: </b> For Nashorn engine, JAVA 8 introduces a new command line tool,
 * jjs, to execute javascript codes at console.
 * </p>
 * 
 * @author ga.omar
 *
 */
public class NashornJavaScript {

	public static void main(String[] args) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

		String name = "Gaurang";
		Integer res = null;

		try {
			nashorn.eval("print('" + name + "')");
			res = (Integer) nashorn.eval("19 + 12");
		} catch (ScriptException e) {
			System.out.println("Errror while executing: " + e.getMessage());
		}
		System.out.println(res);
	}
}
