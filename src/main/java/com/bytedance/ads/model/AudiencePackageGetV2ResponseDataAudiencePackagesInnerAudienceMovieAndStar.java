/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar {
  public static final String SERIALIZED_NAME_MOVIE = "movie";
  @SerializedName(SERIALIZED_NAME_MOVIE)
  private List<String> movie = null;

  public static final String SERIALIZED_NAME_STAR = "star";
  @SerializedName(SERIALIZED_NAME_STAR)
  private List<String> star = null;

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar() {
  }

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar movie(List<String> movie) {
    
    this.movie = movie;
    return this;
  }

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar addMovieItem(String movieItem) {
    if (this.movie == null) {
      this.movie = new ArrayList<>();
    }
    this.movie.add(movieItem);
    return this;
  }

   /**
   * 
   * @return movie
  **/
  @javax.annotation.Nullable
  public List<String> getMovie() {
    return movie;
  }


  public void setMovie(List<String> movie) {
    this.movie = movie;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar star(List<String> star) {
    
    this.star = star;
    return this;
  }

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar addStarItem(String starItem) {
    if (this.star == null) {
      this.star = new ArrayList<>();
    }
    this.star.add(starItem);
    return this;
  }

   /**
   * 
   * @return star
  **/
  @javax.annotation.Nullable
  public List<String> getStar() {
    return star;
  }


  public void setStar(List<String> star) {
    this.star = star;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar = (AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar) o;
    return Objects.equals(this.movie, audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar.movie) &&
        Objects.equals(this.star, audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar.star);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(movie, star);
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
    sb.append("class AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar {\n");
    sb.append("    movie: ").append(toIndentedString(movie)).append("\n");
    sb.append("    star: ").append(toIndentedString(star)).append("\n");
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
    openapiFields.add("movie");
    openapiFields.add("star");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar.class));

       return (TypeAdapter<T>) new TypeAdapter<AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar>() {
           @Override
           public void write(JsonWriter out, AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar
  * @throws IOException if the JSON string is invalid with respect to AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar
  */
  public static AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar.class);
  }

 /**
  * Convert an instance of AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceMovieAndStar to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

