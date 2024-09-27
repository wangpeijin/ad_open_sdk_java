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
import com.bytedance.ads.model.DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner;
import com.bytedance.ads.model.DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner;
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
public class DouplusOptionalTargetsListV30ResponseData {
  public static final String SERIALIZED_NAME_ITEM_RECOMMEND_EAS = "item_recommend_eas";
  @SerializedName(SERIALIZED_NAME_ITEM_RECOMMEND_EAS)
  private List<DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner> itemRecommendEas = null;

  public static final String SERIALIZED_NAME_LIVE_RECOMMEND_EAS = "live_recommend_eas";
  @SerializedName(SERIALIZED_NAME_LIVE_RECOMMEND_EAS)
  private List<DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner> liveRecommendEas = null;

  public DouplusOptionalTargetsListV30ResponseData() {
  }

  public DouplusOptionalTargetsListV30ResponseData itemRecommendEas(List<DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner> itemRecommendEas) {
    
    this.itemRecommendEas = itemRecommendEas;
    return this;
  }

  public DouplusOptionalTargetsListV30ResponseData addItemRecommendEasItem(DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner itemRecommendEasItem) {
    if (this.itemRecommendEas == null) {
      this.itemRecommendEas = new ArrayList<>();
    }
    this.itemRecommendEas.add(itemRecommendEasItem);
    return this;
  }

   /**
   * item可投转化目标列表
   * @return itemRecommendEas
  **/
  @javax.annotation.Nullable
  public List<DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner> getItemRecommendEas() {
    return itemRecommendEas;
  }


  public void setItemRecommendEas(List<DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner> itemRecommendEas) {
    this.itemRecommendEas = itemRecommendEas;
  }


  public DouplusOptionalTargetsListV30ResponseData liveRecommendEas(List<DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner> liveRecommendEas) {
    
    this.liveRecommendEas = liveRecommendEas;
    return this;
  }

  public DouplusOptionalTargetsListV30ResponseData addLiveRecommendEasItem(DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner liveRecommendEasItem) {
    if (this.liveRecommendEas == null) {
      this.liveRecommendEas = new ArrayList<>();
    }
    this.liveRecommendEas.add(liveRecommendEasItem);
    return this;
  }

   /**
   * 主播直播间支持的转化目标列表
   * @return liveRecommendEas
  **/
  @javax.annotation.Nullable
  public List<DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner> getLiveRecommendEas() {
    return liveRecommendEas;
  }


  public void setLiveRecommendEas(List<DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner> liveRecommendEas) {
    this.liveRecommendEas = liveRecommendEas;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOptionalTargetsListV30ResponseData douplusOptionalTargetsListV30ResponseData = (DouplusOptionalTargetsListV30ResponseData) o;
    return Objects.equals(this.itemRecommendEas, douplusOptionalTargetsListV30ResponseData.itemRecommendEas) &&
        Objects.equals(this.liveRecommendEas, douplusOptionalTargetsListV30ResponseData.liveRecommendEas);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemRecommendEas, liveRecommendEas);
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
    sb.append("class DouplusOptionalTargetsListV30ResponseData {\n");
    sb.append("    itemRecommendEas: ").append(toIndentedString(itemRecommendEas)).append("\n");
    sb.append("    liveRecommendEas: ").append(toIndentedString(liveRecommendEas)).append("\n");
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
    openapiFields.add("item_recommend_eas");
    openapiFields.add("live_recommend_eas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOptionalTargetsListV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOptionalTargetsListV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOptionalTargetsListV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOptionalTargetsListV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOptionalTargetsListV30ResponseData>() {
           @Override
           public void write(JsonWriter out, DouplusOptionalTargetsListV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOptionalTargetsListV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOptionalTargetsListV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOptionalTargetsListV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to DouplusOptionalTargetsListV30ResponseData
  */
  public static DouplusOptionalTargetsListV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOptionalTargetsListV30ResponseData.class);
  }

 /**
  * Convert an instance of DouplusOptionalTargetsListV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

