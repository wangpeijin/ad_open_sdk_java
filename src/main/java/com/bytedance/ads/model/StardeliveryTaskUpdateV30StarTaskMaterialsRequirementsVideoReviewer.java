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
@JsonAdapter(StardeliveryTaskUpdateV30StarTaskMaterialsRequirementsVideoReviewer.Adapter.class)
public enum StardeliveryTaskUpdateV30StarTaskMaterialsRequirementsVideoReviewer {
  
  CONFIRM_BY_ISV_ONLY("CONFIRM_BY_ISV_ONLY"),
  
  NEED_RE_CONFIRM("NEED_RE_CONFIRM");

  private String value;

  StardeliveryTaskUpdateV30StarTaskMaterialsRequirementsVideoReviewer(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StardeliveryTaskUpdateV30StarTaskMaterialsRequirementsVideoReviewer fromValue(String value) {
    for (StardeliveryTaskUpdateV30StarTaskMaterialsRequirementsVideoReviewer b : StardeliveryTaskUpdateV30StarTaskMaterialsRequirementsVideoReviewer.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StardeliveryTaskUpdateV30StarTaskMaterialsRequirementsVideoReviewer> {
    @Override
    public void write(final JsonWriter jsonWriter, final StardeliveryTaskUpdateV30StarTaskMaterialsRequirementsVideoReviewer enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StardeliveryTaskUpdateV30StarTaskMaterialsRequirementsVideoReviewer read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StardeliveryTaskUpdateV30StarTaskMaterialsRequirementsVideoReviewer.fromValue(value);
    }
  }
}

