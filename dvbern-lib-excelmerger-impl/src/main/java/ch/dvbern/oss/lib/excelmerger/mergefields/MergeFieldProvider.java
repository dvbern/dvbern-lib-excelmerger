/*
 * Copyright 2017 DV Bern AG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 */

package ch.dvbern.oss.lib.excelmerger.mergefields;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Nonnull;

public interface MergeFieldProvider {

	@Nonnull
	static List<MergeField<?>> toMergeFields(@Nonnull MergeFieldProvider[] values) {
		return Arrays.stream(values)
			.map(v -> (MergeField<?>) v.getMergeField())
			.collect(Collectors.toList());
	}

	@Nonnull
	<V> MergeField<V> getMergeField();
}
