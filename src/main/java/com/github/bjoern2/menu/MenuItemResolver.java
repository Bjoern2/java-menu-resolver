package com.github.bjoern2.menu;

import java.util.List;

public interface MenuItemResolver {

	List<MenuItem> items(MenuItem parent);
	
}
