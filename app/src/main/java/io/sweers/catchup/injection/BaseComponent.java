package io.sweers.catchup.injection;

public interface BaseComponent<T> {

  void inject(T target);

}
