/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeMaterialMetricsV2ResponseDataStatsValueDerivedMaterialsInner;
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
 * CreativeMaterialMetricsV2ResponseDataStatsValue
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-12-26T11:52:44.116511995+08:00[PRC]")
public class CreativeMaterialMetricsV2ResponseDataStatsValue {
  public static final String SERIALIZED_NAME_DERIVED_MATERIALS = "derived_materials";
  @SerializedName(SERIALIZED_NAME_DERIVED_MATERIALS)
  private List<CreativeMaterialMetricsV2ResponseDataStatsValueDerivedMaterialsInner> derivedMaterials = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_TOTAL_DERIVED_COST = "total_derived_cost";
  @SerializedName(SERIALIZED_NAME_TOTAL_DERIVED_COST)
  private Double totalDerivedCost = null;

  public CreativeMaterialMetricsV2ResponseDataStatsValue() {
  }

  public CreativeMaterialMetricsV2ResponseDataStatsValue derivedMaterials(List<CreativeMaterialMetricsV2ResponseDataStatsValueDerivedMaterialsInner> derivedMaterials) {
    
    this.derivedMaterials = derivedMaterials;
    return this;
  }

  public CreativeMaterialMetricsV2ResponseDataStatsValue addDerivedMaterialsItem(CreativeMaterialMetricsV2ResponseDataStatsValueDerivedMaterialsInner derivedMaterialsItem) {
    if (this.derivedMaterials == null) {
      this.derivedMaterials = new ArrayList<>();
    }
    this.derivedMaterials.add(derivedMaterialsItem);
    return this;
  }

   /**
   * 派生素材信息
   * @return derivedMaterials
  **/
  @javax.annotation.Nullable
  public List<CreativeMaterialMetricsV2ResponseDataStatsValueDerivedMaterialsInner> getDerivedMaterials() {
    return derivedMaterials;
  }


  public void setDerivedMaterials(List<CreativeMaterialMetricsV2ResponseDataStatsValueDerivedMaterialsInner> derivedMaterials) {
    this.derivedMaterials = derivedMaterials;
  }


  public CreativeMaterialMetricsV2ResponseDataStatsValue materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 源素材 ID
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public CreativeMaterialMetricsV2ResponseDataStatsValue totalDerivedCost(Double totalDerivedCost) {
    
    this.totalDerivedCost = totalDerivedCost;
    return this;
  }

   /**
   * 派生素材总计消耗（单位：元）
   * @return totalDerivedCost
  **/
  @javax.annotation.Nullable
  public Double getTotalDerivedCost() {
    return totalDerivedCost;
  }


  public void setTotalDerivedCost(Double totalDerivedCost) {
    this.totalDerivedCost = totalDerivedCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeMaterialMetricsV2ResponseDataStatsValue creativeMaterialMetricsV2ResponseDataStatsValue = (CreativeMaterialMetricsV2ResponseDataStatsValue) o;
    return Objects.equals(this.derivedMaterials, creativeMaterialMetricsV2ResponseDataStatsValue.derivedMaterials) &&
        Objects.equals(this.materialId, creativeMaterialMetricsV2ResponseDataStatsValue.materialId) &&
        Objects.equals(this.totalDerivedCost, creativeMaterialMetricsV2ResponseDataStatsValue.totalDerivedCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(derivedMaterials, materialId, totalDerivedCost);
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
    sb.append("class CreativeMaterialMetricsV2ResponseDataStatsValue {\n");
    sb.append("    derivedMaterials: ").append(toIndentedString(derivedMaterials)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    totalDerivedCost: ").append(toIndentedString(totalDerivedCost)).append("\n");
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
    openapiFields.add("derived_materials");
    openapiFields.add("material_id");
    openapiFields.add("total_derived_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeMaterialMetricsV2ResponseDataStatsValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeMaterialMetricsV2ResponseDataStatsValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeMaterialMetricsV2ResponseDataStatsValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeMaterialMetricsV2ResponseDataStatsValue.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeMaterialMetricsV2ResponseDataStatsValue>() {
           @Override
           public void write(JsonWriter out, CreativeMaterialMetricsV2ResponseDataStatsValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeMaterialMetricsV2ResponseDataStatsValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeMaterialMetricsV2ResponseDataStatsValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeMaterialMetricsV2ResponseDataStatsValue
  * @throws IOException if the JSON string is invalid with respect to CreativeMaterialMetricsV2ResponseDataStatsValue
  */
  public static CreativeMaterialMetricsV2ResponseDataStatsValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeMaterialMetricsV2ResponseDataStatsValue.class);
  }

 /**
  * Convert an instance of CreativeMaterialMetricsV2ResponseDataStatsValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

