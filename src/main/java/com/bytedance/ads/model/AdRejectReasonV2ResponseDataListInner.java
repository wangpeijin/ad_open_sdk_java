/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdRejectReasonV2ResponseDataListInnerAdReject;
import com.bytedance.ads.model.AdRejectReasonV2ResponseDataListInnerCreativeRejectInner;
import com.bytedance.ads.model.AdRejectReasonV2ResponseDataListInnerMaterialRejectInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * AdRejectReasonV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class AdRejectReasonV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_REJECT = "ad_reject";
  @SerializedName(SERIALIZED_NAME_AD_REJECT)
  private AdRejectReasonV2ResponseDataListInnerAdReject adReject = null;

  public static final String SERIALIZED_NAME_CREATIVE_REJECT = "creative_reject";
  @SerializedName(SERIALIZED_NAME_CREATIVE_REJECT)
  private List<AdRejectReasonV2ResponseDataListInnerCreativeRejectInner> creativeReject = null;

  public static final String SERIALIZED_NAME_MATERIAL_REJECT = "material_reject";
  @SerializedName(SERIALIZED_NAME_MATERIAL_REJECT)
  private List<AdRejectReasonV2ResponseDataListInnerMaterialRejectInner> materialReject = null;

  public AdRejectReasonV2ResponseDataListInner() {
  }

  public AdRejectReasonV2ResponseDataListInner adReject(AdRejectReasonV2ResponseDataListInnerAdReject adReject) {
    
    this.adReject = adReject;
    return this;
  }

   /**
   * Get adReject
   * @return adReject
  **/
  @javax.annotation.Nullable
  public AdRejectReasonV2ResponseDataListInnerAdReject getAdReject() {
    return adReject;
  }


  public void setAdReject(AdRejectReasonV2ResponseDataListInnerAdReject adReject) {
    this.adReject = adReject;
  }


  public AdRejectReasonV2ResponseDataListInner creativeReject(List<AdRejectReasonV2ResponseDataListInnerCreativeRejectInner> creativeReject) {
    
    this.creativeReject = creativeReject;
    return this;
  }

  public AdRejectReasonV2ResponseDataListInner addCreativeRejectItem(AdRejectReasonV2ResponseDataListInnerCreativeRejectInner creativeRejectItem) {
    if (this.creativeReject == null) {
      this.creativeReject = new ArrayList<>();
    }
    this.creativeReject.add(creativeRejectItem);
    return this;
  }

   /**
   * 
   * @return creativeReject
  **/
  @javax.annotation.Nullable
  public List<AdRejectReasonV2ResponseDataListInnerCreativeRejectInner> getCreativeReject() {
    return creativeReject;
  }


  public void setCreativeReject(List<AdRejectReasonV2ResponseDataListInnerCreativeRejectInner> creativeReject) {
    this.creativeReject = creativeReject;
  }


  public AdRejectReasonV2ResponseDataListInner materialReject(List<AdRejectReasonV2ResponseDataListInnerMaterialRejectInner> materialReject) {
    
    this.materialReject = materialReject;
    return this;
  }

  public AdRejectReasonV2ResponseDataListInner addMaterialRejectItem(AdRejectReasonV2ResponseDataListInnerMaterialRejectInner materialRejectItem) {
    if (this.materialReject == null) {
      this.materialReject = new ArrayList<>();
    }
    this.materialReject.add(materialRejectItem);
    return this;
  }

   /**
   * 
   * @return materialReject
  **/
  @javax.annotation.Nullable
  public List<AdRejectReasonV2ResponseDataListInnerMaterialRejectInner> getMaterialReject() {
    return materialReject;
  }


  public void setMaterialReject(List<AdRejectReasonV2ResponseDataListInnerMaterialRejectInner> materialReject) {
    this.materialReject = materialReject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdRejectReasonV2ResponseDataListInner adRejectReasonV2ResponseDataListInner = (AdRejectReasonV2ResponseDataListInner) o;
    return Objects.equals(this.adReject, adRejectReasonV2ResponseDataListInner.adReject) &&
        Objects.equals(this.creativeReject, adRejectReasonV2ResponseDataListInner.creativeReject) &&
        Objects.equals(this.materialReject, adRejectReasonV2ResponseDataListInner.materialReject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adReject, creativeReject, materialReject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdRejectReasonV2ResponseDataListInner {\n");
    sb.append("    adReject: ").append(toIndentedString(adReject)).append("\n");
    sb.append("    creativeReject: ").append(toIndentedString(creativeReject)).append("\n");
    sb.append("    materialReject: ").append(toIndentedString(materialReject)).append("\n");
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
    openapiFields.add("ad_reject");
    openapiFields.add("creative_reject");
    openapiFields.add("material_reject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdRejectReasonV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdRejectReasonV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdRejectReasonV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdRejectReasonV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdRejectReasonV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, AdRejectReasonV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdRejectReasonV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdRejectReasonV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdRejectReasonV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to AdRejectReasonV2ResponseDataListInner
  */
  public static AdRejectReasonV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdRejectReasonV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of AdRejectReasonV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

