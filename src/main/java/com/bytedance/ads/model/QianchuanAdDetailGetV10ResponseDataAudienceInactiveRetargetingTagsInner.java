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
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataAudienceInactiveRetargetingTagsInactiveType;
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
 * QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner {
  public static final String SERIALIZED_NAME_INACTIVE_TYPE = "inactive_type";
  @SerializedName(SERIALIZED_NAME_INACTIVE_TYPE)
  private QianchuanAdDetailGetV10DataAudienceInactiveRetargetingTagsInactiveType inactiveType = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAG = "retargeting_tag";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAG)
  private Long retargetingTag = null;

  public QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner() {
  }

  public QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner inactiveType(QianchuanAdDetailGetV10DataAudienceInactiveRetargetingTagsInactiveType inactiveType) {
    
    this.inactiveType = inactiveType;
    return this;
  }

   /**
   * Get inactiveType
   * @return inactiveType
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataAudienceInactiveRetargetingTagsInactiveType getInactiveType() {
    return inactiveType;
  }


  public void setInactiveType(QianchuanAdDetailGetV10DataAudienceInactiveRetargetingTagsInactiveType inactiveType) {
    this.inactiveType = inactiveType;
  }


  public QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner name(String name) {
    
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


  public QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner retargetingTag(Long retargetingTag) {
    
    this.retargetingTag = retargetingTag;
    return this;
  }

   /**
   * 
   * @return retargetingTag
  **/
  @javax.annotation.Nullable
  public Long getRetargetingTag() {
    return retargetingTag;
  }


  public void setRetargetingTag(Long retargetingTag) {
    this.retargetingTag = retargetingTag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner qianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner = (QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner) o;
    return Objects.equals(this.inactiveType, qianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner.inactiveType) &&
        Objects.equals(this.name, qianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner.name) &&
        Objects.equals(this.retargetingTag, qianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner.retargetingTag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(inactiveType, name, retargetingTag);
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
    sb.append("class QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner {\n");
    sb.append("    inactiveType: ").append(toIndentedString(inactiveType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    retargetingTag: ").append(toIndentedString(retargetingTag)).append("\n");
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
    openapiFields.add("inactive_type");
    openapiFields.add("name");
    openapiFields.add("retargeting_tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner
  */
  public static QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner.class);
  }

 /**
  * Convert an instance of QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

