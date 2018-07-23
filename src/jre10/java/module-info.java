import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.jstree.JSTreePageConfigurator;

module com.jwebmp.plugins.jstree {

	exports com.jwebmp.plugins.jstree;
	exports com.jwebmp.plugins.jstree.events;
	exports com.jwebmp.plugins.jstree.plugins;
	exports com.jwebmp.plugins.jstree.plugins.onchangedevent;
	exports com.jwebmp.plugins.jstree.enumerations;
	exports com.jwebmp.plugins.jstree.interfaces;
	exports com.jwebmp.plugins.jstree.options;
	exports com.jwebmp.plugins.jstree.themes;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.jwebmp.guicedservlets;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with JSTreePageConfigurator;

}
