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
import com.bytedance.ads.model.CgTransferWalletTransferCreateV30AccountType;
import com.bytedance.ads.model.CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner;
import com.bytedance.ads.model.CgTransferWalletTransferCreateV30TransferDirection;
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
 * CgTransferWalletTransferCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class CgTransferWalletTransferCreateV30Request {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private CgTransferWalletTransferCreateV30AccountType accountType = null;

  public static final String SERIALIZED_NAME_BIZ_REQUEST_NO = "biz_request_no";
  @SerializedName(SERIALIZED_NAME_BIZ_REQUEST_NO)
  private String bizRequestNo = null;

  public static final String SERIALIZED_NAME_MAIN_WALLET_ID = "main_wallet_id";
  @SerializedName(SERIALIZED_NAME_MAIN_WALLET_ID)
  private Long mainWalletId = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_TARGET_WALLET_DETAIL_LIST = "target_wallet_detail_list";
  @SerializedName(SERIALIZED_NAME_TARGET_WALLET_DETAIL_LIST)
  private List<CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner> targetWalletDetailList = null;

  public static final String SERIALIZED_NAME_TRANSFER_DIRECTION = "transfer_direction";
  @SerializedName(SERIALIZED_NAME_TRANSFER_DIRECTION)
  private CgTransferWalletTransferCreateV30TransferDirection transferDirection = null;

  public CgTransferWalletTransferCreateV30Request() {
  }

  public CgTransferWalletTransferCreateV30Request accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 鉴权账户
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public CgTransferWalletTransferCreateV30Request accountType(CgTransferWalletTransferCreateV30AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public CgTransferWalletTransferCreateV30AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(CgTransferWalletTransferCreateV30AccountType accountType) {
    this.accountType = accountType;
  }


  public CgTransferWalletTransferCreateV30Request bizRequestNo(String bizRequestNo) {
    
    this.bizRequestNo = bizRequestNo;
    return this;
  }

   /**
   * 请求幂等id，同一biz_request_no发起转账代表同一转账申请，返回的转账单号相同，推荐uuid
   * @return bizRequestNo
  **/
  @javax.annotation.Nonnull
  public String getBizRequestNo() {
    return bizRequestNo;
  }


  public void setBizRequestNo(String bizRequestNo) {
    this.bizRequestNo = bizRequestNo;
  }


  public CgTransferWalletTransferCreateV30Request mainWalletId(Long mainWalletId) {
    
    this.mainWalletId = mainWalletId;
    return this;
  }

   /**
   * 申请转账的大钱包id
   * @return mainWalletId
  **/
  @javax.annotation.Nonnull
  public Long getMainWalletId() {
    return mainWalletId;
  }


  public void setMainWalletId(Long mainWalletId) {
    this.mainWalletId = mainWalletId;
  }


  public CgTransferWalletTransferCreateV30Request remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 转账备注
   * @return remark
  **/
  @javax.annotation.Nullable
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public CgTransferWalletTransferCreateV30Request targetWalletDetailList(List<CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner> targetWalletDetailList) {
    
    this.targetWalletDetailList = targetWalletDetailList;
    return this;
  }

  public CgTransferWalletTransferCreateV30Request addTargetWalletDetailListItem(CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner targetWalletDetailListItem) {
    if (this.targetWalletDetailList == null) {
      this.targetWalletDetailList = new ArrayList<>();
    }
    this.targetWalletDetailList.add(targetWalletDetailListItem);
    return this;
  }

   /**
   * 申请转账的小钱包列表
   * @return targetWalletDetailList
  **/
  @javax.annotation.Nonnull
  public List<CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner> getTargetWalletDetailList() {
    return targetWalletDetailList;
  }


  public void setTargetWalletDetailList(List<CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner> targetWalletDetailList) {
    this.targetWalletDetailList = targetWalletDetailList;
  }


  public CgTransferWalletTransferCreateV30Request transferDirection(CgTransferWalletTransferCreateV30TransferDirection transferDirection) {
    
    this.transferDirection = transferDirection;
    return this;
  }

   /**
   * Get transferDirection
   * @return transferDirection
  **/
  @javax.annotation.Nonnull
  public CgTransferWalletTransferCreateV30TransferDirection getTransferDirection() {
    return transferDirection;
  }


  public void setTransferDirection(CgTransferWalletTransferCreateV30TransferDirection transferDirection) {
    this.transferDirection = transferDirection;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferWalletTransferCreateV30Request cgTransferWalletTransferCreateV30Request = (CgTransferWalletTransferCreateV30Request) o;
    return Objects.equals(this.accountId, cgTransferWalletTransferCreateV30Request.accountId) &&
        Objects.equals(this.accountType, cgTransferWalletTransferCreateV30Request.accountType) &&
        Objects.equals(this.bizRequestNo, cgTransferWalletTransferCreateV30Request.bizRequestNo) &&
        Objects.equals(this.mainWalletId, cgTransferWalletTransferCreateV30Request.mainWalletId) &&
        Objects.equals(this.remark, cgTransferWalletTransferCreateV30Request.remark) &&
        Objects.equals(this.targetWalletDetailList, cgTransferWalletTransferCreateV30Request.targetWalletDetailList) &&
        Objects.equals(this.transferDirection, cgTransferWalletTransferCreateV30Request.transferDirection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, bizRequestNo, mainWalletId, remark, targetWalletDetailList, transferDirection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CgTransferWalletTransferCreateV30Request {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    bizRequestNo: ").append(toIndentedString(bizRequestNo)).append("\n");
    sb.append("    mainWalletId: ").append(toIndentedString(mainWalletId)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    targetWalletDetailList: ").append(toIndentedString(targetWalletDetailList)).append("\n");
    sb.append("    transferDirection: ").append(toIndentedString(transferDirection)).append("\n");
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
    openapiFields.add("account_type");
    openapiFields.add("biz_request_no");
    openapiFields.add("main_wallet_id");
    openapiFields.add("remark");
    openapiFields.add("target_wallet_detail_list");
    openapiFields.add("transfer_direction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_type");
    openapiRequiredFields.add("biz_request_no");
    openapiRequiredFields.add("main_wallet_id");
    openapiRequiredFields.add("target_wallet_detail_list");
    openapiRequiredFields.add("transfer_direction");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferWalletTransferCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferWalletTransferCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferWalletTransferCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferWalletTransferCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferWalletTransferCreateV30Request>() {
           @Override
           public void write(JsonWriter out, CgTransferWalletTransferCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferWalletTransferCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferWalletTransferCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferWalletTransferCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to CgTransferWalletTransferCreateV30Request
  */
  public static CgTransferWalletTransferCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferWalletTransferCreateV30Request.class);
  }

 /**
  * Convert an instance of CgTransferWalletTransferCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

