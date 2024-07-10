/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionScheduleTimeUpdateV30ResponseDataErrorsInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class PromotionScheduleTimeUpdateV30ResponseData {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<PromotionScheduleTimeUpdateV30ResponseDataErrorsInner> errors = null;

  public static final String SERIALIZED_NAME_PROMOTION_IDS = "promotion_ids";
  @SerializedName(SERIALIZED_NAME_PROMOTION_IDS)
  private List<Long> promotionIds = null;

  public PromotionScheduleTimeUpdateV30ResponseData() {
  }

  public PromotionScheduleTimeUpdateV30ResponseData errors(List<PromotionScheduleTimeUpdateV30ResponseDataErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public PromotionScheduleTimeUpdateV30ResponseData addErrorsItem(PromotionScheduleTimeUpdateV30ResponseDataErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * 更新失败的广告ID列表
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<PromotionScheduleTimeUpdateV30ResponseDataErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<PromotionScheduleTimeUpdateV30ResponseDataErrorsInner> errors) {
    this.errors = errors;
  }


  public PromotionScheduleTimeUpdateV30ResponseData promotionIds(List<Long> promotionIds) {
    
    this.promotionIds = promotionIds;
    return this;
  }

  public PromotionScheduleTimeUpdateV30ResponseData addPromotionIdsItem(Long promotionIdsItem) {
    if (this.promotionIds == null) {
      this.promotionIds = new ArrayList<>();
    }
    this.promotionIds.add(promotionIdsItem);
    return this;
  }

   /**
   * 更新成功的广告ID集合
   * @return promotionIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPromotionIds() {
    return promotionIds;
  }


  public void setPromotionIds(List<Long> promotionIds) {
    this.promotionIds = promotionIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionScheduleTimeUpdateV30ResponseData promotionScheduleTimeUpdateV30ResponseData = (PromotionScheduleTimeUpdateV30ResponseData) o;
    return Objects.equals(this.errors, promotionScheduleTimeUpdateV30ResponseData.errors) &&
        Objects.equals(this.promotionIds, promotionScheduleTimeUpdateV30ResponseData.promotionIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, promotionIds);
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
    sb.append("class PromotionScheduleTimeUpdateV30ResponseData {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    promotionIds: ").append(toIndentedString(promotionIds)).append("\n");
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
    openapiFields.add("errors");
    openapiFields.add("promotion_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionScheduleTimeUpdateV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionScheduleTimeUpdateV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionScheduleTimeUpdateV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionScheduleTimeUpdateV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionScheduleTimeUpdateV30ResponseData>() {
           @Override
           public void write(JsonWriter out, PromotionScheduleTimeUpdateV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionScheduleTimeUpdateV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionScheduleTimeUpdateV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionScheduleTimeUpdateV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to PromotionScheduleTimeUpdateV30ResponseData
  */
  public static PromotionScheduleTimeUpdateV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionScheduleTimeUpdateV30ResponseData.class);
  }

 /**
  * Convert an instance of PromotionScheduleTimeUpdateV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

