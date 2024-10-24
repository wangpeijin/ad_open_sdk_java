/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AgentAdvertiserAssignV2ResponseDataResultsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class AgentAdvertiserAssignV2ResponseData {
  public static final String SERIALIZED_NAME_FAIL_NUM = "fail_num";
  @SerializedName(SERIALIZED_NAME_FAIL_NUM)
  private Long failNum = null;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<AgentAdvertiserAssignV2ResponseDataResultsInner> results = null;

  public static final String SERIALIZED_NAME_SUCCESS_NUM = "success_num";
  @SerializedName(SERIALIZED_NAME_SUCCESS_NUM)
  private Long successNum = null;

  public AgentAdvertiserAssignV2ResponseData() {
  }

  public AgentAdvertiserAssignV2ResponseData failNum(Long failNum) {
    
    this.failNum = failNum;
    return this;
  }

   /**
   * 分配失败账户数
   * @return failNum
  **/
  @javax.annotation.Nullable
  public Long getFailNum() {
    return failNum;
  }


  public void setFailNum(Long failNum) {
    this.failNum = failNum;
  }


  public AgentAdvertiserAssignV2ResponseData results(List<AgentAdvertiserAssignV2ResponseDataResultsInner> results) {
    
    this.results = results;
    return this;
  }

  public AgentAdvertiserAssignV2ResponseData addResultsItem(AgentAdvertiserAssignV2ResponseDataResultsInner resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * 分配结果
   * @return results
  **/
  @javax.annotation.Nullable
  public List<AgentAdvertiserAssignV2ResponseDataResultsInner> getResults() {
    return results;
  }


  public void setResults(List<AgentAdvertiserAssignV2ResponseDataResultsInner> results) {
    this.results = results;
  }


  public AgentAdvertiserAssignV2ResponseData successNum(Long successNum) {
    
    this.successNum = successNum;
    return this;
  }

   /**
   * 分配成功账户数
   * @return successNum
  **/
  @javax.annotation.Nullable
  public Long getSuccessNum() {
    return successNum;
  }


  public void setSuccessNum(Long successNum) {
    this.successNum = successNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAdvertiserAssignV2ResponseData agentAdvertiserAssignV2ResponseData = (AgentAdvertiserAssignV2ResponseData) o;
    return Objects.equals(this.failNum, agentAdvertiserAssignV2ResponseData.failNum) &&
        Objects.equals(this.results, agentAdvertiserAssignV2ResponseData.results) &&
        Objects.equals(this.successNum, agentAdvertiserAssignV2ResponseData.successNum);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failNum, results, successNum);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAdvertiserAssignV2ResponseData {\n");
    sb.append("    failNum: ").append(toIndentedString(failNum)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
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
    openapiFields.add("fail_num");
    openapiFields.add("results");
    openapiFields.add("success_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentAdvertiserAssignV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentAdvertiserAssignV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentAdvertiserAssignV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentAdvertiserAssignV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentAdvertiserAssignV2ResponseData>() {
           @Override
           public void write(JsonWriter out, AgentAdvertiserAssignV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentAdvertiserAssignV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentAdvertiserAssignV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentAdvertiserAssignV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to AgentAdvertiserAssignV2ResponseData
  */
  public static AgentAdvertiserAssignV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentAdvertiserAssignV2ResponseData.class);
  }

 /**
  * Convert an instance of AgentAdvertiserAssignV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

