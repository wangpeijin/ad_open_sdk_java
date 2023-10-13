/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
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
 * ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T17:19:23.525018957+08:00[PRC]")
public class ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner {
  public static final String SERIALIZED_NAME_COVER_NUM_STR = "cover_num_str";
  @SerializedName(SERIALIZED_NAME_COVER_NUM_STR)
  private String coverNumStr = null;

  public static final String SERIALIZED_NAME_FANS_NUM_STR = "fans_num_str";
  @SerializedName(SERIALIZED_NAME_FANS_NUM_STR)
  private String fansNumStr = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = null;

  public ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner() {
  }

  public ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner coverNumStr(String coverNumStr) {
    
    this.coverNumStr = coverNumStr;
    return this;
  }

   /**
   * 
   * @return coverNumStr
  **/
  @javax.annotation.Nullable
  public String getCoverNumStr() {
    return coverNumStr;
  }


  public void setCoverNumStr(String coverNumStr) {
    this.coverNumStr = coverNumStr;
  }


  public ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner fansNumStr(String fansNumStr) {
    
    this.fansNumStr = fansNumStr;
    return this;
  }

   /**
   * 
   * @return fansNumStr
  **/
  @javax.annotation.Nullable
  public String getFansNumStr() {
    return fansNumStr;
  }


  public void setFansNumStr(String fansNumStr) {
    this.fansNumStr = fansNumStr;
  }


  public ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner toolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner = (ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner) o;
    return Objects.equals(this.coverNumStr, toolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner.coverNumStr) &&
        Objects.equals(this.fansNumStr, toolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner.fansNumStr) &&
        Objects.equals(this.id, toolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner.id) &&
        Objects.equals(this.value, toolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverNumStr, fansNumStr, id, value);
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
    sb.append("class ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner {\n");
    sb.append("    coverNumStr: ").append(toIndentedString(coverNumStr)).append("\n");
    sb.append("    fansNumStr: ").append(toIndentedString(fansNumStr)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("cover_num_str");
    openapiFields.add("fans_num_str");
    openapiFields.add("id");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner
  */
  public static ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner.class);
  }

 /**
  * Convert an instance of ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInnerChildrenInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

