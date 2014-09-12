package com.github.bjoern2.menu;


public class MenuItem {

	private MenuItem parent;

	private String id;
	private String name;
	private String type;
	private String path;

	public MenuItem getParent() {
		return parent;
	}

	public void setParent(MenuItem parent) {
		this.parent = parent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", name=" + name + ", type=" + type + ", path=" + path + "]";
	}

}
