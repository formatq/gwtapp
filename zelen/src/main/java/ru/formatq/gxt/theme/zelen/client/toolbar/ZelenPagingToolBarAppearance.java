/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.theme.base.client.toolbar.PagingToolBarBaseAppearance;

public class ZelenPagingToolBarAppearance extends PagingToolBarBaseAppearance {
  public interface ZelenPagingToolBarResources extends PagingToolBarResources, ClientBundle {
    ImageResource first();

    ImageResource prev();

    ImageResource next();

    ImageResource last();

    ImageResource refresh();

    ImageResource loading();
  }

  public ZelenPagingToolBarAppearance() {
    this(GWT.<ZelenPagingToolBarResources> create(ZelenPagingToolBarResources.class));
  }

  public ZelenPagingToolBarAppearance(ZelenPagingToolBarResources resources) {
    super(resources);
  }
}
