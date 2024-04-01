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
import com.bytedance.ads.model.ToolsDiagnosisSuggestionGetV2DataSuggestionListSceneListScene;
import com.bytedance.ads.model.ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInner;
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
 * ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner {
  public static final String SERIALIZED_NAME_SCENE = "scene";
  @SerializedName(SERIALIZED_NAME_SCENE)
  private ToolsDiagnosisSuggestionGetV2DataSuggestionListSceneListScene scene = null;

  public static final String SERIALIZED_NAME_SUGGESTIONS = "suggestions";
  @SerializedName(SERIALIZED_NAME_SUGGESTIONS)
  private List<ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInner> suggestions = null;

  public ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner() {
  }

  public ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner scene(ToolsDiagnosisSuggestionGetV2DataSuggestionListSceneListScene scene) {
    
    this.scene = scene;
    return this;
  }

   /**
   * Get scene
   * @return scene
  **/
  @javax.annotation.Nullable
  public ToolsDiagnosisSuggestionGetV2DataSuggestionListSceneListScene getScene() {
    return scene;
  }


  public void setScene(ToolsDiagnosisSuggestionGetV2DataSuggestionListSceneListScene scene) {
    this.scene = scene;
  }


  public ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner suggestions(List<ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInner> suggestions) {
    
    this.suggestions = suggestions;
    return this;
  }

  public ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner addSuggestionsItem(ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInner suggestionsItem) {
    if (this.suggestions == null) {
      this.suggestions = new ArrayList<>();
    }
    this.suggestions.add(suggestionsItem);
    return this;
  }

   /**
   * 建议对应的工具列表
   * @return suggestions
  **/
  @javax.annotation.Nullable
  public List<ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInner> getSuggestions() {
    return suggestions;
  }


  public void setSuggestions(List<ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInner> suggestions) {
    this.suggestions = suggestions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner toolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner = (ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner) o;
    return Objects.equals(this.scene, toolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner.scene) &&
        Objects.equals(this.suggestions, toolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner.suggestions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(scene, suggestions);
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
    sb.append("class ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner {\n");
    sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
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
    openapiFields.add("scene");
    openapiFields.add("suggestions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner>() {
           @Override
           public void write(JsonWriter out, ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner
  */
  public static ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner.class);
  }

 /**
  * Convert an instance of ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

