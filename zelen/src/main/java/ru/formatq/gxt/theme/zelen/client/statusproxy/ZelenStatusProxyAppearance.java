/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.statusproxy;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.sencha.gxt.theme.base.client.statusproxy.StatusProxyBaseAppearance;

public class ZelenStatusProxyAppearance extends StatusProxyBaseAppearance {

  public interface ZelenStatusProxyResources extends StatusProxyResources, ClientBundle {

    @Override
    @Source({"com/sencha/gxt/theme/base/client/statusproxy/StatusProxy.css", "ZelenStatusProxy.css"})
    ZelenStatusProxyStyle style();

  }

  public interface ZelenStatusProxyStyle extends StatusProxyStyle {
  }

  public ZelenStatusProxyAppearance() {
    this(GWT.<ZelenStatusProxyResources> create(ZelenStatusProxyResources.class),
        GWT.<StatusProxyTemplates> create(StatusProxyTemplates.class));
  }

  public ZelenStatusProxyAppearance(ZelenStatusProxyResources resources, StatusProxyTemplates templates) {
    super(resources, templates);
  }

}
