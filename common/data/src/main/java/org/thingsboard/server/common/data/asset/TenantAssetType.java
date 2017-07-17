/**
 * Copyright © 2016-2017 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.common.data.asset;

import org.thingsboard.server.common.data.UUIDConverter;
import org.thingsboard.server.common.data.id.TenantId;

import java.util.UUID;

public class TenantAssetType {

    private static final long serialVersionUID = 8057290243855622101L;

    private String type;
    private TenantId tenantId;

    public TenantAssetType() {
        super();
    }

    public TenantAssetType(String type, TenantId tenantId) {
        this.type = type;
        this.tenantId = tenantId;
    }

    public TenantAssetType(String type, UUID tenantId) {
        this.type = type;
        this.tenantId = new TenantId(tenantId);
    }

    public TenantAssetType(String type, String tenantId) {
        this.type = type;
        this.tenantId = new TenantId(UUIDConverter.fromString(tenantId));
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TenantId getTenantId() {
        return tenantId;
    }

    public void setTenantId(TenantId tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TenantAssetType that = (TenantAssetType) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return tenantId != null ? tenantId.equals(that.tenantId) : that.tenantId == null;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TenantAssetType{");
        sb.append("type='").append(type).append('\'');
        sb.append(", tenantId=").append(tenantId);
        sb.append('}');
        return sb.toString();
    }
}
