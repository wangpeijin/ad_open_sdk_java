/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanReportCustomGetV10ResponseDataPagination;
import com.bytedance.ads.model.QianchuanReportCustomGetV10ResponseDataRowsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class QianchuanReportCustomGetV10ResponseData {
  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private QianchuanReportCustomGetV10ResponseDataPagination pagination = null;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<QianchuanReportCustomGetV10ResponseDataRowsInner> rows = null;

  public static final String SERIALIZED_NAME_TOTAL_METRICS = "total_metrics";
  @SerializedName(SERIALIZED_NAME_TOTAL_METRICS)
  private Map<String, String> totalMetrics = null;

  public QianchuanReportCustomGetV10ResponseData() {
  }

  public QianchuanReportCustomGetV10ResponseData pagination(QianchuanReportCustomGetV10ResponseDataPagination pagination) {
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  public QianchuanReportCustomGetV10ResponseDataPagination getPagination() {
    return pagination;
  }


  public void setPagination(QianchuanReportCustomGetV10ResponseDataPagination pagination) {
    this.pagination = pagination;
  }


  public QianchuanReportCustomGetV10ResponseData rows(List<QianchuanReportCustomGetV10ResponseDataRowsInner> rows) {
    
    this.rows = rows;
    return this;
  }

  public QianchuanReportCustomGetV10ResponseData addRowsItem(QianchuanReportCustomGetV10ResponseDataRowsInner rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * 
   * @return rows
  **/
  @javax.annotation.Nullable
  public List<QianchuanReportCustomGetV10ResponseDataRowsInner> getRows() {
    return rows;
  }


  public void setRows(List<QianchuanReportCustomGetV10ResponseDataRowsInner> rows) {
    this.rows = rows;
  }


  public QianchuanReportCustomGetV10ResponseData totalMetrics(Map<String, String> totalMetrics) {
    
    this.totalMetrics = totalMetrics;
    return this;
  }

  public QianchuanReportCustomGetV10ResponseData putTotalMetricsItem(String key, String totalMetricsItem) {
    if (this.totalMetrics == null) {
      this.totalMetrics = new HashMap<>();
    }
    this.totalMetrics.put(key, totalMetricsItem);
    return this;
  }

   /**
   * 
   * @return totalMetrics
  **/
  @javax.annotation.Nullable
  public Map<String, String> getTotalMetrics() {
    return totalMetrics;
  }


  public void setTotalMetrics(Map<String, String> totalMetrics) {
    this.totalMetrics = totalMetrics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanReportCustomGetV10ResponseData qianchuanReportCustomGetV10ResponseData = (QianchuanReportCustomGetV10ResponseData) o;
    return Objects.equals(this.pagination, qianchuanReportCustomGetV10ResponseData.pagination) &&
        Objects.equals(this.rows, qianchuanReportCustomGetV10ResponseData.rows) &&
        Objects.equals(this.totalMetrics, qianchuanReportCustomGetV10ResponseData.totalMetrics);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, rows, totalMetrics);
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
    sb.append("class QianchuanReportCustomGetV10ResponseData {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    totalMetrics: ").append(toIndentedString(totalMetrics)).append("\n");
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
    openapiFields.add("pagination");
    openapiFields.add("rows");
    openapiFields.add("total_metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportCustomGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportCustomGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportCustomGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportCustomGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportCustomGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanReportCustomGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportCustomGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportCustomGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportCustomGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportCustomGetV10ResponseData
  */
  public static QianchuanReportCustomGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportCustomGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanReportCustomGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

