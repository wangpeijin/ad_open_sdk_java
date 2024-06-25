/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CgTransferWalletTransferCreateV30TargetWalletDetailListTransferCapitalDetailListCapitalType;
import com.bytedance.ads.model.CgTransferWalletTransferCreateV30TargetWalletDetailListTransferCapitalDetailListPlatform;
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
 * CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner {
  public static final String SERIALIZED_NAME_CAPITAL_TYPE = "capital_type";
  @SerializedName(SERIALIZED_NAME_CAPITAL_TYPE)
  private CgTransferWalletTransferCreateV30TargetWalletDetailListTransferCapitalDetailListCapitalType capitalType = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private CgTransferWalletTransferCreateV30TargetWalletDetailListTransferCapitalDetailListPlatform platform = null;

  public static final String SERIALIZED_NAME_TRANSFER_AMOUNT = "transfer_amount";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AMOUNT)
  private Long transferAmount = null;

  public CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner() {
  }

  public CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner capitalType(CgTransferWalletTransferCreateV30TargetWalletDetailListTransferCapitalDetailListCapitalType capitalType) {
    
    this.capitalType = capitalType;
    return this;
  }

   /**
   * Get capitalType
   * @return capitalType
  **/
  @javax.annotation.Nonnull
  public CgTransferWalletTransferCreateV30TargetWalletDetailListTransferCapitalDetailListCapitalType getCapitalType() {
    return capitalType;
  }


  public void setCapitalType(CgTransferWalletTransferCreateV30TargetWalletDetailListTransferCapitalDetailListCapitalType capitalType) {
    this.capitalType = capitalType;
  }


  public CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner platform(CgTransferWalletTransferCreateV30TargetWalletDetailListTransferCapitalDetailListPlatform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nonnull
  public CgTransferWalletTransferCreateV30TargetWalletDetailListTransferCapitalDetailListPlatform getPlatform() {
    return platform;
  }


  public void setPlatform(CgTransferWalletTransferCreateV30TargetWalletDetailListTransferCapitalDetailListPlatform platform) {
    this.platform = platform;
  }


  public CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner transferAmount(Long transferAmount) {
    
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * 申请转账金额（单位：分）
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
    CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner cgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner = (CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner) o;
    return Objects.equals(this.capitalType, cgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner.capitalType) &&
        Objects.equals(this.platform, cgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner.platform) &&
        Objects.equals(this.transferAmount, cgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner.transferAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capitalType, platform, transferAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner {\n");
    sb.append("    capitalType: ").append(toIndentedString(capitalType)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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
    openapiFields.add("platform");
    openapiFields.add("transfer_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("capital_type");
    openapiRequiredFields.add("platform");
    openapiRequiredFields.add("transfer_amount");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner
  */
  public static CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner.class);
  }

 /**
  * Convert an instance of CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

