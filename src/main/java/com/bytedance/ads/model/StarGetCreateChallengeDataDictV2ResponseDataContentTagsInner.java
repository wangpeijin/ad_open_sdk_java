/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
 * StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner {
  public static final String SERIALIZED_NAME_PARENT_TAG_VALUE = "parent_tag_value";
  @SerializedName(SERIALIZED_NAME_PARENT_TAG_VALUE)
  private Long parentTagValue = null;

  public static final String SERIALIZED_NAME_TAG_NAME = "tag_name";
  @SerializedName(SERIALIZED_NAME_TAG_NAME)
  private String tagName = null;

  public static final String SERIALIZED_NAME_TAG_VALUE = "tag_value";
  @SerializedName(SERIALIZED_NAME_TAG_VALUE)
  private Long tagValue = null;

  public StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner() {
  }

  public StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner parentTagValue(Long parentTagValue) {
    
    this.parentTagValue = parentTagValue;
    return this;
  }

   /**
   * 父标签值，为0则无父标签
   * @return parentTagValue
  **/
  @javax.annotation.Nullable
  public Long getParentTagValue() {
    return parentTagValue;
  }


  public void setParentTagValue(Long parentTagValue) {
    this.parentTagValue = parentTagValue;
  }


  public StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner tagName(String tagName) {
    
    this.tagName = tagName;
    return this;
  }

   /**
   * 内容标签名称
   * @return tagName
  **/
  @javax.annotation.Nullable
  public String getTagName() {
    return tagName;
  }


  public void setTagName(String tagName) {
    this.tagName = tagName;
  }


  public StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner tagValue(Long tagValue) {
    
    this.tagValue = tagValue;
    return this;
  }

   /**
   * 内容标签值
   * @return tagValue
  **/
  @javax.annotation.Nullable
  public Long getTagValue() {
    return tagValue;
  }


  public void setTagValue(Long tagValue) {
    this.tagValue = tagValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner starGetCreateChallengeDataDictV2ResponseDataContentTagsInner = (StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner) o;
    return Objects.equals(this.parentTagValue, starGetCreateChallengeDataDictV2ResponseDataContentTagsInner.parentTagValue) &&
        Objects.equals(this.tagName, starGetCreateChallengeDataDictV2ResponseDataContentTagsInner.tagName) &&
        Objects.equals(this.tagValue, starGetCreateChallengeDataDictV2ResponseDataContentTagsInner.tagValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentTagValue, tagName, tagValue);
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
    sb.append("class StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner {\n");
    sb.append("    parentTagValue: ").append(toIndentedString(parentTagValue)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    tagValue: ").append(toIndentedString(tagValue)).append("\n");
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
    openapiFields.add("parent_tag_value");
    openapiFields.add("tag_name");
    openapiFields.add("tag_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner>() {
           @Override
           public void write(JsonWriter out, StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner
  * @throws IOException if the JSON string is invalid with respect to StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner
  */
  public static StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner.class);
  }

 /**
  * Convert an instance of StarGetCreateChallengeDataDictV2ResponseDataContentTagsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

