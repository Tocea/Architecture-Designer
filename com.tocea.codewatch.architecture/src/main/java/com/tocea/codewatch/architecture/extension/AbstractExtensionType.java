package com.tocea.codewatch.architecture.extension;

import com.tocea.codewatch.architecture.core.AbstractAnalysedElement;
import com.tocea.codewatch.architecture.extension.api.IExtensionType;

public abstract class AbstractExtensionType extends AbstractAnalysedElement implements IExtensionType {

	private int index;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
