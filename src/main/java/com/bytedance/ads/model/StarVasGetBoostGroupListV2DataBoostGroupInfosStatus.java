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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(StarVasGetBoostGroupListV2DataBoostGroupInfosStatus.Adapter.class)
public enum StarVasGetBoostGroupListV2DataBoostGroupInfosStatus {
  
  AUDITING("AUDITING"),
  
  CANCEL("CANCEL"),
  
  CLOSE("CLOSE"),
  
  DOING("DOING"),
  
  FAIL_CREATE("FAIL_CREATE"),
  
  FINISH("FINISH"),
  
  PREPARE("PREPARE"),
  
  REJECT_AUDIT("REJECT_AUDIT"),
  
  SETTLE("SETTLE"),
  
  WAIT_CANCEL("WAIT_CANCEL");

  private String value;

  StarVasGetBoostGroupListV2DataBoostGroupInfosStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarVasGetBoostGroupListV2DataBoostGroupInfosStatus fromValue(String value) {
    for (StarVasGetBoostGroupListV2DataBoostGroupInfosStatus b : StarVasGetBoostGroupListV2DataBoostGroupInfosStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarVasGetBoostGroupListV2DataBoostGroupInfosStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarVasGetBoostGroupListV2DataBoostGroupInfosStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarVasGetBoostGroupListV2DataBoostGroupInfosStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarVasGetBoostGroupListV2DataBoostGroupInfosStatus.fromValue(value);
    }
  }
}

