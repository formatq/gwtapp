/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.status;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance;
import com.sencha.gxt.widget.core.client.Status.BoxStatusAppearance;

public class ZelenBoxStatusAppearance extends BoxStatusBaseAppearance implements BoxStatusAppearance {

  public interface ZelenBoxStatusStyle extends BoxStatusStyle {

  }

  public interface ZelenBoxStatusResources extends BoxStatusResources, ClientBundle {

    @Override
    @Source({"com/sencha/gxt/theme/base/client/status/Status.css", "ZelenBoxStatus.css"})
    ZelenBoxStatusStyle style();

  }

  public ZelenBoxStatusAppearance() {
    this(GWT.<ZelenBoxStatusResources> create(ZelenBoxStatusResources.class), GWT.<BoxTemplate> create(BoxTemplate.class));
  }

  public ZelenBoxStatusAppearance(ZelenBoxStatusResources resources, BoxTemplate template) {
    super(resources, template);
  }

}
