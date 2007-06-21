package com.bretth.osmosis.sort;

import com.bretth.osmosis.data.Element;
import com.bretth.osmosis.task.ChangeAction;


/**
 * Packages an element with the associated change.
 * 
 * @author Brett Henderson
 */
public class ChangeElement {
	private Element element;
	private ChangeAction action;
	
	
	/**
	 * Creates a new instance.
	 * 
	 * @param element
	 *            The element.
	 * @param action
	 *            The action.
	 */
	public ChangeElement(Element element, ChangeAction action) {
		this.element = element;
		this.action = action;
	}
	
	
	/**
	 * @return The element. 
	 */
	public Element getElement() {
		return element;
	}
	
	
	/**
	 * @return The action. 
	 */
	public ChangeAction getAction() {
		return action;
	}
}