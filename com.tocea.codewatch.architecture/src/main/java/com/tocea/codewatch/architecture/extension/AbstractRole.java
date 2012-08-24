package com.tocea.codewatch.architecture.extension;

import com.tocea.codewatch.architecture.core.AbstractAnalysedElement;
import com.tocea.codewatch.architecture.extension.api.IRole;

public abstract class AbstractRole<T> extends AbstractAnalysedElement implements IRole<T> {

	private T attachedElement;


	public T getAttachedElement() {
		return attachedElement;
	}


	public void setAttachedElement(T element) {
		this.attachedElement = element;
	}

}
