/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInnerMetrics;
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
 * QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner {
  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private Long awemeId = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInnerMetrics metrics = null;

  public QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner() {
  }

  public QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner awemeId(Long awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public Long getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(Long awemeId) {
    this.awemeId = awemeId;
  }


  public QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner metrics(QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInnerMetrics metrics) {
    
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  public QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInnerMetrics getMetrics() {
    return metrics;
  }


  public void setMetrics(QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInnerMetrics metrics) {
    this.metrics = metrics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner qianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner = (QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner) o;
    return Objects.equals(this.awemeId, qianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner.awemeId) &&
        Objects.equals(this.materialId, qianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner.materialId) &&
        Objects.equals(this.metrics, qianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner.metrics);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeId, materialId, metrics);
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
    sb.append("class QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner {\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
    openapiFields.add("aweme_id");
    openapiFields.add("material_id");
    openapiFields.add("metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner>() {
           @Override
           public void write(JsonWriter out, QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner
  */
  public static QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner.class);
  }

 /**
  * Convert an instance of QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

