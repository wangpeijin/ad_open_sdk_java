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
@JsonAdapter(ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueBizStates.Adapter.class)
public enum ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueBizStates {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l),
  
  NUMBER_10(10l),
  
  NUMBER_100(100l),
  
  NUMBER_101(101l),
  
  NUMBER_102(102l),
  
  NUMBER_103(103l),
  
  NUMBER_104(104l),
  
  NUMBER_1909002100(1909002100l),
  
  NUMBER_1909002101(1909002101l),
  
  NUMBER_1909002102(1909002102l),
  
  NUMBER_1909002103(1909002103l),
  
  NUMBER_1909002104(1909002104l),
  
  NUMBER_1909002105(1909002105l),
  
  NUMBER_1909002106(1909002106l),
  
  NUMBER_1910001000(1910001000l),
  
  NUMBER_1910001001(1910001001l),
  
  NUMBER_2(2l),
  
  NUMBER_201(201l),
  
  NUMBER_202(202l),
  
  NUMBER_203(203l),
  
  NUMBER_204(204l),
  
  NUMBER_3(3l),
  
  NUMBER_4(4l),
  
  NUMBER_5(5l),
  
  NUMBER_6(6l),
  
  NUMBER_7(7l),
  
  NUMBER_8(8l),
  
  NUMBER_9(9l);

  private Long value;

  ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueBizStates(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueBizStates fromValue(Long value) {
    for (ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueBizStates b : ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueBizStates.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueBizStates> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueBizStates enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueBizStates read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueBizStates.fromValue(value);
    }
  }
}

