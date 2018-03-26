/**
 * Copyright (c) 2016-present, RxJava Contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */

package io.reactivex.functions;

import io.reactivex.annotations.NonNull;

/**
 * 一个功能接口，用于传入一个值返回另一个值，可能是不同的类型，并且允许抛出异常
 *
 * @param <T> 输入的值
 * @param <R> 返回的值
 */
public interface Function<T, R> {
    /**
     * 对输入的值进行处理，然后返回另一个值
     */
    R apply(@NonNull T t) throws Exception;
}
