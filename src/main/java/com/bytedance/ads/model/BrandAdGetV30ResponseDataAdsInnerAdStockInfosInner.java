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
import com.bytedance.ads.model.BrandAdGetV30DataAdsAdStockInfosAdForm;
import com.bytedance.ads.model.BrandAdGetV30DataAdsAdStockInfosAppOrigin;
import com.bytedance.ads.model.BrandAdGetV30DataAdsAdStockInfosSuperiorCreativeType;
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
 * BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner {
  public static final String SERIALIZED_NAME_AD_FORM = "ad_form";
  @SerializedName(SERIALIZED_NAME_AD_FORM)
  private BrandAdGetV30DataAdsAdStockInfosAdForm adForm = null;

  public static final String SERIALIZED_NAME_APP_ORIGIN = "app_origin";
  @SerializedName(SERIALIZED_NAME_APP_ORIGIN)
  private BrandAdGetV30DataAdsAdStockInfosAppOrigin appOrigin = null;

  public static final String SERIALIZED_NAME_SUPERIOR_CREATIVE_TYPE = "superior_creative_type";
  @SerializedName(SERIALIZED_NAME_SUPERIOR_CREATIVE_TYPE)
  private BrandAdGetV30DataAdsAdStockInfosSuperiorCreativeType superiorCreativeType = null;

  public BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner() {
  }

  public BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner adForm(BrandAdGetV30DataAdsAdStockInfosAdForm adForm) {
    
    this.adForm = adForm;
    return this;
  }

   /**
   * Get adForm
   * @return adForm
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30DataAdsAdStockInfosAdForm getAdForm() {
    return adForm;
  }


  public void setAdForm(BrandAdGetV30DataAdsAdStockInfosAdForm adForm) {
    this.adForm = adForm;
  }


  public BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner appOrigin(BrandAdGetV30DataAdsAdStockInfosAppOrigin appOrigin) {
    
    this.appOrigin = appOrigin;
    return this;
  }

   /**
   * Get appOrigin
   * @return appOrigin
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30DataAdsAdStockInfosAppOrigin getAppOrigin() {
    return appOrigin;
  }


  public void setAppOrigin(BrandAdGetV30DataAdsAdStockInfosAppOrigin appOrigin) {
    this.appOrigin = appOrigin;
  }


  public BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner superiorCreativeType(BrandAdGetV30DataAdsAdStockInfosSuperiorCreativeType superiorCreativeType) {
    
    this.superiorCreativeType = superiorCreativeType;
    return this;
  }

   /**
   * Get superiorCreativeType
   * @return superiorCreativeType
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30DataAdsAdStockInfosSuperiorCreativeType getSuperiorCreativeType() {
    return superiorCreativeType;
  }


  public void setSuperiorCreativeType(BrandAdGetV30DataAdsAdStockInfosSuperiorCreativeType superiorCreativeType) {
    this.superiorCreativeType = superiorCreativeType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner brandAdGetV30ResponseDataAdsInnerAdStockInfosInner = (BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner) o;
    return Objects.equals(this.adForm, brandAdGetV30ResponseDataAdsInnerAdStockInfosInner.adForm) &&
        Objects.equals(this.appOrigin, brandAdGetV30ResponseDataAdsInnerAdStockInfosInner.appOrigin) &&
        Objects.equals(this.superiorCreativeType, brandAdGetV30ResponseDataAdsInnerAdStockInfosInner.superiorCreativeType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adForm, appOrigin, superiorCreativeType);
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
    sb.append("class BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner {\n");
    sb.append("    adForm: ").append(toIndentedString(adForm)).append("\n");
    sb.append("    appOrigin: ").append(toIndentedString(appOrigin)).append("\n");
    sb.append("    superiorCreativeType: ").append(toIndentedString(superiorCreativeType)).append("\n");
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
    openapiFields.add("ad_form");
    openapiFields.add("app_origin");
    openapiFields.add("superior_creative_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_form");
    openapiRequiredFields.add("app_origin");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner>() {
           @Override
           public void write(JsonWriter out, BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner
  * @throws IOException if the JSON string is invalid with respect to BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner
  */
  public static BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner.class);
  }

 /**
  * Convert an instance of BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

