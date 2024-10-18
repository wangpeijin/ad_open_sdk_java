/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
 * 字幕样式设置，不传入时系统默认推荐
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class AicVideoMixcutCreateV30RequestSubtitleStyle {
  public static final String SERIALIZED_NAME_FONT_BORDER_COLOR = "font_border_color";
  @SerializedName(SERIALIZED_NAME_FONT_BORDER_COLOR)
  private String fontBorderColor = null;

  public static final String SERIALIZED_NAME_FONT_ELEMENT_ID = "font_element_id";
  @SerializedName(SERIALIZED_NAME_FONT_ELEMENT_ID)
  private Long fontElementId = null;

  public static final String SERIALIZED_NAME_FONT_FILL_COLOR = "font_fill_color";
  @SerializedName(SERIALIZED_NAME_FONT_FILL_COLOR)
  private String fontFillColor = null;

  public static final String SERIALIZED_NAME_FONT_SIZE = "font_size";
  @SerializedName(SERIALIZED_NAME_FONT_SIZE)
  private Long fontSize = null;

  public static final String SERIALIZED_NAME_HIGHLIGHT_FONT_BORDER_COLOR = "highlight_font_border_color";
  @SerializedName(SERIALIZED_NAME_HIGHLIGHT_FONT_BORDER_COLOR)
  private String highlightFontBorderColor = null;

  public static final String SERIALIZED_NAME_HIGHLIGHT_FONT_FILL_COLOR = "highlight_font_fill_color";
  @SerializedName(SERIALIZED_NAME_HIGHLIGHT_FONT_FILL_COLOR)
  private String highlightFontFillColor = null;

  public AicVideoMixcutCreateV30RequestSubtitleStyle() {
  }

  public AicVideoMixcutCreateV30RequestSubtitleStyle fontBorderColor(String fontBorderColor) {
    
    this.fontBorderColor = fontBorderColor;
    return this;
  }

   /**
   * 常规字幕边框颜色，支持RGB、RGBA，系统默认:#000000（黑色），示例：#000000、#000000FF
   * @return fontBorderColor
  **/
  @javax.annotation.Nullable
  public String getFontBorderColor() {
    return fontBorderColor;
  }


  public void setFontBorderColor(String fontBorderColor) {
    this.fontBorderColor = fontBorderColor;
  }


  public AicVideoMixcutCreateV30RequestSubtitleStyle fontElementId(Long fontElementId) {
    
    this.fontElementId = fontElementId;
    return this;
  }

   /**
   * 字体元素id，系统默认抖音美好体
   * @return fontElementId
  **/
  @javax.annotation.Nullable
  public Long getFontElementId() {
    return fontElementId;
  }


  public void setFontElementId(Long fontElementId) {
    this.fontElementId = fontElementId;
  }


  public AicVideoMixcutCreateV30RequestSubtitleStyle fontFillColor(String fontFillColor) {
    
    this.fontFillColor = fontFillColor;
    return this;
  }

   /**
   * 常规字幕填充颜色，支持RGB、RGBA，系统默认#FFFFFF（白色）,示例：#FFFFF、#FFFFFFFF
   * @return fontFillColor
  **/
  @javax.annotation.Nullable
  public String getFontFillColor() {
    return fontFillColor;
  }


  public void setFontFillColor(String fontFillColor) {
    this.fontFillColor = fontFillColor;
  }


  public AicVideoMixcutCreateV30RequestSubtitleStyle fontSize(Long fontSize) {
    
    this.fontSize = fontSize;
    return this;
  }

   /**
   * 字体大小，默认大小49px，最大99px，大小对标1080p视频
   * minimum: 5
   * maximum: 99
   * @return fontSize
  **/
  @javax.annotation.Nullable
  public Long getFontSize() {
    return fontSize;
  }


  public void setFontSize(Long fontSize) {
    this.fontSize = fontSize;
  }


  public AicVideoMixcutCreateV30RequestSubtitleStyle highlightFontBorderColor(String highlightFontBorderColor) {
    
    this.highlightFontBorderColor = highlightFontBorderColor;
    return this;
  }

   /**
   * 需要高亮强调的字幕边框颜色，支持RGB、RGBA，系统默认:#000000（黑色），#RGBA格式，示例：#000000、#000000FF
   * @return highlightFontBorderColor
  **/
  @javax.annotation.Nullable
  public String getHighlightFontBorderColor() {
    return highlightFontBorderColor;
  }


  public void setHighlightFontBorderColor(String highlightFontBorderColor) {
    this.highlightFontBorderColor = highlightFontBorderColor;
  }


  public AicVideoMixcutCreateV30RequestSubtitleStyle highlightFontFillColor(String highlightFontFillColor) {
    
    this.highlightFontFillColor = highlightFontFillColor;
    return this;
  }

   /**
   * 需要高亮强调的字幕填充颜色支持RGB、RGBA，系统默认:#FFD700（黄色），示例#FFD700、#FFD700FF
   * @return highlightFontFillColor
  **/
  @javax.annotation.Nullable
  public String getHighlightFontFillColor() {
    return highlightFontFillColor;
  }


  public void setHighlightFontFillColor(String highlightFontFillColor) {
    this.highlightFontFillColor = highlightFontFillColor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AicVideoMixcutCreateV30RequestSubtitleStyle aicVideoMixcutCreateV30RequestSubtitleStyle = (AicVideoMixcutCreateV30RequestSubtitleStyle) o;
    return Objects.equals(this.fontBorderColor, aicVideoMixcutCreateV30RequestSubtitleStyle.fontBorderColor) &&
        Objects.equals(this.fontElementId, aicVideoMixcutCreateV30RequestSubtitleStyle.fontElementId) &&
        Objects.equals(this.fontFillColor, aicVideoMixcutCreateV30RequestSubtitleStyle.fontFillColor) &&
        Objects.equals(this.fontSize, aicVideoMixcutCreateV30RequestSubtitleStyle.fontSize) &&
        Objects.equals(this.highlightFontBorderColor, aicVideoMixcutCreateV30RequestSubtitleStyle.highlightFontBorderColor) &&
        Objects.equals(this.highlightFontFillColor, aicVideoMixcutCreateV30RequestSubtitleStyle.highlightFontFillColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontBorderColor, fontElementId, fontFillColor, fontSize, highlightFontBorderColor, highlightFontFillColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AicVideoMixcutCreateV30RequestSubtitleStyle {\n");
    sb.append("    fontBorderColor: ").append(toIndentedString(fontBorderColor)).append("\n");
    sb.append("    fontElementId: ").append(toIndentedString(fontElementId)).append("\n");
    sb.append("    fontFillColor: ").append(toIndentedString(fontFillColor)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    highlightFontBorderColor: ").append(toIndentedString(highlightFontBorderColor)).append("\n");
    sb.append("    highlightFontFillColor: ").append(toIndentedString(highlightFontFillColor)).append("\n");
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
    openapiFields.add("font_border_color");
    openapiFields.add("font_element_id");
    openapiFields.add("font_fill_color");
    openapiFields.add("font_size");
    openapiFields.add("highlight_font_border_color");
    openapiFields.add("highlight_font_fill_color");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AicVideoMixcutCreateV30RequestSubtitleStyle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicVideoMixcutCreateV30RequestSubtitleStyle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicVideoMixcutCreateV30RequestSubtitleStyle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicVideoMixcutCreateV30RequestSubtitleStyle.class));

       return (TypeAdapter<T>) new TypeAdapter<AicVideoMixcutCreateV30RequestSubtitleStyle>() {
           @Override
           public void write(JsonWriter out, AicVideoMixcutCreateV30RequestSubtitleStyle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicVideoMixcutCreateV30RequestSubtitleStyle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicVideoMixcutCreateV30RequestSubtitleStyle given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicVideoMixcutCreateV30RequestSubtitleStyle
  * @throws IOException if the JSON string is invalid with respect to AicVideoMixcutCreateV30RequestSubtitleStyle
  */
  public static AicVideoMixcutCreateV30RequestSubtitleStyle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicVideoMixcutCreateV30RequestSubtitleStyle.class);
  }

 /**
  * Convert an instance of AicVideoMixcutCreateV30RequestSubtitleStyle to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

