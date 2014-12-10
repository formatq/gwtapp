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
import com.sencha.gxt.theme.base.client.menu.ItemBaseAppearance;

public class ZelenItemAppearance extends ItemBaseAppearance {

  public interface ZelenItemResources extends ItemBaseAppearance.ItemResources, ClientBundle {

    @Override
    @Source({"com/sencha/gxt/theme/base/client/menu/Item.css",
            "ru/formatq/gxt/theme/zelen/client/menu/ZelenItem.css",
            "ZelenItem.css"})
    ZelenItemStyle style();

    ImageResource itemOver();

  }

  public interface ZelenItemStyle extends ItemStyle {

  }

  public ZelenItemAppearance() {
    this(GWT.<ZelenItemResources> create(ZelenItemResources.class));
  }

  public ZelenItemAppearance(ZelenItemResources resources) {
    super(resources);
  }

}
