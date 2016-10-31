package io.sweers.catchup.injection.mapkeys;

import com.bluelinelabs.conductor.Controller;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import dagger.MapKey;

@MapKey
@Retention(RetentionPolicy.RUNTIME)
public @interface ControllerKey {
  Class<? extends Controller> value();
}
