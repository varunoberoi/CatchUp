package io.sweers.catchup.injection;

import com.bluelinelabs.conductor.Controller;

public interface ControllerComponentBuilderHost {

    <T extends Controller, ComponentBuilderType extends ControllerComponentBuilder> ComponentBuilderType getComponentBuilder(Class<? extends T> key, Class<? extends ComponentBuilderType> builderType);
}
