package io.sweers.catchup.injection;

import com.bluelinelabs.conductor.Controller;

public interface ControllerComponentBuilder<ControllerType extends Controller, ComponentType extends BaseComponent<ControllerType>> {
  ComponentType build();
}
