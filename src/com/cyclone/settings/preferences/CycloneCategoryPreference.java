/*
 * Copyright (C) 2023 Cyclone-AOSP
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cyclone.settings.preferences;

import android.content.Context;
import com.android.settings.R;
import android.util.AttributeSet;
import android.view.View;

import androidx.preference.PreferenceCategory;

public class CycloneCategoryPreference extends PreferenceCategory {

    public CycloneCategoryPreference(Context context, AttributeSet attrs) {
        super(context, attrs);

        setLayoutResource(R.layout.cyclone_preference_category);
    }

    public CycloneCategoryPreference(Context context, View view) {
        super(context);
    }
}
