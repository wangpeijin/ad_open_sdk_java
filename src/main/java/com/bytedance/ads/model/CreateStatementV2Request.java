/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreateStatementV2Platform;
import com.bytedance.ads.model.CreateStatementV2TemplateType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bytedance.ads.JSON;

/**
 * CreateStatementV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class CreateStatementV2Request {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_AGENT_IDS = "agent_ids";
  @SerializedName(SERIALIZED_NAME_AGENT_IDS)
  private List<Long> agentIds = null;

  public static final String SERIALIZED_NAME_CONTRACT_SERIAL = "contract_serial";
  @SerializedName(SERIALIZED_NAME_CONTRACT_SERIAL)
  private String contractSerial = null;

  public static final String SERIALIZED_NAME_FILE_ID = "file_id";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private Long fileId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private CreateStatementV2Platform platform = null;

  public static final String SERIALIZED_NAME_PROJECT_SERIAL_LIST = "project_serial_list";
  @SerializedName(SERIALIZED_NAME_PROJECT_SERIAL_LIST)
  private List<String> projectSerialList = null;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId = null;

  public static final String SERIALIZED_NAME_TEMPLATE_TYPE = "template_type";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TYPE)
  private CreateStatementV2TemplateType templateType = null;

  public CreateStatementV2Request() {
  }

  public CreateStatementV2Request accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 若传入，则校验项目账户ID是否一致
   * @return accountId
  **/
  @javax.annotation.Nullable
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public CreateStatementV2Request agentIds(List<Long> agentIds) {
    
    this.agentIds = agentIds;
    return this;
  }

  public CreateStatementV2Request addAgentIdsItem(Long agentIdsItem) {
    if (this.agentIds == null) {
      this.agentIds = new ArrayList<>();
    }
    this.agentIds.add(agentIdsItem);
    return this;
  }

   /**
   * 代理商账户ID列表
   * @return agentIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getAgentIds() {
    return agentIds;
  }


  public void setAgentIds(List<Long> agentIds) {
    this.agentIds = agentIds;
  }


  public CreateStatementV2Request contractSerial(String contractSerial) {
    
    this.contractSerial = contractSerial;
    return this;
  }

   /**
   * 合同编号
   * @return contractSerial
  **/
  @javax.annotation.Nonnull
  public String getContractSerial() {
    return contractSerial;
  }


  public void setContractSerial(String contractSerial) {
    this.contractSerial = contractSerial;
  }


  public CreateStatementV2Request fileId(Long fileId) {
    
    this.fileId = fileId;
    return this;
  }

   /**
   * 文件ID，当结算单模版类型为非标，则必须传入文件
   * @return fileId
  **/
  @javax.annotation.Nullable
  public Long getFileId() {
    return fileId;
  }


  public void setFileId(Long fileId) {
    this.fileId = fileId;
  }


  public CreateStatementV2Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 结算单名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateStatementV2Request platform(CreateStatementV2Platform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nonnull
  public CreateStatementV2Platform getPlatform() {
    return platform;
  }


  public void setPlatform(CreateStatementV2Platform platform) {
    this.platform = platform;
  }


  public CreateStatementV2Request projectSerialList(List<String> projectSerialList) {
    
    this.projectSerialList = projectSerialList;
    return this;
  }

  public CreateStatementV2Request addProjectSerialListItem(String projectSerialListItem) {
    if (this.projectSerialList == null) {
      this.projectSerialList = new ArrayList<>();
    }
    this.projectSerialList.add(projectSerialListItem);
    return this;
  }

   /**
   * 项目编号列表 200以内
   * @return projectSerialList
  **/
  @javax.annotation.Nonnull
  public List<String> getProjectSerialList() {
    return projectSerialList;
  }


  public void setProjectSerialList(List<String> projectSerialList) {
    this.projectSerialList = projectSerialList;
  }


  public CreateStatementV2Request requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * 请求ID，要求唯一，幂等用，必传
   * @return requestId
  **/
  @javax.annotation.Nonnull
  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public CreateStatementV2Request templateType(CreateStatementV2TemplateType templateType) {
    
    this.templateType = templateType;
    return this;
  }

   /**
   * Get templateType
   * @return templateType
  **/
  @javax.annotation.Nonnull
  public CreateStatementV2TemplateType getTemplateType() {
    return templateType;
  }


  public void setTemplateType(CreateStatementV2TemplateType templateType) {
    this.templateType = templateType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateStatementV2Request createStatementV2Request = (CreateStatementV2Request) o;
    return Objects.equals(this.accountId, createStatementV2Request.accountId) &&
        Objects.equals(this.agentIds, createStatementV2Request.agentIds) &&
        Objects.equals(this.contractSerial, createStatementV2Request.contractSerial) &&
        Objects.equals(this.fileId, createStatementV2Request.fileId) &&
        Objects.equals(this.name, createStatementV2Request.name) &&
        Objects.equals(this.platform, createStatementV2Request.platform) &&
        Objects.equals(this.projectSerialList, createStatementV2Request.projectSerialList) &&
        Objects.equals(this.requestId, createStatementV2Request.requestId) &&
        Objects.equals(this.templateType, createStatementV2Request.templateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agentIds, contractSerial, fileId, name, platform, projectSerialList, requestId, templateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateStatementV2Request {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
    sb.append("    contractSerial: ").append(toIndentedString(contractSerial)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    projectSerialList: ").append(toIndentedString(projectSerialList)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("account_id");
    openapiFields.add("agent_ids");
    openapiFields.add("contract_serial");
    openapiFields.add("file_id");
    openapiFields.add("name");
    openapiFields.add("platform");
    openapiFields.add("project_serial_list");
    openapiFields.add("request_id");
    openapiFields.add("template_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agent_ids");
    openapiRequiredFields.add("contract_serial");
    openapiRequiredFields.add("platform");
    openapiRequiredFields.add("project_serial_list");
    openapiRequiredFields.add("request_id");
    openapiRequiredFields.add("template_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateStatementV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateStatementV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateStatementV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateStatementV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateStatementV2Request>() {
           @Override
           public void write(JsonWriter out, CreateStatementV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateStatementV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateStatementV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateStatementV2Request
  * @throws IOException if the JSON string is invalid with respect to CreateStatementV2Request
  */
  public static CreateStatementV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateStatementV2Request.class);
  }

 /**
  * Convert an instance of CreateStatementV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

