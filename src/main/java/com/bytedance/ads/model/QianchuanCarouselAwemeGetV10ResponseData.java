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
import com.bytedance.ads.model.QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner;
import com.bytedance.ads.model.QianchuanCarouselAwemeGetV10ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class QianchuanCarouselAwemeGetV10ResponseData {
  public static final String SERIALIZED_NAME_IMAGE_AGGREGATE_LIST = "image_aggregate_list";
  @SerializedName(SERIALIZED_NAME_IMAGE_AGGREGATE_LIST)
  private List<QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner> imageAggregateList = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private QianchuanCarouselAwemeGetV10ResponseDataPageInfo pageInfo = null;

  public QianchuanCarouselAwemeGetV10ResponseData() {
  }

  public QianchuanCarouselAwemeGetV10ResponseData imageAggregateList(List<QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner> imageAggregateList) {
    
    this.imageAggregateList = imageAggregateList;
    return this;
  }

  public QianchuanCarouselAwemeGetV10ResponseData addImageAggregateListItem(QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner imageAggregateListItem) {
    if (this.imageAggregateList == null) {
      this.imageAggregateList = new ArrayList<>();
    }
    this.imageAggregateList.add(imageAggregateListItem);
    return this;
  }

   /**
   * 
   * @return imageAggregateList
  **/
  @javax.annotation.Nullable
  public List<QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner> getImageAggregateList() {
    return imageAggregateList;
  }


  public void setImageAggregateList(List<QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner> imageAggregateList) {
    this.imageAggregateList = imageAggregateList;
  }


  public QianchuanCarouselAwemeGetV10ResponseData pageInfo(QianchuanCarouselAwemeGetV10ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public QianchuanCarouselAwemeGetV10ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(QianchuanCarouselAwemeGetV10ResponseDataPageInfo pageInfo) {
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
    QianchuanCarouselAwemeGetV10ResponseData qianchuanCarouselAwemeGetV10ResponseData = (QianchuanCarouselAwemeGetV10ResponseData) o;
    return Objects.equals(this.imageAggregateList, qianchuanCarouselAwemeGetV10ResponseData.imageAggregateList) &&
        Objects.equals(this.pageInfo, qianchuanCarouselAwemeGetV10ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageAggregateList, pageInfo);
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
    sb.append("class QianchuanCarouselAwemeGetV10ResponseData {\n");
    sb.append("    imageAggregateList: ").append(toIndentedString(imageAggregateList)).append("\n");
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
    openapiFields.add("image_aggregate_list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCarouselAwemeGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCarouselAwemeGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCarouselAwemeGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCarouselAwemeGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCarouselAwemeGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanCarouselAwemeGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCarouselAwemeGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCarouselAwemeGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCarouselAwemeGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanCarouselAwemeGetV10ResponseData
  */
  public static QianchuanCarouselAwemeGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCarouselAwemeGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanCarouselAwemeGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

