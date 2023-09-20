/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAbTestInfoGetV2DataConclusion;
import com.bytedance.ads.model.ToolsAbTestInfoGetV2DataStatus;
import com.bytedance.ads.model.ToolsAbTestInfoGetV2DataTestType;
import com.bytedance.ads.model.ToolsAbTestInfoGetV2DataTestVersion;
import com.bytedance.ads.model.ToolsAbTestInfoGetV2ResponseDataConclusionDetail;
import com.bytedance.ads.model.ToolsAbTestInfoGetV2ResponseDataObjectListInner;
import com.bytedance.ads.model.ToolsAbTestInfoGetV2ResponseDataTestReportsInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class ToolsAbTestInfoGetV2ResponseData {
  public static final String SERIALIZED_NAME_CONCLUSION = "conclusion";
  @SerializedName(SERIALIZED_NAME_CONCLUSION)
  private ToolsAbTestInfoGetV2DataConclusion conclusion = null;

  public static final String SERIALIZED_NAME_CONCLUSION_DETAIL = "conclusion_detail";
  @SerializedName(SERIALIZED_NAME_CONCLUSION_DETAIL)
  private ToolsAbTestInfoGetV2ResponseDataConclusionDetail conclusionDetail = null;

  public static final String SERIALIZED_NAME_OBJECT_LIST = "object_list";
  @SerializedName(SERIALIZED_NAME_OBJECT_LIST)
  private List<ToolsAbTestInfoGetV2ResponseDataObjectListInner> objectList = null;

  public static final String SERIALIZED_NAME_REPORT_DATE = "report_date";
  @SerializedName(SERIALIZED_NAME_REPORT_DATE)
  private String reportDate = null;

  public static final String SERIALIZED_NAME_REPORT_TIME = "report_time";
  @SerializedName(SERIALIZED_NAME_REPORT_TIME)
  private String reportTime = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsAbTestInfoGetV2DataStatus status = null;

  public static final String SERIALIZED_NAME_TEST_END_TIME = "test_end_time";
  @SerializedName(SERIALIZED_NAME_TEST_END_TIME)
  private String testEndTime = null;

  public static final String SERIALIZED_NAME_TEST_ID = "test_id";
  @SerializedName(SERIALIZED_NAME_TEST_ID)
  private Long testId = null;

  public static final String SERIALIZED_NAME_TEST_NAME = "test_name";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName = null;

  public static final String SERIALIZED_NAME_TEST_REPORTS = "test_reports";
  @SerializedName(SERIALIZED_NAME_TEST_REPORTS)
  private List<ToolsAbTestInfoGetV2ResponseDataTestReportsInner> testReports = null;

  public static final String SERIALIZED_NAME_TEST_START_TIME = "test_start_time";
  @SerializedName(SERIALIZED_NAME_TEST_START_TIME)
  private String testStartTime = null;

  public static final String SERIALIZED_NAME_TEST_TYPE = "test_type";
  @SerializedName(SERIALIZED_NAME_TEST_TYPE)
  private ToolsAbTestInfoGetV2DataTestType testType = null;

  public static final String SERIALIZED_NAME_TEST_VERSION = "test_version";
  @SerializedName(SERIALIZED_NAME_TEST_VERSION)
  private ToolsAbTestInfoGetV2DataTestVersion testVersion = null;

  public ToolsAbTestInfoGetV2ResponseData() {
  }

  public ToolsAbTestInfoGetV2ResponseData conclusion(ToolsAbTestInfoGetV2DataConclusion conclusion) {
    
    this.conclusion = conclusion;
    return this;
  }

   /**
   * Get conclusion
   * @return conclusion
  **/
  @javax.annotation.Nullable
  public ToolsAbTestInfoGetV2DataConclusion getConclusion() {
    return conclusion;
  }


  public void setConclusion(ToolsAbTestInfoGetV2DataConclusion conclusion) {
    this.conclusion = conclusion;
  }


  public ToolsAbTestInfoGetV2ResponseData conclusionDetail(ToolsAbTestInfoGetV2ResponseDataConclusionDetail conclusionDetail) {
    
    this.conclusionDetail = conclusionDetail;
    return this;
  }

   /**
   * Get conclusionDetail
   * @return conclusionDetail
  **/
  @javax.annotation.Nullable
  public ToolsAbTestInfoGetV2ResponseDataConclusionDetail getConclusionDetail() {
    return conclusionDetail;
  }


  public void setConclusionDetail(ToolsAbTestInfoGetV2ResponseDataConclusionDetail conclusionDetail) {
    this.conclusionDetail = conclusionDetail;
  }


  public ToolsAbTestInfoGetV2ResponseData objectList(List<ToolsAbTestInfoGetV2ResponseDataObjectListInner> objectList) {
    
    this.objectList = objectList;
    return this;
  }

  public ToolsAbTestInfoGetV2ResponseData addObjectListItem(ToolsAbTestInfoGetV2ResponseDataObjectListInner objectListItem) {
    if (this.objectList == null) {
      this.objectList = new ArrayList<>();
    }
    this.objectList.add(objectListItem);
    return this;
  }

   /**
   * 实验对象ID列表
   * @return objectList
  **/
  @javax.annotation.Nullable
  public List<ToolsAbTestInfoGetV2ResponseDataObjectListInner> getObjectList() {
    return objectList;
  }


  public void setObjectList(List<ToolsAbTestInfoGetV2ResponseDataObjectListInner> objectList) {
    this.objectList = objectList;
  }


  public ToolsAbTestInfoGetV2ResponseData reportDate(String reportDate) {
    
    this.reportDate = reportDate;
    return this;
  }

   /**
   * 报告日期，格式：\&quot;20201225\&quot;
   * @return reportDate
  **/
  @javax.annotation.Nullable
  public String getReportDate() {
    return reportDate;
  }


  public void setReportDate(String reportDate) {
    this.reportDate = reportDate;
  }


  public ToolsAbTestInfoGetV2ResponseData reportTime(String reportTime) {
    
    this.reportTime = reportTime;
    return this;
  }

   /**
   * 报告时间，格式：\&quot;2020-12-25 07:12:08\&quot;
   * @return reportTime
  **/
  @javax.annotation.Nullable
  public String getReportTime() {
    return reportTime;
  }


  public void setReportTime(String reportTime) {
    this.reportTime = reportTime;
  }


  public ToolsAbTestInfoGetV2ResponseData status(ToolsAbTestInfoGetV2DataStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsAbTestInfoGetV2DataStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsAbTestInfoGetV2DataStatus status) {
    this.status = status;
  }


  public ToolsAbTestInfoGetV2ResponseData testEndTime(String testEndTime) {
    
    this.testEndTime = testEndTime;
    return this;
  }

   /**
   * 实验结束时间，格式：\&quot;2020-12-25 07:12:08\&quot;
   * @return testEndTime
  **/
  @javax.annotation.Nullable
  public String getTestEndTime() {
    return testEndTime;
  }


  public void setTestEndTime(String testEndTime) {
    this.testEndTime = testEndTime;
  }


  public ToolsAbTestInfoGetV2ResponseData testId(Long testId) {
    
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


  public ToolsAbTestInfoGetV2ResponseData testName(String testName) {
    
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


  public ToolsAbTestInfoGetV2ResponseData testReports(List<ToolsAbTestInfoGetV2ResponseDataTestReportsInner> testReports) {
    
    this.testReports = testReports;
    return this;
  }

  public ToolsAbTestInfoGetV2ResponseData addTestReportsItem(ToolsAbTestInfoGetV2ResponseDataTestReportsInner testReportsItem) {
    if (this.testReports == null) {
      this.testReports = new ArrayList<>();
    }
    this.testReports.add(testReportsItem);
    return this;
  }

   /**
   * 实验对象详细报告
   * @return testReports
  **/
  @javax.annotation.Nullable
  public List<ToolsAbTestInfoGetV2ResponseDataTestReportsInner> getTestReports() {
    return testReports;
  }


  public void setTestReports(List<ToolsAbTestInfoGetV2ResponseDataTestReportsInner> testReports) {
    this.testReports = testReports;
  }


  public ToolsAbTestInfoGetV2ResponseData testStartTime(String testStartTime) {
    
    this.testStartTime = testStartTime;
    return this;
  }

   /**
   * 实验开始时间，格式：\&quot;2020-12-25 07:12:08\&quot;
   * @return testStartTime
  **/
  @javax.annotation.Nullable
  public String getTestStartTime() {
    return testStartTime;
  }


  public void setTestStartTime(String testStartTime) {
    this.testStartTime = testStartTime;
  }


  public ToolsAbTestInfoGetV2ResponseData testType(ToolsAbTestInfoGetV2DataTestType testType) {
    
    this.testType = testType;
    return this;
  }

   /**
   * Get testType
   * @return testType
  **/
  @javax.annotation.Nullable
  public ToolsAbTestInfoGetV2DataTestType getTestType() {
    return testType;
  }


  public void setTestType(ToolsAbTestInfoGetV2DataTestType testType) {
    this.testType = testType;
  }


  public ToolsAbTestInfoGetV2ResponseData testVersion(ToolsAbTestInfoGetV2DataTestVersion testVersion) {
    
    this.testVersion = testVersion;
    return this;
  }

   /**
   * Get testVersion
   * @return testVersion
  **/
  @javax.annotation.Nullable
  public ToolsAbTestInfoGetV2DataTestVersion getTestVersion() {
    return testVersion;
  }


  public void setTestVersion(ToolsAbTestInfoGetV2DataTestVersion testVersion) {
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
    ToolsAbTestInfoGetV2ResponseData toolsAbTestInfoGetV2ResponseData = (ToolsAbTestInfoGetV2ResponseData) o;
    return Objects.equals(this.conclusion, toolsAbTestInfoGetV2ResponseData.conclusion) &&
        Objects.equals(this.conclusionDetail, toolsAbTestInfoGetV2ResponseData.conclusionDetail) &&
        Objects.equals(this.objectList, toolsAbTestInfoGetV2ResponseData.objectList) &&
        Objects.equals(this.reportDate, toolsAbTestInfoGetV2ResponseData.reportDate) &&
        Objects.equals(this.reportTime, toolsAbTestInfoGetV2ResponseData.reportTime) &&
        Objects.equals(this.status, toolsAbTestInfoGetV2ResponseData.status) &&
        Objects.equals(this.testEndTime, toolsAbTestInfoGetV2ResponseData.testEndTime) &&
        Objects.equals(this.testId, toolsAbTestInfoGetV2ResponseData.testId) &&
        Objects.equals(this.testName, toolsAbTestInfoGetV2ResponseData.testName) &&
        Objects.equals(this.testReports, toolsAbTestInfoGetV2ResponseData.testReports) &&
        Objects.equals(this.testStartTime, toolsAbTestInfoGetV2ResponseData.testStartTime) &&
        Objects.equals(this.testType, toolsAbTestInfoGetV2ResponseData.testType) &&
        Objects.equals(this.testVersion, toolsAbTestInfoGetV2ResponseData.testVersion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(conclusion, conclusionDetail, objectList, reportDate, reportTime, status, testEndTime, testId, testName, testReports, testStartTime, testType, testVersion);
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
    sb.append("class ToolsAbTestInfoGetV2ResponseData {\n");
    sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
    sb.append("    conclusionDetail: ").append(toIndentedString(conclusionDetail)).append("\n");
    sb.append("    objectList: ").append(toIndentedString(objectList)).append("\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    reportTime: ").append(toIndentedString(reportTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    testEndTime: ").append(toIndentedString(testEndTime)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    testReports: ").append(toIndentedString(testReports)).append("\n");
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
    openapiFields.add("conclusion_detail");
    openapiFields.add("object_list");
    openapiFields.add("report_date");
    openapiFields.add("report_time");
    openapiFields.add("status");
    openapiFields.add("test_end_time");
    openapiFields.add("test_id");
    openapiFields.add("test_name");
    openapiFields.add("test_reports");
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
       if (!ToolsAbTestInfoGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAbTestInfoGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAbTestInfoGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAbTestInfoGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAbTestInfoGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsAbTestInfoGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAbTestInfoGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAbTestInfoGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAbTestInfoGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsAbTestInfoGetV2ResponseData
  */
  public static ToolsAbTestInfoGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAbTestInfoGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsAbTestInfoGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

