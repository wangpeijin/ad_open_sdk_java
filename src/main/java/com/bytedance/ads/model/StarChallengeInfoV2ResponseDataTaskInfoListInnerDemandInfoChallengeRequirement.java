/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement {
  public static final String SERIALIZED_NAME_ORAL_DEMAND = "oral_demand";
  @SerializedName(SERIALIZED_NAME_ORAL_DEMAND)
  private String oralDemand = null;

  public static final String SERIALIZED_NAME_OTHER_DEMAND = "other_demand";
  @SerializedName(SERIALIZED_NAME_OTHER_DEMAND)
  private List<String> otherDemand = null;

  public static final String SERIALIZED_NAME_SCENE_DEMAND = "scene_demand";
  @SerializedName(SERIALIZED_NAME_SCENE_DEMAND)
  private String sceneDemand = null;

  public static final String SERIALIZED_NAME_STRONG_REQUIREMENTS = "strong_requirements";
  @SerializedName(SERIALIZED_NAME_STRONG_REQUIREMENTS)
  private List<String> strongRequirements = null;

  public static final String SERIALIZED_NAME_TITLE_DEMAND = "title_demand";
  @SerializedName(SERIALIZED_NAME_TITLE_DEMAND)
  private String titleDemand = null;

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement() {
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement oralDemand(String oralDemand) {
    
    this.oralDemand = oralDemand;
    return this;
  }

   /**
   * 
   * @return oralDemand
  **/
  @javax.annotation.Nullable
  public String getOralDemand() {
    return oralDemand;
  }


  public void setOralDemand(String oralDemand) {
    this.oralDemand = oralDemand;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement otherDemand(List<String> otherDemand) {
    
    this.otherDemand = otherDemand;
    return this;
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement addOtherDemandItem(String otherDemandItem) {
    if (this.otherDemand == null) {
      this.otherDemand = new ArrayList<>();
    }
    this.otherDemand.add(otherDemandItem);
    return this;
  }

   /**
   * 
   * @return otherDemand
  **/
  @javax.annotation.Nullable
  public List<String> getOtherDemand() {
    return otherDemand;
  }


  public void setOtherDemand(List<String> otherDemand) {
    this.otherDemand = otherDemand;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement sceneDemand(String sceneDemand) {
    
    this.sceneDemand = sceneDemand;
    return this;
  }

   /**
   * 
   * @return sceneDemand
  **/
  @javax.annotation.Nullable
  public String getSceneDemand() {
    return sceneDemand;
  }


  public void setSceneDemand(String sceneDemand) {
    this.sceneDemand = sceneDemand;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement strongRequirements(List<String> strongRequirements) {
    
    this.strongRequirements = strongRequirements;
    return this;
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement addStrongRequirementsItem(String strongRequirementsItem) {
    if (this.strongRequirements == null) {
      this.strongRequirements = new ArrayList<>();
    }
    this.strongRequirements.add(strongRequirementsItem);
    return this;
  }

   /**
   * 
   * @return strongRequirements
  **/
  @javax.annotation.Nullable
  public List<String> getStrongRequirements() {
    return strongRequirements;
  }


  public void setStrongRequirements(List<String> strongRequirements) {
    this.strongRequirements = strongRequirements;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement titleDemand(String titleDemand) {
    
    this.titleDemand = titleDemand;
    return this;
  }

   /**
   * 
   * @return titleDemand
  **/
  @javax.annotation.Nullable
  public String getTitleDemand() {
    return titleDemand;
  }


  public void setTitleDemand(String titleDemand) {
    this.titleDemand = titleDemand;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement = (StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement) o;
    return Objects.equals(this.oralDemand, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement.oralDemand) &&
        Objects.equals(this.otherDemand, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement.otherDemand) &&
        Objects.equals(this.sceneDemand, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement.sceneDemand) &&
        Objects.equals(this.strongRequirements, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement.strongRequirements) &&
        Objects.equals(this.titleDemand, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement.titleDemand);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(oralDemand, otherDemand, sceneDemand, strongRequirements, titleDemand);
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
    sb.append("class StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement {\n");
    sb.append("    oralDemand: ").append(toIndentedString(oralDemand)).append("\n");
    sb.append("    otherDemand: ").append(toIndentedString(otherDemand)).append("\n");
    sb.append("    sceneDemand: ").append(toIndentedString(sceneDemand)).append("\n");
    sb.append("    strongRequirements: ").append(toIndentedString(strongRequirements)).append("\n");
    sb.append("    titleDemand: ").append(toIndentedString(titleDemand)).append("\n");
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
    openapiFields.add("oral_demand");
    openapiFields.add("other_demand");
    openapiFields.add("scene_demand");
    openapiFields.add("strong_requirements");
    openapiFields.add("title_demand");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement>() {
           @Override
           public void write(JsonWriter out, StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement
  * @throws IOException if the JSON string is invalid with respect to StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement
  */
  public static StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement.class);
  }

 /**
  * Convert an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

