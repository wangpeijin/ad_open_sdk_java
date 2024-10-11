/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
 * ToolsClueRobotScriptQueryV2ResponseDataDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class ToolsClueRobotScriptQueryV2ResponseDataDataInner {
  public static final String SERIALIZED_NAME_CALL_TIMES = "call_times";
  @SerializedName(SERIALIZED_NAME_CALL_TIMES)
  private Integer callTimes = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SCRIPT_VARIABLES = "script_variables";
  @SerializedName(SERIALIZED_NAME_SCRIPT_VARIABLES)
  private List<String> scriptVariables = null;

  public ToolsClueRobotScriptQueryV2ResponseDataDataInner() {
  }

  public ToolsClueRobotScriptQueryV2ResponseDataDataInner callTimes(Integer callTimes) {
    
    this.callTimes = callTimes;
    return this;
  }

   /**
   * 一个号码默认外呼的次数
   * @return callTimes
  **/
  @javax.annotation.Nullable
  public Integer getCallTimes() {
    return callTimes;
  }


  public void setCallTimes(Integer callTimes) {
    this.callTimes = callTimes;
  }


  public ToolsClueRobotScriptQueryV2ResponseDataDataInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 剧本ID
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ToolsClueRobotScriptQueryV2ResponseDataDataInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 剧本名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsClueRobotScriptQueryV2ResponseDataDataInner scriptVariables(List<String> scriptVariables) {
    
    this.scriptVariables = scriptVariables;
    return this;
  }

  public ToolsClueRobotScriptQueryV2ResponseDataDataInner addScriptVariablesItem(String scriptVariablesItem) {
    if (this.scriptVariables == null) {
      this.scriptVariables = new ArrayList<>();
    }
    this.scriptVariables.add(scriptVariablesItem);
    return this;
  }

   /**
   * 变量名称列表
   * @return scriptVariables
  **/
  @javax.annotation.Nullable
  public List<String> getScriptVariables() {
    return scriptVariables;
  }


  public void setScriptVariables(List<String> scriptVariables) {
    this.scriptVariables = scriptVariables;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueRobotScriptQueryV2ResponseDataDataInner toolsClueRobotScriptQueryV2ResponseDataDataInner = (ToolsClueRobotScriptQueryV2ResponseDataDataInner) o;
    return Objects.equals(this.callTimes, toolsClueRobotScriptQueryV2ResponseDataDataInner.callTimes) &&
        Objects.equals(this.id, toolsClueRobotScriptQueryV2ResponseDataDataInner.id) &&
        Objects.equals(this.name, toolsClueRobotScriptQueryV2ResponseDataDataInner.name) &&
        Objects.equals(this.scriptVariables, toolsClueRobotScriptQueryV2ResponseDataDataInner.scriptVariables);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(callTimes, id, name, scriptVariables);
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
    sb.append("class ToolsClueRobotScriptQueryV2ResponseDataDataInner {\n");
    sb.append("    callTimes: ").append(toIndentedString(callTimes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scriptVariables: ").append(toIndentedString(scriptVariables)).append("\n");
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
    openapiFields.add("call_times");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("script_variables");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueRobotScriptQueryV2ResponseDataDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueRobotScriptQueryV2ResponseDataDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueRobotScriptQueryV2ResponseDataDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueRobotScriptQueryV2ResponseDataDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueRobotScriptQueryV2ResponseDataDataInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueRobotScriptQueryV2ResponseDataDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueRobotScriptQueryV2ResponseDataDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueRobotScriptQueryV2ResponseDataDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueRobotScriptQueryV2ResponseDataDataInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueRobotScriptQueryV2ResponseDataDataInner
  */
  public static ToolsClueRobotScriptQueryV2ResponseDataDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueRobotScriptQueryV2ResponseDataDataInner.class);
  }

 /**
  * Convert an instance of ToolsClueRobotScriptQueryV2ResponseDataDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

