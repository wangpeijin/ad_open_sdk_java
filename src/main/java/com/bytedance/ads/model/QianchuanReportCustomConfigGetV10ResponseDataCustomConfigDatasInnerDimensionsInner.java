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
import com.bytedance.ads.model.QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig;
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
 * QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_EXCLUSION_DIMS = "exclusion_dims";
  @SerializedName(SERIALIZED_NAME_EXCLUSION_DIMS)
  private List<String> exclusionDims = null;

  public static final String SERIALIZED_NAME_EXCLUSION_METRICS = "exclusion_metrics";
  @SerializedName(SERIALIZED_NAME_EXCLUSION_METRICS)
  private List<String> exclusionMetrics = null;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field = null;

  public static final String SERIALIZED_NAME_FILTER_CONFIG = "filter_config";
  @SerializedName(SERIALIZED_NAME_FILTER_CONFIG)
  private QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig filterConfig = null;

  public static final String SERIALIZED_NAME_FILTERABLE = "filterable";
  @SerializedName(SERIALIZED_NAME_FILTERABLE)
  private Boolean filterable = null;

  public static final String SERIALIZED_NAME_IS_REQUIRED = "is_required";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
  private Boolean isRequired = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SORTABLE = "sortable";
  @SerializedName(SERIALIZED_NAME_SORTABLE)
  private Boolean sortable = null;

  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner() {
  }

  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner exclusionDims(List<String> exclusionDims) {
    
    this.exclusionDims = exclusionDims;
    return this;
  }

  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner addExclusionDimsItem(String exclusionDimsItem) {
    if (this.exclusionDims == null) {
      this.exclusionDims = new ArrayList<>();
    }
    this.exclusionDims.add(exclusionDimsItem);
    return this;
  }

   /**
   * 
   * @return exclusionDims
  **/
  @javax.annotation.Nullable
  public List<String> getExclusionDims() {
    return exclusionDims;
  }


  public void setExclusionDims(List<String> exclusionDims) {
    this.exclusionDims = exclusionDims;
  }


  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner exclusionMetrics(List<String> exclusionMetrics) {
    
    this.exclusionMetrics = exclusionMetrics;
    return this;
  }

  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner addExclusionMetricsItem(String exclusionMetricsItem) {
    if (this.exclusionMetrics == null) {
      this.exclusionMetrics = new ArrayList<>();
    }
    this.exclusionMetrics.add(exclusionMetricsItem);
    return this;
  }

   /**
   * 
   * @return exclusionMetrics
  **/
  @javax.annotation.Nullable
  public List<String> getExclusionMetrics() {
    return exclusionMetrics;
  }


  public void setExclusionMetrics(List<String> exclusionMetrics) {
    this.exclusionMetrics = exclusionMetrics;
  }


  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * 
   * @return field
  **/
  @javax.annotation.Nullable
  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner filterConfig(QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig filterConfig) {
    
    this.filterConfig = filterConfig;
    return this;
  }

   /**
   * Get filterConfig
   * @return filterConfig
  **/
  @javax.annotation.Nullable
  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig getFilterConfig() {
    return filterConfig;
  }


  public void setFilterConfig(QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig filterConfig) {
    this.filterConfig = filterConfig;
  }


  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner filterable(Boolean filterable) {
    
    this.filterable = filterable;
    return this;
  }

   /**
   * 
   * @return filterable
  **/
  @javax.annotation.Nullable
  public Boolean getFilterable() {
    return filterable;
  }


  public void setFilterable(Boolean filterable) {
    this.filterable = filterable;
  }


  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner isRequired(Boolean isRequired) {
    
    this.isRequired = isRequired;
    return this;
  }

   /**
   * 
   * @return isRequired
  **/
  @javax.annotation.Nullable
  public Boolean getIsRequired() {
    return isRequired;
  }


  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner name(String name) {
    
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


  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner sortable(Boolean sortable) {
    
    this.sortable = sortable;
    return this;
  }

   /**
   * 
   * @return sortable
  **/
  @javax.annotation.Nullable
  public Boolean getSortable() {
    return sortable;
  }


  public void setSortable(Boolean sortable) {
    this.sortable = sortable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner = (QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner) o;
    return Objects.equals(this.description, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner.description) &&
        Objects.equals(this.exclusionDims, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner.exclusionDims) &&
        Objects.equals(this.exclusionMetrics, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner.exclusionMetrics) &&
        Objects.equals(this.field, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner.field) &&
        Objects.equals(this.filterConfig, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner.filterConfig) &&
        Objects.equals(this.filterable, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner.filterable) &&
        Objects.equals(this.isRequired, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner.isRequired) &&
        Objects.equals(this.name, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner.name) &&
        Objects.equals(this.sortable, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner.sortable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, exclusionDims, exclusionMetrics, field, filterConfig, filterable, isRequired, name, sortable);
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
    sb.append("class QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    exclusionDims: ").append(toIndentedString(exclusionDims)).append("\n");
    sb.append("    exclusionMetrics: ").append(toIndentedString(exclusionMetrics)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    filterConfig: ").append(toIndentedString(filterConfig)).append("\n");
    sb.append("    filterable: ").append(toIndentedString(filterable)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sortable: ").append(toIndentedString(sortable)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("exclusion_dims");
    openapiFields.add("exclusion_metrics");
    openapiFields.add("field");
    openapiFields.add("filter_config");
    openapiFields.add("filterable");
    openapiFields.add("is_required");
    openapiFields.add("name");
    openapiFields.add("sortable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner
  */
  public static QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner.class);
  }

 /**
  * Convert an instance of QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

