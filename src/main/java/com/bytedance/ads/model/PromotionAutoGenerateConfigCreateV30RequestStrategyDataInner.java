/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner;
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
 * PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner {
  public static final String SERIALIZED_NAME_STRATEGY_ID = "strategy_id";
  @SerializedName(SERIALIZED_NAME_STRATEGY_ID)
  private Long strategyId = null;

  public static final String SERIALIZED_NAME_STRATEGY_STATE = "strategy_state";
  @SerializedName(SERIALIZED_NAME_STRATEGY_STATE)
  private List<PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner> strategyState = null;

  public PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner() {
  }

  public PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner strategyId(Long strategyId) {
    
    this.strategyId = strategyId;
    return this;
  }

   /**
   * 策略id
   * @return strategyId
  **/
  @javax.annotation.Nonnull
  public Long getStrategyId() {
    return strategyId;
  }


  public void setStrategyId(Long strategyId) {
    this.strategyId = strategyId;
  }


  public PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner strategyState(List<PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner> strategyState) {
    
    this.strategyState = strategyState;
    return this;
  }

  public PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner addStrategyStateItem(PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner strategyStateItem) {
    if (this.strategyState == null) {
      this.strategyState = new ArrayList<>();
    }
    this.strategyState.add(strategyStateItem);
    return this;
  }

   /**
   * 策略配置项列表
   * @return strategyState
  **/
  @javax.annotation.Nullable
  public List<PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner> getStrategyState() {
    return strategyState;
  }


  public void setStrategyState(List<PromotionAutoGenerateConfigCreateV30RequestStrategyDataInnerStrategyStateInner> strategyState) {
    this.strategyState = strategyState;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner promotionAutoGenerateConfigCreateV30RequestStrategyDataInner = (PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner) o;
    return Objects.equals(this.strategyId, promotionAutoGenerateConfigCreateV30RequestStrategyDataInner.strategyId) &&
        Objects.equals(this.strategyState, promotionAutoGenerateConfigCreateV30RequestStrategyDataInner.strategyState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategyId, strategyState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner {\n");
    sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
    sb.append("    strategyState: ").append(toIndentedString(strategyState)).append("\n");
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
    openapiFields.add("strategy_id");
    openapiFields.add("strategy_state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("strategy_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner>() {
           @Override
           public void write(JsonWriter out, PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner
  * @throws IOException if the JSON string is invalid with respect to PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner
  */
  public static PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner.class);
  }

 /**
  * Convert an instance of PromotionAutoGenerateConfigCreateV30RequestStrategyDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

