/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
 * EventManagerOfflineDataCreateV2RequestOfflineDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class EventManagerOfflineDataCreateV2RequestOfflineDataInner {
  public static final String SERIALIZED_NAME_CALLBACK = "callback";
  @SerializedName(SERIALIZED_NAME_CALLBACK)
  private String callback = null;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel = null;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private String customer = null;

  public static final String SERIALIZED_NAME_EVENT_TIME = "event_time";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME)
  private String eventTime = null;

  public static final String SERIALIZED_NAME_IDFA = "idfa";
  @SerializedName(SERIALIZED_NAME_IDFA)
  private String idfa = null;

  public static final String SERIALIZED_NAME_IDFA_MD5 = "idfa_md5";
  @SerializedName(SERIALIZED_NAME_IDFA_MD5)
  private String idfaMd5 = null;

  public static final String SERIALIZED_NAME_IMEI_MD5 = "imei_md5";
  @SerializedName(SERIALIZED_NAME_IMEI_MD5)
  private String imeiMd5 = null;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private Long label = null;

  public static final String SERIALIZED_NAME_MAC_MD5 = "mac_md5";
  @SerializedName(SERIALIZED_NAME_MAC_MD5)
  private String macMd5 = null;

  public static final String SERIALIZED_NAME_OAID = "oaid";
  @SerializedName(SERIALIZED_NAME_OAID)
  private String oaid = null;

  public static final String SERIALIZED_NAME_OAID_MD5 = "oaid_md5";
  @SerializedName(SERIALIZED_NAME_OAID_MD5)
  private String oaidMd5 = null;

  public static final String SERIALIZED_NAME_PAY_AMOUNT = "pay_amount";
  @SerializedName(SERIALIZED_NAME_PAY_AMOUNT)
  private Double payAmount = null;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_MD5 = "phone_number_md5";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_MD5)
  private String phoneNumberMd5 = null;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_SHA256 = "phone_number_sha256";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_SHA256)
  private String phoneNumberSha256 = null;

  public static final String SERIALIZED_NAME_PRODUCT_LINE = "product_line";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LINE)
  private String productLine = null;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid = null;

  public EventManagerOfflineDataCreateV2RequestOfflineDataInner() {
  }

  public EventManagerOfflineDataCreateV2RequestOfflineDataInner callback(String callback) {
    
    this.callback = callback;
    return this;
  }

   /**
   * 
   * @return callback
  **/
  @javax.annotation.Nullable
  public String getCallback() {
    return callback;
  }


  public void setCallback(String callback) {
    this.callback = callback;
  }


  public EventManagerOfflineDataCreateV2RequestOfflineDataInner channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * 
   * @return channel
  **/
  @javax.annotation.Nullable
  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public EventManagerOfflineDataCreateV2RequestOfflineDataInner customer(String customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * 
   * @return customer
  **/
  @javax.annotation.Nullable
  public String getCustomer() {
    return customer;
  }


  public void setCustomer(String customer) {
    this.customer = customer;
  }


  public EventManagerOfflineDataCreateV2RequestOfflineDataInner eventTime(String eventTime) {
    
    this.eventTime = eventTime;
    return this;
  }

   /**
   * 
   * @return eventTime
  **/
  @javax.annotation.Nonnull
  public String getEventTime() {
    return eventTime;
  }


  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }


  public EventManagerOfflineDataCreateV2RequestOfflineDataInner idfa(String idfa) {
    
    this.idfa = idfa;
    return this;
  }

   /**
   * 
   * @return idfa
  **/
  @javax.annotation.Nullable
  public String getIdfa() {
    return idfa;
  }


  public void setIdfa(String idfa) {
    this.idfa = idfa;
  }


  public EventManagerOfflineDataCreateV2RequestOfflineDataInner idfaMd5(String idfaMd5) {
    
    this.idfaMd5 = idfaMd5;
    return this;
  }

   /**
   * 
   * @return idfaMd5
  **/
  @javax.annotation.Nullable
  public String getIdfaMd5() {
    return idfaMd5;
  }


  public void setIdfaMd5(String idfaMd5) {
    this.idfaMd5 = idfaMd5;
  }


  public EventManagerOfflineDataCreateV2RequestOfflineDataInner imeiMd5(String imeiMd5) {
    
    this.imeiMd5 = imeiMd5;
    return this;
  }

   /**
   * 
   * @return imeiMd5
  **/
  @javax.annotation.Nullable
  public String getImeiMd5() {
    return imeiMd5;
  }


  public void setImeiMd5(String imeiMd5) {
    this.imeiMd5 = imeiMd5;
  }


  public EventManagerOfflineDataCreateV2RequestOfflineDataInner label(Long label) {
    
    this.label = label;
    return this;
  }

   /**
   * 
   * @return label
  **/
  @javax.annotation.Nullable
  public Long getLabel() {
    return label;
  }


  public void setLabel(Long label) {
    this.label = label;
  }


  public EventManagerOfflineDataCreateV2RequestOfflineDataInner macMd5(String macMd5) {
    
    this.macMd5 = macMd5;
    return this;
  }

   /**
   * 
   * @return macMd5
  **/
  @javax.annotation.Nullable
  public String getMacMd5() {
    return macMd5;
  }


  public void setMacMd5(String macMd5) {
    this.macMd5 = macMd5;
  }


  public EventManagerOfflineDataCreateV2RequestOfflineDataInner oaid(String oaid) {
    
    this.oaid = oaid;
    return this;
  }

   /**
   * 
   * @return oaid
  **/
  @javax.annotation.Nullable
  public String getOaid() {
    return oaid;
  }


  public void setOaid(String oaid) {
    this.oaid = oaid;
  }


  public EventManagerOfflineDataCreateV2RequestOfflineDataInner oaidMd5(String oaidMd5) {
    
    this.oaidMd5 = oaidMd5;
    return this;
  }

   /**
   * 
   * @return oaidMd5
  **/
  @javax.annotation.Nullable
  public String getOaidMd5() {
    return oaidMd5;
  }


  public void setOaidMd5(String oaidMd5) {
    this.oaidMd5 = oaidMd5;
  }


  public EventManagerOfflineDataCreateV2RequestOfflineDataInner payAmount(Double payAmount) {
    
    this.payAmount = payAmount;
    return this;
  }

   /**
   * 
   * @return payAmount
  **/
  @javax.annotation.Nullable
  public Double getPayAmount() {
    return payAmount;
  }


  public void setPayAmount(Double payAmount) {
    this.payAmount = payAmount;
  }


  public EventManagerOfflineDataCreateV2RequestOfflineDataInner phoneNumberMd5(String phoneNumberMd5) {
    
    this.phoneNumberMd5 = phoneNumberMd5;
    return this;
  }

   /**
   * 
   * @return phoneNumberMd5
  **/
  @javax.annotation.Nullable
  public String getPhoneNumberMd5() {
    return phoneNumberMd5;
  }


  public void setPhoneNumberMd5(String phoneNumberMd5) {
    this.phoneNumberMd5 = phoneNumberMd5;
  }


  public EventManagerOfflineDataCreateV2RequestOfflineDataInner phoneNumberSha256(String phoneNumberSha256) {
    
    this.phoneNumberSha256 = phoneNumberSha256;
    return this;
  }

   /**
   * 
   * @return phoneNumberSha256
  **/
  @javax.annotation.Nullable
  public String getPhoneNumberSha256() {
    return phoneNumberSha256;
  }


  public void setPhoneNumberSha256(String phoneNumberSha256) {
    this.phoneNumberSha256 = phoneNumberSha256;
  }


  public EventManagerOfflineDataCreateV2RequestOfflineDataInner productLine(String productLine) {
    
    this.productLine = productLine;
    return this;
  }

   /**
   * 
   * @return productLine
  **/
  @javax.annotation.Nullable
  public String getProductLine() {
    return productLine;
  }


  public void setProductLine(String productLine) {
    this.productLine = productLine;
  }


  public EventManagerOfflineDataCreateV2RequestOfflineDataInner uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * 
   * @return uid
  **/
  @javax.annotation.Nullable
  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerOfflineDataCreateV2RequestOfflineDataInner eventManagerOfflineDataCreateV2RequestOfflineDataInner = (EventManagerOfflineDataCreateV2RequestOfflineDataInner) o;
    return Objects.equals(this.callback, eventManagerOfflineDataCreateV2RequestOfflineDataInner.callback) &&
        Objects.equals(this.channel, eventManagerOfflineDataCreateV2RequestOfflineDataInner.channel) &&
        Objects.equals(this.customer, eventManagerOfflineDataCreateV2RequestOfflineDataInner.customer) &&
        Objects.equals(this.eventTime, eventManagerOfflineDataCreateV2RequestOfflineDataInner.eventTime) &&
        Objects.equals(this.idfa, eventManagerOfflineDataCreateV2RequestOfflineDataInner.idfa) &&
        Objects.equals(this.idfaMd5, eventManagerOfflineDataCreateV2RequestOfflineDataInner.idfaMd5) &&
        Objects.equals(this.imeiMd5, eventManagerOfflineDataCreateV2RequestOfflineDataInner.imeiMd5) &&
        Objects.equals(this.label, eventManagerOfflineDataCreateV2RequestOfflineDataInner.label) &&
        Objects.equals(this.macMd5, eventManagerOfflineDataCreateV2RequestOfflineDataInner.macMd5) &&
        Objects.equals(this.oaid, eventManagerOfflineDataCreateV2RequestOfflineDataInner.oaid) &&
        Objects.equals(this.oaidMd5, eventManagerOfflineDataCreateV2RequestOfflineDataInner.oaidMd5) &&
        Objects.equals(this.payAmount, eventManagerOfflineDataCreateV2RequestOfflineDataInner.payAmount) &&
        Objects.equals(this.phoneNumberMd5, eventManagerOfflineDataCreateV2RequestOfflineDataInner.phoneNumberMd5) &&
        Objects.equals(this.phoneNumberSha256, eventManagerOfflineDataCreateV2RequestOfflineDataInner.phoneNumberSha256) &&
        Objects.equals(this.productLine, eventManagerOfflineDataCreateV2RequestOfflineDataInner.productLine) &&
        Objects.equals(this.uid, eventManagerOfflineDataCreateV2RequestOfflineDataInner.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callback, channel, customer, eventTime, idfa, idfaMd5, imeiMd5, label, macMd5, oaid, oaidMd5, payAmount, phoneNumberMd5, phoneNumberSha256, productLine, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventManagerOfflineDataCreateV2RequestOfflineDataInner {\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    idfa: ").append(toIndentedString(idfa)).append("\n");
    sb.append("    idfaMd5: ").append(toIndentedString(idfaMd5)).append("\n");
    sb.append("    imeiMd5: ").append(toIndentedString(imeiMd5)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    macMd5: ").append(toIndentedString(macMd5)).append("\n");
    sb.append("    oaid: ").append(toIndentedString(oaid)).append("\n");
    sb.append("    oaidMd5: ").append(toIndentedString(oaidMd5)).append("\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    phoneNumberMd5: ").append(toIndentedString(phoneNumberMd5)).append("\n");
    sb.append("    phoneNumberSha256: ").append(toIndentedString(phoneNumberSha256)).append("\n");
    sb.append("    productLine: ").append(toIndentedString(productLine)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
    openapiFields.add("callback");
    openapiFields.add("channel");
    openapiFields.add("customer");
    openapiFields.add("event_time");
    openapiFields.add("idfa");
    openapiFields.add("idfa_md5");
    openapiFields.add("imei_md5");
    openapiFields.add("label");
    openapiFields.add("mac_md5");
    openapiFields.add("oaid");
    openapiFields.add("oaid_md5");
    openapiFields.add("pay_amount");
    openapiFields.add("phone_number_md5");
    openapiFields.add("phone_number_sha256");
    openapiFields.add("product_line");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("event_time");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerOfflineDataCreateV2RequestOfflineDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerOfflineDataCreateV2RequestOfflineDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerOfflineDataCreateV2RequestOfflineDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerOfflineDataCreateV2RequestOfflineDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerOfflineDataCreateV2RequestOfflineDataInner>() {
           @Override
           public void write(JsonWriter out, EventManagerOfflineDataCreateV2RequestOfflineDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerOfflineDataCreateV2RequestOfflineDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerOfflineDataCreateV2RequestOfflineDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerOfflineDataCreateV2RequestOfflineDataInner
  * @throws IOException if the JSON string is invalid with respect to EventManagerOfflineDataCreateV2RequestOfflineDataInner
  */
  public static EventManagerOfflineDataCreateV2RequestOfflineDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerOfflineDataCreateV2RequestOfflineDataInner.class);
  }

 /**
  * Convert an instance of EventManagerOfflineDataCreateV2RequestOfflineDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

