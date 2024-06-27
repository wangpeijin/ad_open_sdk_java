/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInnerCapitalDetailListInner;
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
 * CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner {
  public static final String SERIALIZED_NAME_CAPITAL_DETAIL_LIST = "capital_detail_list";
  @SerializedName(SERIALIZED_NAME_CAPITAL_DETAIL_LIST)
  private List<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInnerCapitalDetailListInner> capitalDetailList = null;

  public static final String SERIALIZED_NAME_NON_BRAND_MIN_TRANSFER_BALANCE = "non_brand_min_transfer_balance";
  @SerializedName(SERIALIZED_NAME_NON_BRAND_MIN_TRANSFER_BALANCE)
  private Long nonBrandMinTransferBalance = null;

  public static final String SERIALIZED_NAME_PAYEE_WALLET_ID = "payee_wallet_id";
  @SerializedName(SERIALIZED_NAME_PAYEE_WALLET_ID)
  private Long payeeWalletId = null;

  public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner() {
  }

  public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner capitalDetailList(List<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInnerCapitalDetailListInner> capitalDetailList) {
    
    this.capitalDetailList = capitalDetailList;
    return this;
  }

  public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner addCapitalDetailListItem(CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInnerCapitalDetailListInner capitalDetailListItem) {
    if (this.capitalDetailList == null) {
      this.capitalDetailList = new ArrayList<>();
    }
    this.capitalDetailList.add(capitalDetailListItem);
    return this;
  }

   /**
   * 加款钱包可转资金列表
   * @return capitalDetailList
  **/
  @javax.annotation.Nullable
  public List<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInnerCapitalDetailListInner> getCapitalDetailList() {
    return capitalDetailList;
  }


  public void setCapitalDetailList(List<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInnerCapitalDetailListInner> capitalDetailList) {
    this.capitalDetailList = capitalDetailList;
  }


  public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner nonBrandMinTransferBalance(Long nonBrandMinTransferBalance) {
    
    this.nonBrandMinTransferBalance = nonBrandMinTransferBalance;
    return this;
  }

   /**
   * 加款钱包非品牌资金最小转入金额（单位：分）
   * @return nonBrandMinTransferBalance
  **/
  @javax.annotation.Nullable
  public Long getNonBrandMinTransferBalance() {
    return nonBrandMinTransferBalance;
  }


  public void setNonBrandMinTransferBalance(Long nonBrandMinTransferBalance) {
    this.nonBrandMinTransferBalance = nonBrandMinTransferBalance;
  }


  public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner payeeWalletId(Long payeeWalletId) {
    
    this.payeeWalletId = payeeWalletId;
    return this;
  }

   /**
   * 加款钱包id
   * @return payeeWalletId
  **/
  @javax.annotation.Nullable
  public Long getPayeeWalletId() {
    return payeeWalletId;
  }


  public void setPayeeWalletId(Long payeeWalletId) {
    this.payeeWalletId = payeeWalletId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner cgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner = (CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner) o;
    return Objects.equals(this.capitalDetailList, cgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner.capitalDetailList) &&
        Objects.equals(this.nonBrandMinTransferBalance, cgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner.nonBrandMinTransferBalance) &&
        Objects.equals(this.payeeWalletId, cgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner.payeeWalletId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(capitalDetailList, nonBrandMinTransferBalance, payeeWalletId);
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
    sb.append("class CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner {\n");
    sb.append("    capitalDetailList: ").append(toIndentedString(capitalDetailList)).append("\n");
    sb.append("    nonBrandMinTransferBalance: ").append(toIndentedString(nonBrandMinTransferBalance)).append("\n");
    sb.append("    payeeWalletId: ").append(toIndentedString(payeeWalletId)).append("\n");
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
    openapiFields.add("capital_detail_list");
    openapiFields.add("non_brand_min_transfer_balance");
    openapiFields.add("payee_wallet_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner
  */
  public static CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner.class);
  }

 /**
  * Convert an instance of CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerPayeeTransferAmountDetailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

