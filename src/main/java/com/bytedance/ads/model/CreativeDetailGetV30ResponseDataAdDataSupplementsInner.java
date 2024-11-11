/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeDetailGetV30DataAdDataSupplementsSupplementType;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner;
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
 * CreativeDetailGetV30ResponseDataAdDataSupplementsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class CreativeDetailGetV30ResponseDataAdDataSupplementsInner {
  public static final String SERIALIZED_NAME_GAMES = "games";
  @SerializedName(SERIALIZED_NAME_GAMES)
  private List<CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner> games = null;

  public static final String SERIALIZED_NAME_SUPPLEMENT_TYPE = "supplement_type";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENT_TYPE)
  private CreativeDetailGetV30DataAdDataSupplementsSupplementType supplementType = null;

  public CreativeDetailGetV30ResponseDataAdDataSupplementsInner() {
  }

  public CreativeDetailGetV30ResponseDataAdDataSupplementsInner games(List<CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner> games) {
    
    this.games = games;
    return this;
  }

  public CreativeDetailGetV30ResponseDataAdDataSupplementsInner addGamesItem(CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner gamesItem) {
    if (this.games == null) {
      this.games = new ArrayList<>();
    }
    this.games.add(gamesItem);
    return this;
  }

   /**
   * 
   * @return games
  **/
  @javax.annotation.Nullable
  public List<CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner> getGames() {
    return games;
  }


  public void setGames(List<CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner> games) {
    this.games = games;
  }


  public CreativeDetailGetV30ResponseDataAdDataSupplementsInner supplementType(CreativeDetailGetV30DataAdDataSupplementsSupplementType supplementType) {
    
    this.supplementType = supplementType;
    return this;
  }

   /**
   * Get supplementType
   * @return supplementType
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30DataAdDataSupplementsSupplementType getSupplementType() {
    return supplementType;
  }


  public void setSupplementType(CreativeDetailGetV30DataAdDataSupplementsSupplementType supplementType) {
    this.supplementType = supplementType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeDetailGetV30ResponseDataAdDataSupplementsInner creativeDetailGetV30ResponseDataAdDataSupplementsInner = (CreativeDetailGetV30ResponseDataAdDataSupplementsInner) o;
    return Objects.equals(this.games, creativeDetailGetV30ResponseDataAdDataSupplementsInner.games) &&
        Objects.equals(this.supplementType, creativeDetailGetV30ResponseDataAdDataSupplementsInner.supplementType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(games, supplementType);
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
    sb.append("class CreativeDetailGetV30ResponseDataAdDataSupplementsInner {\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("    supplementType: ").append(toIndentedString(supplementType)).append("\n");
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
    openapiFields.add("games");
    openapiFields.add("supplement_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeDetailGetV30ResponseDataAdDataSupplementsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeDetailGetV30ResponseDataAdDataSupplementsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeDetailGetV30ResponseDataAdDataSupplementsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeDetailGetV30ResponseDataAdDataSupplementsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeDetailGetV30ResponseDataAdDataSupplementsInner>() {
           @Override
           public void write(JsonWriter out, CreativeDetailGetV30ResponseDataAdDataSupplementsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeDetailGetV30ResponseDataAdDataSupplementsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeDetailGetV30ResponseDataAdDataSupplementsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeDetailGetV30ResponseDataAdDataSupplementsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeDetailGetV30ResponseDataAdDataSupplementsInner
  */
  public static CreativeDetailGetV30ResponseDataAdDataSupplementsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeDetailGetV30ResponseDataAdDataSupplementsInner.class);
  }

 /**
  * Convert an instance of CreativeDetailGetV30ResponseDataAdDataSupplementsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

