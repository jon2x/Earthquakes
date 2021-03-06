package ru.inno.earthquakes.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Class that combines downloading state and an entity
 *
 * @author Artur Badretdinov (Gaket) 05.08.17
 */
public class EntitiesWrapper<T> {

  @NonNull
  private State state;
  @Nullable
  private T data;

  public EntitiesWrapper(@NonNull State state, @Nullable T data) {
    this.state = state;
    this.data = data;
  }

  @NonNull
  public State getState() {
    return state;
  }

  public void setState(@NonNull State state) {
    this.state = state;
  }

  @Nullable
  public T getData() {
    return data;
  }

  public void setData(@Nullable T data) {
    this.data = data;
  }

  public enum State {
    EMPTY,
    LOADING,
    SUCCESS,
    ERROR_NETWORK
  }
}
