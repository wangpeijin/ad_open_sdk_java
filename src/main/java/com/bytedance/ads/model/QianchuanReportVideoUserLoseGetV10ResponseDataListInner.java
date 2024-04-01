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
import com.bytedance.ads.model.QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields;
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
 * QianchuanReportVideoUserLoseGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class QianchuanReportVideoUserLoseGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields fields = null;

  public static final String SERIALIZED_NAME_H_SEC = "h_sec";
  @SerializedName(SERIALIZED_NAME_H_SEC)
  private Long hSec = null;

  public QianchuanReportVideoUserLoseGetV10ResponseDataListInner() {
  }

  public QianchuanReportVideoUserLoseGetV10ResponseDataListInner fields(QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields fields) {
    
    this.fields = fields;
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  public QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields getFields() {
    return fields;
  }


  public void setFields(QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields fields) {
    this.fields = fields;
  }


  public QianchuanReportVideoUserLoseGetV10ResponseDataListInner hSec(Long hSec) {
    
    this.hSec = hSec;
    return this;
  }

   /**
   * 
   * @return hSec
  **/
  @javax.annotation.Nullable
  public Long gethSec() {
    return hSec;
  }


  public void sethSec(Long hSec) {
    this.hSec = hSec;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanReportVideoUserLoseGetV10ResponseDataListInner qianchuanReportVideoUserLoseGetV10ResponseDataListInner = (QianchuanReportVideoUserLoseGetV10ResponseDataListInner) o;
    return Objects.equals(this.fields, qianchuanReportVideoUserLoseGetV10ResponseDataListInner.fields) &&
        Objects.equals(this.hSec, qianchuanReportVideoUserLoseGetV10ResponseDataListInner.hSec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, hSec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanReportVideoUserLoseGetV10ResponseDataListInner {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    hSec: ").append(toIndentedString(hSec)).append("\n");
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
    openapiFields.add("fields");
    openapiFields.add("h_sec");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fields");
    openapiRequiredFields.add("h_sec");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportVideoUserLoseGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportVideoUserLoseGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportVideoUserLoseGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportVideoUserLoseGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportVideoUserLoseGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanReportVideoUserLoseGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportVideoUserLoseGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportVideoUserLoseGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportVideoUserLoseGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportVideoUserLoseGetV10ResponseDataListInner
  */
  public static QianchuanReportVideoUserLoseGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportVideoUserLoseGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanReportVideoUserLoseGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

