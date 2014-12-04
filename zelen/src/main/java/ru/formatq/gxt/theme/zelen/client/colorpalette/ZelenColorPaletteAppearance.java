/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.colorpalette;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.sencha.gxt.theme.base.client.colorpalette.ColorPaletteBaseAppearance;

public class ZelenColorPaletteAppearance extends ColorPaletteBaseAppearance {

  public interface ZelenColorPaletteResources extends ColorPaletteBaseAppearance.ColorPaletteResources, ClientBundle {

    @Override
    @Source({"com/sencha/gxt/theme/base/client/colorpalette/ColorPalette.css", "ZelenColorPalette.css"})
    ZelenColorPaletteStyle style();

  }

  public interface ZelenColorPaletteStyle extends ColorPaletteStyle {
  }

  public ZelenColorPaletteAppearance() {
    this(GWT.<ZelenColorPaletteResources> create(ZelenColorPaletteResources.class),
        GWT.<BaseColorPaletteTemplate> create(BaseColorPaletteTemplate.class));
  }

  public ZelenColorPaletteAppearance(ZelenColorPaletteResources resources, BaseColorPaletteTemplate template) {
    super(resources, template);
  }

}
