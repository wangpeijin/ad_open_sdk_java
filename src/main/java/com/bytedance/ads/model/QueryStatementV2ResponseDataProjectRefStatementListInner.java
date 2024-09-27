/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner;
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
 * QueryStatementV2ResponseDataProjectRefStatementListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class QueryStatementV2ResponseDataProjectRefStatementListInner {
  public static final String SERIALIZED_NAME_ARCHIVE_STATUS = "archive_status";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_STATUS)
  private Long archiveStatus = null;

  public static final String SERIALIZED_NAME_ARCHIVE_STATUS_NAME = "archive_status_name";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_STATUS_NAME)
  private String archiveStatusName = null;

  public static final String SERIALIZED_NAME_ATTACH_LIST = "attach_list";
  @SerializedName(SERIALIZED_NAME_ATTACH_LIST)
  private List<QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner> attachList = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_REF_STATEMENT_AMOUNT = "ref_statement_amount";
  @SerializedName(SERIALIZED_NAME_REF_STATEMENT_AMOUNT)
  private String refStatementAmount = null;

  public static final String SERIALIZED_NAME_STAMP_STATUS = "stamp_status";
  @SerializedName(SERIALIZED_NAME_STAMP_STATUS)
  private Long stampStatus = null;

  public static final String SERIALIZED_NAME_STAMP_STATUS_NAME = "stamp_status_name";
  @SerializedName(SERIALIZED_NAME_STAMP_STATUS_NAME)
  private String stampStatusName = null;

  public static final String SERIALIZED_NAME_STATEMENT_SERIAL = "statement_serial";
  @SerializedName(SERIALIZED_NAME_STATEMENT_SERIAL)
  private String statementSerial = null;

  public QueryStatementV2ResponseDataProjectRefStatementListInner() {
  }

  public QueryStatementV2ResponseDataProjectRefStatementListInner archiveStatus(Long archiveStatus) {
    
    this.archiveStatus = archiveStatus;
    return this;
  }

   /**
   * 结算单归档状态
   * @return archiveStatus
  **/
  @javax.annotation.Nullable
  public Long getArchiveStatus() {
    return archiveStatus;
  }


  public void setArchiveStatus(Long archiveStatus) {
    this.archiveStatus = archiveStatus;
  }


  public QueryStatementV2ResponseDataProjectRefStatementListInner archiveStatusName(String archiveStatusName) {
    
    this.archiveStatusName = archiveStatusName;
    return this;
  }

   /**
   * 结算单归档状态名称
   * @return archiveStatusName
  **/
  @javax.annotation.Nullable
  public String getArchiveStatusName() {
    return archiveStatusName;
  }


  public void setArchiveStatusName(String archiveStatusName) {
    this.archiveStatusName = archiveStatusName;
  }


  public QueryStatementV2ResponseDataProjectRefStatementListInner attachList(List<QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner> attachList) {
    
    this.attachList = attachList;
    return this;
  }

  public QueryStatementV2ResponseDataProjectRefStatementListInner addAttachListItem(QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner attachListItem) {
    if (this.attachList == null) {
      this.attachList = new ArrayList<>();
    }
    this.attachList.add(attachListItem);
    return this;
  }

   /**
   * 附件列表
   * @return attachList
  **/
  @javax.annotation.Nullable
  public List<QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner> getAttachList() {
    return attachList;
  }


  public void setAttachList(List<QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner> attachList) {
    this.attachList = attachList;
  }


  public QueryStatementV2ResponseDataProjectRefStatementListInner projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目id
   * @return projectId
  **/
  @javax.annotation.Nullable
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public QueryStatementV2ResponseDataProjectRefStatementListInner refStatementAmount(String refStatementAmount) {
    
    this.refStatementAmount = refStatementAmount;
    return this;
  }

   /**
   * 项目关联结算单金额
   * @return refStatementAmount
  **/
  @javax.annotation.Nullable
  public String getRefStatementAmount() {
    return refStatementAmount;
  }


  public void setRefStatementAmount(String refStatementAmount) {
    this.refStatementAmount = refStatementAmount;
  }


  public QueryStatementV2ResponseDataProjectRefStatementListInner stampStatus(Long stampStatus) {
    
    this.stampStatus = stampStatus;
    return this;
  }

   /**
   * 结算单盖章状态（1：未盖章，2：审批中，3：已盖章，5：无需盖章，4: 电子签章审批中)
   * @return stampStatus
  **/
  @javax.annotation.Nullable
  public Long getStampStatus() {
    return stampStatus;
  }


  public void setStampStatus(Long stampStatus) {
    this.stampStatus = stampStatus;
  }


  public QueryStatementV2ResponseDataProjectRefStatementListInner stampStatusName(String stampStatusName) {
    
    this.stampStatusName = stampStatusName;
    return this;
  }

   /**
   * 结算单盖章状态名称
   * @return stampStatusName
  **/
  @javax.annotation.Nullable
  public String getStampStatusName() {
    return stampStatusName;
  }


  public void setStampStatusName(String stampStatusName) {
    this.stampStatusName = stampStatusName;
  }


  public QueryStatementV2ResponseDataProjectRefStatementListInner statementSerial(String statementSerial) {
    
    this.statementSerial = statementSerial;
    return this;
  }

   /**
   * 结算单编号
   * @return statementSerial
  **/
  @javax.annotation.Nullable
  public String getStatementSerial() {
    return statementSerial;
  }


  public void setStatementSerial(String statementSerial) {
    this.statementSerial = statementSerial;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryStatementV2ResponseDataProjectRefStatementListInner queryStatementV2ResponseDataProjectRefStatementListInner = (QueryStatementV2ResponseDataProjectRefStatementListInner) o;
    return Objects.equals(this.archiveStatus, queryStatementV2ResponseDataProjectRefStatementListInner.archiveStatus) &&
        Objects.equals(this.archiveStatusName, queryStatementV2ResponseDataProjectRefStatementListInner.archiveStatusName) &&
        Objects.equals(this.attachList, queryStatementV2ResponseDataProjectRefStatementListInner.attachList) &&
        Objects.equals(this.projectId, queryStatementV2ResponseDataProjectRefStatementListInner.projectId) &&
        Objects.equals(this.refStatementAmount, queryStatementV2ResponseDataProjectRefStatementListInner.refStatementAmount) &&
        Objects.equals(this.stampStatus, queryStatementV2ResponseDataProjectRefStatementListInner.stampStatus) &&
        Objects.equals(this.stampStatusName, queryStatementV2ResponseDataProjectRefStatementListInner.stampStatusName) &&
        Objects.equals(this.statementSerial, queryStatementV2ResponseDataProjectRefStatementListInner.statementSerial);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveStatus, archiveStatusName, attachList, projectId, refStatementAmount, stampStatus, stampStatusName, statementSerial);
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
    sb.append("class QueryStatementV2ResponseDataProjectRefStatementListInner {\n");
    sb.append("    archiveStatus: ").append(toIndentedString(archiveStatus)).append("\n");
    sb.append("    archiveStatusName: ").append(toIndentedString(archiveStatusName)).append("\n");
    sb.append("    attachList: ").append(toIndentedString(attachList)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    refStatementAmount: ").append(toIndentedString(refStatementAmount)).append("\n");
    sb.append("    stampStatus: ").append(toIndentedString(stampStatus)).append("\n");
    sb.append("    stampStatusName: ").append(toIndentedString(stampStatusName)).append("\n");
    sb.append("    statementSerial: ").append(toIndentedString(statementSerial)).append("\n");
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
    openapiFields.add("archive_status");
    openapiFields.add("archive_status_name");
    openapiFields.add("attach_list");
    openapiFields.add("project_id");
    openapiFields.add("ref_statement_amount");
    openapiFields.add("stamp_status");
    openapiFields.add("stamp_status_name");
    openapiFields.add("statement_serial");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryStatementV2ResponseDataProjectRefStatementListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryStatementV2ResponseDataProjectRefStatementListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryStatementV2ResponseDataProjectRefStatementListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryStatementV2ResponseDataProjectRefStatementListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryStatementV2ResponseDataProjectRefStatementListInner>() {
           @Override
           public void write(JsonWriter out, QueryStatementV2ResponseDataProjectRefStatementListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryStatementV2ResponseDataProjectRefStatementListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryStatementV2ResponseDataProjectRefStatementListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryStatementV2ResponseDataProjectRefStatementListInner
  * @throws IOException if the JSON string is invalid with respect to QueryStatementV2ResponseDataProjectRefStatementListInner
  */
  public static QueryStatementV2ResponseDataProjectRefStatementListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryStatementV2ResponseDataProjectRefStatementListInner.class);
  }

 /**
  * Convert an instance of QueryStatementV2ResponseDataProjectRefStatementListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

