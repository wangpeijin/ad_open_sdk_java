/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeProductAvailableGetV10ResponseDataPageInfo;
import com.bytedance.ads.model.QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class QianchuanAwemeProductAvailableGetV10ResponseData {
  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private QianchuanAwemeProductAvailableGetV10ResponseDataPageInfo pageInfo = null;

  public static final String SERIALIZED_NAME_PRODUCT_LIST = "product_list";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LIST)
  private List<QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner> productList = null;

  public QianchuanAwemeProductAvailableGetV10ResponseData() {
  }

  public QianchuanAwemeProductAvailableGetV10ResponseData pageInfo(QianchuanAwemeProductAvailableGetV10ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeProductAvailableGetV10ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(QianchuanAwemeProductAvailableGetV10ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public QianchuanAwemeProductAvailableGetV10ResponseData productList(List<QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner> productList) {
    
    this.productList = productList;
    return this;
  }

  public QianchuanAwemeProductAvailableGetV10ResponseData addProductListItem(QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner productListItem) {
    if (this.productList == null) {
      this.productList = new ArrayList<>();
    }
    this.productList.add(productListItem);
    return this;
  }

   /**
   * 
   * @return productList
  **/
  @javax.annotation.Nullable
  public List<QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner> getProductList() {
    return productList;
  }


  public void setProductList(List<QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner> productList) {
    this.productList = productList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeProductAvailableGetV10ResponseData qianchuanAwemeProductAvailableGetV10ResponseData = (QianchuanAwemeProductAvailableGetV10ResponseData) o;
    return Objects.equals(this.pageInfo, qianchuanAwemeProductAvailableGetV10ResponseData.pageInfo) &&
        Objects.equals(this.productList, qianchuanAwemeProductAvailableGetV10ResponseData.productList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageInfo, productList);
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
    sb.append("class QianchuanAwemeProductAvailableGetV10ResponseData {\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    productList: ").append(toIndentedString(productList)).append("\n");
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
    openapiFields.add("page_info");
    openapiFields.add("product_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("product_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeProductAvailableGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeProductAvailableGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeProductAvailableGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeProductAvailableGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeProductAvailableGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeProductAvailableGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeProductAvailableGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeProductAvailableGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeProductAvailableGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeProductAvailableGetV10ResponseData
  */
  public static QianchuanAwemeProductAvailableGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeProductAvailableGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanAwemeProductAvailableGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

