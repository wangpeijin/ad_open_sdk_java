/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class ProjectCostProtectStatusGetV30ResponseData {
  public static final String SERIALIZED_NAME_COMPENSATE_STATUS_INFO_LIST = "compensate_status_info_list";
  @SerializedName(SERIALIZED_NAME_COMPENSATE_STATUS_INFO_LIST)
  private List<ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner> compensateStatusInfoList = null;

  public ProjectCostProtectStatusGetV30ResponseData() {
  }

  public ProjectCostProtectStatusGetV30ResponseData compensateStatusInfoList(List<ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner> compensateStatusInfoList) {
    
    this.compensateStatusInfoList = compensateStatusInfoList;
    return this;
  }

  public ProjectCostProtectStatusGetV30ResponseData addCompensateStatusInfoListItem(ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner compensateStatusInfoListItem) {
    if (this.compensateStatusInfoList == null) {
      this.compensateStatusInfoList = new ArrayList<>();
    }
    this.compensateStatusInfoList.add(compensateStatusInfoListItem);
    return this;
  }

   /**
   * 项目成本保障信息列表
   * @return compensateStatusInfoList
  **/
  @javax.annotation.Nullable
  public List<ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner> getCompensateStatusInfoList() {
    return compensateStatusInfoList;
  }


  public void setCompensateStatusInfoList(List<ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner> compensateStatusInfoList) {
    this.compensateStatusInfoList = compensateStatusInfoList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectCostProtectStatusGetV30ResponseData projectCostProtectStatusGetV30ResponseData = (ProjectCostProtectStatusGetV30ResponseData) o;
    return Objects.equals(this.compensateStatusInfoList, projectCostProtectStatusGetV30ResponseData.compensateStatusInfoList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(compensateStatusInfoList);
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
    sb.append("class ProjectCostProtectStatusGetV30ResponseData {\n");
    sb.append("    compensateStatusInfoList: ").append(toIndentedString(compensateStatusInfoList)).append("\n");
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
    openapiFields.add("compensate_status_info_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectCostProtectStatusGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectCostProtectStatusGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectCostProtectStatusGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectCostProtectStatusGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectCostProtectStatusGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ProjectCostProtectStatusGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectCostProtectStatusGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectCostProtectStatusGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectCostProtectStatusGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ProjectCostProtectStatusGetV30ResponseData
  */
  public static ProjectCostProtectStatusGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectCostProtectStatusGetV30ResponseData.class);
  }

 /**
  * Convert an instance of ProjectCostProtectStatusGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

