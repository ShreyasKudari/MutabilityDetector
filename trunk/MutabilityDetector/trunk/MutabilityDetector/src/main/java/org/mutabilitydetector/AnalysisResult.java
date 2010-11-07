/*
 * Mutability Detector
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * Further licensing information for this project can be found in 
 * 		license/LICENSE.txt
 */

package org.mutabilitydetector;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.mutabilitydetector.IAnalysisSession.IsImmutable;

public final class AnalysisResult {
	public final String dottedClassName;
	public final IsImmutable isImmutable;
	public final Collection<CheckerReasonDetail> reasons;
	
	
	public AnalysisResult(String dottedClassName, IsImmutable isImmutable, Collection<CheckerReasonDetail> reasons) {
		this.dottedClassName = dottedClassName;
		this.isImmutable = isImmutable;
		this.reasons = Collections.unmodifiableCollection(new ArrayList<CheckerReasonDetail>(reasons));
	}
	
	public AnalysisResult(String dottedClassName, IsImmutable isImmutable, CheckerReasonDetail... reasons) {
		this(dottedClassName, isImmutable, asList(reasons));
	}
	
	public static AnalysisResult definitelyImmutable(String dottedClassName) {
		return new AnalysisResult(dottedClassName, IsImmutable.DEFINITELY);
	}
}