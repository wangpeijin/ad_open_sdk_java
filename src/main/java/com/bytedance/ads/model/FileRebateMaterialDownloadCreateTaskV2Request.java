/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileRebateMaterialDownloadCreateTaskV2MaterialPolicyType;
import com.bytedance.ads.model.FileRebateMaterialDownloadCreateTaskV2RequestFiltering;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * FileRebateMaterialDownloadCreateTaskV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class FileRebateMaterialDownloadCreateTaskV2Request {
  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_FILTERING = "filtering";
  @SerializedName(SERIALIZED_NAME_FILTERING)
  private FileRebateMaterialDownloadCreateTaskV2RequestFiltering filtering = null;

  public static final String SERIALIZED_NAME_MATERIAL_POLICY_TYPE = "material_policy_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_POLICY_TYPE)
  private FileRebateMaterialDownloadCreateTaskV2MaterialPolicyType materialPolicyType = null;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private String period = null;

  public FileRebateMaterialDownloadCreateTaskV2Request() {
  }

  public FileRebateMaterialDownloadCreateTaskV2Request agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 代理商帐户Id
   * @return agentId
  **/
  @javax.annotation.Nonnull
  public Long getAgentId() {
    return agentId;
  }


  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }


  public FileRebateMaterialDownloadCreateTaskV2Request filtering(FileRebateMaterialDownloadCreateTaskV2RequestFiltering filtering) {
    
    this.filtering = filtering;
    return this;
  }

   /**
   * Get filtering
   * @return filtering
  **/
  @javax.annotation.Nullable
  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering getFiltering() {
    return filtering;
  }


  public void setFiltering(FileRebateMaterialDownloadCreateTaskV2RequestFiltering filtering) {
    this.filtering = filtering;
  }


  public FileRebateMaterialDownloadCreateTaskV2Request materialPolicyType(FileRebateMaterialDownloadCreateTaskV2MaterialPolicyType materialPolicyType) {
    
    this.materialPolicyType = materialPolicyType;
    return this;
  }

   /**
   * Get materialPolicyType
   * @return materialPolicyType
  **/
  @javax.annotation.Nonnull
  public FileRebateMaterialDownloadCreateTaskV2MaterialPolicyType getMaterialPolicyType() {
    return materialPolicyType;
  }


  public void setMaterialPolicyType(FileRebateMaterialDownloadCreateTaskV2MaterialPolicyType materialPolicyType) {
    this.materialPolicyType = materialPolicyType;
  }


  public FileRebateMaterialDownloadCreateTaskV2Request period(String period) {
    
    this.period = period;
    return this;
  }

   /**
   * 业绩消耗年月 年月 格式：yyyy-MM
   * @return period
  **/
  @javax.annotation.Nonnull
  public String getPeriod() {
    return period;
  }


  public void setPeriod(String period) {
    this.period = period;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileRebateMaterialDownloadCreateTaskV2Request fileRebateMaterialDownloadCreateTaskV2Request = (FileRebateMaterialDownloadCreateTaskV2Request) o;
    return Objects.equals(this.agentId, fileRebateMaterialDownloadCreateTaskV2Request.agentId) &&
        Objects.equals(this.filtering, fileRebateMaterialDownloadCreateTaskV2Request.filtering) &&
        Objects.equals(this.materialPolicyType, fileRebateMaterialDownloadCreateTaskV2Request.materialPolicyType) &&
        Objects.equals(this.period, fileRebateMaterialDownloadCreateTaskV2Request.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, filtering, materialPolicyType, period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileRebateMaterialDownloadCreateTaskV2Request {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    filtering: ").append(toIndentedString(filtering)).append("\n");
    sb.append("    materialPolicyType: ").append(toIndentedString(materialPolicyType)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
    openapiFields.add("agent_id");
    openapiFields.add("filtering");
    openapiFields.add("material_policy_type");
    openapiFields.add("period");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agent_id");
    openapiRequiredFields.add("material_policy_type");
    openapiRequiredFields.add("period");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileRebateMaterialDownloadCreateTaskV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileRebateMaterialDownloadCreateTaskV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileRebateMaterialDownloadCreateTaskV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileRebateMaterialDownloadCreateTaskV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<FileRebateMaterialDownloadCreateTaskV2Request>() {
           @Override
           public void write(JsonWriter out, FileRebateMaterialDownloadCreateTaskV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileRebateMaterialDownloadCreateTaskV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileRebateMaterialDownloadCreateTaskV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileRebateMaterialDownloadCreateTaskV2Request
  * @throws IOException if the JSON string is invalid with respect to FileRebateMaterialDownloadCreateTaskV2Request
  */
  public static FileRebateMaterialDownloadCreateTaskV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileRebateMaterialDownloadCreateTaskV2Request.class);
  }

 /**
  * Convert an instance of FileRebateMaterialDownloadCreateTaskV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
