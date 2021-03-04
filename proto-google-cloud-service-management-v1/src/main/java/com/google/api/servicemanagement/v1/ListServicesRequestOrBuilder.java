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
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

public interface ListServicesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.ListServicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Include services produced by the specified project.
   * </pre>
   *
   * <code>string producer_project_id = 1;</code>
   *
   * @return The producerProjectId.
   */
  java.lang.String getProducerProjectId();
  /**
   *
   *
   * <pre>
   * Include services produced by the specified project.
   * </pre>
   *
   * <code>string producer_project_id = 1;</code>
   *
   * @return The bytes for producerProjectId.
   */
  com.google.protobuf.ByteString getProducerProjectIdBytes();

  /**
   *
   *
   * <pre>
   * The max number of items to include in the response list. Page size is 50
   * if not specified. Maximum value is 100.
   * </pre>
   *
   * <code>int32 page_size = 5;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Token identifying which result to start with; returned by a previous list
   * call.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Token identifying which result to start with; returned by a previous list
   * call.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Include services consumed by the specified consumer.
   * The Google Service Management implementation accepts the following
   * forms:
   * - project:&lt;project_id&gt;
   * </pre>
   *
   * <code>string consumer_id = 7 [deprecated = true];</code>
   *
   * @return The consumerId.
   */
  @java.lang.Deprecated
  java.lang.String getConsumerId();
  /**
   *
   *
   * <pre>
   * Include services consumed by the specified consumer.
   * The Google Service Management implementation accepts the following
   * forms:
   * - project:&lt;project_id&gt;
   * </pre>
   *
   * <code>string consumer_id = 7 [deprecated = true];</code>
   *
   * @return The bytes for consumerId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getConsumerIdBytes();
}
