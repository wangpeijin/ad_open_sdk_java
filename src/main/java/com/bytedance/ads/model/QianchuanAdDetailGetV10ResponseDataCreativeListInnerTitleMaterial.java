/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataCreativeListTitleMaterialTitleType;
import com.bytedance.ads.model.QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterialDynamicWordsInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial {
  public static final String SERIALIZED_NAME_DYNAMIC_WORDS = "dynamic_words";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_WORDS)
  private List<QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterialDynamicWordsInner> dynamicWords = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_TITLE_TYPE = "title_type";
  @SerializedName(SERIALIZED_NAME_TITLE_TYPE)
  private QianchuanAdDetailGetV10DataCreativeListTitleMaterialTitleType titleType = null;

  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial() {
  }

  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial dynamicWords(List<QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterialDynamicWordsInner> dynamicWords) {
    
    this.dynamicWords = dynamicWords;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial addDynamicWordsItem(QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterialDynamicWordsInner dynamicWordsItem) {
    if (this.dynamicWords == null) {
      this.dynamicWords = new ArrayList<>();
    }
    this.dynamicWords.add(dynamicWordsItem);
    return this;
  }

   /**
   * 
   * @return dynamicWords
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterialDynamicWordsInner> getDynamicWords() {
    return dynamicWords;
  }


  public void setDynamicWords(List<QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterialDynamicWordsInner> dynamicWords) {
    this.dynamicWords = dynamicWords;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial id(Long id) {
    
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


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial titleType(QianchuanAdDetailGetV10DataCreativeListTitleMaterialTitleType titleType) {
    
    this.titleType = titleType;
    return this;
  }

   /**
   * Get titleType
   * @return titleType
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataCreativeListTitleMaterialTitleType getTitleType() {
    return titleType;
  }


  public void setTitleType(QianchuanAdDetailGetV10DataCreativeListTitleMaterialTitleType titleType) {
    this.titleType = titleType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial qianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial = (QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial) o;
    return Objects.equals(this.dynamicWords, qianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial.dynamicWords) &&
        Objects.equals(this.id, qianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial.id) &&
        Objects.equals(this.title, qianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial.title) &&
        Objects.equals(this.titleType, qianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial.titleType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicWords, id, title, titleType);
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
    sb.append("class QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial {\n");
    sb.append("    dynamicWords: ").append(toIndentedString(dynamicWords)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleType: ").append(toIndentedString(titleType)).append("\n");
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
    openapiFields.add("dynamic_words");
    openapiFields.add("id");
    openapiFields.add("title");
    openapiFields.add("title_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial>() {
           @Override
           public void write(JsonWriter out, QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial
  */
  public static QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial.class);
  }

 /**
  * Convert an instance of QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

