package io.ray.streaming.api.function;

import java.io.Serializable;

/**
 * Interface of streaming functions.
 */
public interface Function extends Serializable {

  default void loadCheckpoint(Serializable checkpointObject) {

  }

  default Serializable doCheckpoint() {
    return null;
  }

}
