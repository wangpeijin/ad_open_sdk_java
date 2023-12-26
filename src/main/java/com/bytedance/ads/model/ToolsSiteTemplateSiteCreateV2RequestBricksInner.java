/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2BricksType;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerCoupon;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerPicture;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerPictureGroup;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerText;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerWechatApplet;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerWechatGame;
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
 * ToolsSiteTemplateSiteCreateV2RequestBricksInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-12-26T11:52:44.116511995+08:00[PRC]")
public class ToolsSiteTemplateSiteCreateV2RequestBricksInner {
  public static final String SERIALIZED_NAME_BUTTON = "button";
  @SerializedName(SERIALIZED_NAME_BUTTON)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton button = null;

  public static final String SERIALIZED_NAME_COUPON = "coupon";
  @SerializedName(SERIALIZED_NAME_COUPON)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerCoupon coupon = null;

  public static final String SERIALIZED_NAME_FORM = "form";
  @SerializedName(SERIALIZED_NAME_FORM)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm form = null;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private String index = null;

  public static final String SERIALIZED_NAME_PICTURE = "picture";
  @SerializedName(SERIALIZED_NAME_PICTURE)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerPicture picture = null;

  public static final String SERIALIZED_NAME_PICTURE_GROUP = "picture_group";
  @SerializedName(SERIALIZED_NAME_PICTURE_GROUP)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerPictureGroup pictureGroup = null;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerText text = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ToolsSiteTemplateSiteCreateV2BricksType type = null;

  public static final String SERIALIZED_NAME_VIDEO = "video";
  @SerializedName(SERIALIZED_NAME_VIDEO)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo video = null;

  public static final String SERIALIZED_NAME_WECHAT_APPLET = "wechat_applet";
  @SerializedName(SERIALIZED_NAME_WECHAT_APPLET)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerWechatApplet wechatApplet = null;

  public static final String SERIALIZED_NAME_WECHAT_GAME = "wechat_game";
  @SerializedName(SERIALIZED_NAME_WECHAT_GAME)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerWechatGame wechatGame = null;

  public ToolsSiteTemplateSiteCreateV2RequestBricksInner() {
  }

  public ToolsSiteTemplateSiteCreateV2RequestBricksInner button(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton button) {
    
    this.button = button;
    return this;
  }

   /**
   * Get button
   * @return button
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton getButton() {
    return button;
  }


  public void setButton(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton button) {
    this.button = button;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInner coupon(ToolsSiteTemplateSiteCreateV2RequestBricksInnerCoupon coupon) {
    
    this.coupon = coupon;
    return this;
  }

   /**
   * Get coupon
   * @return coupon
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerCoupon getCoupon() {
    return coupon;
  }


  public void setCoupon(ToolsSiteTemplateSiteCreateV2RequestBricksInnerCoupon coupon) {
    this.coupon = coupon;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInner form(ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm form) {
    
    this.form = form;
    return this;
  }

   /**
   * Get form
   * @return form
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm getForm() {
    return form;
  }


  public void setForm(ToolsSiteTemplateSiteCreateV2RequestBricksInnerForm form) {
    this.form = form;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInner index(String index) {
    
    this.index = index;
    return this;
  }

   /**
   * 组件在模板中的位置描述，需和【基于站点创建模板】接口返回的组件index保持一致
   * @return index
  **/
  @javax.annotation.Nonnull
  public String getIndex() {
    return index;
  }


  public void setIndex(String index) {
    this.index = index;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInner picture(ToolsSiteTemplateSiteCreateV2RequestBricksInnerPicture picture) {
    
    this.picture = picture;
    return this;
  }

   /**
   * Get picture
   * @return picture
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerPicture getPicture() {
    return picture;
  }


  public void setPicture(ToolsSiteTemplateSiteCreateV2RequestBricksInnerPicture picture) {
    this.picture = picture;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInner pictureGroup(ToolsSiteTemplateSiteCreateV2RequestBricksInnerPictureGroup pictureGroup) {
    
    this.pictureGroup = pictureGroup;
    return this;
  }

   /**
   * Get pictureGroup
   * @return pictureGroup
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerPictureGroup getPictureGroup() {
    return pictureGroup;
  }


  public void setPictureGroup(ToolsSiteTemplateSiteCreateV2RequestBricksInnerPictureGroup pictureGroup) {
    this.pictureGroup = pictureGroup;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInner text(ToolsSiteTemplateSiteCreateV2RequestBricksInnerText text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerText getText() {
    return text;
  }


  public void setText(ToolsSiteTemplateSiteCreateV2RequestBricksInnerText text) {
    this.text = text;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInner type(ToolsSiteTemplateSiteCreateV2BricksType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public ToolsSiteTemplateSiteCreateV2BricksType getType() {
    return type;
  }


  public void setType(ToolsSiteTemplateSiteCreateV2BricksType type) {
    this.type = type;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInner video(ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo video) {
    
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo getVideo() {
    return video;
  }


  public void setVideo(ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo video) {
    this.video = video;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInner wechatApplet(ToolsSiteTemplateSiteCreateV2RequestBricksInnerWechatApplet wechatApplet) {
    
    this.wechatApplet = wechatApplet;
    return this;
  }

   /**
   * Get wechatApplet
   * @return wechatApplet
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerWechatApplet getWechatApplet() {
    return wechatApplet;
  }


  public void setWechatApplet(ToolsSiteTemplateSiteCreateV2RequestBricksInnerWechatApplet wechatApplet) {
    this.wechatApplet = wechatApplet;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInner wechatGame(ToolsSiteTemplateSiteCreateV2RequestBricksInnerWechatGame wechatGame) {
    
    this.wechatGame = wechatGame;
    return this;
  }

   /**
   * Get wechatGame
   * @return wechatGame
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerWechatGame getWechatGame() {
    return wechatGame;
  }


  public void setWechatGame(ToolsSiteTemplateSiteCreateV2RequestBricksInnerWechatGame wechatGame) {
    this.wechatGame = wechatGame;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteTemplateSiteCreateV2RequestBricksInner toolsSiteTemplateSiteCreateV2RequestBricksInner = (ToolsSiteTemplateSiteCreateV2RequestBricksInner) o;
    return Objects.equals(this.button, toolsSiteTemplateSiteCreateV2RequestBricksInner.button) &&
        Objects.equals(this.coupon, toolsSiteTemplateSiteCreateV2RequestBricksInner.coupon) &&
        Objects.equals(this.form, toolsSiteTemplateSiteCreateV2RequestBricksInner.form) &&
        Objects.equals(this.index, toolsSiteTemplateSiteCreateV2RequestBricksInner.index) &&
        Objects.equals(this.picture, toolsSiteTemplateSiteCreateV2RequestBricksInner.picture) &&
        Objects.equals(this.pictureGroup, toolsSiteTemplateSiteCreateV2RequestBricksInner.pictureGroup) &&
        Objects.equals(this.text, toolsSiteTemplateSiteCreateV2RequestBricksInner.text) &&
        Objects.equals(this.type, toolsSiteTemplateSiteCreateV2RequestBricksInner.type) &&
        Objects.equals(this.video, toolsSiteTemplateSiteCreateV2RequestBricksInner.video) &&
        Objects.equals(this.wechatApplet, toolsSiteTemplateSiteCreateV2RequestBricksInner.wechatApplet) &&
        Objects.equals(this.wechatGame, toolsSiteTemplateSiteCreateV2RequestBricksInner.wechatGame);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(button, coupon, form, index, picture, pictureGroup, text, type, video, wechatApplet, wechatGame);
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
    sb.append("class ToolsSiteTemplateSiteCreateV2RequestBricksInner {\n");
    sb.append("    button: ").append(toIndentedString(button)).append("\n");
    sb.append("    coupon: ").append(toIndentedString(coupon)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    pictureGroup: ").append(toIndentedString(pictureGroup)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    wechatApplet: ").append(toIndentedString(wechatApplet)).append("\n");
    sb.append("    wechatGame: ").append(toIndentedString(wechatGame)).append("\n");
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
    openapiFields.add("button");
    openapiFields.add("coupon");
    openapiFields.add("form");
    openapiFields.add("index");
    openapiFields.add("picture");
    openapiFields.add("picture_group");
    openapiFields.add("text");
    openapiFields.add("type");
    openapiFields.add("video");
    openapiFields.add("wechat_applet");
    openapiFields.add("wechat_game");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("index");
    openapiRequiredFields.add("type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateSiteCreateV2RequestBricksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateSiteCreateV2RequestBricksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateSiteCreateV2RequestBricksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateSiteCreateV2RequestBricksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateSiteCreateV2RequestBricksInner>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateSiteCreateV2RequestBricksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateSiteCreateV2RequestBricksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateSiteCreateV2RequestBricksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateSiteCreateV2RequestBricksInner
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateSiteCreateV2RequestBricksInner
  */
  public static ToolsSiteTemplateSiteCreateV2RequestBricksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateSiteCreateV2RequestBricksInner.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateSiteCreateV2RequestBricksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

