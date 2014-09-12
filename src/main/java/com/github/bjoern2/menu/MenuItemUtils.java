package com.github.bjoern2.menu;

public class MenuItemUtils {

	public static MenuItem findParentByType(MenuItem item, String type) {
		if (item != null) {
			MenuItem parent = item.getParent();
			if (parent != null) {
				if (parent.getType().equals(type)) {
					return parent;
				} else {
					return findParentByType(parent, type);
				}
			}
		}
		return null;
	}
	
	public static String generatePath(MenuItem item) {
		if (item == null) {
			return "Home";
		}
		return generatePath(item.getParent()) + " / " + item.getName();
	}
	
}
