package com.treutec.stargazer.domain;

import com.sdicons.json.model.JSONValue;

/**
 * High level accessor of a block.  Contains both the parsed and raw JSON object returned from the API.
 *
 * @author uurl
 */
public class BlockJsonType {
  private final BlockType blockType;
  private final JSONValue blockJson;

  public BlockJsonType(com.treutec.stargazer.domain.BlockType blockType2, JSONValue blockJson) {
    this.blockType = blockType2;
    this.blockJson = blockJson;
  }

  public BlockType getBlockType() {
    return blockType;
  }

  public JSONValue getBlockJson() {
    return blockJson;
  }
}
