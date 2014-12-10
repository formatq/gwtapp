/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.theme.base.client.menu.SeparatorMenuItemBaseAppearance;

public class ZelenSeparatorMenuItemAppearance extends SeparatorMenuItemBaseAppearance {

  public interface ZelenSeparatorMenuItemResources extends ClientBundle, SeparatorMenuItemResources {

    @Override
    @Source({"com/sencha/gxt/theme/base/client/menu/Item.css",
            "ru/formatq/gxt/theme/zelen/client/menu/ZelenItem.css",
            "com/sencha/gxt/theme/base/client/menu/SeparatorMenuItem.css",
            "ZelenSeparatorMenuItem.css"})
    ZelenSeparatorMenuItemStyle style();

    ImageResource itemOver();
  }

  public interface ZelenSeparatorMenuItemStyle extends SeparatorMenuItemStyle {
  }

  public ZelenSeparatorMenuItemAppearance() {
    this(GWT.<ZelenSeparatorMenuItemResources> create(ZelenSeparatorMenuItemResources.class),
        GWT.<SeparatorMenuItemTemplate> create(SeparatorMenuItemTemplate.class));
  }

  public ZelenSeparatorMenuItemAppearance(ZelenSeparatorMenuItemResources resources,
                                          SeparatorMenuItemTemplate template) {
    super(resources, template);
  }

}
