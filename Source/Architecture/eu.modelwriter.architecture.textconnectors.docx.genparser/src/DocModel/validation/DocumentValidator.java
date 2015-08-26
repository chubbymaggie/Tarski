/*******************************************************************************
 * Copyright (c) 2015 UNIT Information Technologies R&D
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    A. Furkan Tanriverdi (UNIT) - initial API and implementation
 *******************************************************************************/
/**
 *
 * $Id$
 */
package DocModel.validation;

import DocModel.Mark;
import DocModel.Paragraph;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link DocModel.Document}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DocumentValidator {
	boolean validate();

	boolean validateOwnedParagraph(EList<Paragraph> value);
	boolean validateDocument(XWPFDocument value);
	boolean validatePath(String value);
	boolean validateOwnedMark(EList<Mark> value);
}