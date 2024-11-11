/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferStatus;
import com.bytedance.ads.model.CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner;
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
 * CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner {
  public static final String SERIALIZED_NAME_MAIN_WALLET_ID = "main_wallet_id";
  @SerializedName(SERIALIZED_NAME_MAIN_WALLET_ID)
  private Long mainWalletId = null;

  public static final String SERIALIZED_NAME_SUB_WALLET_ID = "sub_wallet_id";
  @SerializedName(SERIALIZED_NAME_SUB_WALLET_ID)
  private Long subWalletId = null;

  public static final String SERIALIZED_NAME_TRANSFER_AMOUNT = "transfer_amount";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AMOUNT)
  private Long transferAmount = null;

  public static final String SERIALIZED_NAME_TRANSFER_CAPITAL_RECORD_LIST = "transfer_capital_record_list";
  @SerializedName(SERIALIZED_NAME_TRANSFER_CAPITAL_RECORD_LIST)
  private List<CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner> transferCapitalRecordList = null;

  public static final String SERIALIZED_NAME_TRANSFER_STATUS = "transfer_status";
  @SerializedName(SERIALIZED_NAME_TRANSFER_STATUS)
  private CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferStatus transferStatus = null;

  public CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner() {
  }

  public CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner mainWalletId(Long mainWalletId) {
    
    this.mainWalletId = mainWalletId;
    return this;
  }

   /**
   * 大钱包id
   * @return mainWalletId
  **/
  @javax.annotation.Nullable
  public Long getMainWalletId() {
    return mainWalletId;
  }


  public void setMainWalletId(Long mainWalletId) {
    this.mainWalletId = mainWalletId;
  }


  public CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner subWalletId(Long subWalletId) {
    
    this.subWalletId = subWalletId;
    return this;
  }

   /**
   * 小钱包id
   * @return subWalletId
  **/
  @javax.annotation.Nullable
  public Long getSubWalletId() {
    return subWalletId;
  }


  public void setSubWalletId(Long subWalletId) {
    this.subWalletId = subWalletId;
  }


  public CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner transferAmount(Long transferAmount) {
    
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


  public CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner transferCapitalRecordList(List<CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner> transferCapitalRecordList) {
    
    this.transferCapitalRecordList = transferCapitalRecordList;
    return this;
  }

  public CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner addTransferCapitalRecordListItem(CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner transferCapitalRecordListItem) {
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
  public List<CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner> getTransferCapitalRecordList() {
    return transferCapitalRecordList;
  }


  public void setTransferCapitalRecordList(List<CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner> transferCapitalRecordList) {
    this.transferCapitalRecordList = transferCapitalRecordList;
  }


  public CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner transferStatus(CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferStatus transferStatus) {
    
    this.transferStatus = transferStatus;
    return this;
  }

   /**
   * Get transferStatus
   * @return transferStatus
  **/
  @javax.annotation.Nullable
  public CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferStatus getTransferStatus() {
    return transferStatus;
  }


  public void setTransferStatus(CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferStatus transferStatus) {
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
    CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner cgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner = (CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner) o;
    return Objects.equals(this.mainWalletId, cgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner.mainWalletId) &&
        Objects.equals(this.subWalletId, cgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner.subWalletId) &&
        Objects.equals(this.transferAmount, cgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner.transferAmount) &&
        Objects.equals(this.transferCapitalRecordList, cgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner.transferCapitalRecordList) &&
        Objects.equals(this.transferStatus, cgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner.transferStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainWalletId, subWalletId, transferAmount, transferCapitalRecordList, transferStatus);
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
    sb.append("class CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner {\n");
    sb.append("    mainWalletId: ").append(toIndentedString(mainWalletId)).append("\n");
    sb.append("    subWalletId: ").append(toIndentedString(subWalletId)).append("\n");
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
    openapiFields.add("main_wallet_id");
    openapiFields.add("sub_wallet_id");
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
       if (!CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner
  */
  public static CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner.class);
  }

 /**
  * Convert an instance of CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

