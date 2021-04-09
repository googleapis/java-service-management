/*
 * Copyright 2021 Google LLC
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

package com.google.cloud.api.servicemanagement.v1.stub;

import static com.google.cloud.api.servicemanagement.v1.ServiceManagerClient.ListServiceConfigsPagedResponse;
import static com.google.cloud.api.servicemanagement.v1.ServiceManagerClient.ListServiceRolloutsPagedResponse;
import static com.google.cloud.api.servicemanagement.v1.ServiceManagerClient.ListServicesPagedResponse;

import com.google.api.Service;
import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.servicemanagement.v1.CreateServiceConfigRequest;
import com.google.api.servicemanagement.v1.CreateServiceRequest;
import com.google.api.servicemanagement.v1.CreateServiceRolloutRequest;
import com.google.api.servicemanagement.v1.DeleteServiceRequest;
import com.google.api.servicemanagement.v1.DisableServiceRequest;
import com.google.api.servicemanagement.v1.DisableServiceResponse;
import com.google.api.servicemanagement.v1.EnableServiceRequest;
import com.google.api.servicemanagement.v1.EnableServiceResponse;
import com.google.api.servicemanagement.v1.GenerateConfigReportRequest;
import com.google.api.servicemanagement.v1.GenerateConfigReportResponse;
import com.google.api.servicemanagement.v1.GetServiceConfigRequest;
import com.google.api.servicemanagement.v1.GetServiceRequest;
import com.google.api.servicemanagement.v1.GetServiceRolloutRequest;
import com.google.api.servicemanagement.v1.ListServiceConfigsRequest;
import com.google.api.servicemanagement.v1.ListServiceConfigsResponse;
import com.google.api.servicemanagement.v1.ListServiceRolloutsRequest;
import com.google.api.servicemanagement.v1.ListServiceRolloutsResponse;
import com.google.api.servicemanagement.v1.ListServicesRequest;
import com.google.api.servicemanagement.v1.ListServicesResponse;
import com.google.api.servicemanagement.v1.ManagedService;
import com.google.api.servicemanagement.v1.OperationMetadata;
import com.google.api.servicemanagement.v1.Rollout;
import com.google.api.servicemanagement.v1.SubmitConfigSourceRequest;
import com.google.api.servicemanagement.v1.SubmitConfigSourceResponse;
import com.google.api.servicemanagement.v1.UndeleteServiceRequest;
import com.google.api.servicemanagement.v1.UndeleteServiceResponse;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ServiceManagerStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (servicemanagement.googleapis.com) and default port (443) are
 *       used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getService to 30 seconds:
 *
 * <pre>{@code
 * ServiceManagerStubSettings.Builder serviceManagerSettingsBuilder =
 *     ServiceManagerStubSettings.newBuilder();
 * serviceManagerSettingsBuilder
 *     .getServiceSettings()
 *     .setRetrySettings(
 *         serviceManagerSettingsBuilder
 *             .getServiceSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ServiceManagerStubSettings serviceManagerSettings = serviceManagerSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class ServiceManagerStubSettings extends StubSettings<ServiceManagerStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/cloud-platform.read-only")
          .add("https://www.googleapis.com/auth/service.management")
          .add("https://www.googleapis.com/auth/service.management.readonly")
          .build();

  private final PagedCallSettings<
          ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
      listServicesSettings;
  private final UnaryCallSettings<GetServiceRequest, ManagedService> getServiceSettings;
  private final UnaryCallSettings<CreateServiceRequest, Operation> createServiceSettings;
  private final OperationCallSettings<CreateServiceRequest, ManagedService, OperationMetadata>
      createServiceOperationSettings;
  private final UnaryCallSettings<DeleteServiceRequest, Operation> deleteServiceSettings;
  private final OperationCallSettings<DeleteServiceRequest, Empty, OperationMetadata>
      deleteServiceOperationSettings;
  private final UnaryCallSettings<UndeleteServiceRequest, Operation> undeleteServiceSettings;
  private final OperationCallSettings<
          UndeleteServiceRequest, UndeleteServiceResponse, OperationMetadata>
      undeleteServiceOperationSettings;
  private final PagedCallSettings<
          ListServiceConfigsRequest, ListServiceConfigsResponse, ListServiceConfigsPagedResponse>
      listServiceConfigsSettings;
  private final UnaryCallSettings<GetServiceConfigRequest, Service> getServiceConfigSettings;
  private final UnaryCallSettings<CreateServiceConfigRequest, Service> createServiceConfigSettings;
  private final UnaryCallSettings<SubmitConfigSourceRequest, Operation> submitConfigSourceSettings;
  private final OperationCallSettings<
          SubmitConfigSourceRequest, SubmitConfigSourceResponse, OperationMetadata>
      submitConfigSourceOperationSettings;
  private final PagedCallSettings<
          ListServiceRolloutsRequest, ListServiceRolloutsResponse, ListServiceRolloutsPagedResponse>
      listServiceRolloutsSettings;
  private final UnaryCallSettings<GetServiceRolloutRequest, Rollout> getServiceRolloutSettings;
  private final UnaryCallSettings<CreateServiceRolloutRequest, Operation>
      createServiceRolloutSettings;
  private final OperationCallSettings<CreateServiceRolloutRequest, Rollout, OperationMetadata>
      createServiceRolloutOperationSettings;
  private final UnaryCallSettings<GenerateConfigReportRequest, GenerateConfigReportResponse>
      generateConfigReportSettings;
  private final UnaryCallSettings<EnableServiceRequest, Operation> enableServiceSettings;
  private final OperationCallSettings<
          EnableServiceRequest, EnableServiceResponse, OperationMetadata>
      enableServiceOperationSettings;
  private final UnaryCallSettings<DisableServiceRequest, Operation> disableServiceSettings;
  private final OperationCallSettings<
          DisableServiceRequest, DisableServiceResponse, OperationMetadata>
      disableServiceOperationSettings;

  private static final PagedListDescriptor<
          ListServicesRequest, ListServicesResponse, ManagedService>
      LIST_SERVICES_PAGE_STR_DESC =
          new PagedListDescriptor<ListServicesRequest, ListServicesResponse, ManagedService>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListServicesRequest injectToken(ListServicesRequest payload, String token) {
              return ListServicesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListServicesRequest injectPageSize(ListServicesRequest payload, int pageSize) {
              return ListServicesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListServicesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListServicesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ManagedService> extractResources(ListServicesResponse payload) {
              return payload.getServicesList() == null
                  ? ImmutableList.<ManagedService>of()
                  : payload.getServicesList();
            }
          };

  private static final PagedListDescriptor<
          ListServiceConfigsRequest, ListServiceConfigsResponse, Service>
      LIST_SERVICE_CONFIGS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListServiceConfigsRequest, ListServiceConfigsResponse, Service>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListServiceConfigsRequest injectToken(
                ListServiceConfigsRequest payload, String token) {
              return ListServiceConfigsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListServiceConfigsRequest injectPageSize(
                ListServiceConfigsRequest payload, int pageSize) {
              return ListServiceConfigsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListServiceConfigsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListServiceConfigsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Service> extractResources(ListServiceConfigsResponse payload) {
              return payload.getServiceConfigsList() == null
                  ? ImmutableList.<Service>of()
                  : payload.getServiceConfigsList();
            }
          };

  private static final PagedListDescriptor<
          ListServiceRolloutsRequest, ListServiceRolloutsResponse, Rollout>
      LIST_SERVICE_ROLLOUTS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListServiceRolloutsRequest, ListServiceRolloutsResponse, Rollout>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListServiceRolloutsRequest injectToken(
                ListServiceRolloutsRequest payload, String token) {
              return ListServiceRolloutsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListServiceRolloutsRequest injectPageSize(
                ListServiceRolloutsRequest payload, int pageSize) {
              return ListServiceRolloutsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListServiceRolloutsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListServiceRolloutsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Rollout> extractResources(ListServiceRolloutsResponse payload) {
              return payload.getRolloutsList() == null
                  ? ImmutableList.<Rollout>of()
                  : payload.getRolloutsList();
            }
          };

  private static final PagedListResponseFactory<
          ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
      LIST_SERVICES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>() {
            @Override
            public ApiFuture<ListServicesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListServicesRequest, ListServicesResponse> callable,
                ListServicesRequest request,
                ApiCallContext context,
                ApiFuture<ListServicesResponse> futureResponse) {
              PageContext<ListServicesRequest, ListServicesResponse, ManagedService> pageContext =
                  PageContext.create(callable, LIST_SERVICES_PAGE_STR_DESC, request, context);
              return ListServicesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListServiceConfigsRequest, ListServiceConfigsResponse, ListServiceConfigsPagedResponse>
      LIST_SERVICE_CONFIGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListServiceConfigsRequest,
              ListServiceConfigsResponse,
              ListServiceConfigsPagedResponse>() {
            @Override
            public ApiFuture<ListServiceConfigsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListServiceConfigsRequest, ListServiceConfigsResponse> callable,
                ListServiceConfigsRequest request,
                ApiCallContext context,
                ApiFuture<ListServiceConfigsResponse> futureResponse) {
              PageContext<ListServiceConfigsRequest, ListServiceConfigsResponse, Service>
                  pageContext =
                      PageContext.create(
                          callable, LIST_SERVICE_CONFIGS_PAGE_STR_DESC, request, context);
              return ListServiceConfigsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListServiceRolloutsRequest, ListServiceRolloutsResponse, ListServiceRolloutsPagedResponse>
      LIST_SERVICE_ROLLOUTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListServiceRolloutsRequest,
              ListServiceRolloutsResponse,
              ListServiceRolloutsPagedResponse>() {
            @Override
            public ApiFuture<ListServiceRolloutsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListServiceRolloutsRequest, ListServiceRolloutsResponse> callable,
                ListServiceRolloutsRequest request,
                ApiCallContext context,
                ApiFuture<ListServiceRolloutsResponse> futureResponse) {
              PageContext<ListServiceRolloutsRequest, ListServiceRolloutsResponse, Rollout>
                  pageContext =
                      PageContext.create(
                          callable, LIST_SERVICE_ROLLOUTS_PAGE_STR_DESC, request, context);
              return ListServiceRolloutsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to listServices. */
  public PagedCallSettings<ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
      listServicesSettings() {
    return listServicesSettings;
  }

  /** Returns the object with the settings used for calls to getService. */
  public UnaryCallSettings<GetServiceRequest, ManagedService> getServiceSettings() {
    return getServiceSettings;
  }

  /** Returns the object with the settings used for calls to createService. */
  public UnaryCallSettings<CreateServiceRequest, Operation> createServiceSettings() {
    return createServiceSettings;
  }

  /** Returns the object with the settings used for calls to createService. */
  public OperationCallSettings<CreateServiceRequest, ManagedService, OperationMetadata>
      createServiceOperationSettings() {
    return createServiceOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteService. */
  public UnaryCallSettings<DeleteServiceRequest, Operation> deleteServiceSettings() {
    return deleteServiceSettings;
  }

  /** Returns the object with the settings used for calls to deleteService. */
  public OperationCallSettings<DeleteServiceRequest, Empty, OperationMetadata>
      deleteServiceOperationSettings() {
    return deleteServiceOperationSettings;
  }

  /** Returns the object with the settings used for calls to undeleteService. */
  public UnaryCallSettings<UndeleteServiceRequest, Operation> undeleteServiceSettings() {
    return undeleteServiceSettings;
  }

  /** Returns the object with the settings used for calls to undeleteService. */
  public OperationCallSettings<UndeleteServiceRequest, UndeleteServiceResponse, OperationMetadata>
      undeleteServiceOperationSettings() {
    return undeleteServiceOperationSettings;
  }

  /** Returns the object with the settings used for calls to listServiceConfigs. */
  public PagedCallSettings<
          ListServiceConfigsRequest, ListServiceConfigsResponse, ListServiceConfigsPagedResponse>
      listServiceConfigsSettings() {
    return listServiceConfigsSettings;
  }

  /** Returns the object with the settings used for calls to getServiceConfig. */
  public UnaryCallSettings<GetServiceConfigRequest, Service> getServiceConfigSettings() {
    return getServiceConfigSettings;
  }

  /** Returns the object with the settings used for calls to createServiceConfig. */
  public UnaryCallSettings<CreateServiceConfigRequest, Service> createServiceConfigSettings() {
    return createServiceConfigSettings;
  }

  /** Returns the object with the settings used for calls to submitConfigSource. */
  public UnaryCallSettings<SubmitConfigSourceRequest, Operation> submitConfigSourceSettings() {
    return submitConfigSourceSettings;
  }

  /** Returns the object with the settings used for calls to submitConfigSource. */
  public OperationCallSettings<
          SubmitConfigSourceRequest, SubmitConfigSourceResponse, OperationMetadata>
      submitConfigSourceOperationSettings() {
    return submitConfigSourceOperationSettings;
  }

  /** Returns the object with the settings used for calls to listServiceRollouts. */
  public PagedCallSettings<
          ListServiceRolloutsRequest, ListServiceRolloutsResponse, ListServiceRolloutsPagedResponse>
      listServiceRolloutsSettings() {
    return listServiceRolloutsSettings;
  }

  /** Returns the object with the settings used for calls to getServiceRollout. */
  public UnaryCallSettings<GetServiceRolloutRequest, Rollout> getServiceRolloutSettings() {
    return getServiceRolloutSettings;
  }

  /** Returns the object with the settings used for calls to createServiceRollout. */
  public UnaryCallSettings<CreateServiceRolloutRequest, Operation> createServiceRolloutSettings() {
    return createServiceRolloutSettings;
  }

  /** Returns the object with the settings used for calls to createServiceRollout. */
  public OperationCallSettings<CreateServiceRolloutRequest, Rollout, OperationMetadata>
      createServiceRolloutOperationSettings() {
    return createServiceRolloutOperationSettings;
  }

  /** Returns the object with the settings used for calls to generateConfigReport. */
  public UnaryCallSettings<GenerateConfigReportRequest, GenerateConfigReportResponse>
      generateConfigReportSettings() {
    return generateConfigReportSettings;
  }

  /**
   * Returns the object with the settings used for calls to enableService.
   *
   * @deprecated This method is deprecated and will be removed in the next major version update.
   */
  @Deprecated
  public UnaryCallSettings<EnableServiceRequest, Operation> enableServiceSettings() {
    return enableServiceSettings;
  }

  /** Returns the object with the settings used for calls to enableService. */
  public OperationCallSettings<EnableServiceRequest, EnableServiceResponse, OperationMetadata>
      enableServiceOperationSettings() {
    return enableServiceOperationSettings;
  }

  /**
   * Returns the object with the settings used for calls to disableService.
   *
   * @deprecated This method is deprecated and will be removed in the next major version update.
   */
  @Deprecated
  public UnaryCallSettings<DisableServiceRequest, Operation> disableServiceSettings() {
    return disableServiceSettings;
  }

  /** Returns the object with the settings used for calls to disableService. */
  public OperationCallSettings<DisableServiceRequest, DisableServiceResponse, OperationMetadata>
      disableServiceOperationSettings() {
    return disableServiceOperationSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ServiceManagerStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcServiceManagerStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "servicemanagement.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(ServiceManagerStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected ServiceManagerStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listServicesSettings = settingsBuilder.listServicesSettings().build();
    getServiceSettings = settingsBuilder.getServiceSettings().build();
    createServiceSettings = settingsBuilder.createServiceSettings().build();
    createServiceOperationSettings = settingsBuilder.createServiceOperationSettings().build();
    deleteServiceSettings = settingsBuilder.deleteServiceSettings().build();
    deleteServiceOperationSettings = settingsBuilder.deleteServiceOperationSettings().build();
    undeleteServiceSettings = settingsBuilder.undeleteServiceSettings().build();
    undeleteServiceOperationSettings = settingsBuilder.undeleteServiceOperationSettings().build();
    listServiceConfigsSettings = settingsBuilder.listServiceConfigsSettings().build();
    getServiceConfigSettings = settingsBuilder.getServiceConfigSettings().build();
    createServiceConfigSettings = settingsBuilder.createServiceConfigSettings().build();
    submitConfigSourceSettings = settingsBuilder.submitConfigSourceSettings().build();
    submitConfigSourceOperationSettings =
        settingsBuilder.submitConfigSourceOperationSettings().build();
    listServiceRolloutsSettings = settingsBuilder.listServiceRolloutsSettings().build();
    getServiceRolloutSettings = settingsBuilder.getServiceRolloutSettings().build();
    createServiceRolloutSettings = settingsBuilder.createServiceRolloutSettings().build();
    createServiceRolloutOperationSettings =
        settingsBuilder.createServiceRolloutOperationSettings().build();
    generateConfigReportSettings = settingsBuilder.generateConfigReportSettings().build();
    enableServiceSettings = settingsBuilder.enableServiceSettings().build();
    enableServiceOperationSettings = settingsBuilder.enableServiceOperationSettings().build();
    disableServiceSettings = settingsBuilder.disableServiceSettings().build();
    disableServiceOperationSettings = settingsBuilder.disableServiceOperationSettings().build();
  }

  /** Builder for ServiceManagerStubSettings. */
  public static class Builder extends StubSettings.Builder<ServiceManagerStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
        listServicesSettings;
    private final UnaryCallSettings.Builder<GetServiceRequest, ManagedService> getServiceSettings;
    private final UnaryCallSettings.Builder<CreateServiceRequest, Operation> createServiceSettings;
    private final OperationCallSettings.Builder<
            CreateServiceRequest, ManagedService, OperationMetadata>
        createServiceOperationSettings;
    private final UnaryCallSettings.Builder<DeleteServiceRequest, Operation> deleteServiceSettings;
    private final OperationCallSettings.Builder<DeleteServiceRequest, Empty, OperationMetadata>
        deleteServiceOperationSettings;
    private final UnaryCallSettings.Builder<UndeleteServiceRequest, Operation>
        undeleteServiceSettings;
    private final OperationCallSettings.Builder<
            UndeleteServiceRequest, UndeleteServiceResponse, OperationMetadata>
        undeleteServiceOperationSettings;
    private final PagedCallSettings.Builder<
            ListServiceConfigsRequest, ListServiceConfigsResponse, ListServiceConfigsPagedResponse>
        listServiceConfigsSettings;
    private final UnaryCallSettings.Builder<GetServiceConfigRequest, Service>
        getServiceConfigSettings;
    private final UnaryCallSettings.Builder<CreateServiceConfigRequest, Service>
        createServiceConfigSettings;
    private final UnaryCallSettings.Builder<SubmitConfigSourceRequest, Operation>
        submitConfigSourceSettings;
    private final OperationCallSettings.Builder<
            SubmitConfigSourceRequest, SubmitConfigSourceResponse, OperationMetadata>
        submitConfigSourceOperationSettings;
    private final PagedCallSettings.Builder<
            ListServiceRolloutsRequest,
            ListServiceRolloutsResponse,
            ListServiceRolloutsPagedResponse>
        listServiceRolloutsSettings;
    private final UnaryCallSettings.Builder<GetServiceRolloutRequest, Rollout>
        getServiceRolloutSettings;
    private final UnaryCallSettings.Builder<CreateServiceRolloutRequest, Operation>
        createServiceRolloutSettings;
    private final OperationCallSettings.Builder<
            CreateServiceRolloutRequest, Rollout, OperationMetadata>
        createServiceRolloutOperationSettings;
    private final UnaryCallSettings.Builder<
            GenerateConfigReportRequest, GenerateConfigReportResponse>
        generateConfigReportSettings;
    private final UnaryCallSettings.Builder<EnableServiceRequest, Operation> enableServiceSettings;
    private final OperationCallSettings.Builder<
            EnableServiceRequest, EnableServiceResponse, OperationMetadata>
        enableServiceOperationSettings;
    private final UnaryCallSettings.Builder<DisableServiceRequest, Operation>
        disableServiceSettings;
    private final OperationCallSettings.Builder<
            DisableServiceRequest, DisableServiceResponse, OperationMetadata>
        disableServiceOperationSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_0_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(10000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(10000L))
              .setTotalTimeout(Duration.ofMillis(10000L))
              .build();
      definitions.put("no_retry_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      listServicesSettings = PagedCallSettings.newBuilder(LIST_SERVICES_PAGE_STR_FACT);
      getServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createServiceOperationSettings = OperationCallSettings.newBuilder();
      deleteServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteServiceOperationSettings = OperationCallSettings.newBuilder();
      undeleteServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      undeleteServiceOperationSettings = OperationCallSettings.newBuilder();
      listServiceConfigsSettings = PagedCallSettings.newBuilder(LIST_SERVICE_CONFIGS_PAGE_STR_FACT);
      getServiceConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createServiceConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      submitConfigSourceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      submitConfigSourceOperationSettings = OperationCallSettings.newBuilder();
      listServiceRolloutsSettings =
          PagedCallSettings.newBuilder(LIST_SERVICE_ROLLOUTS_PAGE_STR_FACT);
      getServiceRolloutSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createServiceRolloutSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createServiceRolloutOperationSettings = OperationCallSettings.newBuilder();
      generateConfigReportSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      enableServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      enableServiceOperationSettings = OperationCallSettings.newBuilder();
      disableServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      disableServiceOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listServicesSettings,
              getServiceSettings,
              createServiceSettings,
              deleteServiceSettings,
              undeleteServiceSettings,
              listServiceConfigsSettings,
              getServiceConfigSettings,
              createServiceConfigSettings,
              submitConfigSourceSettings,
              listServiceRolloutsSettings,
              getServiceRolloutSettings,
              createServiceRolloutSettings,
              generateConfigReportSettings,
              enableServiceSettings,
              disableServiceSettings);
      initDefaults(this);
    }

    protected Builder(ServiceManagerStubSettings settings) {
      super(settings);

      listServicesSettings = settings.listServicesSettings.toBuilder();
      getServiceSettings = settings.getServiceSettings.toBuilder();
      createServiceSettings = settings.createServiceSettings.toBuilder();
      createServiceOperationSettings = settings.createServiceOperationSettings.toBuilder();
      deleteServiceSettings = settings.deleteServiceSettings.toBuilder();
      deleteServiceOperationSettings = settings.deleteServiceOperationSettings.toBuilder();
      undeleteServiceSettings = settings.undeleteServiceSettings.toBuilder();
      undeleteServiceOperationSettings = settings.undeleteServiceOperationSettings.toBuilder();
      listServiceConfigsSettings = settings.listServiceConfigsSettings.toBuilder();
      getServiceConfigSettings = settings.getServiceConfigSettings.toBuilder();
      createServiceConfigSettings = settings.createServiceConfigSettings.toBuilder();
      submitConfigSourceSettings = settings.submitConfigSourceSettings.toBuilder();
      submitConfigSourceOperationSettings =
          settings.submitConfigSourceOperationSettings.toBuilder();
      listServiceRolloutsSettings = settings.listServiceRolloutsSettings.toBuilder();
      getServiceRolloutSettings = settings.getServiceRolloutSettings.toBuilder();
      createServiceRolloutSettings = settings.createServiceRolloutSettings.toBuilder();
      createServiceRolloutOperationSettings =
          settings.createServiceRolloutOperationSettings.toBuilder();
      generateConfigReportSettings = settings.generateConfigReportSettings.toBuilder();
      enableServiceSettings = settings.enableServiceSettings.toBuilder();
      enableServiceOperationSettings = settings.enableServiceOperationSettings.toBuilder();
      disableServiceSettings = settings.disableServiceSettings.toBuilder();
      disableServiceOperationSettings = settings.disableServiceOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listServicesSettings,
              getServiceSettings,
              createServiceSettings,
              deleteServiceSettings,
              undeleteServiceSettings,
              listServiceConfigsSettings,
              getServiceConfigSettings,
              createServiceConfigSettings,
              submitConfigSourceSettings,
              listServiceRolloutsSettings,
              getServiceRolloutSettings,
              createServiceRolloutSettings,
              generateConfigReportSettings,
              enableServiceSettings,
              disableServiceSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .listServicesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .getServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .createServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .deleteServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .undeleteServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .listServiceConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .getServiceConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .createServiceConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .submitConfigSourceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .listServiceRolloutsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .getServiceRolloutSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .createServiceRolloutSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .generateConfigReportSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .enableServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .disableServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .createServiceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateServiceRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(ManagedService.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .deleteServiceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteServiceRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .undeleteServiceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<UndeleteServiceRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(UndeleteServiceResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .submitConfigSourceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SubmitConfigSourceRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  SubmitConfigSourceResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .createServiceRolloutOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateServiceRolloutRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Rollout.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .enableServiceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<EnableServiceRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(EnableServiceResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .disableServiceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DisableServiceRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(DisableServiceResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to listServices. */
    public PagedCallSettings.Builder<
            ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
        listServicesSettings() {
      return listServicesSettings;
    }

    /** Returns the builder for the settings used for calls to getService. */
    public UnaryCallSettings.Builder<GetServiceRequest, ManagedService> getServiceSettings() {
      return getServiceSettings;
    }

    /** Returns the builder for the settings used for calls to createService. */
    public UnaryCallSettings.Builder<CreateServiceRequest, Operation> createServiceSettings() {
      return createServiceSettings;
    }

    /** Returns the builder for the settings used for calls to createService. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<CreateServiceRequest, ManagedService, OperationMetadata>
        createServiceOperationSettings() {
      return createServiceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteService. */
    public UnaryCallSettings.Builder<DeleteServiceRequest, Operation> deleteServiceSettings() {
      return deleteServiceSettings;
    }

    /** Returns the builder for the settings used for calls to deleteService. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteServiceRequest, Empty, OperationMetadata>
        deleteServiceOperationSettings() {
      return deleteServiceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to undeleteService. */
    public UnaryCallSettings.Builder<UndeleteServiceRequest, Operation> undeleteServiceSettings() {
      return undeleteServiceSettings;
    }

    /** Returns the builder for the settings used for calls to undeleteService. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            UndeleteServiceRequest, UndeleteServiceResponse, OperationMetadata>
        undeleteServiceOperationSettings() {
      return undeleteServiceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listServiceConfigs. */
    public PagedCallSettings.Builder<
            ListServiceConfigsRequest, ListServiceConfigsResponse, ListServiceConfigsPagedResponse>
        listServiceConfigsSettings() {
      return listServiceConfigsSettings;
    }

    /** Returns the builder for the settings used for calls to getServiceConfig. */
    public UnaryCallSettings.Builder<GetServiceConfigRequest, Service> getServiceConfigSettings() {
      return getServiceConfigSettings;
    }

    /** Returns the builder for the settings used for calls to createServiceConfig. */
    public UnaryCallSettings.Builder<CreateServiceConfigRequest, Service>
        createServiceConfigSettings() {
      return createServiceConfigSettings;
    }

    /** Returns the builder for the settings used for calls to submitConfigSource. */
    public UnaryCallSettings.Builder<SubmitConfigSourceRequest, Operation>
        submitConfigSourceSettings() {
      return submitConfigSourceSettings;
    }

    /** Returns the builder for the settings used for calls to submitConfigSource. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SubmitConfigSourceRequest, SubmitConfigSourceResponse, OperationMetadata>
        submitConfigSourceOperationSettings() {
      return submitConfigSourceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listServiceRollouts. */
    public PagedCallSettings.Builder<
            ListServiceRolloutsRequest,
            ListServiceRolloutsResponse,
            ListServiceRolloutsPagedResponse>
        listServiceRolloutsSettings() {
      return listServiceRolloutsSettings;
    }

    /** Returns the builder for the settings used for calls to getServiceRollout. */
    public UnaryCallSettings.Builder<GetServiceRolloutRequest, Rollout>
        getServiceRolloutSettings() {
      return getServiceRolloutSettings;
    }

    /** Returns the builder for the settings used for calls to createServiceRollout. */
    public UnaryCallSettings.Builder<CreateServiceRolloutRequest, Operation>
        createServiceRolloutSettings() {
      return createServiceRolloutSettings;
    }

    /** Returns the builder for the settings used for calls to createServiceRollout. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<CreateServiceRolloutRequest, Rollout, OperationMetadata>
        createServiceRolloutOperationSettings() {
      return createServiceRolloutOperationSettings;
    }

    /** Returns the builder for the settings used for calls to generateConfigReport. */
    public UnaryCallSettings.Builder<GenerateConfigReportRequest, GenerateConfigReportResponse>
        generateConfigReportSettings() {
      return generateConfigReportSettings;
    }

    /**
     * Returns the builder for the settings used for calls to enableService.
     *
     * @deprecated This method is deprecated and will be removed in the next major version update.
     */
    @Deprecated
    public UnaryCallSettings.Builder<EnableServiceRequest, Operation> enableServiceSettings() {
      return enableServiceSettings;
    }

    /** Returns the builder for the settings used for calls to enableService. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            EnableServiceRequest, EnableServiceResponse, OperationMetadata>
        enableServiceOperationSettings() {
      return enableServiceOperationSettings;
    }

    /**
     * Returns the builder for the settings used for calls to disableService.
     *
     * @deprecated This method is deprecated and will be removed in the next major version update.
     */
    @Deprecated
    public UnaryCallSettings.Builder<DisableServiceRequest, Operation> disableServiceSettings() {
      return disableServiceSettings;
    }

    /** Returns the builder for the settings used for calls to disableService. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DisableServiceRequest, DisableServiceResponse, OperationMetadata>
        disableServiceOperationSettings() {
      return disableServiceOperationSettings;
    }

    @Override
    public ServiceManagerStubSettings build() throws IOException {
      return new ServiceManagerStubSettings(this);
    }
  }
}
