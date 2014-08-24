/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gwtapp.theme.greeny.client.sliced.toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import ru.formatq.gwtapp.theme.greeny.client.base.toolbar.Css3ToolBarAppearance;

/**
 *
 */
public class SlicedToolBarAppearance extends Css3ToolBarAppearance {

  public interface SlicedToolBarResources extends Css3ToolBarResources {
    @Source({"com/sencha/gxt/theme/base/client/container/BoxLayout.css", "ru/formatq/gwtapp/theme/greeny/client/base/container/Css3HBoxLayoutContainer.css", "SlicedToolBar.css"})
    @Override
    Css3ToolBarStyle style();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource background();
  }

  public SlicedToolBarAppearance() {
    this(GWT.<SlicedToolBarResources>create(SlicedToolBarResources.class));
  }

  public SlicedToolBarAppearance(SlicedToolBarResources resources) {
    super(resources);
  }
}
