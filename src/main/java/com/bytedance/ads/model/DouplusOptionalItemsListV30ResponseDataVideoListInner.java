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
 * DouplusOptionalItemsListV30ResponseDataVideoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class DouplusOptionalItemsListV30ResponseDataVideoListInner {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_IS_HARD_SELL = "is_hard_sell";
  @SerializedName(SERIALIZED_NAME_IS_HARD_SELL)
  private Boolean isHardSell = null;

  public static final String SERIALIZED_NAME_IS_IMG = "is_img";
  @SerializedName(SERIALIZED_NAME_IS_IMG)
  private Boolean isImg = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private List<String> url = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_URL = "video_cover_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_URL)
  private List<String> videoCoverUrl = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public DouplusOptionalItemsListV30ResponseDataVideoListInner() {
  }

  public DouplusOptionalItemsListV30ResponseDataVideoListInner height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public DouplusOptionalItemsListV30ResponseDataVideoListInner isHardSell(Boolean isHardSell) {
    
    this.isHardSell = isHardSell;
    return this;
  }

   /**
   * 
   * @return isHardSell
  **/
  @javax.annotation.Nullable
  public Boolean getIsHardSell() {
    return isHardSell;
  }


  public void setIsHardSell(Boolean isHardSell) {
    this.isHardSell = isHardSell;
  }


  public DouplusOptionalItemsListV30ResponseDataVideoListInner isImg(Boolean isImg) {
    
    this.isImg = isImg;
    return this;
  }

   /**
   * 
   * @return isImg
  **/
  @javax.annotation.Nullable
  public Boolean getIsImg() {
    return isImg;
  }


  public void setIsImg(Boolean isImg) {
    this.isImg = isImg;
  }


  public DouplusOptionalItemsListV30ResponseDataVideoListInner itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 
   * @return itemId
  **/
  @javax.annotation.Nullable
  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public DouplusOptionalItemsListV30ResponseDataVideoListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public DouplusOptionalItemsListV30ResponseDataVideoListInner url(List<String> url) {
    
    this.url = url;
    return this;
  }

  public DouplusOptionalItemsListV30ResponseDataVideoListInner addUrlItem(String urlItem) {
    if (this.url == null) {
      this.url = new ArrayList<>();
    }
    this.url.add(urlItem);
    return this;
  }

   /**
   * 
   * @return url
  **/
  @javax.annotation.Nullable
  public List<String> getUrl() {
    return url;
  }


  public void setUrl(List<String> url) {
    this.url = url;
  }


  public DouplusOptionalItemsListV30ResponseDataVideoListInner videoCoverUrl(List<String> videoCoverUrl) {
    
    this.videoCoverUrl = videoCoverUrl;
    return this;
  }

  public DouplusOptionalItemsListV30ResponseDataVideoListInner addVideoCoverUrlItem(String videoCoverUrlItem) {
    if (this.videoCoverUrl == null) {
      this.videoCoverUrl = new ArrayList<>();
    }
    this.videoCoverUrl.add(videoCoverUrlItem);
    return this;
  }

   /**
   * 
   * @return videoCoverUrl
  **/
  @javax.annotation.Nullable
  public List<String> getVideoCoverUrl() {
    return videoCoverUrl;
  }


  public void setVideoCoverUrl(List<String> videoCoverUrl) {
    this.videoCoverUrl = videoCoverUrl;
  }


  public DouplusOptionalItemsListV30ResponseDataVideoListInner width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 
   * @return width
  **/
  @javax.annotation.Nullable
  public Long getWidth() {
    return width;
  }


  public void setWidth(Long width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOptionalItemsListV30ResponseDataVideoListInner douplusOptionalItemsListV30ResponseDataVideoListInner = (DouplusOptionalItemsListV30ResponseDataVideoListInner) o;
    return Objects.equals(this.height, douplusOptionalItemsListV30ResponseDataVideoListInner.height) &&
        Objects.equals(this.isHardSell, douplusOptionalItemsListV30ResponseDataVideoListInner.isHardSell) &&
        Objects.equals(this.isImg, douplusOptionalItemsListV30ResponseDataVideoListInner.isImg) &&
        Objects.equals(this.itemId, douplusOptionalItemsListV30ResponseDataVideoListInner.itemId) &&
        Objects.equals(this.title, douplusOptionalItemsListV30ResponseDataVideoListInner.title) &&
        Objects.equals(this.url, douplusOptionalItemsListV30ResponseDataVideoListInner.url) &&
        Objects.equals(this.videoCoverUrl, douplusOptionalItemsListV30ResponseDataVideoListInner.videoCoverUrl) &&
        Objects.equals(this.width, douplusOptionalItemsListV30ResponseDataVideoListInner.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, isHardSell, isImg, itemId, title, url, videoCoverUrl, width);
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
    sb.append("class DouplusOptionalItemsListV30ResponseDataVideoListInner {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    isHardSell: ").append(toIndentedString(isHardSell)).append("\n");
    sb.append("    isImg: ").append(toIndentedString(isImg)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    videoCoverUrl: ").append(toIndentedString(videoCoverUrl)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("height");
    openapiFields.add("is_hard_sell");
    openapiFields.add("is_img");
    openapiFields.add("item_id");
    openapiFields.add("title");
    openapiFields.add("url");
    openapiFields.add("video_cover_url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOptionalItemsListV30ResponseDataVideoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOptionalItemsListV30ResponseDataVideoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOptionalItemsListV30ResponseDataVideoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOptionalItemsListV30ResponseDataVideoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOptionalItemsListV30ResponseDataVideoListInner>() {
           @Override
           public void write(JsonWriter out, DouplusOptionalItemsListV30ResponseDataVideoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOptionalItemsListV30ResponseDataVideoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOptionalItemsListV30ResponseDataVideoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOptionalItemsListV30ResponseDataVideoListInner
  * @throws IOException if the JSON string is invalid with respect to DouplusOptionalItemsListV30ResponseDataVideoListInner
  */
  public static DouplusOptionalItemsListV30ResponseDataVideoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOptionalItemsListV30ResponseDataVideoListInner.class);
  }

 /**
  * Convert an instance of DouplusOptionalItemsListV30ResponseDataVideoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

