/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class ReportRtaExpLocalDailyGetV30Filtering {
  public static final String SERIALIZED_NAME_BID_COEF = "bid_coef";
  @SerializedName(SERIALIZED_NAME_BID_COEF)
  private List<String> bidCoef = null;

  public ReportRtaExpLocalDailyGetV30Filtering() {
  }

  public ReportRtaExpLocalDailyGetV30Filtering bidCoef(List<String> bidCoef) {
    
    this.bidCoef = bidCoef;
    return this;
  }

  public ReportRtaExpLocalDailyGetV30Filtering addBidCoefItem(String bidCoefItem) {
    if (this.bidCoef == null) {
      this.bidCoef = new ArrayList<>();
    }
    this.bidCoef.add(bidCoefItem);
    return this;
  }

   /**
   * 
   * @return bidCoef
  **/
  @javax.annotation.Nullable
  public List<String> getBidCoef() {
    return bidCoef;
  }


  public void setBidCoef(List<String> bidCoef) {
    this.bidCoef = bidCoef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRtaExpLocalDailyGetV30Filtering reportRtaExpLocalDailyGetV30Filtering = (ReportRtaExpLocalDailyGetV30Filtering) o;
    return Objects.equals(this.bidCoef, reportRtaExpLocalDailyGetV30Filtering.bidCoef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidCoef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRtaExpLocalDailyGetV30Filtering {\n");
    sb.append("    bidCoef: ").append(toIndentedString(bidCoef)).append("\n");
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
    openapiFields.add("bid_coef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportRtaExpLocalDailyGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportRtaExpLocalDailyGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportRtaExpLocalDailyGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportRtaExpLocalDailyGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportRtaExpLocalDailyGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, ReportRtaExpLocalDailyGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportRtaExpLocalDailyGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportRtaExpLocalDailyGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportRtaExpLocalDailyGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to ReportRtaExpLocalDailyGetV30Filtering
  */
  public static ReportRtaExpLocalDailyGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportRtaExpLocalDailyGetV30Filtering.class);
  }

 /**
  * Convert an instance of ReportRtaExpLocalDailyGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

