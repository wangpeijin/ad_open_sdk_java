/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListCapitalType;
import com.bytedance.ads.model.CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListPlatform;
import com.bytedance.ads.model.CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListTransferStatus;
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
 * CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner {
  public static final String SERIALIZED_NAME_CAPITAL_TYPE = "capital_type";
  @SerializedName(SERIALIZED_NAME_CAPITAL_TYPE)
  private CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListCapitalType capitalType = null;

  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListPlatform platform = null;

  public static final String SERIALIZED_NAME_TRANSFER_AMOUNT = "transfer_amount";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AMOUNT)
  private Long transferAmount = null;

  public static final String SERIALIZED_NAME_TRANSFER_STATUS = "transfer_status";
  @SerializedName(SERIALIZED_NAME_TRANSFER_STATUS)
  private CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListTransferStatus transferStatus = null;

  public CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner() {
  }

  public CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner capitalType(CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListCapitalType capitalType) {
    
    this.capitalType = capitalType;
    return this;
  }

   /**
   * Get capitalType
   * @return capitalType
  **/
  @javax.annotation.Nullable
  public CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListCapitalType getCapitalType() {
    return capitalType;
  }


  public void setCapitalType(CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListCapitalType capitalType) {
    this.capitalType = capitalType;
  }


  public CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 失败原因
   * @return failReason
  **/
  @javax.annotation.Nullable
  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner platform(CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListPlatform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListPlatform getPlatform() {
    return platform;
  }


  public void setPlatform(CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListPlatform platform) {
    this.platform = platform;
  }


  public CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner transferAmount(Long transferAmount) {
    
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * 转账资金金额(单位：分)
   * @return transferAmount
  **/
  @javax.annotation.Nullable
  public Long getTransferAmount() {
    return transferAmount;
  }


  public void setTransferAmount(Long transferAmount) {
    this.transferAmount = transferAmount;
  }


  public CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner transferStatus(CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListTransferStatus transferStatus) {
    
    this.transferStatus = transferStatus;
    return this;
  }

   /**
   * Get transferStatus
   * @return transferStatus
  **/
  @javax.annotation.Nullable
  public CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListTransferStatus getTransferStatus() {
    return transferStatus;
  }


  public void setTransferStatus(CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListTransferStatus transferStatus) {
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
    CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner cgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner = (CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner) o;
    return Objects.equals(this.capitalType, cgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner.capitalType) &&
        Objects.equals(this.failReason, cgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner.failReason) &&
        Objects.equals(this.platform, cgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner.platform) &&
        Objects.equals(this.transferAmount, cgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner.transferAmount) &&
        Objects.equals(this.transferStatus, cgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner.transferStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(capitalType, failReason, platform, transferAmount, transferStatus);
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
    sb.append("class CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner {\n");
    sb.append("    capitalType: ").append(toIndentedString(capitalType)).append("\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
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
    openapiFields.add("capital_type");
    openapiFields.add("fail_reason");
    openapiFields.add("platform");
    openapiFields.add("transfer_amount");
    openapiFields.add("transfer_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner
  */
  public static CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner.class);
  }

 /**
  * Convert an instance of CgTransferWalletTransferDetailV30ResponseDataTransferWalletRecordListInnerTransferCapitalRecordListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

