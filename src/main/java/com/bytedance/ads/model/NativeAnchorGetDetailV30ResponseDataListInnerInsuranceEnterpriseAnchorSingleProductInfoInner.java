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
 * NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner {
  public static final String SERIALIZED_NAME_SINGLE_PRODUCT_DETAIL = "single_product_detail";
  @SerializedName(SERIALIZED_NAME_SINGLE_PRODUCT_DETAIL)
  private String singleProductDetail = null;

  public static final String SERIALIZED_NAME_SINGLE_PRODUCT_NAME = "single_product_name";
  @SerializedName(SERIALIZED_NAME_SINGLE_PRODUCT_NAME)
  private String singleProductName = null;

  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner() {
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner singleProductDetail(String singleProductDetail) {
    
    this.singleProductDetail = singleProductDetail;
    return this;
  }

   /**
   * 服务描述，0/10
   * @return singleProductDetail
  **/
  @javax.annotation.Nullable
  public String getSingleProductDetail() {
    return singleProductDetail;
  }


  public void setSingleProductDetail(String singleProductDetail) {
    this.singleProductDetail = singleProductDetail;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner singleProductName(String singleProductName) {
    
    this.singleProductName = singleProductName;
    return this;
  }

   /**
   * 单项服务名称，0/15
   * @return singleProductName
  **/
  @javax.annotation.Nullable
  public String getSingleProductName() {
    return singleProductName;
  }


  public void setSingleProductName(String singleProductName) {
    this.singleProductName = singleProductName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner nativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner = (NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner) o;
    return Objects.equals(this.singleProductDetail, nativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner.singleProductDetail) &&
        Objects.equals(this.singleProductName, nativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner.singleProductName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(singleProductDetail, singleProductName);
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
    sb.append("class NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner {\n");
    sb.append("    singleProductDetail: ").append(toIndentedString(singleProductDetail)).append("\n");
    sb.append("    singleProductName: ").append(toIndentedString(singleProductName)).append("\n");
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
    openapiFields.add("single_product_detail");
    openapiFields.add("single_product_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner>() {
           @Override
           public void write(JsonWriter out, NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner
  */
  public static NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner.class);
  }

 /**
  * Convert an instance of NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

