/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner;
import com.bytedance.ads.model.QianchuanAdMaterialGetV10ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class QianchuanAdMaterialGetV10ResponseData {
  public static final String SERIALIZED_NAME_AD_MATERIAL_INFOS = "ad_material_infos";
  @SerializedName(SERIALIZED_NAME_AD_MATERIAL_INFOS)
  private List<QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner> adMaterialInfos = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private QianchuanAdMaterialGetV10ResponseDataPageInfo pageInfo = null;

  public QianchuanAdMaterialGetV10ResponseData() {
  }

  public QianchuanAdMaterialGetV10ResponseData adMaterialInfos(List<QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner> adMaterialInfos) {
    
    this.adMaterialInfos = adMaterialInfos;
    return this;
  }

  public QianchuanAdMaterialGetV10ResponseData addAdMaterialInfosItem(QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner adMaterialInfosItem) {
    if (this.adMaterialInfos == null) {
      this.adMaterialInfos = new ArrayList<>();
    }
    this.adMaterialInfos.add(adMaterialInfosItem);
    return this;
  }

   /**
   * 返回的素材信息列表
   * @return adMaterialInfos
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner> getAdMaterialInfos() {
    return adMaterialInfos;
  }


  public void setAdMaterialInfos(List<QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner> adMaterialInfos) {
    this.adMaterialInfos = adMaterialInfos;
  }


  public QianchuanAdMaterialGetV10ResponseData pageInfo(QianchuanAdMaterialGetV10ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAdMaterialGetV10ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(QianchuanAdMaterialGetV10ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdMaterialGetV10ResponseData qianchuanAdMaterialGetV10ResponseData = (QianchuanAdMaterialGetV10ResponseData) o;
    return Objects.equals(this.adMaterialInfos, qianchuanAdMaterialGetV10ResponseData.adMaterialInfos) &&
        Objects.equals(this.pageInfo, qianchuanAdMaterialGetV10ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adMaterialInfos, pageInfo);
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
    sb.append("class QianchuanAdMaterialGetV10ResponseData {\n");
    sb.append("    adMaterialInfos: ").append(toIndentedString(adMaterialInfos)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("ad_material_infos");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_material_infos");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdMaterialGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdMaterialGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdMaterialGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdMaterialGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdMaterialGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanAdMaterialGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdMaterialGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdMaterialGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdMaterialGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdMaterialGetV10ResponseData
  */
  public static QianchuanAdMaterialGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdMaterialGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanAdMaterialGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
