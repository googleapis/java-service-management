/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/resources.proto

package com.google.api.servicemanagement.v1;

/**
 *
 *
 * <pre>
 * The full representation of a Service that is managed by
 * Google Service Management.
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.ManagedService}
 */
public final class ManagedService extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.ManagedService)
    ManagedServiceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ManagedService.newBuilder() to construct.
  private ManagedService(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ManagedService() {
    serviceName_ = "";
    producerProjectId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ManagedService();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ManagedService(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              serviceName_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              producerProjectId_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.servicemanagement.v1.ResourcesProto
        .internal_static_google_api_servicemanagement_v1_ManagedService_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.servicemanagement.v1.ResourcesProto
        .internal_static_google_api_servicemanagement_v1_ManagedService_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.servicemanagement.v1.ManagedService.class,
            com.google.api.servicemanagement.v1.ManagedService.Builder.class);
  }

  public static final int SERVICE_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object serviceName_;
  /**
   *
   *
   * <pre>
   * The name of the service. See the [overview](https://cloud.google.com/service-management/overview)
   * for naming requirements.
   * </pre>
   *
   * <code>string service_name = 2;</code>
   *
   * @return The serviceName.
   */
  @java.lang.Override
  public java.lang.String getServiceName() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the service. See the [overview](https://cloud.google.com/service-management/overview)
   * for naming requirements.
   * </pre>
   *
   * <code>string service_name = 2;</code>
   *
   * @return The bytes for serviceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceNameBytes() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object producerProjectId_;
  /**
   *
   *
   * <pre>
   * ID of the project that produces and owns this service.
   * </pre>
   *
   * <code>string producer_project_id = 3;</code>
   *
   * @return The producerProjectId.
   */
  @java.lang.Override
  public java.lang.String getProducerProjectId() {
    java.lang.Object ref = producerProjectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      producerProjectId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * ID of the project that produces and owns this service.
   * </pre>
   *
   * <code>string producer_project_id = 3;</code>
   *
   * @return The bytes for producerProjectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProducerProjectIdBytes() {
    java.lang.Object ref = producerProjectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      producerProjectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serviceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(producerProjectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, producerProjectId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serviceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(producerProjectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, producerProjectId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.api.servicemanagement.v1.ManagedService)) {
      return super.equals(obj);
    }
    com.google.api.servicemanagement.v1.ManagedService other =
        (com.google.api.servicemanagement.v1.ManagedService) obj;

    if (!getServiceName().equals(other.getServiceName())) return false;
    if (!getProducerProjectId().equals(other.getProducerProjectId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SERVICE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getServiceName().hashCode();
    hash = (37 * hash) + PRODUCER_PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProducerProjectId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.servicemanagement.v1.ManagedService parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.ManagedService parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.ManagedService parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.ManagedService parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.ManagedService parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.ManagedService parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.ManagedService parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.ManagedService parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.ManagedService parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.ManagedService parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.ManagedService parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.ManagedService parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.api.servicemanagement.v1.ManagedService prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The full representation of a Service that is managed by
   * Google Service Management.
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.ManagedService}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.ManagedService)
      com.google.api.servicemanagement.v1.ManagedServiceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.servicemanagement.v1.ResourcesProto
          .internal_static_google_api_servicemanagement_v1_ManagedService_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.servicemanagement.v1.ResourcesProto
          .internal_static_google_api_servicemanagement_v1_ManagedService_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.servicemanagement.v1.ManagedService.class,
              com.google.api.servicemanagement.v1.ManagedService.Builder.class);
    }

    // Construct using com.google.api.servicemanagement.v1.ManagedService.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      serviceName_ = "";

      producerProjectId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.servicemanagement.v1.ResourcesProto
          .internal_static_google_api_servicemanagement_v1_ManagedService_descriptor;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.ManagedService getDefaultInstanceForType() {
      return com.google.api.servicemanagement.v1.ManagedService.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.ManagedService build() {
      com.google.api.servicemanagement.v1.ManagedService result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.ManagedService buildPartial() {
      com.google.api.servicemanagement.v1.ManagedService result =
          new com.google.api.servicemanagement.v1.ManagedService(this);
      result.serviceName_ = serviceName_;
      result.producerProjectId_ = producerProjectId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.servicemanagement.v1.ManagedService) {
        return mergeFrom((com.google.api.servicemanagement.v1.ManagedService) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.servicemanagement.v1.ManagedService other) {
      if (other == com.google.api.servicemanagement.v1.ManagedService.getDefaultInstance())
        return this;
      if (!other.getServiceName().isEmpty()) {
        serviceName_ = other.serviceName_;
        onChanged();
      }
      if (!other.getProducerProjectId().isEmpty()) {
        producerProjectId_ = other.producerProjectId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.api.servicemanagement.v1.ManagedService parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.api.servicemanagement.v1.ManagedService) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object serviceName_ = "";
    /**
     *
     *
     * <pre>
     * The name of the service. See the [overview](https://cloud.google.com/service-management/overview)
     * for naming requirements.
     * </pre>
     *
     * <code>string service_name = 2;</code>
     *
     * @return The serviceName.
     */
    public java.lang.String getServiceName() {
      java.lang.Object ref = serviceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the service. See the [overview](https://cloud.google.com/service-management/overview)
     * for naming requirements.
     * </pre>
     *
     * <code>string service_name = 2;</code>
     *
     * @return The bytes for serviceName.
     */
    public com.google.protobuf.ByteString getServiceNameBytes() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the service. See the [overview](https://cloud.google.com/service-management/overview)
     * for naming requirements.
     * </pre>
     *
     * <code>string service_name = 2;</code>
     *
     * @param value The serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      serviceName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the service. See the [overview](https://cloud.google.com/service-management/overview)
     * for naming requirements.
     * </pre>
     *
     * <code>string service_name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceName() {

      serviceName_ = getDefaultInstance().getServiceName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the service. See the [overview](https://cloud.google.com/service-management/overview)
     * for naming requirements.
     * </pre>
     *
     * <code>string service_name = 2;</code>
     *
     * @param value The bytes for serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      serviceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object producerProjectId_ = "";
    /**
     *
     *
     * <pre>
     * ID of the project that produces and owns this service.
     * </pre>
     *
     * <code>string producer_project_id = 3;</code>
     *
     * @return The producerProjectId.
     */
    public java.lang.String getProducerProjectId() {
      java.lang.Object ref = producerProjectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        producerProjectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of the project that produces and owns this service.
     * </pre>
     *
     * <code>string producer_project_id = 3;</code>
     *
     * @return The bytes for producerProjectId.
     */
    public com.google.protobuf.ByteString getProducerProjectIdBytes() {
      java.lang.Object ref = producerProjectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        producerProjectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of the project that produces and owns this service.
     * </pre>
     *
     * <code>string producer_project_id = 3;</code>
     *
     * @param value The producerProjectId to set.
     * @return This builder for chaining.
     */
    public Builder setProducerProjectId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      producerProjectId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of the project that produces and owns this service.
     * </pre>
     *
     * <code>string producer_project_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProducerProjectId() {

      producerProjectId_ = getDefaultInstance().getProducerProjectId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of the project that produces and owns this service.
     * </pre>
     *
     * <code>string producer_project_id = 3;</code>
     *
     * @param value The bytes for producerProjectId to set.
     * @return This builder for chaining.
     */
    public Builder setProducerProjectIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      producerProjectId_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.ManagedService)
  }

  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.ManagedService)
  private static final com.google.api.servicemanagement.v1.ManagedService DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.servicemanagement.v1.ManagedService();
  }

  public static com.google.api.servicemanagement.v1.ManagedService getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManagedService> PARSER =
      new com.google.protobuf.AbstractParser<ManagedService>() {
        @java.lang.Override
        public ManagedService parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ManagedService(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ManagedService> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManagedService> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.servicemanagement.v1.ManagedService getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
