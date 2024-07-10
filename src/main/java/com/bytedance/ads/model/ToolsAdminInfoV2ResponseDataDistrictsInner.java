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
import com.bytedance.ads.model.ToolsAdminInfoV2DataDistrictsLevel;
import com.bytedance.ads.model.ToolsAdminInfoV2ResponseDataDistrictsInnerSubDistrictsInner;
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
 * ToolsAdminInfoV2ResponseDataDistrictsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class ToolsAdminInfoV2ResponseDataDistrictsInner {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code = null;

  public static final String SERIALIZED_NAME_GEONAME_ID = "geoname_id";
  @SerializedName(SERIALIZED_NAME_GEONAME_ID)
  private Long geonameId = null;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private ToolsAdminInfoV2DataDistrictsLevel level = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SUB_DISTRICTS = "sub_districts";
  @SerializedName(SERIALIZED_NAME_SUB_DISTRICTS)
  private List<ToolsAdminInfoV2ResponseDataDistrictsInnerSubDistrictsInner> subDistricts = null;

  public ToolsAdminInfoV2ResponseDataDistrictsInner() {
  }

  public ToolsAdminInfoV2ResponseDataDistrictsInner code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 中国大陆行政区域编码
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ToolsAdminInfoV2ResponseDataDistrictsInner geonameId(Long geonameId) {
    
    this.geonameId = geonameId;
    return this;
  }

   /**
   * 港澳台、国外行政区域编码
   * @return geonameId
  **/
  @javax.annotation.Nullable
  public Long getGeonameId() {
    return geonameId;
  }


  public void setGeonameId(Long geonameId) {
    this.geonameId = geonameId;
  }


  public ToolsAdminInfoV2ResponseDataDistrictsInner level(ToolsAdminInfoV2DataDistrictsLevel level) {
    
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
  public ToolsAdminInfoV2DataDistrictsLevel getLevel() {
    return level;
  }


  public void setLevel(ToolsAdminInfoV2DataDistrictsLevel level) {
    this.level = level;
  }


  public ToolsAdminInfoV2ResponseDataDistrictsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 行政区域名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsAdminInfoV2ResponseDataDistrictsInner subDistricts(List<ToolsAdminInfoV2ResponseDataDistrictsInnerSubDistrictsInner> subDistricts) {
    
    this.subDistricts = subDistricts;
    return this;
  }

  public ToolsAdminInfoV2ResponseDataDistrictsInner addSubDistrictsItem(ToolsAdminInfoV2ResponseDataDistrictsInnerSubDistrictsInner subDistrictsItem) {
    if (this.subDistricts == null) {
      this.subDistricts = new ArrayList<>();
    }
    this.subDistricts.add(subDistrictsItem);
    return this;
  }

   /**
   * 子行政层级信息
   * @return subDistricts
  **/
  @javax.annotation.Nullable
  public List<ToolsAdminInfoV2ResponseDataDistrictsInnerSubDistrictsInner> getSubDistricts() {
    return subDistricts;
  }


  public void setSubDistricts(List<ToolsAdminInfoV2ResponseDataDistrictsInnerSubDistrictsInner> subDistricts) {
    this.subDistricts = subDistricts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAdminInfoV2ResponseDataDistrictsInner toolsAdminInfoV2ResponseDataDistrictsInner = (ToolsAdminInfoV2ResponseDataDistrictsInner) o;
    return Objects.equals(this.code, toolsAdminInfoV2ResponseDataDistrictsInner.code) &&
        Objects.equals(this.geonameId, toolsAdminInfoV2ResponseDataDistrictsInner.geonameId) &&
        Objects.equals(this.level, toolsAdminInfoV2ResponseDataDistrictsInner.level) &&
        Objects.equals(this.name, toolsAdminInfoV2ResponseDataDistrictsInner.name) &&
        Objects.equals(this.subDistricts, toolsAdminInfoV2ResponseDataDistrictsInner.subDistricts);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, geonameId, level, name, subDistricts);
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
    sb.append("class ToolsAdminInfoV2ResponseDataDistrictsInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    geonameId: ").append(toIndentedString(geonameId)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subDistricts: ").append(toIndentedString(subDistricts)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("geoname_id");
    openapiFields.add("level");
    openapiFields.add("name");
    openapiFields.add("sub_districts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAdminInfoV2ResponseDataDistrictsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAdminInfoV2ResponseDataDistrictsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAdminInfoV2ResponseDataDistrictsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAdminInfoV2ResponseDataDistrictsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAdminInfoV2ResponseDataDistrictsInner>() {
           @Override
           public void write(JsonWriter out, ToolsAdminInfoV2ResponseDataDistrictsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAdminInfoV2ResponseDataDistrictsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAdminInfoV2ResponseDataDistrictsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAdminInfoV2ResponseDataDistrictsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAdminInfoV2ResponseDataDistrictsInner
  */
  public static ToolsAdminInfoV2ResponseDataDistrictsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAdminInfoV2ResponseDataDistrictsInner.class);
  }

 /**
  * Convert an instance of ToolsAdminInfoV2ResponseDataDistrictsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

