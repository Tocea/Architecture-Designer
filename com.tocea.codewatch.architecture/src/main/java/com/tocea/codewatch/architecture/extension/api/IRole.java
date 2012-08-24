package com.tocea.codewatch.architecture.extension.api;

import com.tocea.codewatch.architecture.core.api.IAnalysedElement;

public interface IRole<T> extends IExtensionType {

	/**
	 * @return the {@link IAnalysedElement} attached to this role
	 */
	public T getAttachedElement();

	/**
	 * Attaches an {@link IAnalysedElement} to the role
	 * 
	 * @param element the element to attach.
	 */
	public void setAttachedElement(T element);

}
