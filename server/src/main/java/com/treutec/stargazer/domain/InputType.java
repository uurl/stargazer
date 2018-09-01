package com.treutec.stargazer.domain;

import com.treutec.stargazer.PrevOut;

/**
 * An input abstraction created from the blockchain.info API.
 *
 * @author uurl
 */
public class InputType {
  private PrevOut prev_out;

  public PrevOut getPrev_out() {
    return prev_out;
  }

  public void setPrev_out(PrevOut prev_out) {
    this.prev_out = prev_out;
  }
}
