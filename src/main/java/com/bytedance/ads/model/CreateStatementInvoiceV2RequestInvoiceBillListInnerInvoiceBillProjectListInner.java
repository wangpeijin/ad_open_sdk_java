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
 * CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner {
  public static final String SERIALIZED_NAME_APPLY_AMOUNT = "apply_amount";
  @SerializedName(SERIALIZED_NAME_APPLY_AMOUNT)
  private Double applyAmount = null;

  public static final String SERIALIZED_NAME_INVOICE_PROJECT_NAME = "invoice_project_name";
  @SerializedName(SERIALIZED_NAME_INVOICE_PROJECT_NAME)
  private String invoiceProjectName = null;

  public static final String SERIALIZED_NAME_SPECIFICATIONS = "specifications";
  @SerializedName(SERIALIZED_NAME_SPECIFICATIONS)
  private String specifications = null;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit = null;

  public CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner() {
  }

  public CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner applyAmount(Double applyAmount) {
    
    this.applyAmount = applyAmount;
    return this;
  }

   /**
   * 开票项目金额
   * @return applyAmount
  **/
  @javax.annotation.Nonnull
  public Double getApplyAmount() {
    return applyAmount;
  }


  public void setApplyAmount(Double applyAmount) {
    this.applyAmount = applyAmount;
  }


  public CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner invoiceProjectName(String invoiceProjectName) {
    
    this.invoiceProjectName = invoiceProjectName;
    return this;
  }

   /**
   * 开票项目名称
   * @return invoiceProjectName
  **/
  @javax.annotation.Nonnull
  public String getInvoiceProjectName() {
    return invoiceProjectName;
  }


  public void setInvoiceProjectName(String invoiceProjectName) {
    this.invoiceProjectName = invoiceProjectName;
  }


  public CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner specifications(String specifications) {
    
    this.specifications = specifications;
    return this;
  }

   /**
   * 规则型号
   * @return specifications
  **/
  @javax.annotation.Nullable
  public String getSpecifications() {
    return specifications;
  }


  public void setSpecifications(String specifications) {
    this.specifications = specifications;
  }


  public CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * 单位
   * @return unit
  **/
  @javax.annotation.Nullable
  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner createStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner = (CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner) o;
    return Objects.equals(this.applyAmount, createStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner.applyAmount) &&
        Objects.equals(this.invoiceProjectName, createStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner.invoiceProjectName) &&
        Objects.equals(this.specifications, createStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner.specifications) &&
        Objects.equals(this.unit, createStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyAmount, invoiceProjectName, specifications, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner {\n");
    sb.append("    applyAmount: ").append(toIndentedString(applyAmount)).append("\n");
    sb.append("    invoiceProjectName: ").append(toIndentedString(invoiceProjectName)).append("\n");
    sb.append("    specifications: ").append(toIndentedString(specifications)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
    openapiFields.add("invoice_project_name");
    openapiFields.add("specifications");
    openapiFields.add("unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("apply_amount");
    openapiRequiredFields.add("invoice_project_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner>() {
           @Override
           public void write(JsonWriter out, CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner
  * @throws IOException if the JSON string is invalid with respect to CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner
  */
  public static CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner.class);
  }

 /**
  * Convert an instance of CreateStatementInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

