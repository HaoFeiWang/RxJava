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
package io.reactivex;

import io.reactivex.annotations.*;

/**
 * 用于发送数据流的接口，create操作符的参数类型
 *
 * @param <T> the value type pushed
 */
public interface ObservableOnSubscribe<T> {

    /**
     * 对每个订阅者发送数据的观察者
     * @param emitter the safe emitter instance, never null
     * @throws Exception on error
     */
    void subscribe(@NonNull ObservableEmitter<T> emitter) throws Exception;
}

