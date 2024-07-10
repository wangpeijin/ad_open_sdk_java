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
import com.bytedance.ads.model.StarVasCreateBoostItemGroupV2CustomAudienceTagAge;
import com.bytedance.ads.model.StarVasCreateBoostItemGroupV2CustomAudienceTagGender;
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
 * 人群标签定向，仅boost_type为CUSTOM_TAG时传参
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class StarVasCreateBoostItemGroupV2RequestCustomAudienceTag {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<StarVasCreateBoostItemGroupV2CustomAudienceTagAge> age = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private StarVasCreateBoostItemGroupV2CustomAudienceTagGender gender = null;

  public StarVasCreateBoostItemGroupV2RequestCustomAudienceTag() {
  }

  public StarVasCreateBoostItemGroupV2RequestCustomAudienceTag age(List<StarVasCreateBoostItemGroupV2CustomAudienceTagAge> age) {
    
    this.age = age;
    return this;
  }

  public StarVasCreateBoostItemGroupV2RequestCustomAudienceTag addAgeItem(StarVasCreateBoostItemGroupV2CustomAudienceTagAge ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * 年龄，空则为不限 可选值: 18_TO_23 18-23;     24_TO_30 24-30;     31_TO_40 31-40;     41_TO_50 41-50;     INFINITE 不限;    
   * @return age
  **/
  @javax.annotation.Nullable
  public List<StarVasCreateBoostItemGroupV2CustomAudienceTagAge> getAge() {
    return age;
  }


  public void setAge(List<StarVasCreateBoostItemGroupV2CustomAudienceTagAge> age) {
    this.age = age;
  }


  public StarVasCreateBoostItemGroupV2RequestCustomAudienceTag gender(StarVasCreateBoostItemGroupV2CustomAudienceTagGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public StarVasCreateBoostItemGroupV2CustomAudienceTagGender getGender() {
    return gender;
  }


  public void setGender(StarVasCreateBoostItemGroupV2CustomAudienceTagGender gender) {
    this.gender = gender;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarVasCreateBoostItemGroupV2RequestCustomAudienceTag starVasCreateBoostItemGroupV2RequestCustomAudienceTag = (StarVasCreateBoostItemGroupV2RequestCustomAudienceTag) o;
    return Objects.equals(this.age, starVasCreateBoostItemGroupV2RequestCustomAudienceTag.age) &&
        Objects.equals(this.gender, starVasCreateBoostItemGroupV2RequestCustomAudienceTag.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, gender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarVasCreateBoostItemGroupV2RequestCustomAudienceTag {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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
    openapiFields.add("age");
    openapiFields.add("gender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarVasCreateBoostItemGroupV2RequestCustomAudienceTag.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarVasCreateBoostItemGroupV2RequestCustomAudienceTag' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarVasCreateBoostItemGroupV2RequestCustomAudienceTag> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarVasCreateBoostItemGroupV2RequestCustomAudienceTag.class));

       return (TypeAdapter<T>) new TypeAdapter<StarVasCreateBoostItemGroupV2RequestCustomAudienceTag>() {
           @Override
           public void write(JsonWriter out, StarVasCreateBoostItemGroupV2RequestCustomAudienceTag value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarVasCreateBoostItemGroupV2RequestCustomAudienceTag read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarVasCreateBoostItemGroupV2RequestCustomAudienceTag given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarVasCreateBoostItemGroupV2RequestCustomAudienceTag
  * @throws IOException if the JSON string is invalid with respect to StarVasCreateBoostItemGroupV2RequestCustomAudienceTag
  */
  public static StarVasCreateBoostItemGroupV2RequestCustomAudienceTag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarVasCreateBoostItemGroupV2RequestCustomAudienceTag.class);
  }

 /**
  * Convert an instance of StarVasCreateBoostItemGroupV2RequestCustomAudienceTag to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

