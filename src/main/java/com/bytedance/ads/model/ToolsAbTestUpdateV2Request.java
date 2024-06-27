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
 * ToolsAbTestUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class ToolsAbTestUpdateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_TEST_END_TIME = "test_end_time";
  @SerializedName(SERIALIZED_NAME_TEST_END_TIME)
  private String testEndTime = null;

  public static final String SERIALIZED_NAME_TEST_ID = "test_id";
  @SerializedName(SERIALIZED_NAME_TEST_ID)
  private Long testId = null;

  public static final String SERIALIZED_NAME_TEST_NAME = "test_name";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName = null;

  public static final String SERIALIZED_NAME_TEST_START_TIME = "test_start_time";
  @SerializedName(SERIALIZED_NAME_TEST_START_TIME)
  private String testStartTime = null;

  public ToolsAbTestUpdateV2Request() {
  }

  public ToolsAbTestUpdateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsAbTestUpdateV2Request testEndTime(String testEndTime) {
    
    this.testEndTime = testEndTime;
    return this;
  }

   /**
   * 实验结束时间，格式为：\&quot;2020-12-25 07:12:08\&quot;，开始与结束时间跨度至少选择1天，最多选择30天。
   * @return testEndTime
  **/
  @javax.annotation.Nullable
  public String getTestEndTime() {
    return testEndTime;
  }


  public void setTestEndTime(String testEndTime) {
    this.testEndTime = testEndTime;
  }


  public ToolsAbTestUpdateV2Request testId(Long testId) {
    
    this.testId = testId;
    return this;
  }

   /**
   * 实验ID
   * @return testId
  **/
  @javax.annotation.Nonnull
  public Long getTestId() {
    return testId;
  }


  public void setTestId(Long testId) {
    this.testId = testId;
  }


  public ToolsAbTestUpdateV2Request testName(String testName) {
    
    this.testName = testName;
    return this;
  }

   /**
   * 实验名称，长度1-100字符
   * @return testName
  **/
  @javax.annotation.Nullable
  public String getTestName() {
    return testName;
  }


  public void setTestName(String testName) {
    this.testName = testName;
  }


  public ToolsAbTestUpdateV2Request testStartTime(String testStartTime) {
    
    this.testStartTime = testStartTime;
    return this;
  }

   /**
   * 实验开始时间，格式为：\&quot;2020-12-25 07:12:08\&quot;，开始时间不能早于当前时间
   * @return testStartTime
  **/
  @javax.annotation.Nullable
  public String getTestStartTime() {
    return testStartTime;
  }


  public void setTestStartTime(String testStartTime) {
    this.testStartTime = testStartTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAbTestUpdateV2Request toolsAbTestUpdateV2Request = (ToolsAbTestUpdateV2Request) o;
    return Objects.equals(this.advertiserId, toolsAbTestUpdateV2Request.advertiserId) &&
        Objects.equals(this.testEndTime, toolsAbTestUpdateV2Request.testEndTime) &&
        Objects.equals(this.testId, toolsAbTestUpdateV2Request.testId) &&
        Objects.equals(this.testName, toolsAbTestUpdateV2Request.testName) &&
        Objects.equals(this.testStartTime, toolsAbTestUpdateV2Request.testStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, testEndTime, testId, testName, testStartTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAbTestUpdateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    testEndTime: ").append(toIndentedString(testEndTime)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    testStartTime: ").append(toIndentedString(testStartTime)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("test_end_time");
    openapiFields.add("test_id");
    openapiFields.add("test_name");
    openapiFields.add("test_start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("test_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAbTestUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAbTestUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAbTestUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAbTestUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAbTestUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsAbTestUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAbTestUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAbTestUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAbTestUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsAbTestUpdateV2Request
  */
  public static ToolsAbTestUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAbTestUpdateV2Request.class);
  }

 /**
  * Convert an instance of ToolsAbTestUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

