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
import com.bytedance.ads.model.BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner;
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
 * BrandRegionGetV30ResponseDataRegionsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class BrandRegionGetV30ResponseDataRegionsInner {
  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SUB_REGIONS = "sub_regions";
  @SerializedName(SERIALIZED_NAME_SUB_REGIONS)
  private List<BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner> subRegions = null;

  public BrandRegionGetV30ResponseDataRegionsInner() {
  }

  public BrandRegionGetV30ResponseDataRegionsInner fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * 省市全名
   * @return fullName
  **/
  @javax.annotation.Nullable
  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public BrandRegionGetV30ResponseDataRegionsInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 城市ID
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public BrandRegionGetV30ResponseDataRegionsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 省市简称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BrandRegionGetV30ResponseDataRegionsInner subRegions(List<BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner> subRegions) {
    
    this.subRegions = subRegions;
    return this;
  }

  public BrandRegionGetV30ResponseDataRegionsInner addSubRegionsItem(BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner subRegionsItem) {
    if (this.subRegions == null) {
      this.subRegions = new ArrayList<>();
    }
    this.subRegions.add(subRegionsItem);
    return this;
  }

   /**
   * 子城市列表
   * @return subRegions
  **/
  @javax.annotation.Nullable
  public List<BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner> getSubRegions() {
    return subRegions;
  }


  public void setSubRegions(List<BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner> subRegions) {
    this.subRegions = subRegions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandRegionGetV30ResponseDataRegionsInner brandRegionGetV30ResponseDataRegionsInner = (BrandRegionGetV30ResponseDataRegionsInner) o;
    return Objects.equals(this.fullName, brandRegionGetV30ResponseDataRegionsInner.fullName) &&
        Objects.equals(this.id, brandRegionGetV30ResponseDataRegionsInner.id) &&
        Objects.equals(this.name, brandRegionGetV30ResponseDataRegionsInner.name) &&
        Objects.equals(this.subRegions, brandRegionGetV30ResponseDataRegionsInner.subRegions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, id, name, subRegions);
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
    sb.append("class BrandRegionGetV30ResponseDataRegionsInner {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subRegions: ").append(toIndentedString(subRegions)).append("\n");
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
    openapiFields.add("full_name");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("sub_regions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandRegionGetV30ResponseDataRegionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandRegionGetV30ResponseDataRegionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandRegionGetV30ResponseDataRegionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandRegionGetV30ResponseDataRegionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandRegionGetV30ResponseDataRegionsInner>() {
           @Override
           public void write(JsonWriter out, BrandRegionGetV30ResponseDataRegionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandRegionGetV30ResponseDataRegionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandRegionGetV30ResponseDataRegionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandRegionGetV30ResponseDataRegionsInner
  * @throws IOException if the JSON string is invalid with respect to BrandRegionGetV30ResponseDataRegionsInner
  */
  public static BrandRegionGetV30ResponseDataRegionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandRegionGetV30ResponseDataRegionsInner.class);
  }

 /**
  * Convert an instance of BrandRegionGetV30ResponseDataRegionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

