/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
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
 * CreateStatementInvoiceV2RequestRebateItemListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class CreateStatementInvoiceV2RequestRebateItemListInner {
  public static final String SERIALIZED_NAME_APPLY_AMOUNT = "apply_amount";
  @SerializedName(SERIALIZED_NAME_APPLY_AMOUNT)
  private Double applyAmount = null;

  public static final String SERIALIZED_NAME_REBATE_SERIAL = "rebate_serial";
  @SerializedName(SERIALIZED_NAME_REBATE_SERIAL)
  private String rebateSerial = null;

  public CreateStatementInvoiceV2RequestRebateItemListInner() {
  }

  public CreateStatementInvoiceV2RequestRebateItemListInner applyAmount(Double applyAmount) {
    
    this.applyAmount = applyAmount;
    return this;
  }

   /**
   * 返点申请金额
   * @return applyAmount
  **/
  @javax.annotation.Nullable
  public Double getApplyAmount() {
    return applyAmount;
  }


  public void setApplyAmount(Double applyAmount) {
    this.applyAmount = applyAmount;
  }


  public CreateStatementInvoiceV2RequestRebateItemListInner rebateSerial(String rebateSerial) {
    
    this.rebateSerial = rebateSerial;
    return this;
  }

   /**
   * 返点编号
   * @return rebateSerial
  **/
  @javax.annotation.Nullable
  public String getRebateSerial() {
    return rebateSerial;
  }


  public void setRebateSerial(String rebateSerial) {
    this.rebateSerial = rebateSerial;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateStatementInvoiceV2RequestRebateItemListInner createStatementInvoiceV2RequestRebateItemListInner = (CreateStatementInvoiceV2RequestRebateItemListInner) o;
    return Objects.equals(this.applyAmount, createStatementInvoiceV2RequestRebateItemListInner.applyAmount) &&
        Objects.equals(this.rebateSerial, createStatementInvoiceV2RequestRebateItemListInner.rebateSerial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyAmount, rebateSerial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateStatementInvoiceV2RequestRebateItemListInner {\n");
    sb.append("    applyAmount: ").append(toIndentedString(applyAmount)).append("\n");
    sb.append("    rebateSerial: ").append(toIndentedString(rebateSerial)).append("\n");
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
    openapiFields.add("apply_amount");
    openapiFields.add("rebate_serial");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateStatementInvoiceV2RequestRebateItemListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateStatementInvoiceV2RequestRebateItemListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateStatementInvoiceV2RequestRebateItemListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateStatementInvoiceV2RequestRebateItemListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateStatementInvoiceV2RequestRebateItemListInner>() {
           @Override
           public void write(JsonWriter out, CreateStatementInvoiceV2RequestRebateItemListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateStatementInvoiceV2RequestRebateItemListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateStatementInvoiceV2RequestRebateItemListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateStatementInvoiceV2RequestRebateItemListInner
  * @throws IOException if the JSON string is invalid with respect to CreateStatementInvoiceV2RequestRebateItemListInner
  */
  public static CreateStatementInvoiceV2RequestRebateItemListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateStatementInvoiceV2RequestRebateItemListInner.class);
  }

 /**
  * Convert an instance of CreateStatementInvoiceV2RequestRebateItemListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

