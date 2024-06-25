/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner;
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
 * ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner {
  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public static final String SERIALIZED_NAME_SCENE_LIST = "scene_list";
  @SerializedName(SERIALIZED_NAME_SCENE_LIST)
  private List<ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner> sceneList = null;

  public ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner() {
  }

  public ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }


  public ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner sceneList(List<ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner> sceneList) {
    
    this.sceneList = sceneList;
    return this;
  }

  public ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner addSceneListItem(ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner sceneListItem) {
    if (this.sceneList == null) {
      this.sceneList = new ArrayList<>();
    }
    this.sceneList.add(sceneListItem);
    return this;
  }

   /**
   * 
   * @return sceneList
  **/
  @javax.annotation.Nullable
  public List<ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner> getSceneList() {
    return sceneList;
  }


  public void setSceneList(List<ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner> sceneList) {
    this.sceneList = sceneList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner toolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner = (ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner) o;
    return Objects.equals(this.promotionId, toolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner.promotionId) &&
        Objects.equals(this.sceneList, toolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner.sceneList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionId, sceneList);
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
    sb.append("class ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner {\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    sceneList: ").append(toIndentedString(sceneList)).append("\n");
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
    openapiFields.add("promotion_id");
    openapiFields.add("scene_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner
  */
  public static ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner.class);
  }

 /**
  * Convert an instance of ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

