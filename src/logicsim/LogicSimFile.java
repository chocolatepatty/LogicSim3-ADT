package logicsim;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class LogicSimFile {
	Circuit circuit = new Circuit();
	Map<String, String> info = new HashMap<String, String>();
	String fileName;
	public boolean changed = false;

	public LogicSimFile(String fileName) {
		this.fileName = fileName;
	}

	public LogicSimFile(String fileName, Map<String, String> info, Vector<Gate> gates, Vector<Wire> wires) {
		this(fileName);
		this.info = info;
		this.circuit.setGates(gates);
	}

	public Vector<Gate> getGates() {
		return circuit.getGates();
	}

	public void setGates(Vector<Gate> gates) {
		circuit.setGates(gates);
	}

	public Vector<Wire> getWires() {
		return circuit.getWires();
	}

	private String getKey(String key) {
		return info.containsKey(key) ? info.get(key) : null;
	}

	public void setLabel(String value) {
		info.put("label", value);
	}

	public void setDescription(String value) {
		info.put("description", value);
	}

	public String getLabel() {
		return getKey("label");
	}

	public String getDescription() {
		return getKey("description");
	}

}