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

package com.gigigo.orchextra.core.data.datasources.network.models

class OxResponse<T>(
    val status: Boolean?,
    val data: T?
)

class OxErrorResponse(
    val status: Boolean?,
    val error: ApiError?
)

class ApiError(
    val code: Int?,
    val message: String?
)

class ApiToken(
    val value: String?,
    val type: String?,
    val expiresIn: Long?,
    val expiresAt: String?,
    val projectId: String?
)

class ApiAuthRequest(
    val grantType: String?,
    val credentials: ApiCredentials?
)

class ApiCredentials(
    val apiKey: String? = null,
    val apiSecret: String? = null,
    val clientToken: String? = null,
    val crmId: String? = null,
    val instanceId: String? = null,
    val secureId: String? = null,
    val serialNumber: String? = null,
    val bluetoothMacAddress: String? = null,
    val wifiMacAddress: String? = null
)