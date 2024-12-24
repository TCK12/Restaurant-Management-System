package model;

public class Table {
	private String tableID;
	private boolean isEmpty;
	
	public Table(String tableID, boolean isEmpty) {
		this.tableID = tableID;
		this.isEmpty = isEmpty;
	}

	public String getTableID() {
		return tableID;
	}

	public void setTableID(String tableID) {
		this.tableID = tableID;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	
	
}
