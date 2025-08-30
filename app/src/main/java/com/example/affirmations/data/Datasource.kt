/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1, "Eleanor Roosevelt", listOf("#courage", "#wisdom", "#inspiration")),
            Affirmation(R.string.affirmation2, R.drawable.image2, "Amelia Earhart", listOf("#adventure", "#flying", "#motivation")),
            Affirmation(R.string.affirmation3, R.drawable.image3, "Maya Angelou", listOf("#phenomenal", "#woman", "#poetry")),
            Affirmation(R.string.affirmation4, R.drawable.image4, "Confucius", listOf("#harmony", "#philosophy", "#ancient")),
            Affirmation(R.string.affirmation5, R.drawable.image5, "Nelson Mandela", listOf("#freedom", "#forgiveness", "#resilience")),
            Affirmation(R.string.affirmation6, R.drawable.image6, "Walt Disney", listOf("#dreams", "#imagination", "#creativity")),
            Affirmation(R.string.affirmation7, R.drawable.image7, "Albert Einstein", listOf("#science", "#relativity", "#knowledge")),
            Affirmation(R.string.affirmation8, R.drawable.image8, "Helen Keller", listOf("#optimism", "#perseverance", "#vision")),
            Affirmation(R.string.affirmation9, R.drawable.image9, "Martin Luther King Jr.", listOf("#justice", "#equality", "#dream")),
            Affirmation(R.string.affirmation10, R.drawable.image10, "Lao Tzu", listOf("#taoism", "#simplicity", "#wisdom"))
        )
    }
}
