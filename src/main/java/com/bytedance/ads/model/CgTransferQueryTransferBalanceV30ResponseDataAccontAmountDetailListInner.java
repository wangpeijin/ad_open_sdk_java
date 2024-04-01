/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInnerCapitalDetailListInner;
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
 * CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_CAPITAL_DETAIL_LIST = "capital_detail_list";
  @SerializedName(SERIALIZED_NAME_CAPITAL_DETAIL_LIST)
  private List<CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInnerCapitalDetailListInner> capitalDetailList = null;

  public static final String SERIALIZED_NAME_DEPOSIT_AMOUNT = "deposit_amount";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_AMOUNT)
  private Long depositAmount = null;

  public static final String SERIALIZED_NAME_TOTAL_TRANSFER_AMOUNT = "total_transfer_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRANSFER_AMOUNT)
  private Long totalTransferAmount = null;

  public CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner() {
  }

  public CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 账户id
   * @return accountId
  **/
  @javax.annotation.Nullable
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner capitalDetailList(List<CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInnerCapitalDetailListInner> capitalDetailList) {
    
    this.capitalDetailList = capitalDetailList;
    return this;
  }

  public CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner addCapitalDetailListItem(CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInnerCapitalDetailListInner capitalDetailListItem) {
    if (this.capitalDetailList == null) {
      this.capitalDetailList = new ArrayList<>();
    }
    this.capitalDetailList.add(capitalDetailListItem);
    return this;
  }

   /**
   * 可转资金列表
   * @return capitalDetailList
  **/
  @javax.annotation.Nullable
  public List<CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInnerCapitalDetailListInner> getCapitalDetailList() {
    return capitalDetailList;
  }


  public void setCapitalDetailList(List<CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInnerCapitalDetailListInner> capitalDetailList) {
    this.capitalDetailList = capitalDetailList;
  }


  public CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner depositAmount(Long depositAmount) {
    
    this.depositAmount = depositAmount;
    return this;
  }

   /**
   * 竞价消耗保证金金额(单位：分)
   * @return depositAmount
  **/
  @javax.annotation.Nullable
  public Long getDepositAmount() {
    return depositAmount;
  }


  public void setDepositAmount(Long depositAmount) {
    this.depositAmount = depositAmount;
  }


  public CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner totalTransferAmount(Long totalTransferAmount) {
    
    this.totalTransferAmount = totalTransferAmount;
    return this;
  }

   /**
   * 总可转金额(单位：分)
   * @return totalTransferAmount
  **/
  @javax.annotation.Nullable
  public Long getTotalTransferAmount() {
    return totalTransferAmount;
  }


  public void setTotalTransferAmount(Long totalTransferAmount) {
    this.totalTransferAmount = totalTransferAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner cgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner = (CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner) o;
    return Objects.equals(this.accountId, cgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner.accountId) &&
        Objects.equals(this.capitalDetailList, cgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner.capitalDetailList) &&
        Objects.equals(this.depositAmount, cgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner.depositAmount) &&
        Objects.equals(this.totalTransferAmount, cgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner.totalTransferAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, capitalDetailList, depositAmount, totalTransferAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    capitalDetailList: ").append(toIndentedString(capitalDetailList)).append("\n");
    sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
    sb.append("    totalTransferAmount: ").append(toIndentedString(totalTransferAmount)).append("\n");
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
    openapiFields.add("capital_detail_list");
    openapiFields.add("deposit_amount");
    openapiFields.add("total_transfer_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("capital_detail_list");
    openapiRequiredFields.add("deposit_amount");
    openapiRequiredFields.add("total_transfer_amount");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner
  */
  public static CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner.class);
  }

 /**
  * Convert an instance of CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

