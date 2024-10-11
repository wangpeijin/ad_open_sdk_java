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
import com.bytedance.ads.model.AdvertiserDeliveryPkgDeleteV30ResponseDataErrorsInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class AdvertiserDeliveryPkgDeleteV30ResponseData {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<AdvertiserDeliveryPkgDeleteV30ResponseDataErrorsInner> errors = null;

  public static final String SERIALIZED_NAME_PKG_IDS = "pkg_ids";
  @SerializedName(SERIALIZED_NAME_PKG_IDS)
  private List<Long> pkgIds = null;

  public AdvertiserDeliveryPkgDeleteV30ResponseData() {
  }

  public AdvertiserDeliveryPkgDeleteV30ResponseData errors(List<AdvertiserDeliveryPkgDeleteV30ResponseDataErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public AdvertiserDeliveryPkgDeleteV30ResponseData addErrorsItem(AdvertiserDeliveryPkgDeleteV30ResponseDataErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * 删除失败的行业产品列表
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<AdvertiserDeliveryPkgDeleteV30ResponseDataErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<AdvertiserDeliveryPkgDeleteV30ResponseDataErrorsInner> errors) {
    this.errors = errors;
  }


  public AdvertiserDeliveryPkgDeleteV30ResponseData pkgIds(List<Long> pkgIds) {
    
    this.pkgIds = pkgIds;
    return this;
  }

  public AdvertiserDeliveryPkgDeleteV30ResponseData addPkgIdsItem(Long pkgIdsItem) {
    if (this.pkgIds == null) {
      this.pkgIds = new ArrayList<>();
    }
    this.pkgIds.add(pkgIdsItem);
    return this;
  }

   /**
   * 删除成功的推广产品id
   * @return pkgIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPkgIds() {
    return pkgIds;
  }


  public void setPkgIds(List<Long> pkgIds) {
    this.pkgIds = pkgIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryPkgDeleteV30ResponseData advertiserDeliveryPkgDeleteV30ResponseData = (AdvertiserDeliveryPkgDeleteV30ResponseData) o;
    return Objects.equals(this.errors, advertiserDeliveryPkgDeleteV30ResponseData.errors) &&
        Objects.equals(this.pkgIds, advertiserDeliveryPkgDeleteV30ResponseData.pkgIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, pkgIds);
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
    sb.append("class AdvertiserDeliveryPkgDeleteV30ResponseData {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    pkgIds: ").append(toIndentedString(pkgIds)).append("\n");
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
    openapiFields.add("errors");
    openapiFields.add("pkg_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryPkgDeleteV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryPkgDeleteV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryPkgDeleteV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryPkgDeleteV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryPkgDeleteV30ResponseData>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryPkgDeleteV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryPkgDeleteV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryPkgDeleteV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryPkgDeleteV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryPkgDeleteV30ResponseData
  */
  public static AdvertiserDeliveryPkgDeleteV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryPkgDeleteV30ResponseData.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryPkgDeleteV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

