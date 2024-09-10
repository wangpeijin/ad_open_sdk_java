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
import com.bytedance.ads.model.ToolsAbTestListGetV2DataTestListConclusion;
import com.bytedance.ads.model.ToolsAbTestListGetV2DataTestListStatus;
import com.bytedance.ads.model.ToolsAbTestListGetV2DataTestListTestType;
import com.bytedance.ads.model.ToolsAbTestListGetV2DataTestListTestVersion;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * ToolsAbTestListGetV2ResponseDataTestListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class ToolsAbTestListGetV2ResponseDataTestListInner {
  public static final String SERIALIZED_NAME_CONCLUSION = "conclusion";
  @SerializedName(SERIALIZED_NAME_CONCLUSION)
  private ToolsAbTestListGetV2DataTestListConclusion conclusion = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_REPORT_UPDATE_DATE = "report_update_date";
  @SerializedName(SERIALIZED_NAME_REPORT_UPDATE_DATE)
  private String reportUpdateDate = null;

  public static final String SERIALIZED_NAME_REPORT_UPDATE_TIME = "report_update_time";
  @SerializedName(SERIALIZED_NAME_REPORT_UPDATE_TIME)
  private String reportUpdateTime = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsAbTestListGetV2DataTestListStatus status = null;

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

  public static final String SERIALIZED_NAME_TEST_TYPE = "test_type";
  @SerializedName(SERIALIZED_NAME_TEST_TYPE)
  private ToolsAbTestListGetV2DataTestListTestType testType = null;

  public static final String SERIALIZED_NAME_TEST_VERSION = "test_version";
  @SerializedName(SERIALIZED_NAME_TEST_VERSION)
  private ToolsAbTestListGetV2DataTestListTestVersion testVersion = null;

  public ToolsAbTestListGetV2ResponseDataTestListInner() {
  }

  public ToolsAbTestListGetV2ResponseDataTestListInner conclusion(ToolsAbTestListGetV2DataTestListConclusion conclusion) {
    
    this.conclusion = conclusion;
    return this;
  }

   /**
   * Get conclusion
   * @return conclusion
  **/
  @javax.annotation.Nullable
  public ToolsAbTestListGetV2DataTestListConclusion getConclusion() {
    return conclusion;
  }


  public void setConclusion(ToolsAbTestListGetV2DataTestListConclusion conclusion) {
    this.conclusion = conclusion;
  }


  public ToolsAbTestListGetV2ResponseDataTestListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 实验创建时间，格式：\&quot;2020-12-25 07:12:08\&quot;
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ToolsAbTestListGetV2ResponseDataTestListInner reportUpdateDate(String reportUpdateDate) {
    
    this.reportUpdateDate = reportUpdateDate;
    return this;
  }

   /**
   * 实验报告更新日期，格式：\&quot;2020-12-25 07:12:08\&quot;
   * @return reportUpdateDate
  **/
  @javax.annotation.Nullable
  public String getReportUpdateDate() {
    return reportUpdateDate;
  }


  public void setReportUpdateDate(String reportUpdateDate) {
    this.reportUpdateDate = reportUpdateDate;
  }


  public ToolsAbTestListGetV2ResponseDataTestListInner reportUpdateTime(String reportUpdateTime) {
    
    this.reportUpdateTime = reportUpdateTime;
    return this;
  }

   /**
   * 实验报告更新时间，格式：\&quot;2020-12-25 07:12:08\&quot;
   * @return reportUpdateTime
  **/
  @javax.annotation.Nullable
  public String getReportUpdateTime() {
    return reportUpdateTime;
  }


  public void setReportUpdateTime(String reportUpdateTime) {
    this.reportUpdateTime = reportUpdateTime;
  }


  public ToolsAbTestListGetV2ResponseDataTestListInner status(ToolsAbTestListGetV2DataTestListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsAbTestListGetV2DataTestListStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsAbTestListGetV2DataTestListStatus status) {
    this.status = status;
  }


  public ToolsAbTestListGetV2ResponseDataTestListInner testEndTime(String testEndTime) {
    
    this.testEndTime = testEndTime;
    return this;
  }

   /**
   * 实验结束时间
   * @return testEndTime
  **/
  @javax.annotation.Nullable
  public String getTestEndTime() {
    return testEndTime;
  }


  public void setTestEndTime(String testEndTime) {
    this.testEndTime = testEndTime;
  }


  public ToolsAbTestListGetV2ResponseDataTestListInner testId(Long testId) {
    
    this.testId = testId;
    return this;
  }

   /**
   * 实验ID
   * @return testId
  **/
  @javax.annotation.Nullable
  public Long getTestId() {
    return testId;
  }


  public void setTestId(Long testId) {
    this.testId = testId;
  }


  public ToolsAbTestListGetV2ResponseDataTestListInner testName(String testName) {
    
    this.testName = testName;
    return this;
  }

   /**
   * 实验名称
   * @return testName
  **/
  @javax.annotation.Nullable
  public String getTestName() {
    return testName;
  }


  public void setTestName(String testName) {
    this.testName = testName;
  }


  public ToolsAbTestListGetV2ResponseDataTestListInner testStartTime(String testStartTime) {
    
    this.testStartTime = testStartTime;
    return this;
  }

   /**
   * 实验开始时间
   * @return testStartTime
  **/
  @javax.annotation.Nullable
  public String getTestStartTime() {
    return testStartTime;
  }


  public void setTestStartTime(String testStartTime) {
    this.testStartTime = testStartTime;
  }


  public ToolsAbTestListGetV2ResponseDataTestListInner testType(ToolsAbTestListGetV2DataTestListTestType testType) {
    
    this.testType = testType;
    return this;
  }

   /**
   * Get testType
   * @return testType
  **/
  @javax.annotation.Nullable
  public ToolsAbTestListGetV2DataTestListTestType getTestType() {
    return testType;
  }


  public void setTestType(ToolsAbTestListGetV2DataTestListTestType testType) {
    this.testType = testType;
  }


  public ToolsAbTestListGetV2ResponseDataTestListInner testVersion(ToolsAbTestListGetV2DataTestListTestVersion testVersion) {
    
    this.testVersion = testVersion;
    return this;
  }

   /**
   * Get testVersion
   * @return testVersion
  **/
  @javax.annotation.Nullable
  public ToolsAbTestListGetV2DataTestListTestVersion getTestVersion() {
    return testVersion;
  }


  public void setTestVersion(ToolsAbTestListGetV2DataTestListTestVersion testVersion) {
    this.testVersion = testVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAbTestListGetV2ResponseDataTestListInner toolsAbTestListGetV2ResponseDataTestListInner = (ToolsAbTestListGetV2ResponseDataTestListInner) o;
    return Objects.equals(this.conclusion, toolsAbTestListGetV2ResponseDataTestListInner.conclusion) &&
        Objects.equals(this.createTime, toolsAbTestListGetV2ResponseDataTestListInner.createTime) &&
        Objects.equals(this.reportUpdateDate, toolsAbTestListGetV2ResponseDataTestListInner.reportUpdateDate) &&
        Objects.equals(this.reportUpdateTime, toolsAbTestListGetV2ResponseDataTestListInner.reportUpdateTime) &&
        Objects.equals(this.status, toolsAbTestListGetV2ResponseDataTestListInner.status) &&
        Objects.equals(this.testEndTime, toolsAbTestListGetV2ResponseDataTestListInner.testEndTime) &&
        Objects.equals(this.testId, toolsAbTestListGetV2ResponseDataTestListInner.testId) &&
        Objects.equals(this.testName, toolsAbTestListGetV2ResponseDataTestListInner.testName) &&
        Objects.equals(this.testStartTime, toolsAbTestListGetV2ResponseDataTestListInner.testStartTime) &&
        Objects.equals(this.testType, toolsAbTestListGetV2ResponseDataTestListInner.testType) &&
        Objects.equals(this.testVersion, toolsAbTestListGetV2ResponseDataTestListInner.testVersion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(conclusion, createTime, reportUpdateDate, reportUpdateTime, status, testEndTime, testId, testName, testStartTime, testType, testVersion);
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
    sb.append("class ToolsAbTestListGetV2ResponseDataTestListInner {\n");
    sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    reportUpdateDate: ").append(toIndentedString(reportUpdateDate)).append("\n");
    sb.append("    reportUpdateTime: ").append(toIndentedString(reportUpdateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    testEndTime: ").append(toIndentedString(testEndTime)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    testStartTime: ").append(toIndentedString(testStartTime)).append("\n");
    sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
    sb.append("    testVersion: ").append(toIndentedString(testVersion)).append("\n");
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
    openapiFields.add("conclusion");
    openapiFields.add("create_time");
    openapiFields.add("report_update_date");
    openapiFields.add("report_update_time");
    openapiFields.add("status");
    openapiFields.add("test_end_time");
    openapiFields.add("test_id");
    openapiFields.add("test_name");
    openapiFields.add("test_start_time");
    openapiFields.add("test_type");
    openapiFields.add("test_version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAbTestListGetV2ResponseDataTestListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAbTestListGetV2ResponseDataTestListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAbTestListGetV2ResponseDataTestListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAbTestListGetV2ResponseDataTestListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAbTestListGetV2ResponseDataTestListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAbTestListGetV2ResponseDataTestListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAbTestListGetV2ResponseDataTestListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAbTestListGetV2ResponseDataTestListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAbTestListGetV2ResponseDataTestListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAbTestListGetV2ResponseDataTestListInner
  */
  public static ToolsAbTestListGetV2ResponseDataTestListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAbTestListGetV2ResponseDataTestListInner.class);
  }

 /**
  * Convert an instance of ToolsAbTestListGetV2ResponseDataTestListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

