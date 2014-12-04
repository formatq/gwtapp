/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.tree;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.sencha.gxt.theme.base.client.tree.TreeBaseAppearance;

public class ZelenTreeAppearance extends TreeBaseAppearance {

  public interface ZelenTreeResources extends TreeResources, ClientBundle {

    @Source({"com/sencha/gxt/theme/base/client/tree/Tree.css", "TreeDefault.css"})
    TreeBaseStyle style();

  }

  public ZelenTreeAppearance() {
    super((TreeResources) GWT.create(ZelenTreeResources.class));
  }
}
