/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AudiencePackageGetV2DataAudiencePackagesAudienceActionActionScene;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction {
  public static final String SERIALIZED_NAME_ACTION_CATEGORIES = "action_categories";
  @SerializedName(SERIALIZED_NAME_ACTION_CATEGORIES)
  private List<Long> actionCategories = null;

  public static final String SERIALIZED_NAME_ACTION_DAYS = "action_days";
  @SerializedName(SERIALIZED_NAME_ACTION_DAYS)
  private Long actionDays = null;

  public static final String SERIALIZED_NAME_ACTION_SCENE = "action_scene";
  @SerializedName(SERIALIZED_NAME_ACTION_SCENE)
  private List<AudiencePackageGetV2DataAudiencePackagesAudienceActionActionScene> actionScene = null;

  public static final String SERIALIZED_NAME_ACTION_WORDS = "action_words";
  @SerializedName(SERIALIZED_NAME_ACTION_WORDS)
  private List<Long> actionWords = null;

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction() {
  }

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction actionCategories(List<Long> actionCategories) {
    
    this.actionCategories = actionCategories;
    return this;
  }

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction addActionCategoriesItem(Long actionCategoriesItem) {
    if (this.actionCategories == null) {
      this.actionCategories = new ArrayList<>();
    }
    this.actionCategories.add(actionCategoriesItem);
    return this;
  }

   /**
   * 
   * @return actionCategories
  **/
  @javax.annotation.Nullable
  public List<Long> getActionCategories() {
    return actionCategories;
  }


  public void setActionCategories(List<Long> actionCategories) {
    this.actionCategories = actionCategories;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction actionDays(Long actionDays) {
    
    this.actionDays = actionDays;
    return this;
  }

   /**
   * 
   * @return actionDays
  **/
  @javax.annotation.Nullable
  public Long getActionDays() {
    return actionDays;
  }


  public void setActionDays(Long actionDays) {
    this.actionDays = actionDays;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction actionScene(List<AudiencePackageGetV2DataAudiencePackagesAudienceActionActionScene> actionScene) {
    
    this.actionScene = actionScene;
    return this;
  }

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction addActionSceneItem(AudiencePackageGetV2DataAudiencePackagesAudienceActionActionScene actionSceneItem) {
    if (this.actionScene == null) {
      this.actionScene = new ArrayList<>();
    }
    this.actionScene.add(actionSceneItem);
    return this;
  }

   /**
   * 
   * @return actionScene
  **/
  @javax.annotation.Nullable
  public List<AudiencePackageGetV2DataAudiencePackagesAudienceActionActionScene> getActionScene() {
    return actionScene;
  }


  public void setActionScene(List<AudiencePackageGetV2DataAudiencePackagesAudienceActionActionScene> actionScene) {
    this.actionScene = actionScene;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction actionWords(List<Long> actionWords) {
    
    this.actionWords = actionWords;
    return this;
  }

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction addActionWordsItem(Long actionWordsItem) {
    if (this.actionWords == null) {
      this.actionWords = new ArrayList<>();
    }
    this.actionWords.add(actionWordsItem);
    return this;
  }

   /**
   * 
   * @return actionWords
  **/
  @javax.annotation.Nullable
  public List<Long> getActionWords() {
    return actionWords;
  }


  public void setActionWords(List<Long> actionWords) {
    this.actionWords = actionWords;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction = (AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction) o;
    return Objects.equals(this.actionCategories, audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction.actionCategories) &&
        Objects.equals(this.actionDays, audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction.actionDays) &&
        Objects.equals(this.actionScene, audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction.actionScene) &&
        Objects.equals(this.actionWords, audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction.actionWords);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCategories, actionDays, actionScene, actionWords);
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
    sb.append("class AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction {\n");
    sb.append("    actionCategories: ").append(toIndentedString(actionCategories)).append("\n");
    sb.append("    actionDays: ").append(toIndentedString(actionDays)).append("\n");
    sb.append("    actionScene: ").append(toIndentedString(actionScene)).append("\n");
    sb.append("    actionWords: ").append(toIndentedString(actionWords)).append("\n");
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
    openapiFields.add("action_categories");
    openapiFields.add("action_days");
    openapiFields.add("action_scene");
    openapiFields.add("action_words");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction.class));

       return (TypeAdapter<T>) new TypeAdapter<AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction>() {
           @Override
           public void write(JsonWriter out, AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction
  * @throws IOException if the JSON string is invalid with respect to AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction
  */
  public static AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction.class);
  }

 /**
  * Convert an instance of AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

