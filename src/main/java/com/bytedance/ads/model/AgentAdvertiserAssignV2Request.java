/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AgentAdvertiserAssignV2Role;
import com.bytedance.ads.model.AgentAdvertiserAssignV2Type;
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
 * AgentAdvertiserAssignV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class AgentAdvertiserAssignV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiser_ids";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<Long> advertiserIds = null;

  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private Long employeeId = null;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private AgentAdvertiserAssignV2Role role = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AgentAdvertiserAssignV2Type type = null;

  public AgentAdvertiserAssignV2Request() {
  }

  public AgentAdvertiserAssignV2Request advertiserIds(List<Long> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public AgentAdvertiserAssignV2Request addAdvertiserIdsItem(Long advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * 广告主账户ID，最多支持100个
   * @return advertiserIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public AgentAdvertiserAssignV2Request agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 待分配广告主账户的所属代理商账户ID
   * @return agentId
  **/
  @javax.annotation.Nonnull
  public Long getAgentId() {
    return agentId;
  }


  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }


  public AgentAdvertiserAssignV2Request employeeId(Long employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * 待分配的员工id
   * @return employeeId
  **/
  @javax.annotation.Nonnull
  public Long getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(Long employeeId) {
    this.employeeId = employeeId;
  }


  public AgentAdvertiserAssignV2Request role(AgentAdvertiserAssignV2Role role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nonnull
  public AgentAdvertiserAssignV2Role getRole() {
    return role;
  }


  public void setRole(AgentAdvertiserAssignV2Role role) {
    this.role = role;
  }


  public AgentAdvertiserAssignV2Request type(AgentAdvertiserAssignV2Type type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public AgentAdvertiserAssignV2Type getType() {
    return type;
  }


  public void setType(AgentAdvertiserAssignV2Type type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAdvertiserAssignV2Request agentAdvertiserAssignV2Request = (AgentAdvertiserAssignV2Request) o;
    return Objects.equals(this.advertiserIds, agentAdvertiserAssignV2Request.advertiserIds) &&
        Objects.equals(this.agentId, agentAdvertiserAssignV2Request.agentId) &&
        Objects.equals(this.employeeId, agentAdvertiserAssignV2Request.employeeId) &&
        Objects.equals(this.role, agentAdvertiserAssignV2Request.role) &&
        Objects.equals(this.type, agentAdvertiserAssignV2Request.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, agentId, employeeId, role, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAdvertiserAssignV2Request {\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("advertiser_ids");
    openapiFields.add("agent_id");
    openapiFields.add("employee_id");
    openapiFields.add("role");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_ids");
    openapiRequiredFields.add("agent_id");
    openapiRequiredFields.add("employee_id");
    openapiRequiredFields.add("role");
    openapiRequiredFields.add("type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentAdvertiserAssignV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentAdvertiserAssignV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentAdvertiserAssignV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentAdvertiserAssignV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentAdvertiserAssignV2Request>() {
           @Override
           public void write(JsonWriter out, AgentAdvertiserAssignV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentAdvertiserAssignV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentAdvertiserAssignV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentAdvertiserAssignV2Request
  * @throws IOException if the JSON string is invalid with respect to AgentAdvertiserAssignV2Request
  */
  public static AgentAdvertiserAssignV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentAdvertiserAssignV2Request.class);
  }

 /**
  * Convert an instance of AgentAdvertiserAssignV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

