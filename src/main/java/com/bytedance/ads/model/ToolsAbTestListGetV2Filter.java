/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAbTestListGetV2FilterConclusions;
import com.bytedance.ads.model.ToolsAbTestListGetV2FilterStatus;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class ToolsAbTestListGetV2Filter {
  public static final String SERIALIZED_NAME_CONCLUSIONS = "conclusions";
  @SerializedName(SERIALIZED_NAME_CONCLUSIONS)
  private List<ToolsAbTestListGetV2FilterConclusions> conclusions = null;

  public static final String SERIALIZED_NAME_CREATE_TIME_AFTER = "create_time_after";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME_AFTER)
  private String createTimeAfter = null;

  public static final String SERIALIZED_NAME_CREATE_TIME_BEFORE = "create_time_before";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME_BEFORE)
  private String createTimeBefore = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private List<ToolsAbTestListGetV2FilterStatus> status = null;

  public static final String SERIALIZED_NAME_TEST_IDS = "test_ids";
  @SerializedName(SERIALIZED_NAME_TEST_IDS)
  private List<Long> testIds = null;

  public static final String SERIALIZED_NAME_TEST_NAME = "test_name";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName = null;

  public static final String SERIALIZED_NAME_TEST_TIME_AFTER = "test_time_after";
  @SerializedName(SERIALIZED_NAME_TEST_TIME_AFTER)
  private String testTimeAfter = null;

  public static final String SERIALIZED_NAME_TEST_TIME_BEFORE = "test_time_before";
  @SerializedName(SERIALIZED_NAME_TEST_TIME_BEFORE)
  private String testTimeBefore = null;

  public ToolsAbTestListGetV2Filter() {
  }

  public ToolsAbTestListGetV2Filter conclusions(List<ToolsAbTestListGetV2FilterConclusions> conclusions) {
    
    this.conclusions = conclusions;
    return this;
  }

  public ToolsAbTestListGetV2Filter addConclusionsItem(ToolsAbTestListGetV2FilterConclusions conclusionsItem) {
    if (this.conclusions == null) {
      this.conclusions = new ArrayList<>();
    }
    this.conclusions.add(conclusionsItem);
    return this;
  }

   /**
   * 根据实验结论过滤，允许值：&#x60;\&quot;NOT_START\&quot;&#x60;：未开始，&#x60;\&quot;OBVIOUS\&quot;&#x60;：有明显结论，&#x60;\&quot;INSUFFICIENT\&quot;&#x60;：数据量不足；&#x60;\&quot;FAILED\&quot;&#x60;：不满足实验条件，&#x60;\&quot;TMP_OBVIOUS\&quot;&#x60;：有初步结论。
   * @return conclusions
  **/
  @javax.annotation.Nullable
  public List<ToolsAbTestListGetV2FilterConclusions> getConclusions() {
    return conclusions;
  }


  public void setConclusions(List<ToolsAbTestListGetV2FilterConclusions> conclusions) {
    this.conclusions = conclusions;
  }


  public ToolsAbTestListGetV2Filter createTimeAfter(String createTimeAfter) {
    
    this.createTimeAfter = createTimeAfter;
    return this;
  }

   /**
   * 返回创建时间在此之后的实验，格式：\&quot;2020-12-25 07:12:08\&quot;
   * @return createTimeAfter
  **/
  @javax.annotation.Nullable
  public String getCreateTimeAfter() {
    return createTimeAfter;
  }


  public void setCreateTimeAfter(String createTimeAfter) {
    this.createTimeAfter = createTimeAfter;
  }


  public ToolsAbTestListGetV2Filter createTimeBefore(String createTimeBefore) {
    
    this.createTimeBefore = createTimeBefore;
    return this;
  }

   /**
   * 返回创建时间在此之前的实验，格式：\&quot;2020-12-25 07:12:08\&quot;
   * @return createTimeBefore
  **/
  @javax.annotation.Nullable
  public String getCreateTimeBefore() {
    return createTimeBefore;
  }


  public void setCreateTimeBefore(String createTimeBefore) {
    this.createTimeBefore = createTimeBefore;
  }


  public ToolsAbTestListGetV2Filter status(List<ToolsAbTestListGetV2FilterStatus> status) {
    
    this.status = status;
    return this;
  }

  public ToolsAbTestListGetV2Filter addStatusItem(ToolsAbTestListGetV2FilterStatus statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * 根据实验状态过滤，允许值：&#x60;\&quot;CREATED\&quot;&#x60;：排期中，&#x60;\&quot;PROCESSING\&quot;&#x60;：进行中，&#x60;\&quot;FINISH\&quot;&#x60;：结束，&#x60;\&quot;FAILED\&quot;&#x60;：不满足实验条件。
   * @return status
  **/
  @javax.annotation.Nullable
  public List<ToolsAbTestListGetV2FilterStatus> getStatus() {
    return status;
  }


  public void setStatus(List<ToolsAbTestListGetV2FilterStatus> status) {
    this.status = status;
  }


  public ToolsAbTestListGetV2Filter testIds(List<Long> testIds) {
    
    this.testIds = testIds;
    return this;
  }

  public ToolsAbTestListGetV2Filter addTestIdsItem(Long testIdsItem) {
    if (this.testIds == null) {
      this.testIds = new ArrayList<>();
    }
    this.testIds.add(testIdsItem);
    return this;
  }

   /**
   * 根据实验ID列表过滤，列表长度1-100
   * @return testIds
  **/
  @javax.annotation.Nullable
  public List<Long> getTestIds() {
    return testIds;
  }


  public void setTestIds(List<Long> testIds) {
    this.testIds = testIds;
  }


  public ToolsAbTestListGetV2Filter testName(String testName) {
    
    this.testName = testName;
    return this;
  }

   /**
   * 根据实验名称过滤，支持模糊匹配，长度限制100字符，中文算2个字符。
   * @return testName
  **/
  @javax.annotation.Nullable
  public String getTestName() {
    return testName;
  }


  public void setTestName(String testName) {
    this.testName = testName;
  }


  public ToolsAbTestListGetV2Filter testTimeAfter(String testTimeAfter) {
    
    this.testTimeAfter = testTimeAfter;
    return this;
  }

   /**
   * 返回测试时间在此之后的实验，格式：\&quot;2020-12-25 07:12:08\&quot;
   * @return testTimeAfter
  **/
  @javax.annotation.Nullable
  public String getTestTimeAfter() {
    return testTimeAfter;
  }


  public void setTestTimeAfter(String testTimeAfter) {
    this.testTimeAfter = testTimeAfter;
  }


  public ToolsAbTestListGetV2Filter testTimeBefore(String testTimeBefore) {
    
    this.testTimeBefore = testTimeBefore;
    return this;
  }

   /**
   * 返回测试时间在此之前的实验，格式：\&quot;2020-12-25 07:12:08\&quot;
   * @return testTimeBefore
  **/
  @javax.annotation.Nullable
  public String getTestTimeBefore() {
    return testTimeBefore;
  }


  public void setTestTimeBefore(String testTimeBefore) {
    this.testTimeBefore = testTimeBefore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAbTestListGetV2Filter toolsAbTestListGetV2Filter = (ToolsAbTestListGetV2Filter) o;
    return Objects.equals(this.conclusions, toolsAbTestListGetV2Filter.conclusions) &&
        Objects.equals(this.createTimeAfter, toolsAbTestListGetV2Filter.createTimeAfter) &&
        Objects.equals(this.createTimeBefore, toolsAbTestListGetV2Filter.createTimeBefore) &&
        Objects.equals(this.status, toolsAbTestListGetV2Filter.status) &&
        Objects.equals(this.testIds, toolsAbTestListGetV2Filter.testIds) &&
        Objects.equals(this.testName, toolsAbTestListGetV2Filter.testName) &&
        Objects.equals(this.testTimeAfter, toolsAbTestListGetV2Filter.testTimeAfter) &&
        Objects.equals(this.testTimeBefore, toolsAbTestListGetV2Filter.testTimeBefore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conclusions, createTimeAfter, createTimeBefore, status, testIds, testName, testTimeAfter, testTimeBefore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAbTestListGetV2Filter {\n");
    sb.append("    conclusions: ").append(toIndentedString(conclusions)).append("\n");
    sb.append("    createTimeAfter: ").append(toIndentedString(createTimeAfter)).append("\n");
    sb.append("    createTimeBefore: ").append(toIndentedString(createTimeBefore)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    testIds: ").append(toIndentedString(testIds)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    testTimeAfter: ").append(toIndentedString(testTimeAfter)).append("\n");
    sb.append("    testTimeBefore: ").append(toIndentedString(testTimeBefore)).append("\n");
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
    openapiFields.add("conclusions");
    openapiFields.add("create_time_after");
    openapiFields.add("create_time_before");
    openapiFields.add("status");
    openapiFields.add("test_ids");
    openapiFields.add("test_name");
    openapiFields.add("test_time_after");
    openapiFields.add("test_time_before");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAbTestListGetV2Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAbTestListGetV2Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAbTestListGetV2Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAbTestListGetV2Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAbTestListGetV2Filter>() {
           @Override
           public void write(JsonWriter out, ToolsAbTestListGetV2Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAbTestListGetV2Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAbTestListGetV2Filter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAbTestListGetV2Filter
  * @throws IOException if the JSON string is invalid with respect to ToolsAbTestListGetV2Filter
  */
  public static ToolsAbTestListGetV2Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAbTestListGetV2Filter.class);
  }

 /**
  * Convert an instance of ToolsAbTestListGetV2Filter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

