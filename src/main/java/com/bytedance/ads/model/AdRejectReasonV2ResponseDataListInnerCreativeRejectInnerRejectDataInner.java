/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
 * AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner {
  public static final String SERIALIZED_NAME_REJECT_ITEM = "reject_item";
  @SerializedName(SERIALIZED_NAME_REJECT_ITEM)
  private String rejectItem = null;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason = null;

  public AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner() {
  }

  public AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner rejectItem(String rejectItem) {
    
    this.rejectItem = rejectItem;
    return this;
  }

   /**
   * 
   * @return rejectItem
  **/
  @javax.annotation.Nullable
  public String getRejectItem() {
    return rejectItem;
  }


  public void setRejectItem(String rejectItem) {
    this.rejectItem = rejectItem;
  }


  public AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner rejectReason(String rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * 
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  public String getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner adRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner = (AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner) o;
    return Objects.equals(this.rejectItem, adRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner.rejectItem) &&
        Objects.equals(this.rejectReason, adRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner.rejectReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectItem, rejectReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner {\n");
    sb.append("    rejectItem: ").append(toIndentedString(rejectItem)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
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
    openapiFields.add("reject_item");
    openapiFields.add("reject_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner>() {
           @Override
           public void write(JsonWriter out, AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner
  * @throws IOException if the JSON string is invalid with respect to AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner
  */
  public static AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner.class);
  }

 /**
  * Convert an instance of AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerRejectDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

