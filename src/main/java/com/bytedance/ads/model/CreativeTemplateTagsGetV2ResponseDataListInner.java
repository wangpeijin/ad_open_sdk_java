/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
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
 * CreativeTemplateTagsGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class CreativeTemplateTagsGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_TEMPLATE_TAG_ID = "template_tag_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TAG_ID)
  private String templateTagId = null;

  public static final String SERIALIZED_NAME_TEMPLATE_TAG_NAME = "template_tag_name";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TAG_NAME)
  private String templateTagName = null;

  public CreativeTemplateTagsGetV2ResponseDataListInner() {
  }

  public CreativeTemplateTagsGetV2ResponseDataListInner templateTagId(String templateTagId) {
    
    this.templateTagId = templateTagId;
    return this;
  }

   /**
   * 模板标签ID
   * @return templateTagId
  **/
  @javax.annotation.Nullable
  public String getTemplateTagId() {
    return templateTagId;
  }


  public void setTemplateTagId(String templateTagId) {
    this.templateTagId = templateTagId;
  }


  public CreativeTemplateTagsGetV2ResponseDataListInner templateTagName(String templateTagName) {
    
    this.templateTagName = templateTagName;
    return this;
  }

   /**
   * 模板标签名称，e.g. \&quot;价格优惠\&quot;、\&quot;节日氛围\&quot;、\&quot;玩法吸引力\&quot;、\&quot;利益点露出\&quot;
   * @return templateTagName
  **/
  @javax.annotation.Nullable
  public String getTemplateTagName() {
    return templateTagName;
  }


  public void setTemplateTagName(String templateTagName) {
    this.templateTagName = templateTagName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeTemplateTagsGetV2ResponseDataListInner creativeTemplateTagsGetV2ResponseDataListInner = (CreativeTemplateTagsGetV2ResponseDataListInner) o;
    return Objects.equals(this.templateTagId, creativeTemplateTagsGetV2ResponseDataListInner.templateTagId) &&
        Objects.equals(this.templateTagName, creativeTemplateTagsGetV2ResponseDataListInner.templateTagName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateTagId, templateTagName);
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
    sb.append("class CreativeTemplateTagsGetV2ResponseDataListInner {\n");
    sb.append("    templateTagId: ").append(toIndentedString(templateTagId)).append("\n");
    sb.append("    templateTagName: ").append(toIndentedString(templateTagName)).append("\n");
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
    openapiFields.add("template_tag_id");
    openapiFields.add("template_tag_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeTemplateTagsGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeTemplateTagsGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeTemplateTagsGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeTemplateTagsGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeTemplateTagsGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, CreativeTemplateTagsGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeTemplateTagsGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeTemplateTagsGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeTemplateTagsGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to CreativeTemplateTagsGetV2ResponseDataListInner
  */
  public static CreativeTemplateTagsGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeTemplateTagsGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of CreativeTemplateTagsGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

