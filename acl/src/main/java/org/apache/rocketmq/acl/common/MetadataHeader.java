/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.acl.common;

public class MetadataHeader {
    private String remoteAddress;
    private String tenantId;
    private String namespace;
    private String authorization;
    private String datetime;
    private String sessionToken;
    private String requestId;
    private String language;
    private String clientVersion;
    private String protocol;
    private int requestCode;

    MetadataHeader(final String remoteAddress, final String tenantId, final String namespace,
        final String authorization, final String datetime, final String sessionToken, final String requestId,
        final String language, final String clientVersion, final String protocol, final int requestCode) {
        this.remoteAddress = remoteAddress;
        this.tenantId = tenantId;
        this.namespace = namespace;
        this.authorization = authorization;
        this.datetime = datetime;
        this.sessionToken = sessionToken;
        this.requestId = requestId;
        this.language = language;
        this.clientVersion = clientVersion;
        this.protocol = protocol;
        this.requestCode = requestCode;
    }

    public static class MetadataHeaderBuilder {
        private String remoteAddress;
        private String tenantId;
        private String namespace;
        private String authorization;
        private String datetime;
        private String sessionToken;
        private String requestId;
        private String language;
        private String clientVersion;
        private String protocol;
        private int requestCode;

        MetadataHeaderBuilder() {
        }

        public MetadataHeader.MetadataHeaderBuilder remoteAddress(final String remoteAddress) {
            this.remoteAddress = remoteAddress;
            return this;
        }

        public MetadataHeader.MetadataHeaderBuilder tenantId(final String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public MetadataHeader.MetadataHeaderBuilder namespace(final String namespace) {
            this.namespace = namespace;
            return this;
        }

        public MetadataHeader.MetadataHeaderBuilder authorization(final String authorization) {
            this.authorization = authorization;
            return this;
        }

        public MetadataHeader.MetadataHeaderBuilder datetime(final String datetime) {
            this.datetime = datetime;
            return this;
        }

        public MetadataHeader.MetadataHeaderBuilder sessionToken(final String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }

        public MetadataHeader.MetadataHeaderBuilder requestId(final String requestId) {
            this.requestId = requestId;
            return this;
        }

        public MetadataHeader.MetadataHeaderBuilder language(final String language) {
            this.language = language;
            return this;
        }

        public MetadataHeader.MetadataHeaderBuilder clientVersion(final String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }

        public MetadataHeader.MetadataHeaderBuilder protocol(final String protocol) {
            this.protocol = protocol;
            return this;
        }

        public MetadataHeader.MetadataHeaderBuilder requestCode(final int requestCode) {
            this.requestCode = requestCode;
            return this;
        }

        public MetadataHeader build() {
            return new MetadataHeader(this.remoteAddress, this.tenantId, this.namespace, this.authorization,
                this.datetime, this.sessionToken, this.requestId, this.language, this.clientVersion, this.protocol,
                this.requestCode);
        }
    }

    public static MetadataHeader.MetadataHeaderBuilder builder() {
        return new MetadataHeader.MetadataHeaderBuilder();
    }

    public String getRemoteAddress() {
        return this.remoteAddress;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getAuthorization() {
        return this.authorization;
    }

    public String getDatetime() {
        return this.datetime;
    }

    public String getSessionToken() {
        return this.sessionToken;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getClientVersion() {
        return this.clientVersion;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public int getRequestCode() {
        return this.requestCode;
    }

    public void setRemoteAddress(final String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    public void setTenantId(final String tenantId) {
        this.tenantId = tenantId;
    }

    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    public void setAuthorization(final String authorization) {
        this.authorization = authorization;
    }

    public void setDatetime(final String datetime) {
        this.datetime = datetime;
    }

    public void setSessionToken(final String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public void setRequestId(final String requestId) {
        this.requestId = requestId;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public void setClientVersion(final String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public void setProtocol(final String protocol) {
        this.protocol = protocol;
    }

    public void setRequestCode(int requestCode) {
        this.requestCode = requestCode;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("MetadataHeader{");
        sb.append("remoteAddress='").append(remoteAddress).append('\'');
        sb.append(", tenantId='").append(tenantId).append('\'');
        sb.append(", namespace='").append(namespace).append('\'');
        sb.append(", authorization='").append(authorization).append('\'');
        sb.append(", datetime='").append(datetime).append('\'');
        sb.append(", sessionToken='").append(sessionToken).append('\'');
        sb.append(", requestId='").append(requestId).append('\'');
        sb.append(", language='").append(language).append('\'');
        sb.append(", clientVersion='").append(clientVersion).append('\'');
        sb.append(", protocol='").append(protocol).append('\'');
        sb.append(", requestCode=").append(requestCode);
        sb.append('}');
        return sb.toString();
    }
}
