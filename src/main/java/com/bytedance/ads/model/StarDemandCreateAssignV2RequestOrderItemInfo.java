/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandCreateAssignV2RequestOrderItemInfoAuthorListInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * 任务供给侧相关信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class StarDemandCreateAssignV2RequestOrderItemInfo {
  public static final String SERIALIZED_NAME_AUTHOR_LIST = "author_list";
  @SerializedName(SERIALIZED_NAME_AUTHOR_LIST)
  private List<StarDemandCreateAssignV2RequestOrderItemInfoAuthorListInner> authorList = null;

  public static final String SERIALIZED_NAME_ORDER_TYPE = "order_type";
  @SerializedName(SERIALIZED_NAME_ORDER_TYPE)
  private Long orderType = null;

  public StarDemandCreateAssignV2RequestOrderItemInfo() {
  }

  public StarDemandCreateAssignV2RequestOrderItemInfo authorList(List<StarDemandCreateAssignV2RequestOrderItemInfoAuthorListInner> authorList) {
    
    this.authorList = authorList;
    return this;
  }

  public StarDemandCreateAssignV2RequestOrderItemInfo addAuthorListItem(StarDemandCreateAssignV2RequestOrderItemInfoAuthorListInner authorListItem) {
    if (this.authorList == null) {
      this.authorList = new ArrayList<>();
    }
    this.authorList.add(authorListItem);
    return this;
  }

   /**
   * order_type
   * @return authorList
  **/
  @javax.annotation.Nullable
  public List<StarDemandCreateAssignV2RequestOrderItemInfoAuthorListInner> getAuthorList() {
    return authorList;
  }


  public void setAuthorList(List<StarDemandCreateAssignV2RequestOrderItemInfoAuthorListInner> authorList) {
    this.authorList = authorList;
  }


  public StarDemandCreateAssignV2RequestOrderItemInfo orderType(Long orderType) {
    
    this.orderType = orderType;
    return this;
  }

   /**
   * 任务付款类型 (1)：全款； (2)：预付
   * @return orderType
  **/
  @javax.annotation.Nullable
  public Long getOrderType() {
    return orderType;
  }


  public void setOrderType(Long orderType) {
    this.orderType = orderType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateAssignV2RequestOrderItemInfo starDemandCreateAssignV2RequestOrderItemInfo = (StarDemandCreateAssignV2RequestOrderItemInfo) o;
    return Objects.equals(this.authorList, starDemandCreateAssignV2RequestOrderItemInfo.authorList) &&
        Objects.equals(this.orderType, starDemandCreateAssignV2RequestOrderItemInfo.orderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorList, orderType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandCreateAssignV2RequestOrderItemInfo {\n");
    sb.append("    authorList: ").append(toIndentedString(authorList)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
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
    openapiFields.add("author_list");
    openapiFields.add("order_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("author_list");
    openapiRequiredFields.add("order_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateAssignV2RequestOrderItemInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateAssignV2RequestOrderItemInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateAssignV2RequestOrderItemInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateAssignV2RequestOrderItemInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateAssignV2RequestOrderItemInfo>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateAssignV2RequestOrderItemInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateAssignV2RequestOrderItemInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateAssignV2RequestOrderItemInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateAssignV2RequestOrderItemInfo
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateAssignV2RequestOrderItemInfo
  */
  public static StarDemandCreateAssignV2RequestOrderItemInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateAssignV2RequestOrderItemInfo.class);
  }

 /**
  * Convert an instance of StarDemandCreateAssignV2RequestOrderItemInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

