/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner;
import com.bytedance.ads.model.CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner;
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
 * CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner {
  public static final String SERIALIZED_NAME_NON_BRAND_MAX_TRANSFER_BALANCE = "non_brand_max_transfer_balance";
  @SerializedName(SERIALIZED_NAME_NON_BRAND_MAX_TRANSFER_BALANCE)
  private Long nonBrandMaxTransferBalance = null;

  public static final String SERIALIZED_NAME_PAYEE_TRANSFER_AMOUNT_DETAIL_LIST = "payee_transfer_amount_detail_list";
  @SerializedName(SERIALIZED_NAME_PAYEE_TRANSFER_AMOUNT_DETAIL_LIST)
  private List<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner> payeeTransferAmountDetailList = null;

  public static final String SERIALIZED_NAME_REMITTER_CAPITAL_DETAIL_LIST = "remitter_capital_detail_list";
  @SerializedName(SERIALIZED_NAME_REMITTER_CAPITAL_DETAIL_LIST)
  private List<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner> remitterCapitalDetailList = null;

  public static final String SERIALIZED_NAME_REMITTER_WALLET_ID = "remitter_wallet_id";
  @SerializedName(SERIALIZED_NAME_REMITTER_WALLET_ID)
  private Long remitterWalletId = null;

  public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner() {
  }

  public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner nonBrandMaxTransferBalance(Long nonBrandMaxTransferBalance) {
    
    this.nonBrandMaxTransferBalance = nonBrandMaxTransferBalance;
    return this;
  }

   /**
   * 减款钱包非品牌资金最大可转出金额（单位：分）
   * @return nonBrandMaxTransferBalance
  **/
  @javax.annotation.Nullable
  public Long getNonBrandMaxTransferBalance() {
    return nonBrandMaxTransferBalance;
  }


  public void setNonBrandMaxTransferBalance(Long nonBrandMaxTransferBalance) {
    this.nonBrandMaxTransferBalance = nonBrandMaxTransferBalance;
  }


  public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner payeeTransferAmountDetailList(List<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner> payeeTransferAmountDetailList) {
    
    this.payeeTransferAmountDetailList = payeeTransferAmountDetailList;
    return this;
  }

  public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner addPayeeTransferAmountDetailListItem(CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner payeeTransferAmountDetailListItem) {
    if (this.payeeTransferAmountDetailList == null) {
      this.payeeTransferAmountDetailList = new ArrayList<>();
    }
    this.payeeTransferAmountDetailList.add(payeeTransferAmountDetailListItem);
    return this;
  }

   /**
   * 加款钱包可转余额信息列表
   * @return payeeTransferAmountDetailList
  **/
  @javax.annotation.Nullable
  public List<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner> getPayeeTransferAmountDetailList() {
    return payeeTransferAmountDetailList;
  }


  public void setPayeeTransferAmountDetailList(List<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner> payeeTransferAmountDetailList) {
    this.payeeTransferAmountDetailList = payeeTransferAmountDetailList;
  }


  public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner remitterCapitalDetailList(List<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner> remitterCapitalDetailList) {
    
    this.remitterCapitalDetailList = remitterCapitalDetailList;
    return this;
  }

  public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner addRemitterCapitalDetailListItem(CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner remitterCapitalDetailListItem) {
    if (this.remitterCapitalDetailList == null) {
      this.remitterCapitalDetailList = new ArrayList<>();
    }
    this.remitterCapitalDetailList.add(remitterCapitalDetailListItem);
    return this;
  }

   /**
   * 减款钱包可转资金列表
   * @return remitterCapitalDetailList
  **/
  @javax.annotation.Nullable
  public List<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner> getRemitterCapitalDetailList() {
    return remitterCapitalDetailList;
  }


  public void setRemitterCapitalDetailList(List<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner> remitterCapitalDetailList) {
    this.remitterCapitalDetailList = remitterCapitalDetailList;
  }


  public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner remitterWalletId(Long remitterWalletId) {
    
    this.remitterWalletId = remitterWalletId;
    return this;
  }

   /**
   * 减款钱包id
   * @return remitterWalletId
  **/
  @javax.annotation.Nullable
  public Long getRemitterWalletId() {
    return remitterWalletId;
  }


  public void setRemitterWalletId(Long remitterWalletId) {
    this.remitterWalletId = remitterWalletId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner cgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner = (CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner) o;
    return Objects.equals(this.nonBrandMaxTransferBalance, cgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner.nonBrandMaxTransferBalance) &&
        Objects.equals(this.payeeTransferAmountDetailList, cgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner.payeeTransferAmountDetailList) &&
        Objects.equals(this.remitterCapitalDetailList, cgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner.remitterCapitalDetailList) &&
        Objects.equals(this.remitterWalletId, cgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner.remitterWalletId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonBrandMaxTransferBalance, payeeTransferAmountDetailList, remitterCapitalDetailList, remitterWalletId);
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
    sb.append("class CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner {\n");
    sb.append("    nonBrandMaxTransferBalance: ").append(toIndentedString(nonBrandMaxTransferBalance)).append("\n");
    sb.append("    payeeTransferAmountDetailList: ").append(toIndentedString(payeeTransferAmountDetailList)).append("\n");
    sb.append("    remitterCapitalDetailList: ").append(toIndentedString(remitterCapitalDetailList)).append("\n");
    sb.append("    remitterWalletId: ").append(toIndentedString(remitterWalletId)).append("\n");
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
    openapiFields.add("non_brand_max_transfer_balance");
    openapiFields.add("payee_transfer_amount_detail_list");
    openapiFields.add("remitter_capital_detail_list");
    openapiFields.add("remitter_wallet_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner
  */
  public static CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner.class);
  }

 /**
  * Convert an instance of CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

