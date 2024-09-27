/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoDeliveryStatus.Adapter.class)
public enum StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoDeliveryStatus {
  
  PASS_BY_CUSTOMER("PASS_BY_CUSTOMER"),
  
  PASS_BY_ISV("PASS_BY_ISV"),
  
  REJECTED("REJECTED"),
  
  WAIT_CONFIRM("WAIT_CONFIRM");

  private String value;

  StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoDeliveryStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoDeliveryStatus fromValue(String value) {
    for (StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoDeliveryStatus b : StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoDeliveryStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoDeliveryStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoDeliveryStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoDeliveryStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoDeliveryStatus.fromValue(value);
    }
  }
}

