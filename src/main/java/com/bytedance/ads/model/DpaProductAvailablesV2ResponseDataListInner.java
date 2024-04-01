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
import com.bytedance.ads.model.DpaProductAvailablesV2DataListProductIndustry;
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
 * DpaProductAvailablesV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class DpaProductAvailablesV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PLATFORM_ID = "platform_id";
  @SerializedName(SERIALIZED_NAME_PLATFORM_ID)
  private Long platformId = null;

  public static final String SERIALIZED_NAME_PRODUCT_INDUSTRY = "product_industry";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INDUSTRY)
  private DpaProductAvailablesV2DataListProductIndustry productIndustry = null;

  public DpaProductAvailablesV2ResponseDataListInner() {
  }

  public DpaProductAvailablesV2ResponseDataListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DpaProductAvailablesV2ResponseDataListInner platformId(Long platformId) {
    
    this.platformId = platformId;
    return this;
  }

   /**
   * 
   * @return platformId
  **/
  @javax.annotation.Nullable
  public Long getPlatformId() {
    return platformId;
  }


  public void setPlatformId(Long platformId) {
    this.platformId = platformId;
  }


  public DpaProductAvailablesV2ResponseDataListInner productIndustry(DpaProductAvailablesV2DataListProductIndustry productIndustry) {
    
    this.productIndustry = productIndustry;
    return this;
  }

   /**
   * Get productIndustry
   * @return productIndustry
  **/
  @javax.annotation.Nullable
  public DpaProductAvailablesV2DataListProductIndustry getProductIndustry() {
    return productIndustry;
  }


  public void setProductIndustry(DpaProductAvailablesV2DataListProductIndustry productIndustry) {
    this.productIndustry = productIndustry;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaProductAvailablesV2ResponseDataListInner dpaProductAvailablesV2ResponseDataListInner = (DpaProductAvailablesV2ResponseDataListInner) o;
    return Objects.equals(this.name, dpaProductAvailablesV2ResponseDataListInner.name) &&
        Objects.equals(this.platformId, dpaProductAvailablesV2ResponseDataListInner.platformId) &&
        Objects.equals(this.productIndustry, dpaProductAvailablesV2ResponseDataListInner.productIndustry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, platformId, productIndustry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaProductAvailablesV2ResponseDataListInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platformId: ").append(toIndentedString(platformId)).append("\n");
    sb.append("    productIndustry: ").append(toIndentedString(productIndustry)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("platform_id");
    openapiFields.add("product_industry");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaProductAvailablesV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaProductAvailablesV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaProductAvailablesV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaProductAvailablesV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaProductAvailablesV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, DpaProductAvailablesV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaProductAvailablesV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaProductAvailablesV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaProductAvailablesV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to DpaProductAvailablesV2ResponseDataListInner
  */
  public static DpaProductAvailablesV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaProductAvailablesV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of DpaProductAvailablesV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

