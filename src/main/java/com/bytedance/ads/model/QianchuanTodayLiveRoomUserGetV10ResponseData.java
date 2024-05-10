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
import com.bytedance.ads.model.QianchuanTodayLiveRoomUserGetV10ResponseDataAgeInner;
import com.bytedance.ads.model.QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner;
import com.bytedance.ads.model.QianchuanTodayLiveRoomUserGetV10ResponseDataGenderInner;
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
public class QianchuanTodayLiveRoomUserGetV10ResponseData {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<QianchuanTodayLiveRoomUserGetV10ResponseDataAgeInner> age = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner> city = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private List<QianchuanTodayLiveRoomUserGetV10ResponseDataGenderInner> gender = null;

  public QianchuanTodayLiveRoomUserGetV10ResponseData() {
  }

  public QianchuanTodayLiveRoomUserGetV10ResponseData age(List<QianchuanTodayLiveRoomUserGetV10ResponseDataAgeInner> age) {
    
    this.age = age;
    return this;
  }

  public QianchuanTodayLiveRoomUserGetV10ResponseData addAgeItem(QianchuanTodayLiveRoomUserGetV10ResponseDataAgeInner ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * 
   * @return age
  **/
  @javax.annotation.Nullable
  public List<QianchuanTodayLiveRoomUserGetV10ResponseDataAgeInner> getAge() {
    return age;
  }


  public void setAge(List<QianchuanTodayLiveRoomUserGetV10ResponseDataAgeInner> age) {
    this.age = age;
  }


  public QianchuanTodayLiveRoomUserGetV10ResponseData city(List<QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner> city) {
    
    this.city = city;
    return this;
  }

  public QianchuanTodayLiveRoomUserGetV10ResponseData addCityItem(QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 
   * @return city
  **/
  @javax.annotation.Nullable
  public List<QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner> getCity() {
    return city;
  }


  public void setCity(List<QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner> city) {
    this.city = city;
  }


  public QianchuanTodayLiveRoomUserGetV10ResponseData gender(List<QianchuanTodayLiveRoomUserGetV10ResponseDataGenderInner> gender) {
    
    this.gender = gender;
    return this;
  }

  public QianchuanTodayLiveRoomUserGetV10ResponseData addGenderItem(QianchuanTodayLiveRoomUserGetV10ResponseDataGenderInner genderItem) {
    if (this.gender == null) {
      this.gender = new ArrayList<>();
    }
    this.gender.add(genderItem);
    return this;
  }

   /**
   * 
   * @return gender
  **/
  @javax.annotation.Nullable
  public List<QianchuanTodayLiveRoomUserGetV10ResponseDataGenderInner> getGender() {
    return gender;
  }


  public void setGender(List<QianchuanTodayLiveRoomUserGetV10ResponseDataGenderInner> gender) {
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
    QianchuanTodayLiveRoomUserGetV10ResponseData qianchuanTodayLiveRoomUserGetV10ResponseData = (QianchuanTodayLiveRoomUserGetV10ResponseData) o;
    return Objects.equals(this.age, qianchuanTodayLiveRoomUserGetV10ResponseData.age) &&
        Objects.equals(this.city, qianchuanTodayLiveRoomUserGetV10ResponseData.city) &&
        Objects.equals(this.gender, qianchuanTodayLiveRoomUserGetV10ResponseData.gender);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, city, gender);
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
    sb.append("class QianchuanTodayLiveRoomUserGetV10ResponseData {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("gender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanTodayLiveRoomUserGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanTodayLiveRoomUserGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanTodayLiveRoomUserGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanTodayLiveRoomUserGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanTodayLiveRoomUserGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanTodayLiveRoomUserGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanTodayLiveRoomUserGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanTodayLiveRoomUserGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanTodayLiveRoomUserGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanTodayLiveRoomUserGetV10ResponseData
  */
  public static QianchuanTodayLiveRoomUserGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanTodayLiveRoomUserGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanTodayLiveRoomUserGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

