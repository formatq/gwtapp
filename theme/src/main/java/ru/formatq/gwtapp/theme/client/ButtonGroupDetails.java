/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package ru.formatq.gwtapp.theme.client;

import com.sencha.gxt.themebuilder.base.client.config.TypeDetails;

public interface ButtonGroupDetails {

  @TypeDetails(sampleValue = "#FFFFFF", comment = "the body background color")
  String bodyBackgroundColor();

  @TypeDetails(sampleValue = "util.padding(4)", comment = "the group's body padding")
  EdgeDetails bodyPadding();

  @TypeDetails(sampleValue = "util.border('solid', '#dfeaf2', 3)", comment = "the groups border")
  BorderDetails border();

  @TypeDetails(sampleValue = "3", comment = "border radius of the button group")
  int borderRadius();

  @TypeDetails(sampleValue = "util.fontStyle('helvetica, arial, verdana, sans-serif','13px','#666666')", comment = "the groups text")
  FontDetails font();

  @TypeDetails(sampleValue = "#4B9CD7 0%, #3892D3 50%, #358AC8 51%, #3892D3", comment = "the header gradient")
  String headerGradient();

  @TypeDetails(sampleValue = "util.padding(2)", comment = "the group's header padding")
  EdgeDetails headerPadding();
}
