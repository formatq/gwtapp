/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gxt.theme.zelen.client.grid;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.CssResource.Import;
import com.sencha.gxt.theme.base.client.grid.GridBaseAppearance;
import com.sencha.gxt.widget.core.client.grid.GridView.GridStateStyles;

public class ZelenGridAppearance extends GridBaseAppearance {

  public interface ZelenGridStyle extends GridStyle {
    
  }
  
  public interface ZelenGridResources extends GridResources  {

    @Import(GridStateStyles.class)
    @Source({"com/sencha/gxt/theme/base/client/grid/Grid.css", "ZelenGrid.css"})
    @Override
    ZelenGridStyle css();
  }
  
  
  public ZelenGridAppearance() {
    this(GWT.<ZelenGridResources> create(ZelenGridResources.class));
  }

  public ZelenGridAppearance(ZelenGridResources resources) {
    super(resources);
  }
}
