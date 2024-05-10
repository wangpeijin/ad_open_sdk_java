/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferStatus;
import com.bytedance.ads.model.CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner;
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
 * CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_TARGET_ACCOUNT_ID = "target_account_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ACCOUNT_ID)
  private Long targetAccountId = null;

  public static final String SERIALIZED_NAME_TRANSFER_AMOUNT = "transfer_amount";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AMOUNT)
  private Long transferAmount = null;

  public static final String SERIALIZED_NAME_TRANSFER_CAPITAL_RECORD_LIST = "transfer_capital_record_list";
  @SerializedName(SERIALIZED_NAME_TRANSFER_CAPITAL_RECORD_LIST)
  private List<CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner> transferCapitalRecordList = null;

  public static final String SERIALIZED_NAME_TRANSFER_STATUS = "transfer_status";
  @SerializedName(SERIALIZED_NAME_TRANSFER_STATUS)
  private CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferStatus transferStatus = null;

  public CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner() {
  }

  public CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 锚定账户id，1:N的1
   * @return accountId
  **/
  @javax.annotation.Nullable
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner targetAccountId(Long targetAccountId) {
    
    this.targetAccountId = targetAccountId;
    return this;
  }

   /**
   * 目标账户id，1:N的N
   * @return targetAccountId
  **/
  @javax.annotation.Nullable
  public Long getTargetAccountId() {
    return targetAccountId;
  }


  public void setTargetAccountId(Long targetAccountId) {
    this.targetAccountId = targetAccountId;
  }


  public CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner transferAmount(Long transferAmount) {
    
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * 转账金额(单位：分)
   * @return transferAmount
  **/
  @javax.annotation.Nullable
  public Long getTransferAmount() {
    return transferAmount;
  }


  public void setTransferAmount(Long transferAmount) {
    this.transferAmount = transferAmount;
  }


  public CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner transferCapitalRecordList(List<CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner> transferCapitalRecordList) {
    
    this.transferCapitalRecordList = transferCapitalRecordList;
    return this;
  }

  public CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner addTransferCapitalRecordListItem(CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner transferCapitalRecordListItem) {
    if (this.transferCapitalRecordList == null) {
      this.transferCapitalRecordList = new ArrayList<>();
    }
    this.transferCapitalRecordList.add(transferCapitalRecordListItem);
    return this;
  }

   /**
   * 转账资金类型列表
   * @return transferCapitalRecordList
  **/
  @javax.annotation.Nullable
  public List<CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner> getTransferCapitalRecordList() {
    return transferCapitalRecordList;
  }


  public void setTransferCapitalRecordList(List<CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner> transferCapitalRecordList) {
    this.transferCapitalRecordList = transferCapitalRecordList;
  }


  public CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner transferStatus(CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferStatus transferStatus) {
    
    this.transferStatus = transferStatus;
    return this;
  }

   /**
   * Get transferStatus
   * @return transferStatus
  **/
  @javax.annotation.Nullable
  public CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferStatus getTransferStatus() {
    return transferStatus;
  }


  public void setTransferStatus(CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferStatus transferStatus) {
    this.transferStatus = transferStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner cgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner = (CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner) o;
    return Objects.equals(this.accountId, cgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner.accountId) &&
        Objects.equals(this.targetAccountId, cgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner.targetAccountId) &&
        Objects.equals(this.transferAmount, cgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner.transferAmount) &&
        Objects.equals(this.transferCapitalRecordList, cgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner.transferCapitalRecordList) &&
        Objects.equals(this.transferStatus, cgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner.transferStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, targetAccountId, transferAmount, transferCapitalRecordList, transferStatus);
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
    sb.append("class CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    targetAccountId: ").append(toIndentedString(targetAccountId)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    transferCapitalRecordList: ").append(toIndentedString(transferCapitalRecordList)).append("\n");
    sb.append("    transferStatus: ").append(toIndentedString(transferStatus)).append("\n");
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
    openapiFields.add("target_account_id");
    openapiFields.add("transfer_amount");
    openapiFields.add("transfer_capital_record_list");
    openapiFields.add("transfer_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner
  */
  public static CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner.class);
  }

 /**
  * Convert an instance of CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

