head	1.2;
access;
symbols;
locks; strict;
comment	@# @;


1.2
date	2010.03.02.22.43.40;	author tfaure;	state Exp;
branches;
next	1.1;
commitid	83b74b8d949a4567;

1.1
date	2010.03.02.22.28.07;	author tfaure;	state Exp;
branches;
next	;
commitid	6e914b8d90e34567;


desc
@@


1.2
log
@drop unused action : call activity. an activity as it is referenced is directly called
@
text
@/**
 * Copyright (c) 2010 ATOS ORIGIN INTEGRATION.
 * 
 *     
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Tristan FAURE (ATOS ORIGIN INTEGRATION) tristan.faure@@atosorigin.com - Initial API and implementation
 */
package org.eclipse.emf.doc2model.doc2model.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.doc2model.doc2model.util.Doc2modelAdapterFactory;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @@generated
 */
public class Doc2modelItemProviderAdapterFactory extends Doc2modelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	public Doc2modelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.Doc2Model} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected Doc2ModelItemProvider doc2ModelItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.Doc2Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createDoc2ModelAdapter() {
		if (doc2ModelItemProvider == null) {
			doc2ModelItemProvider = new Doc2ModelItemProvider(this);
		}

		return doc2ModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.Configuration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected ConfigurationItemProvider configurationItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createConfigurationAdapter() {
		if (configurationItemProvider == null) {
			configurationItemProvider = new ConfigurationItemProvider(this);
		}

		return configurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.InitialModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected InitialModelItemProvider initialModelItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.InitialModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createInitialModelAdapter() {
		if (initialModelItemProvider == null) {
			initialModelItemProvider = new InitialModelItemProvider(this);
		}

		return initialModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.Match} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected MatchItemProvider matchItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createMatchAdapter() {
		if (matchItemProvider == null) {
			matchItemProvider = new MatchItemProvider(this);
		}

		return matchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.Rule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected RuleItemProvider ruleItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createRuleAdapter() {
		if (ruleItemProvider == null) {
			ruleItemProvider = new RuleItemProvider(this);
		}

		return ruleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.CurrentContainerSelection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected CurrentContainerSelectionItemProvider currentContainerSelectionItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.CurrentContainerSelection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createCurrentContainerSelectionAdapter() {
		if (currentContainerSelectionItemProvider == null) {
			currentContainerSelectionItemProvider = new CurrentContainerSelectionItemProvider(this);
		}

		return currentContainerSelectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.LastElementCreatedSelection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected LastElementCreatedSelectionItemProvider lastElementCreatedSelectionItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.LastElementCreatedSelection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createLastElementCreatedSelectionAdapter() {
		if (lastElementCreatedSelectionItemProvider == null) {
			lastElementCreatedSelectionItemProvider = new LastElementCreatedSelectionItemProvider(this);
		}

		return lastElementCreatedSelectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.StaticElementSelection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected StaticElementSelectionItemProvider staticElementSelectionItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.StaticElementSelection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createStaticElementSelectionAdapter() {
		if (staticElementSelectionItemProvider == null) {
			staticElementSelectionItemProvider = new StaticElementSelectionItemProvider(this);
		}

		return staticElementSelectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.LastContainerConsideringMatchOrder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected LastContainerConsideringMatchOrderItemProvider lastContainerConsideringMatchOrderItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.LastContainerConsideringMatchOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createLastContainerConsideringMatchOrderAdapter() {
		if (lastContainerConsideringMatchOrderItemProvider == null) {
			lastContainerConsideringMatchOrderItemProvider = new LastContainerConsideringMatchOrderItemProvider(this);
		}

		return lastContainerConsideringMatchOrderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.CreateElementAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected CreateElementActionItemProvider createElementActionItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.CreateElementAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createCreateElementActionAdapter() {
		if (createElementActionItemProvider == null) {
			createElementActionItemProvider = new CreateElementActionItemProvider(this);
		}

		return createElementActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.FillAttributeAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected FillAttributeActionItemProvider fillAttributeActionItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.FillAttributeAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createFillAttributeActionAdapter() {
		if (fillAttributeActionItemProvider == null) {
			fillAttributeActionItemProvider = new FillAttributeActionItemProvider(this);
		}

		return fillAttributeActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.EPackageReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected EPackageReferenceItemProvider ePackageReferenceItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.EPackageReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createEPackageReferenceAdapter() {
		if (ePackageReferenceItemProvider == null) {
			ePackageReferenceItemProvider = new EPackageReferenceItemProvider(this);
		}

		return ePackageReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.RegexTextTransformer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected RegexTextTransformerItemProvider regexTextTransformerItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.RegexTextTransformer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createRegexTextTransformerAdapter() {
		if (regexTextTransformerItemProvider == null) {
			regexTextTransformerItemProvider = new RegexTextTransformerItemProvider(this);
		}

		return regexTextTransformerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.StringReplacementTextTransformer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected StringReplacementTextTransformerItemProvider stringReplacementTextTransformerItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.StringReplacementTextTransformer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createStringReplacementTextTransformerAdapter() {
		if (stringReplacementTextTransformerItemProvider == null) {
			stringReplacementTextTransformerItemProvider = new StringReplacementTextTransformerItemProvider(this);
		}

		return stringReplacementTextTransformerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.ReferenceStaticElementAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected ReferenceStaticElementActionItemProvider referenceStaticElementActionItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.ReferenceStaticElementAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createReferenceStaticElementActionAdapter() {
		if (referenceStaticElementActionItemProvider == null) {
			referenceStaticElementActionItemProvider = new ReferenceStaticElementActionItemProvider(this);
		}

		return referenceStaticElementActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.ContainerSelectionObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected ContainerSelectionObjectItemProvider containerSelectionObjectItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.ContainerSelectionObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createContainerSelectionObjectAdapter() {
		if (containerSelectionObjectItemProvider == null) {
			containerSelectionObjectItemProvider = new ContainerSelectionObjectItemProvider(this);
		}

		return containerSelectionObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.ParameterObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected ParameterObjectItemProvider parameterObjectItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.ParameterObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createParameterObjectAdapter() {
		if (parameterObjectItemProvider == null) {
			parameterObjectItemProvider = new ParameterObjectItemProvider(this);
		}

		return parameterObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.ActionResultObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected ActionResultObjectItemProvider actionResultObjectItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.ActionResultObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createActionResultObjectAdapter() {
		if (actionResultObjectItemProvider == null) {
			actionResultObjectItemProvider = new ActionResultObjectItemProvider(this);
		}

		return actionResultObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.Activity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected ActivityItemProvider activityItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createActivityAdapter() {
		if (activityItemProvider == null) {
			activityItemProvider = new ActivityItemProvider(this);
		}

		return activityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.MatchingResultObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected MatchingResultObjectItemProvider matchingResultObjectItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.MatchingResultObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createMatchingResultObjectAdapter() {
		if (matchingResultObjectItemProvider == null) {
			matchingResultObjectItemProvider = new MatchingResultObjectItemProvider(this);
		}

		return matchingResultObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.ReferenceElementAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected ReferenceElementActionItemProvider referenceElementActionItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.ReferenceElementAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createReferenceElementActionAdapter() {
		if (referenceElementActionItemProvider == null) {
			referenceElementActionItemProvider = new ReferenceElementActionItemProvider(this);
		}

		return referenceElementActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.SetContainerAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected SetContainerActionItemProvider setContainerActionItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.SetContainerAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createSetContainerActionAdapter() {
		if (setContainerActionItemProvider == null) {
			setContainerActionItemProvider = new SetContainerActionItemProvider(this);
		}

		return setContainerActionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@@link #changeNotifier} and to {@@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	public void dispose() {
		if (doc2ModelItemProvider != null) doc2ModelItemProvider.dispose();
		if (configurationItemProvider != null) configurationItemProvider.dispose();
		if (initialModelItemProvider != null) initialModelItemProvider.dispose();
		if (matchItemProvider != null) matchItemProvider.dispose();
		if (ruleItemProvider != null) ruleItemProvider.dispose();
		if (currentContainerSelectionItemProvider != null) currentContainerSelectionItemProvider.dispose();
		if (lastElementCreatedSelectionItemProvider != null) lastElementCreatedSelectionItemProvider.dispose();
		if (staticElementSelectionItemProvider != null) staticElementSelectionItemProvider.dispose();
		if (lastContainerConsideringMatchOrderItemProvider != null) lastContainerConsideringMatchOrderItemProvider.dispose();
		if (createElementActionItemProvider != null) createElementActionItemProvider.dispose();
		if (fillAttributeActionItemProvider != null) fillAttributeActionItemProvider.dispose();
		if (ePackageReferenceItemProvider != null) ePackageReferenceItemProvider.dispose();
		if (regexTextTransformerItemProvider != null) regexTextTransformerItemProvider.dispose();
		if (stringReplacementTextTransformerItemProvider != null) stringReplacementTextTransformerItemProvider.dispose();
		if (referenceStaticElementActionItemProvider != null) referenceStaticElementActionItemProvider.dispose();
		if (containerSelectionObjectItemProvider != null) containerSelectionObjectItemProvider.dispose();
		if (parameterObjectItemProvider != null) parameterObjectItemProvider.dispose();
		if (actionResultObjectItemProvider != null) actionResultObjectItemProvider.dispose();
		if (activityItemProvider != null) activityItemProvider.dispose();
		if (matchingResultObjectItemProvider != null) matchingResultObjectItemProvider.dispose();
		if (referenceElementActionItemProvider != null) referenceElementActionItemProvider.dispose();
		if (setContainerActionItemProvider != null) setContainerActionItemProvider.dispose();
	}

}
@


1.1
log
@first commit for doc2model api edit
@
text
@a590 23
	 * This keeps track of the one adapter used for all {@@link org.eclipse.emf.doc2model.doc2model.CallActivityAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	protected CallActivityActionItemProvider callActivityActionItemProvider;

	/**
	 * This creates an adapter for a {@@link org.eclipse.emf.doc2model.doc2model.CallActivityAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @@generated
	 */
	@@Override
	public Adapter createCallActivityActionAdapter() {
		if (callActivityActionItemProvider == null) {
			callActivityActionItemProvider = new CallActivityActionItemProvider(this);
		}

		return callActivityActionItemProvider;
	}

	/**
a710 1
		if (callActivityActionItemProvider != null) callActivityActionItemProvider.dispose();
@

