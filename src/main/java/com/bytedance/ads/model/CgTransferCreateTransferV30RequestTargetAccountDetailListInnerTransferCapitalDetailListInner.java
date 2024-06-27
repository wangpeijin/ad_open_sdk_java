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
import com.bytedance.ads.model.CgTransferCreateTransferV30TargetAccountDetailListTransferCapitalDetailListCapitalType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner {
  public static final String SERIALIZED_NAME_CAPITAL_TYPE = "capital_type";
  @SerializedName(SERIALIZED_NAME_CAPITAL_TYPE)
  private CgTransferCreateTransferV30TargetAccountDetailListTransferCapitalDetailListCapitalType capitalType = null;

  public static final String SERIALIZED_NAME_TRANSFER_AMOUNT = "transfer_amount";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AMOUNT)
  private Long transferAmount = null;

  public CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner() {
  }

  public CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner capitalType(CgTransferCreateTransferV30TargetAccountDetailListTransferCapitalDetailListCapitalType capitalType) {
    
    this.capitalType = capitalType;
    return this;
  }

   /**
   * Get capitalType
   * @return capitalType
  **/
  @javax.annotation.Nonnull
  public CgTransferCreateTransferV30TargetAccountDetailListTransferCapitalDetailListCapitalType getCapitalType() {
    return capitalType;
  }


  public void setCapitalType(CgTransferCreateTransferV30TargetAccountDetailListTransferCapitalDetailListCapitalType capitalType) {
    this.capitalType = capitalType;
  }


  public CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner transferAmount(Long transferAmount) {
    
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * 转账资金金额(单位：分)
   * @return transferAmount
  **/
  @javax.annotation.Nonnull
  public Long getTransferAmount() {
    return transferAmount;
  }


  public void setTransferAmount(Long transferAmount) {
    this.transferAmount = transferAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner cgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner = (CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner) o;
    return Objects.equals(this.capitalType, cgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner.capitalType) &&
        Objects.equals(this.transferAmount, cgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner.transferAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capitalType, transferAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner {\n");
    sb.append("    capitalType: ").append(toIndentedString(capitalType)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
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
    openapiFields.add("transfer_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("capital_type");
    openapiRequiredFields.add("transfer_amount");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner
  */
  public static CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner.class);
  }

 /**
  * Convert an instance of CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

