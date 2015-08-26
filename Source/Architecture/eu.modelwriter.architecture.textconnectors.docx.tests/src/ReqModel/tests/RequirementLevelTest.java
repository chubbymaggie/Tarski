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
 */
package ReqModel.tests;

import ReqModel.ReqModelFactory;
import ReqModel.RequirementLevel;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Requirement Level</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementLevelTest extends DefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequirementLevelTest.class);
	}

	/**
	 * Constructs a new Requirement Level test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementLevelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Requirement Level test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RequirementLevel getFixture() {
		return (RequirementLevel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReqModelFactory.eINSTANCE.createRequirementLevel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RequirementLevelTest