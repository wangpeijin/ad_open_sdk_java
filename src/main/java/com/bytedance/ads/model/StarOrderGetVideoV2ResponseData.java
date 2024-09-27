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
import com.bytedance.ads.model.StarOrderGetVideoV2ResponseDataOrderVideoListInner;
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
public class StarOrderGetVideoV2ResponseData {
  public static final String SERIALIZED_NAME_ORDER_VIDEO_LIST = "order_video_list";
  @SerializedName(SERIALIZED_NAME_ORDER_VIDEO_LIST)
  private List<StarOrderGetVideoV2ResponseDataOrderVideoListInner> orderVideoList = null;

  public StarOrderGetVideoV2ResponseData() {
  }

  public StarOrderGetVideoV2ResponseData orderVideoList(List<StarOrderGetVideoV2ResponseDataOrderVideoListInner> orderVideoList) {
    
    this.orderVideoList = orderVideoList;
    return this;
  }

  public StarOrderGetVideoV2ResponseData addOrderVideoListItem(StarOrderGetVideoV2ResponseDataOrderVideoListInner orderVideoListItem) {
    if (this.orderVideoList == null) {
      this.orderVideoList = new ArrayList<>();
    }
    this.orderVideoList.add(orderVideoListItem);
    return this;
  }

   /**
   * 任务视频信息
   * @return orderVideoList
  **/
  @javax.annotation.Nullable
  public List<StarOrderGetVideoV2ResponseDataOrderVideoListInner> getOrderVideoList() {
    return orderVideoList;
  }


  public void setOrderVideoList(List<StarOrderGetVideoV2ResponseDataOrderVideoListInner> orderVideoList) {
    this.orderVideoList = orderVideoList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderGetVideoV2ResponseData starOrderGetVideoV2ResponseData = (StarOrderGetVideoV2ResponseData) o;
    return Objects.equals(this.orderVideoList, starOrderGetVideoV2ResponseData.orderVideoList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderVideoList);
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
    sb.append("class StarOrderGetVideoV2ResponseData {\n");
    sb.append("    orderVideoList: ").append(toIndentedString(orderVideoList)).append("\n");
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
    openapiFields.add("order_video_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetVideoV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetVideoV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetVideoV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetVideoV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetVideoV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarOrderGetVideoV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetVideoV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetVideoV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetVideoV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetVideoV2ResponseData
  */
  public static StarOrderGetVideoV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetVideoV2ResponseData.class);
  }

 /**
  * Convert an instance of StarOrderGetVideoV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

