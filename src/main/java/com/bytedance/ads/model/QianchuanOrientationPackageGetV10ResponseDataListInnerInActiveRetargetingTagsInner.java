/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanOrientationPackageGetV10DataListInActiveRetargetingTagsInActiveType;
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
 * QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner {
  public static final String SERIALIZED_NAME_IN_ACTIVE_TYPE = "InActive_type";
  @SerializedName(SERIALIZED_NAME_IN_ACTIVE_TYPE)
  private QianchuanOrientationPackageGetV10DataListInActiveRetargetingTagsInActiveType inActiveType = null;

  public static final String SERIALIZED_NAME_RETARGETING_NAME = "retargeting_name";
  @SerializedName(SERIALIZED_NAME_RETARGETING_NAME)
  private String retargetingName = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAG = "retargeting_tag";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAG)
  private Long retargetingTag = null;

  public QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner() {
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner inActiveType(QianchuanOrientationPackageGetV10DataListInActiveRetargetingTagsInActiveType inActiveType) {
    
    this.inActiveType = inActiveType;
    return this;
  }

   /**
   * Get inActiveType
   * @return inActiveType
  **/
  @javax.annotation.Nullable
  public QianchuanOrientationPackageGetV10DataListInActiveRetargetingTagsInActiveType getInActiveType() {
    return inActiveType;
  }


  public void setInActiveType(QianchuanOrientationPackageGetV10DataListInActiveRetargetingTagsInActiveType inActiveType) {
    this.inActiveType = inActiveType;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner retargetingName(String retargetingName) {
    
    this.retargetingName = retargetingName;
    return this;
  }

   /**
   * 
   * @return retargetingName
  **/
  @javax.annotation.Nullable
  public String getRetargetingName() {
    return retargetingName;
  }


  public void setRetargetingName(String retargetingName) {
    this.retargetingName = retargetingName;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner retargetingTag(Long retargetingTag) {
    
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
    QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner qianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner = (QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner) o;
    return Objects.equals(this.inActiveType, qianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner.inActiveType) &&
        Objects.equals(this.retargetingName, qianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner.retargetingName) &&
        Objects.equals(this.retargetingTag, qianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner.retargetingTag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(inActiveType, retargetingName, retargetingTag);
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
    sb.append("class QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner {\n");
    sb.append("    inActiveType: ").append(toIndentedString(inActiveType)).append("\n");
    sb.append("    retargetingName: ").append(toIndentedString(retargetingName)).append("\n");
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
    openapiFields.add("InActive_type");
    openapiFields.add("retargeting_name");
    openapiFields.add("retargeting_tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner
  */
  public static QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner.class);
  }

 /**
  * Convert an instance of QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

