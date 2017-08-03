/*
 * Created by Orchextra
 *
 * Copyright (C) 2017 Gigigo Mobile Services SL
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
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gigigo.orchextra.core.domain.executor

import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit


object ThreadExecutor {

  private val CORE_POOL_SIZE = 3
  private val MAX_POOL_SIZE = 5
  private val KEEP_ALIVE_TIME = 120L
  private val TIME_UNIT = TimeUnit.SECONDS
  private val WORK_QUEUE = LinkedBlockingQueue<Runnable>()
  private val threadPoolExecutor = ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE,
      KEEP_ALIVE_TIME, TIME_UNIT,
      WORK_QUEUE)

  fun execute(runnable: Runnable) {
    threadPoolExecutor.submit(runnable)
  }
}