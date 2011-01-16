/*
 * Mutability Detector
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 * 
 * Further licensing information for this project can be found in
 * license/LICENSE.txt
 */

package org.mutabilitydetector.unittesting.matchers;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;
import org.mutabilitydetector.AnalysisResult;

public abstract class BaseAnalysisResultMatcher extends TypeSafeDiagnosingMatcher<AnalysisResult> 
												implements AnalysisResultMatcher {
	
	@Override protected abstract boolean matchesSafely(AnalysisResult analysisResult, Description mismatchDescription);
	
}
