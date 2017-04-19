/*
 * Copyright 2016 MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mongodb.spark.sql.fieldTypes.api.java;

/**
 * A Java bean representing the Bson Undefined type
 *
 * @since 1.0
 */
public final class Undefined {
    private boolean undefined;

    /**
     * Construct a new instance
     */
    public Undefined() {
        this(true);
    }

    /**
     * Construct a new instance
     *
     * @param undefined data representing undefined
     */
    public Undefined(final boolean undefined) {
        this.undefined = undefined;
    }

    public boolean isUndefined() {
        return undefined;
    }

    public void setUndefined(final boolean undefined) {
        this.undefined = undefined;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Undefined that = (Undefined) o;
        return undefined == that.undefined;
    }

    @Override
    public int hashCode() {
        return (undefined ? 1 : 0);
    }
}
