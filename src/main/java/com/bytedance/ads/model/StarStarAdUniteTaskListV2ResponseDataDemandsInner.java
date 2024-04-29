/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.3
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
 * StarStarAdUniteTaskListV2ResponseDataDemandsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class StarStarAdUniteTaskListV2ResponseDataDemandsInner {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DEMAND_ID = "demand_id";
  @SerializedName(SERIALIZED_NAME_DEMAND_ID)
  private Long demandId = null;

  public static final String SERIALIZED_NAME_DEMAND_NAME = "demand_name";
  @SerializedName(SERIALIZED_NAME_DEMAND_NAME)
  private String demandName = null;

  public StarStarAdUniteTaskListV2ResponseDataDemandsInner() {
  }

  public StarStarAdUniteTaskListV2ResponseDataDemandsInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 任务创建时间，格式：yyyy-mm-dd HH:MM:SS
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public StarStarAdUniteTaskListV2ResponseDataDemandsInner demandId(Long demandId) {
    
    this.demandId = demandId;
    return this;
  }

   /**
   * 任务id
   * @return demandId
  **/
  @javax.annotation.Nullable
  public Long getDemandId() {
    return demandId;
  }


  public void setDemandId(Long demandId) {
    this.demandId = demandId;
  }


  public StarStarAdUniteTaskListV2ResponseDataDemandsInner demandName(String demandName) {
    
    this.demandName = demandName;
    return this;
  }

   /**
   * 任务名称
   * @return demandName
  **/
  @javax.annotation.Nullable
  public String getDemandName() {
    return demandName;
  }


  public void setDemandName(String demandName) {
    this.demandName = demandName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarStarAdUniteTaskListV2ResponseDataDemandsInner starStarAdUniteTaskListV2ResponseDataDemandsInner = (StarStarAdUniteTaskListV2ResponseDataDemandsInner) o;
    return Objects.equals(this.createTime, starStarAdUniteTaskListV2ResponseDataDemandsInner.createTime) &&
        Objects.equals(this.demandId, starStarAdUniteTaskListV2ResponseDataDemandsInner.demandId) &&
        Objects.equals(this.demandName, starStarAdUniteTaskListV2ResponseDataDemandsInner.demandName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, demandId, demandName);
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
    sb.append("class StarStarAdUniteTaskListV2ResponseDataDemandsInner {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    demandId: ").append(toIndentedString(demandId)).append("\n");
    sb.append("    demandName: ").append(toIndentedString(demandName)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("demand_id");
    openapiFields.add("demand_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarStarAdUniteTaskListV2ResponseDataDemandsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarStarAdUniteTaskListV2ResponseDataDemandsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarStarAdUniteTaskListV2ResponseDataDemandsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarStarAdUniteTaskListV2ResponseDataDemandsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarStarAdUniteTaskListV2ResponseDataDemandsInner>() {
           @Override
           public void write(JsonWriter out, StarStarAdUniteTaskListV2ResponseDataDemandsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarStarAdUniteTaskListV2ResponseDataDemandsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarStarAdUniteTaskListV2ResponseDataDemandsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarStarAdUniteTaskListV2ResponseDataDemandsInner
  * @throws IOException if the JSON string is invalid with respect to StarStarAdUniteTaskListV2ResponseDataDemandsInner
  */
  public static StarStarAdUniteTaskListV2ResponseDataDemandsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarStarAdUniteTaskListV2ResponseDataDemandsInner.class);
  }

 /**
  * Convert an instance of StarStarAdUniteTaskListV2ResponseDataDemandsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
